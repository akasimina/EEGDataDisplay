<template>
    <div>
      <button @click="togglePlay">{{ isPlaying ? 'Pause' : 'Play' }}</button>
      <input type="range" min="0" max="1" step="0.01" v-model="volume" />
      <canvas ref="canvas"></canvas>
      <audio ref="audio" src="/assets/music/meditation-blue.mp3" />
    </div>
  </template>
  
  <script setup>
  import { ref, onMounted, onUnmounted, watch, nextTick } from 'vue';
  
  const isPlaying = ref(false);
  const volume = ref(1);
  const audio = ref(null);
  const canvas = ref(null);
  const audioContext = new AudioContext();
  let analyser;
  let dataArray;
  let bufferLength;
  let animationFrameId;
  
  const togglePlay = async () => {
    await nextTick();
  
    if (audio.value) {
      if (isPlaying.value) {
        audio.value.pause();
      } else {
        audio.value.play();
      }
      isPlaying.value = !isPlaying.value;
    }
  };
  
  watch(volume, (newVolume) => {
    if (audio.value) {
      audio.value.volume = newVolume;
    }
  });
  
  onMounted(() => {
    nextTick().then(() => {
      if (audio.value && canvas.value) {
        const track = audioContext.createMediaElementSource(audio.value);
        analyser = audioContext.createAnalyser();
        track.connect(analyser);
        analyser.connect(audioContext.destination);
        analyser.fftSize = 2048;
        bufferLength = analyser.frequencyBinCount;
        dataArray = new Uint8Array(bufferLength);
    
        const draw = () => {
          animationFrameId = requestAnimationFrame(draw);
          analyser.getByteTimeDomainData(dataArray);
    
          const canvasCtx = canvas.value.getContext('2d');
          canvasCtx.fillStyle = 'rgb(200, 200, 200)';
          canvasCtx.fillRect(0, 0, canvas.value.width, canvas.value.height);
    
          canvasCtx.lineWidth = 2;
          canvasCtx.strokeStyle = 'rgb(0, 0, 0)';
          canvasCtx.beginPath();
    
          const sliceWidth = canvas.value.width * 1.0 / bufferLength;
          let x = 0;
    
          for (let i = 0; i < bufferLength; i++) {
            const v = dataArray[i] / 128.0;
            const y = v * canvas.value.height / 2;
    
            if (i === 0) {
              canvasCtx.moveTo(x, y);
            } else {
              canvasCtx.lineTo(x, y);
            }
    
            x += sliceWidth;
          }
    
          canvasCtx.lineTo(canvas.value.width, canvas.value.height / 2);
          canvasCtx.stroke();
        };
    
        draw();
      }
    });
  });
  
  onUnmounted(() => {
    if (animationFrameId != null) {
      cancelAnimationFrame(animationFrameId);
    }
    if (analyser) {
      analyser.disconnect();
    }
    if (audioContext) {
      audioContext.close();
    }
  });
  </script>
  