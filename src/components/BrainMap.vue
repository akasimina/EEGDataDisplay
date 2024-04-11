<template>
    <div ref="container" id="map"></div>
</template>

<script setup>
import { onMounted, ref } from 'vue';
import * as THREE from 'three';
import { PCDLoader } from 'three/examples/jsm/loaders/PCDLoader.js';
import { GUI } from 'three/examples/jsm/libs/lil-gui.module.min.js';
import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls.js';

const container = ref(null);


onMounted(() => {
    initThree();
});

const initThree = () => {
    const scene = new THREE.Scene();
    const renderer = new THREE.WebGLRenderer({ antialias: true, alpha: true });
    renderer.setClearColor(0x000000, 0); // 设置清除颜色为黑色，但是完全透明
    renderer.setPixelRatio(window.devicePixelRatio);
    renderer.setSize(window.innerWidth * 0.35, window.innerHeight * 0.35);
    container.value.appendChild(renderer.domElement);
    const render = () => {
        renderer.render(scene, camera);
    };

    const camera = new THREE.PerspectiveCamera(
        30,
        window.innerWidth / window.innerHeight,
        0.01,
        40
    );
    camera.position.set(0, 0, 1);
    scene.add(camera);

    // const controls = new OrbitControls(camera, renderer.domElement);
    // controls.addEventListener('change', render);
    // controls.minDistance = 0.5;
    // controls.maxDistance = 10;


    const loader = new PCDLoader();
    loader.load('/assets/ThreeDPicture/Zaghetto.pcd', (points) => {
        points.geometry.center();
        points.geometry.rotateX(Math.PI);
        scene.add(points);
        points.position.set(-0.25, -0.05, 0);
        points.scale.set(1.4, 1.4, 1);
        points.rotation.set(0.3, 0.5, -0.2);
        points.material.size = 0;
        // const gui = new GUI();
        // gui.add(points.material, 'size', 0.001, 0.01).onChange(render);
        // gui.addColor(points.material, 'color').onChange(render);
        // gui.open();
        points.material.color.set(0xF9EAEA);

        render();
    });

    function animate() {
        requestAnimationFrame(animate);
        // controls.update();
        render();
    }
    animate();
};
</script>

<style>
#map {
    width: 100%;
    height: 100%;
    top: 10%;
    position: relative;
}

</style>