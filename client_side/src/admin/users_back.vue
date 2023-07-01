<template>

  <el-descriptions
      class="userform"
      title="用户表"
      direction="vertical"
      :column="6"
      border
  >
    <el-descriptions-item label="用户名">kooriookami</el-descriptions-item>
    <el-descriptions-item label="角色">18100000000</el-descriptions-item>
    <el-descriptions-item label="ID" :span="2">Suzhou</el-descriptions-item>
    <el-descriptions-item label="密码">test</el-descriptions-item>
    <el-descriptions-item label="功能">
      <el-button type="功能" class="btn">Success</el-button>
    </el-descriptions-item>
  </el-descriptions>
</template>

<script setup lang="ts">
</script>

<style scoped>
.el-descriptions {
  margin-top: 20px;
}
.userform{
  width:600px;
  margin:0 auto;
  text-align: center;
}
.btn{

}

</style>
