<template>
<div class="menu">
<el-menu
    :default-active="activeIndex"
    class="el-menu"
    mode="horizontal"
    :ellipsis="false"
    @select="handleSelect"
>
  <el-menu-item index="0">LOGO</el-menu-item>
  <el-menu-item index="1">首页</el-menu-item>
  <el-menu-item index="2">活动</el-menu-item>
  <el-menu-item index="3">论坛</el-menu-item>
  <div class="flex-grow" />

</el-menu>
</div>
</template>
<script lang="ts" setup>
import {ref} from "vue";

const activeIndex = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
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
  //flex-grow: 1;
}
</style>