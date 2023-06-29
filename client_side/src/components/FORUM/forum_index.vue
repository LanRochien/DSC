<script setup>
import Menu from "@/components/COMPONENT/menu.vue";
import {ref}from 'vue'
import API from "../../axiosinstance/axiosInstance.js"//API路径
import {useRouter} from 'vue-router'
const router=useRouter()
const current='/forum'
const plate=ref()
const toPlate=(id)=>{
  console.log(id)
  router.push({
    name:'plate',
    params:{
      plateid:id
    }
  })
}
API({
  url:'/plate',
  method:'GET'
}).then((res)=>{
  plate.value=res.data.forum
})
</script>

<template>
<Menu :current=current></Menu>
  <div class="dock">
  <div class="wrapper">
  <div class="plate_block" v-for="item in plate">
    <el-card class="box-card">
    <template #header>
      <div class="plate_header">
        <span>{{ item.name }}</span>
        <el-button class="button" @click="toPlate(item.id)" text>进入板块</el-button>
      </div>
      <div class="plate_info">
        <span>点击数: {{item.click_qty}}</span>
        <span>帖子数:{{item.post_qty}}</span>
      </div>
    </template>
    <div class="plate_img"><img :src="item.plate_img"></div>
  </el-card>
  </div>
  </div></div>
<!--  傻逼布局，两层父元素一层flex一层float-->
</template>

<style scoped>
.dock{
  display: flex;
  align-items: center;
  justify-content: center;
}
.wrapper{
  width: 1320px;

  overflow: hidden;
}
.plate_block{
  float: left;
  margin: 20px 20px;
  width: 620px;
  height:fit-content;

}
.plate_block img{
  width: 100%;
}
.plate_header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.plate_info{
  color: #cccccc;
  font-size: 12px;
}
.plate_info span{
  margin-right: 10px;
}
</style>