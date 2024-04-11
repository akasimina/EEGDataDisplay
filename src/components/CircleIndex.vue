<template>
<div class="IndexFrame">
<div class="circle" :style="{ boxShadow: boxShadowStyle }">99</div>
</div>
</template>

<script setup>
import { inject, computed } from 'vue';
const indexName = inject('name');
const props = defineProps(['order'])

const boxShadowStyle = computed(() => {
    const color = getColorByOrder(props.order);
    return `10px 0px 10px 0px ${color}`;
});
const getColorByOrder = ( order ) =>{
    if( order % 2 == 0  ) return '#5AA0EB';
    return '#FFCDCD';
};
</script>

<style>
.IndexFrame{
    width: 18%;
    height: 70%;

}

.circle {
    width: 100%;
    aspect-ratio: 1/1;
    border: 1px solid #5AA0EB;
    border-radius: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 2rem;
    font-weight: bold;
}
</style>
