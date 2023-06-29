<script setup>
import {onMounted} from "vue";
import {useRouter} from "vue-router";
import {ref} from 'vue'
import Menu from "@/components/COMPONENT/menu.vue";
import API from "../../axiosinstance/axiosInstance.js"//API路径
const current='/forum'
const router=useRouter()
const postId=ref()
onMounted(()=>{
  postId.value=router.currentRoute.value.params.postid
  API({
    url:'',
    //传参使用指定postid
    method:'GET'
  }).then((res)=>{

  })

})
</script>

<template>

</template>

<style scoped>

</style>