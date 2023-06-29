<script setup>
import {onMounted} from "vue";
import {useRouter} from "vue-router";

const router=useRouter()
onMounted(()=>{
  console.log(router.currentRoute.value.params)
})
</script>

<template>

</template>

<style scoped>

</style>