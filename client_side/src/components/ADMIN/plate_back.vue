<script setup>
import API from "../../axiosinstance/axiosInstance.js"
import  {onMounted,ref,inject} from "vue";
import { ElMessage } from 'element-plus'
import {useStore} from '../../pinia/index.js'

const isShow=ref(true)
const multipleSelection = ref([])
const dialogVisible = ref(false)
const pList=ref()


onMounted(()=>{
  API({
    url:'/plate/findall',
    method:"GET",
  }).then((res)=>{
    // iftrue
    pList.value=res.data
    isShow.value=true
  })
})
</script>

<template>
  <el-button type="primary" @click="dialogVisible=true">板块插入</el-button>
  <el-button type="danger" @click="pDelete">板块删除</el-button>

  <el-table :data="pList"
            height="650"
            style="width: 100%"
            v-if="isShow"
            @selection-change="handleSelectionChange">
    <el-table-column type="selection" width="55" />
    <el-table-column prop="name" label="板块主题" width="230" />
    <el-table-column prop="detail" label="板块简介" width="180" />
    <el-table-column prop="click_qty" label="点击数" width="180" />
    <el-table-column prop="post_qty" label="主题数" width="230" />
  </el-table>
</template>

<style scoped>

</style>