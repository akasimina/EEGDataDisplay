<template>
    <div ref="_chart" class="chartStyle">

    </div>
</template>

<script setup>
import { onMounted, defineProps, ref } from 'vue';
import * as echarts from 'echarts';

const _chart = ref(null);

// cNumber, labelColor , chartType, chartareaStyle, chartname

const props = defineProps(['cNumbers', 'labelColor', 'chartType', 'chartareaStyle', 'chartname', 'chartColor']);

var option;
/******** 以下代码为测试使用 **********/
var date = [];
var data = [Math.random() * 150];
if (props.cNumbers === 2) var data1 = [Math.random() * 150];

function addData(shift) {
    const now = new Date();
    var formattedTime = [now.getHours(), now.getMinutes(), now.getSeconds()].join(':');
    //   now = [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/');
    date.push(formattedTime);
    data.push((Math.random() - 0.4) * 10 + data[data.length - 1]);
    if (props.cNumbers === 2) data1.push((Math.random() - 0.4) * 10 + data1[data1.length - 1]);
    if (shift) {
        date.shift();
        data.shift();
        if (props.cNumbers === 2 && typeof data1 !== 'undefined') data1.shift();
    }
}

for (var i = 1; i < 100; i++) {
    addData();
}

/******** 以上代码为测试使用 **********/


option = {
    grid: {
        left: '15%',
        right: '5%',
        height: '50%',
        bottom: '25%'
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: date
    },
    yAxis: {
        boundaryGap: [0, '30%'],
        type: 'value',
        splitNumber: 2,
    },
    axisLabel: {
        color: props.labelColor
    },
    series: []
};


for (var i = 0; i < 2; i++) {
    option.series.push({
        name: props.chartname,
        type: props.chartType[i],
        smooth: 'none',
        stack: 'a',
        areaStyle: props.chartareaStyle[i],
        symbol: 'none',
        color: props.chartColor[i]
    });
    if (i == 0) option.series[i].data = data;
    else option.series[i].data = data1;
    if (props.chartType == 'line') {
        option.series[i].lineStyle = { width: 3 };
    }
}

function shiftdata() {
    addData(true);
    _chart.value.setOption({
        xAxis: {
            data: date
        }
    });
    if (props.cNumbers === 1) {
        _chart.value.setOption({
            series: [
                {
                    data: data
                }
            ]
        });
    } else {
        _chart.value.setOption({
            series: [
                {
                    data: data
                },
                {
                    data: data1
                }
            ]
        });
    }
};



onMounted(() => {
    _chart.value = echarts.init(_chart.value);
    _chart.value.setOption(option);
    setInterval(shiftdata, 500);
});

</script>

<style>
.chartStyle {
    width: 100%;
    height: 100%;
}
</style>