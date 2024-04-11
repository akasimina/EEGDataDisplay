<template>
    <n-dropdown trigger="click" :options="options" @select="handleSelect">
        <div class="MenuFrame">
            <img src="/assets/icons/Menu.svg" alt="菜单图标" class="Icon"/>
        </div>
    </n-dropdown>
</template>

<script setup>
import { NDropdown } from 'naive-ui';

const options = [
    {
        label: "滨海湾金沙，新加坡",
        key: "marina bay sands",
        disabled: true,
    },
    {
        label: "布朗酒店，伦敦",
        key: "brown's hotel, london",
    },
    {
        label: "亚特兰蒂斯巴哈马，拿骚",
        key: "atlantis nahamas, nassau",
    },
    {
        label: "比佛利山庄酒店，洛杉矶",
        key: "the beverly hills hotel, los angeles",
    },
];

const handleSelect = (key) => {
    message.info(String(key));
};
</script>

<style>
@import '../style.css'; 
</style>
