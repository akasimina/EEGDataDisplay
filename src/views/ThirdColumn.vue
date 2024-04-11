<template>
<div class="column3">
    <div class="Chart3">
        <ChartS :c-numbers="1" :label-color="'#FFCDCD'" :chart-type="['line']" :chartarea-style="[{}]" :chartname="MediationLine" :chart-color="['#F5E1E1']"/>
    </div>
    <div class="Chart3">
        <ChartS :c-numbers="2" :label-color="'#FFCDCD'" :chart-type="['line', 'line']" :chartarea-style="[{}, {}]" :chartname="Frequency" :chart-color="['#F5E1E1', '']"/>
    </div>
    <div class="AudioEffect">
        <SiriWave />
        <MusicPlayBar />
    </div>
</div>
</template>

<script setup>
import MusicPlayBar from '../components/MusicPlayBar.vue';
import SiriWave from '../components/SiriWave.vue';
import ChartS from '../components/ChartS.vue';
</script>

<style>
.column3{
    width: 40%;
    height: 100%;
}
.Chart3{
    height: 27.5%;
    width: 100%;
    border-bottom: 1px solid #CDE1F5;
}
.AudioEffect{
    height: 45%;
    width: 100%;
    position: relative;
    overflow: hidden;
}
</style>



