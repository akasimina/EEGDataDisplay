<template>
    <div class="meditationcard">
        <div class="headBar">
            <div id="Meditation">Meditaion</div>
            <div id="meditationscore">Score</div>
        </div>
        <div class="meditationFrame">
            <div id="minHint">0</div>
            <div class="meditationBar">
                <n-progress type="line" :percentage="60" color="#5AA0EB"  height="8" unit="" />
            </div>
        </div>
        <div class="alphaFrame">
            <div id="scorehint">alpha score</div>
            <div class="alphaBar">
                <n-progress type="line" :percentage="60" color="#5AA0EB"  height="8" unit=""/>
            </div>
        </div>
        <div class="betaFrame">
            <div id="scorehint">theta score</div>
            <div class="betaBar">
                <n-progress type="line" :percentage="60" color="#5AA0EB" height="8" unit=""/>
            </div>
        </div>
    </div>
</template>

<script setup>
import { NCard, NProgress } from 'naive-ui';

</script>

<style>
.meditationcard {
    width: 95%;
    aspect-ratio: 11/6;
    border-radius: 30px;
    background-color: #F5F0EB;
    position: relative;
    top: 5%;
    left: 2.5%
}

.meditationBar {
    width: 100%;
    height: 25%;
}

.alphaBar {
    width: 100%;
    height: 1%;
}

.betaBar {
    width: 100%;
    height: 25%;
}

.headBar {
    height: 25%;
    position: relative;
    width: 100%;
    height: 25%;
    display: flex;
    justify-content: space-between;
}

#Meditation {
    font-weight: bold;
    font-size: large;
    position: relative;
    top: 30%;
    left: 5%;
    display: inline-block;
}

#meditationscore {
    position: relative;
    top: 40%;
    right: 20%;
    font-size: small;
}

#meditationscore::before {
    content: "";
    display: inline-block;
    width: 10px;
    height: 10px;
    border-radius: 100%;
    background-color: #5AA0EB;
    margin-right: 10px;
}

.meditationBar,
.alphaBar,
.betaBar {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 70%;
}

.meditationFrame,
.alphaFrame,
.betaFrame {
    position: relative;
    height: 25%;
    width: 100%;
    display: flex;
    justify-content: space-around;
    align-items: center;
}

#minHint::before {
    content: "";
    display: inline-block;
    width: 10px;
    height: 10px;
    border-radius: 10px;
    background-color: #58E5DC;
    margin-right: 10px;

}

#minHint, #scorehint {
    width: 20%;
}

#minHint{
    position: relative;
    left: 10px;
}
</style>
