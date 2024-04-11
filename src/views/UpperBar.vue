<template>
<div class="buttonContainer">
    <ButtonScore v-for="(value, key) in signal.signal" :hint="key" :leftscore="value" />
    <DropMenu />
</div>
</template>

<script setup>
import ButtonScore from '../components/ButtonScore.vue';
import DropMenu from '../components/DropMenu.vue';
import { useSignalStore } from '@/stores/SignalData.js';

const signal = useSignalStore();

</script>

<style scoped>

</style>
