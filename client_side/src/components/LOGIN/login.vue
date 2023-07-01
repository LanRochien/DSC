<template>
  <div class="main">
    <div class="logo">
      <h2>登录</h2>
<!--      <div>{{store.count}}</div>-->
    </div>
    <hr id="underline"/>
    <div class="login">
      <el-form
          ref="ruleFormRef"
          :model="ruleForm"
          status-icon
          :rules="rules"
          label-width="150px"
          class="demo-ruleForm"
      >
        <el-form-item label="用户名" prop="name">
          <el-input v-model="ruleForm.name" type="password" autocomplete="off" />
        </el-form-item>
        <el-form-item label="密码" prop="pwd">
          <el-input
              v-model="ruleForm.pwd"
              type="password"
              autocomplete="off"
          />
        </el-form-item>
        <div class="btn">
          <el-form-item>
            <el-button type="primary" @click="submitForm(ruleFormRef)"
            >Submit</el-button
            >
<!--            <el-button @click="resetForm(ruleFormRef)">Reset</el-button>-->
              <el-button @click="naviToreg()">注册</el-button>
          </el-form-item>
        </div>
      </el-form>
    </div>
  </div>
</template>
<script lang="ts" setup>
import {provide, reactive, ref} from 'vue'
import type { FormInstance, FormRules } from 'element-plus'
import {useRouter} from "vue-router"
import API from "../../axiosinstance/axiosInstance.js"//API路径
// import bus from '../../../bus.ts'
import {useStore} from '../../pinia/index.js'
const store=useStore()
const router=useRouter()
const ruleFormRef = ref<FormInstance>()
const userInfo=ref({})
const naviToreg=()=>{
  router.push('/register')
}
const validatePass = (rule: any, value: any, callback: any) => {
  if (value === '') {
    callback(new Error('请输入用户名'))
  } else {
    if (ruleForm.name !== '') {
      if (!ruleFormRef.value) return
      ruleFormRef.value.validateField('checkPass', () => null)
    }
    callback()
  }
}
const validatePass2 = (rule: any, value: any, callback: any) => {
  if (value === '') {
    callback(new Error("请输入密码"))
  } else if (value !== ruleForm.pwd) {
    callback(new Error("密码错误"))
  } else {
    callback()
  }
}

const ruleForm = reactive({
  name: '',
  pwd: '',
})

const rules = reactive<FormRules<typeof ruleForm>>({
  name: [{ validator: validatePass, trigger: 'blur' }],
  pwd: [{ validator: validatePass2, trigger: 'blur' }],

})

const submitForm = (formEl: FormInstance |undefined) => {
  if (!formEl) return
  formEl.validate((valid) => {
    if (valid) {
      console.log('submit!')
      console.log(ruleForm.name);
      console.log(ruleForm.pwd);
      API({
        url:'http://localhost:8129/user/login',
        method:"post",
        params: {
            username: ruleForm.name,
            password: ruleForm.pwd
        }
        // url:'/test',
        // method:'GET'

      }).then((res)=>{
        if(res.status=="200"){
          userInfo.value=res.data
          store.user=res.data.user
          console.log(store.user)
          router.push({
            path:'/index'
          })
        }
        console.log(res)
      })

    } else {
      console.log('error submit!')
      return false
    }
  })
}

const resetForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.resetFields()
}
provide('userInfo',userInfo)
</script>
<style scoped>
.logo{
  width:30vw;
  height: 5vw;
  text-align: center;
  line-height: 5vw;

}
.main{
  background-color: rgba(144,72,87,0.2);
  border-radius: 5px;
  margin:0 auto;
  width: 30vw;
  margin-top:10vw;




}
#underline{
  width: 100%;
  color: white;
}
.login{
  margin-left: -5vw;
  max-width: 500px;
}

.btn{
  margin-left: 4.5vw;
}


</style>