<template>
    <div class="FractionalFrame">
        <div class="Score">{{ props.leftscore }} / {{ signaldata.signal.alpha }}</div>
        <div class="hint">
            <div class="point" />
                {{ props.hint }}
        </div>
    </div>
</template>

<script setup>
import { defineProps } from 'vue';
import { useSignalStore } from '@/stores/SignalData.js';
const props = defineProps({
    hint: String,
    leftscore: Number,
    rightscore: Number
});

const signaldata = useSignalStore();

</script>

<style>
@import '../style.css'; 
</style>