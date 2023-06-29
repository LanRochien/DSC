<template>
<div class="menu">
<el-menu
    :default-active="current"
    class="el-menu"
    mode="horizontal"
    :ellipsis="false"
    :router="true"
    @select="handleSelect"
>
  <el-menu-item index="0">LOGO</el-menu-item>
  <el-menu-item index="/index">首页</el-menu-item>
  <el-menu-item index="/activities">活动</el-menu-item>
  <el-menu-item index="/forum">论坛</el-menu-item>
  <div class="flex-grow" />
  <el-menu-item>
  <el-input
      v-model="input"
      class="w-50 m-2"
      placeholder="全站搜索"
      :suffix-icon="Search"
  />
  </el-menu-item>
  <el-sub-menu v-if="login">
    <template #title>  <el-avatar  :icon="UserFilled" /></template>
    <div class="user_info">
      <div class="username">{{user.name}}</div>
    </div>
    <el-menu-item> 个人中心</el-menu-item>
  </el-sub-menu>
  <el-menu-item v-else index="/login" >
    <div >登录</div>
  </el-menu-item>

</el-menu>
  </div>
</template>
<script lang="ts" setup>
import {ref} from "vue";
import { Search } from '@element-plus/icons-vue'
import { UserFilled } from '@element-plus/icons-vue'
import API from "../../axiosinstance/axiosInstance.js"//API路径


const input=ref("")
const login=ref(false)
const user=ref({})
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}

API({
  url:'/test',
  method:'GET'
}).then((res)=>{

  user.value=res.data

})

defineProps({
  current:String,
})
</script>
<style scoped>
.el-menu{
  position: fixed;
  width: 100%;
  height: 60px;
  z-index: 99;
}
.menu{
  height: 60px;
}
.flex-grow {
  flex-grow: 1;
}
.user_info{
  width: 100%;
  height: 150px;
  text-align: center;
  border: 1px solid black;
}
</style>