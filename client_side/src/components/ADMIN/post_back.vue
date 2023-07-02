<script setup>
import {ElTable} from "element-plus";
import  {onMounted,ref,inject} from "vue";

const isShow=ref(true)
</script>


<template>

  <el-table :data="pList"
            height="650"
            style="width: 100%"
            highlight-current-row
            ref="singleTableRef"
            v-if="isShow"
            @current-change="handleCurrentChange"
  >
    <el-table-column type="index" width="50" />
    <el-table-column prop="name" label="板块主题" width="230" />
    <el-table-column prop="id" label="板块ID" width="180" />
    <el-table-column prop="detail" label="板块简介" width="180" />
    <el-table-column prop="click_qty" label="点击数" width="180" />
    <el-table-column prop="post_qty" label="主题数" width="230" />
  </el-table>
</template>

<style scoped>

</style>