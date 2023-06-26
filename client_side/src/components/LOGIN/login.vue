<template>
  <div class="main">
    <div class="logo">
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
            <el-button @click="resetForm(ruleFormRef)">Reset</el-button>
          </el-form-item>
        </div>
      </el-form>
    </div>
  </div>
</template>
<script lang="ts" setup>
import { reactive, ref } from 'vue'
import type { FormInstance, FormRules } from 'element-plus'
const ruleFormRef = ref<FormInstance>()
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

const submitForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.validate((valid) => {
    if (valid) {
      console.log('submit!')
      console.log(ruleForm.name);
      console.log(ruleForm.pwd);

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

</script>
<style scoped>
.logo{
  width:30vw;
  height: 5vw;

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
  margin-left: -6vw;
}
#app{
  display: flex;
  justify-content: center;
}
.btn{
  margin-left: 6vw;
}


</style>