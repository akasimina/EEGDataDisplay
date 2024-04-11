<template>
    <div class="playBar">
        <div class="icon" v-for="(iconPath, index) in iconPaths" :key="index" >
            <img :src="iconPath" class="img-class">
        </div>
        
    </div>
</template>


<script setup>
import { ref } from 'vue';

const prePath = '/public/assets/icons/';
const iconPaths = ref([
    'playlist.svg',
    'last.svg',
    'play.svg',
    'next.svg',
    'collect.svg'
].map(icon => prePath + icon));

console.log(iconPaths);

</script>

<style scoped>
.icon {
    display: flex;
    align-items: center;
    justify-content: center;
    transition: transform 0.3s ease;
}
.playBar {
    width: 100%;
    height: 50%;
    display: flex;
    justify-content: space-around;
}
.img-class{
    width: 80%;
    height: auto;
    
}
.icon:hover{
    transform: scale(1.2);
}
</style>
