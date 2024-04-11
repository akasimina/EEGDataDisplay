<template>
<div class="IndexsFrame">
    <div class="IndexNameBar">
        <div class="Name"  v-for="value in indexList" >{{ value }}</div>
    </div>
    <div class="IndexBar">
        <CircleIndex v-for="value in 4" :key="value" :order="value"/>
    </div>
    <div class="StatuBar">
        <div class="Status" v-for="value in statusList" >{{ value }}</div>
    </div>
</div>
</template>

<script setup>
import { ref } from 'vue';
import CircleIndex from '@/components/CircleIndex.vue';
const indexList = ref(['attention', 'relax', 'emotion', 'tired']);
const statusList = ref(['Focus', 'Relax', 'Peace', 'Energetic']);
</script>

<style>
.IndexsFrame{
    width: 95%;
    aspect-ratio: 11/5;
    background-color: #F5F0EB;
    border-radius: 30px;
    position: relative;
    top: 10%;
    left: 2.5%;
}
.Name{
    position: relative;
    width: 20%;
    top: 20%;
    font-size: 1.5rem;
    /* font-weight: bolder; */
}
.IndexNameBar{
    position: relative;
    display: flex;
    height: 30%;
    justify-content: space-around;
    align-items: center;
}
.IndexBar{
    width: 100%;
    height: 65%;
    border-bottom: 2px solid #B9B4B4;
    display: flex;
    justify-content: space-around;
    align-items: center;
}
.StatuBar{
    width: 100%;
    height: 35%;
    display: flex;
    justify-content: space-around;
    align-items: center;
}
.Status{
    width: 20%;
    font-size: 1.5rem;
    /* font-weight: bold; */
}
</style>
