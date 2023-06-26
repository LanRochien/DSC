<template>
  <div class="signupbody">
  <div class="head">
    <h2>加入我们</h2>
    </div>
  <div class="main">
  <el-form :model="form" label-width="120px">
    <el-form-item label="用户名">
      <el-input v-model="form.name" />
    </el-form-item>
    <el-form-item label="密码">
      <el-input v-model="form.name" />
    </el-form-item>
    <el-form-item label="所在地区">
      <el-select v-model="form.region" placeholder="please select your zone">
        <el-option label="Zone one" value="shanghai" />
        <el-option label="Zone two" value="beijing" />
      </el-select>
    </el-form-item>
    <el-form-item label="出生日期">
      <el-col :span="11">
        <el-date-picker
            v-model="form.date1"
            type="date"
            placeholder="Pick a date"
            style="width: 100%"
        />
      </el-col>
      <el-col :span="2" class="text-center">
        <span class="text-gray-500">-</span>
      </el-col>

    </el-form-item>
    <el-form-item label="公益推送">
      <el-switch v-model="form.delivery" />
    </el-form-item>
    <el-form-item label="角色">
      <el-checkbox-group v-model="form.type">
        <el-checkbox label="患者" name="type" />
        <el-checkbox label="患者家属" name="type" />
        <el-checkbox label="志愿者" name="type" />
        <el-checkbox label="爱心人士" name="type" />
      </el-checkbox-group>
    </el-form-item>
    <el-form-item label="性别">
      <el-radio-group v-model="form.resource">
        <el-radio label="男" />
        <el-radio label="女" />
      </el-radio-group>
    </el-form-item>
    <el-form-item>
      <div class="btn">
      <el-button type="primary" @click="onSubmit">Create</el-button>
      <el-button>Cancel</el-button>
      </div>
    </el-form-item>
  </el-form>
  </div>
  </div>
</template>

<script lang="ts" setup>
import { reactive } from 'vue'

// do not use same name with ref
const form = reactive({
  name: '',
  region: '',
  date1: '',
  date2: '',
  delivery: false,
  type: [],
  resource: '',
  desc: '',
})

const onSubmit = () => {
  console.log('submit!')
}
</script>

<style scoped>
.signupbody{
  margin: 0 auto;
  padding-bottom: 0px;
  margin-top: 10vw;
}
.main{
  max-width: 600px;
  margin: 0 auto;
  border-style: solid;
  border-radius: 5px;
  padding-right: 2vw;
}
.btn{
  margin-left:7vw;
}
.head{
  text-align: center;
  width:100%;
  margin: 0 auto;
 margin-top: 10px;
}
</style>