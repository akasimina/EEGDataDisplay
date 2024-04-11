<template>
    <div ref="siriContainer" class="siri-container"></div>
</template>

<script setup>
import { onMounted, onUnmounted, ref } from 'vue';
import SiriWave from 'siriwave';

const siriContainer = ref(null);
let siriWave;

onMounted(() => {
    siriWave = new SiriWave({
        container: siriContainer.value,
        width: 300,
        height: 200,
        style: 'ios9'
    });

    siriWave.start();
});

onUnmounted(() => {
    if( siriWave ){
        siriWave.stop();
    }
});

</script>

<style scoped>
.siri-container{
    width: 100%;
    height: 50%;
    bottom: 10%;
    position: relative;
}
</style>
