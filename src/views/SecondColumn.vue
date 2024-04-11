<template>
<div class="column2">
    <div class="mapFrame">
        <BrainMap />
    </div>
    <div class="originalWave">
        <ChartS :c-numbers="1" :label-color="'#FFCDCD'" :chart-type="['line']" :chartarea-style="[{}]" :chartname="Origin1" :chart-color="['#F5E1E1']"/>
    </div>
    <div class="originalWave">
        <ChartS :c-numbers="1" :label-color="'#1E1E1E'" :chart-type="['line']" :chartarea-style="[{}]" :chartname="Origin2" :chart-color="['#F5E1E1']"/>
    </div>
</div>
</template>

<script setup>
import BrainMap from '../components/BrainMap.vue';
import ChartS from '../components/ChartS.vue';
</script>

<style>
.column2{
    height: 100%;
    width: 26%;
}
.mapFrame{
    height: 55%;
    width: 100%;
    border: 1px solid #CDE1F5;
    position: relative;
    overflow: hidden;
    border-top: 0px;
}
.originalWave{
    width: 100%;
    height: 22.5%;
    border-left: 1px solid #CDE1F5;
    border-right: 1px solid #CDE1F5;
}
.originalWave:last-of-type{
    border-top: 1px solid #CDE1F5;
}
</style>

