<template>
    <div class="column1">
        <div class="alphawave">
            <ChartS :c-numbers="1" :label-color="'#FFCDCD'" :chart-type="['bar']" :chartarea-style="['none']" :chartname="Mediation1" :chart-color="['#F5E1E1']"/>
        </div>
        <div class="alphawave">
            <ChartS :c-numbers="1" :label-color="'#FFCDCD'" :chart-type="['bar']" :chartarea-style="['none']" :chartname="Mediation2" :chart-color="['#F5E1E1']"/>
        </div>
        <div class="relatedwave">
            <ChartS :c-numbers="2" :label-color="'#FFCDCD'" :chart-type="['bar', 'line']" :chartarea-style="['none', {}]" :chartname="beta" :chart-color="['#F5E1E1', '']"/>
        </div>
        <div class="relatedwave">
            <ChartS :c-numbers="2" :label-color="'#1E1E1E'" :chart-type="['bar', 'line']" :chartarea-style="['none', {}]" :chartname="theta" :chart-color="['#F5E1E1', '']"/>
        </div>
    </div>
</template>

<script setup>
import ChartS from '../components/ChartS.vue';
</script>

<style>
.column1 {
    width: 34%;
    height: 100%;
}

.alphawave {
    width: 100%;
    height: 27.5%;
    border-bottom: 1px solid #CDE1F5;
}

.relatedwave {
    width: 100%;
    height: 22.5%;
    border-top: 1px solid #CDE1F5;
}
</style>
