<template>

      <el-menu
          style="width: 300px;"
          active-text-color="#ffd04b"
          background-color="#545c64"
          class="side_menu"
          default-active="2"
          text-color="#fff"
          @open="handleOpen"
          @close="handleClose"
          :router="true"

      >
        <el-sub-menu index="1" >
          <template #title>
            <el-icon><location /></el-icon>
            <span id="title">管理员界面</span>
          </template>
        <el-menu-item-group>
        <el-menu-item index="/admin/users">
          <el-icon><icon-menu /></el-icon>
          <span>用户信息</span>
        </el-menu-item>
        <el-menu-item index="/admin/activity">
          <el-icon><setting /></el-icon>
          <span>活动管理</span>
        </el-menu-item>
          <el-menu-item index="/admin/plate">
            <el-icon><setting /></el-icon>
            <span>板块管理</span>
          </el-menu-item>
          <el-menu-item index="/admin/post">
            <el-icon><setting /></el-icon>
            <span>帖子管理</span>
          </el-menu-item>
        </el-menu-item-group>
        </el-sub-menu>
      </el-menu>

  <div class="adminperson">
  <el-avatar :size="'large'" :src="circleUrl" shape="circle" class="touxiang"/>
    <el-text type="primary" class="adminshuoming">Administrator</el-text>
  </div>
  <div class="details">
    <router-view></router-view>
  </div>
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
.side_menu{
  position: fixed;
  width: 300px;
  height: 100%;
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
  position: absolute;
  left: 300px;
  top: 150px;
  width: 1382px;
  overflow: hidden;
}
</style>
