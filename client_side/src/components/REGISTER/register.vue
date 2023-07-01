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
      <el-input v-model="form.password" type="password" />
    </el-form-item>
    <el-form-item label="所在地区">
      <el-cascader v-model="form.location" :options="pcTextArr" @change="handleChange" />
    </el-form-item>
    <el-form-item label="出生日期">
      <el-col :span="11">
        <el-date-picker
            v-model="form.birthday"
            type="date"
            placeholder="Pick a date"
            style="width: 100%"
            value-format="YYYY-MM-DD"
        />
      </el-col>
      <el-col :span="2" class="text-center">
        <span class="text-gray-500">-</span>
      </el-col>

    </el-form-item>
    <el-form-item label="性别">
      <el-radio-group v-model="form.sex">
        <el-radio label="男" />
        <el-radio label="女" />
      </el-radio-group>
    </el-form-item>
    <el-form-item>
      <div class="btn">
      <el-button type="primary" @click="onSubmit">注册</el-button>
      <el-button @click="onCancel">取消</el-button>
      </div>
    </el-form-item>
  </el-form>
  </div>
  </div>
</template>

<script lang="ts" setup>
import { ref} from 'vue'
import {useRouter} from "vue-router";
import API from "../../axiosinstance/axiosInstance.js"//API路径
import {pcTextArr} from "element-china-area-data";
import { ElMessage } from 'element-plus'
const router=useRouter()
// do not use same name with ref
const form = ref({
  role:0,
  id:0,
  name: '',
  password:'',
  sex:'',
  birthday:'',
  location:'',

})
const handleChange = (value) => {
  console.log(value)
}
const getDate=(n)=>{
  n=new Date(n)
  return n.toLocaleDateString().replace(/\//g,"-")
}
const onSubmit = () => {

  const currentDate=getDate(Date.now())
  console.log(currentDate)
  API({
    url:'/user/register',
    method:'POST',
    data:{
      role:form.value.role,
      id:form.value.id,
      name: form.value.name,
      password:form.value.password,
      sex:form.value.sex,
      record_date:currentDate,
      birthday:form.value.birthday,
      location:form.value.location,
      post_qty:0,
      reply_qty:0,
      head_url:'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png'
    }
  }).then((res)=>{
    if(res.data.resp.status==200){
      //成功
      setTimeout(()=>{
        router.push('/login')
      },3000)
      ElMessage({
        message: '注册成功，即将跳转至登录页',
        type: 'success',
      })
    }
    else {
      ElMessage.error('出错，请联系管理员')
    }
  })
}
const onCancel = () => {
  router.push('/login')
}
</script>

<style scoped>
.signupbody{
  padding-bottom: 0px;
  margin: 10vw auto 0;
}
.main{
  max-width: 600px;
  margin: 0 auto;
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
  margin-bottom: 30px;
}
</style>