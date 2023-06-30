<template>
  <el-form
      ref="ruleFormRef"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
      class="demo-ruleForm"
      status-icon
  >
    <el-form-item label="活动名" prop="name">
      <el-input v-model="ruleForm.name" />
    </el-form-item>

    <el-form-item label="真实姓名" prop="personame">
      <el-input v-model="ruleForm.personame" />
    </el-form-item>
    <el-form-item label="活动地点" prop="region">
      <el-select v-model="ruleForm.region" placeholder="Activity zone">
        <el-option label="北京" value="北京" />
        <el-option label="上海" value="上海" />
      </el-select>
    </el-form-item>
    <el-form-item label="Activity time" required>
      <el-col :span="11">
        <el-form-item prop="date1">
          <el-date-picker
              v-model="ruleForm.date1"
              type="date"
              label="Pick a start date"
              placeholder="选择开始时间"
              style="width: 100%"
          />
        </el-form-item>
      </el-col>
      <el-col class="text-center" :span="2">
        <span class="text-gray-500">-</span>
      </el-col>
      <el-form-item label="活动时长" prop="time" aria-placeholder="单位:/天">
        <el-input v-model="ruleForm.time" />
      </el-form-item>
    </el-form-item>
    <el-form-item label="是否需要资助" prop="delivery">
      <el-switch v-model="ruleForm.delivery" />
    </el-form-item>
    <el-form-item label="活动类型" prop="type">
      <el-checkbox-group v-model="ruleForm.type">
        <el-checkbox label="Online activities" name="type" />
        <el-checkbox label="Promotion activities" name="type" />
        <el-checkbox label="Offline activities" name="type" />
        <el-checkbox label="Simple brand exposure" name="type" />
      </el-checkbox-group>
    </el-form-item>
    <el-form-item label="您代表" prop="resource">
      <el-radio-group v-model="ruleForm.resource">
        <el-radio label="个人" />
        <el-radio label="组织" />
      </el-radio-group>
    </el-form-item>
    <el-form-item label="所需人数" prop="people_nedd" >
      <el-input type="number" v-model="ruleForm.people_need" />
    </el-form-item>
    <el-form-item label="详细说明" prop="desc">
      <el-input v-model="ruleForm.desc" />
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm(ruleFormRef)">
        Create
      </el-button>
      <el-button @click="resetForm(ruleFormRef)">Reset</el-button>
    </el-form-item>
  </el-form>
</template>

<script lang="ts" setup>
import { reactive, ref } from 'vue'
import type { FormInstance, FormRules } from 'element-plus'
import API from "../../axiosinstance/axiosInstance.js"
import axios from "axios";
//API路径
const param=ref({
  activityname:'',
  username:'',
  people_need:'',
  content:'',
})
const   current='/activities';
const testData = ref({});
//测试请求方法
const getData = function(){
  API({
    // url:'/activity/findall',
    method:'post',
    activityname:ruleForm.name,
  }).then((res)=>{
     console.log("posted")
  });
}

interface RuleForm {
  name: string
  personame:string
  region: string
  count: string
  date1: string
  time:number
  delivery: boolean
  type: string[]
  resource: string
  people_need:number
  desc: string
}

const formSize = ref('default')
const ruleFormRef = ref<FormInstance>()
const ruleForm = reactive<RuleForm>({
  name: '',//title
  personame:'Jr-Frank',
  region: '',
  count: '',
  date1: '',
  time:0,
  delivery: false,
  type: [],
  resource: '',
  people_need:0,
  desc: '',
})

const rules = reactive<FormRules<RuleForm>>({
  name: [
    { required: true, message: '请输入活动名', trigger: 'blur' },
    { min: 1, max: 100, message: '活动名长度不能超过100', trigger: 'blur' },
  ],
  personame:[
      {required:true,message:'请输入真实姓名',trigger:'blur'},
    {min:2,max:10,message:'请输入合法姓名',trigger:'blur' },
  ],
  region: [
    {
      required: true,
      message: '请选择活动区域',
      trigger: 'change',
    },
  ],
  date1: [
    {
      type: 'date',
      required: true,
      message: '请选择开始日期',
      trigger: 'change',
    },
  ],
  time: [
    {required: true,
      message: '请输入活动所需天数',
      trigger: 'blur',
    },
    // {
    //   type: 'number',
    //   required: true,
    //   message: '格式错误,不允许有特殊字符',
    //   trigger: 'blur',
    // },
    {required:true,min:1,message:'活动时间不能为0天',trigger:'blur' },
    {required:true,max:90,message:'活动时间不能超过90天',trigger:'blur' },
  ],
  type: [
    {
      type: 'array',
      required: true,
      message: '请选择活动类型',
      trigger: 'change',
    },
  ],
  resource: [
    {
      required: true,
      message: '请选择您代表的角色',
      trigger: 'change',
    },
  ],
  people_need:[
    {required:true,message:'请选择所需人数',trigger:'blur',},
    {min:1,max:50,message:'请将人数控制在1到50',trigger:'blur'}
  ],
  desc: [
    { required: true, message: '请补充详细信息', trigger: 'blur' },
  ],
})
const submitForm = async (formEl: FormInstance | undefined) => {
  if (!formEl) return
  await formEl.validate((valid, fields) => {
    if (valid) {
      console.log('submit!')
      console.log("活动名"+ruleForm.name)
      console.log("申请用户"+ruleForm.personame)
      console.log("开始时间"+ruleForm.date1)
      console.log("持续时间"+ruleForm.time)
      console.log("所需人数"+ruleForm.people_need)
      console.log("详细说明"+ruleForm.desc)
    } else {
      console.log('error submit!', fields)
    }
  })
}//输入数据存储在ruleForm中

const resetForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.resetFields()
}

const options = Array.from({ length: 10000 }).map((_, idx) => ({
  value: `${idx + 1}`,
  label: `${idx + 1}`,
}))
</script>

<style scoped>

</style>