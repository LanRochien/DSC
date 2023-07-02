<script setup>
import { nextTick,provide,ref} from "vue";

const isAlive=ref(true)
const reLoad=()=>{
  isAlive.value=false
  nextTick(()=>{
    isAlive.value=true
  })
}

provide('reLoad',reLoad)
</script>

<template>

  <router-view v-if="isAlive"></router-view>


</template>

<style >

</style>