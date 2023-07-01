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
    <el-input v-model="search" class="w-50 m-2" placeholder="Search for Activity or Post">
      <template #prefix>
        <el-icon class="el-input__icon" @click="toSearch()"><Search style="width: 1em; height: 1em; margin-right: 8px" />
        </el-icon>
      </template>
    </el-input>
  </el-menu-item>
  <el-sub-menu v-if="isLogin" index="/person">
    <template #title>  <el-avatar  :icon="UserFilled" /></template>
    <div class="user_info">
      <div class="username">{{store.user.name}}</div>
      <div class="user_role"> 用户组：{{ store.user.state }}</div>
      <div class="user_sex">性别：{{store.user.sex}}</div>
      <div class="record_time">
        <div>注册日期：{{store.user.record_date}}</div>
      </div>
      <div class="forum_info">
        <div >发帖数：{{store.user.post_qty}}</div>
        <div>回复数：{{store.user.reply_qty}}</div>
      </div>
    </div>

    <el-menu-item @click="toPersonal"> 个人中心</el-menu-item>
    <el-menu-item @click="logOut"> 退出登录</el-menu-item>

  </el-sub-menu>
  <el-menu-item v-else index="/login" >
    <div >登录</div>
  </el-menu-item>

</el-menu>
  </div>
</template>
<script lang="ts" setup>
import {onMounted, ref,inject} from "vue";
import { UserFilled } from '@element-plus/icons-vue'
import {useStore} from '../../pinia/index.js'
import {useRouter} from "vue-router";

const reLoad=inject('reLoad')
const search=ref("")
const isBan=ref(false)
const isLogin=ref(false)
const store=useStore()
const router=useRouter()


const logOut=()=>{
  store.user={}
  reLoad()
}
const toSearch=()=>{
  if(typeof (search.value)!==undefined&&search.value!==""){
  store.searchKey=search.value
    console.log(store.searchKey)
    router.push({
      name:"search",
      params:{
        key:store.searchKey
      }
    })
    reLoad()
  }
}
const checkLogin=()=>{
  if(typeof (store.user.name)!="undefined"){
    isLogin.value=true
    if (store.user.role!==-1)
      isBan.value=true
    else isBan.value=false
  }
  else isLogin.value=false
}
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const toPersonal=()=>{
  const name=store.user.name
  router.push({
    name:'personal',
    params:{
      id:name
    }
  })
}
onMounted(()=>{
  // console.log(store.user)
    const rules=['已封禁','管理员','普通用户','志愿者']
    store.user.state= rules[(store.user.role+1)%4]

  checkLogin()

})

defineProps({
  current:String,
})
defineExpose({
  login: isBan
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
  height: 130px;
  text-align: center;
}
</style>