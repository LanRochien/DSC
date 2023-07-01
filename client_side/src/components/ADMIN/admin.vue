<template>
  <el-row class="tac">
    <el-col :span="12">
      <el-menu
          active-text-color="#ffd04b"
          background-color="#545c64"
          class="cebianlan"
          default-active="2"
          text-color="#fff"
          @open="handleOpen"
          @close="handleClose"
      >
        <el-sub-menu index="1" >
          <template #title>
            <el-icon><location /></el-icon>
            <span id="title">管理员界面</span>
          </template>
        <el-menu-item-group>
        <el-menu-item index="1-1">
          <el-icon><icon-menu /></el-icon>
          <span>用户信息</span>
        </el-menu-item>
        <el-menu-item index="1-2" >
          <el-icon><document /></el-icon>
          <span>论坛信息</span>
        </el-menu-item>
        <el-menu-item index="1-3">
          <el-icon><setting /></el-icon>
          <span>活动信息</span>
        </el-menu-item>
        </el-menu-item-group>
        </el-sub-menu>
      </el-menu>
    </el-col>
  </el-row>
  <div class="header">
  <el-page-header @back="goBack">
    <template #content>
      <span class="text-large font-600 mr-3"> Welcome,administrator</span>
    </template>
  </el-page-header>
  </div>
  <div class="adminperson">
  <el-avatar :size="'large'" :src="circleUrl" shape="circle" class="touxiang"/>
    <el-text type="primary" class="adminshuoming">Administrator</el-text>
  </div>
  <div class="details">contents</div>
</template>

<script lang="ts" setup>
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
} from '@element-plus/icons-vue'
const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const goBack = () => {
  console.log('go back')
}
import { reactive, toRefs } from 'vue'

const state = reactive({
  circleUrl:
      'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png',
  squareUrl:
      'https://cube.elemecdn.com/9/c2/f0ee8a3c7c9638a54940382568c9dpng.png',
})
const { circleUrl, squareUrl } = toRefs(state)
</script>
<style scoped>
.cebianlan{
  width: 300px;
  height: 792px;
}
.header{
  width: 79vw;
  position: absolute;
  left:300px;
  top:10px;
  border-bottom-style: solid;
  border-bottom-color: black;
  border-bottom-width: 2px;
}

.adminperson{
  position: absolute;
  width: 79vw;
  height: 70px;
  top:50px;
  left:300px;
  text-align: center;
  border-bottom-style: solid;
  border-bottom-color: #1280b4;
}
.touxiang{
  display: block;
  margin-left:10px;
}
.adminshuoming{
  display: block;
  margin-left: 84px;
  margin-top: -42px;
  font-size: 20px;
  width: 150px;
}
.details{
  font-size: 40px;
  position: absolute;
  left:800px;
  top:300px;
}
</style>
