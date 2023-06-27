<script setup>
import {reactive,onMounted} from "vue";
import {alldata} from "@/http/data/index";
export default {
  name:"app",
  setup(){
    const datas=reactive({
      value:[],
    })
    const methods={
      requestall(){
         const data={
           pageNum:10,
           pageSize:5,
           articleId:100,
         };
         alldata(data).then(res=>{
           datas.value=res
           console.log(res);
         }).catch(err=>{
           console.log(err)
         })
      }
    }
    onMounted(()=>{
      methods.requestall()
    })
    return{
      ...methods
    }
  }
}
</script>

<template>

</template>

<style scoped>

</style>