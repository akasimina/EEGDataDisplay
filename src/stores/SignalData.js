import { defineStore } from 'pinia';
import { ref } from 'vue';
export const useSignalStore = defineStore('SignalData', () => {
    const signal = ref({
        alpha: Math.round(Math.random() * 10),
        beta: Math.round(Math.random() * 10),
        gamma: Math.round(Math.random() * 10),
        theta: Math.round(Math.random() * 10),
        delta: Math.round(Math.random() * 10)
    });

    const increment = () => {
        //后续补充
    }
    return { signal, increment }
});

