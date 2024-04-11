<template>
    <div class="table">
        <div class="top">
            <UpperBar />

            <div class="box">
                <div class="left">
                    <FirstColumn />
                    <SecondColumn />
                    <ThirdColumn />
                </div>
                <div class="right">
                    <IndicatorCard />
                    <OtherIndex />
                </div>
            </div>
        </div>
    </div>
</template>

<script setup>
import UpperBar from './UpperBar.vue';
import IndicatorCard from './IndicatorCard.vue';
import OtherIndex from './OtherIndex.vue';
import FirstColumn from './FirstColumn.vue';
import SecondColumn from './SecondColumn.vue';
import ThirdColumn from './ThirdColumn.vue';
</script>
<style>
.table {
    border: 3px solid #CDE1F5;
    box-sizing: border-box;
    width: 90vw;
    height: 90vh;
    padding: 1rem;
    background: linear-gradient(to bottom, #6496B9, #D7C8D2 50%);
    border-radius: 60px;
    position: relative;
}

.top {
    width: 100%;
    height: 100%;
    background-color: transparent;
    box-sizing: border-box;
    border-radius: 40px;
    position: relative;
    z-index: 1;
    border-width: 3px 1px 2px 1px;
    border-color: #CDE1F5;
    border-style: solid;
}

.box {
    box-sizing: border-box;
    display: flex;
    width: 100%;
    height: 82.5%;
    /* background-color: grey; */
    position: relative;
    z-index: 2;
}

.left {
    width: 65%;
    height: 100%;
    border-radius: 40px;
    border: 2px solid #CDE1F5;
    background: linear-gradient(to bottom, #2D4673, transparent);
    box-sizing: border-box;
    display: flex;

}


.right {
    flex: 1;
    height: 100%;
    background-color: transparent;
    margin-left: 1rem;
    border-radius: 40px;
    border: 2px solid #CDE1F5;
    box-sizing: border-box;
    position: relative;
}
</style>
