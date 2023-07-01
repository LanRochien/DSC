<template>

  <el-descriptions
      class="userform"
      title="论坛信息表"
      direction="vertical"
      :column="8"
      border
  >
    <el-descriptions-item label="帖子信息1">kooriookami</el-descriptions-item>
    <el-descriptions-item label="帖子信息2">18100000000</el-descriptions-item>
    <el-descriptions-item label="帖子信息3" :span="2">Suzhou</el-descriptions-item>
    <el-descriptions-item label="帖子信息4">test</el-descriptions-item>
    <el-descriptions-item label="帖子信息5">test</el-descriptions-item>
    <el-descriptions-item label="帖子信息6">test</el-descriptions-item>
    <el-descriptions-item label="功能">
      <el-button type="功能" class="btn">Success</el-button>
    </el-descriptions-item>
  </el-descriptions>
</template>

<script setup lang="ts">
import API from "../../axiosinstance/axiosInstance.js"
import  {onMounted} from "vue";
onMounted(()=>{

})
</script>

<style scoped>
.el-descriptions {
  margin-top: 20px;
}
.userform{
  width:800px;
  margin:0 auto;
  text-align: center;
}
.btn{

}

</style>
