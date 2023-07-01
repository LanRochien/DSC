<template>
  <el-dialog v-model="dialogVisible" title="新建活动">
    <el-form :model="acForm">
      <el-form-item label="活动主题" :label-width="70">
        <el-input placeholder="请输入题目" v-model="acForm.title" autocomplete="off" />
      </el-form-item>
      <el-form-item label="活动内容" :label-width="70">
        <el-input
            v-model="acForm.content"
            :rows="2"
            type="textarea"
            placeholder="Please input"
        />
      </el-form-item>
      <el-form-item label="活动图片" :label-width="70">
        <el-upload
            class="avatar-uploader"
            action="https://run.mocky.io/v3/9d059bf9-4660-45f2-925d-ce80ad6c4d15"
            :show-file-list="false"
        >
          <img v-if="acForm.activity_image" :src="acForm.activity_image" class="avatar" />
          <el-icon v-else class="avatar-uploader-icon"><Plus /></el-icon>
        </el-upload>
        <el-input placeholder="上传图片地址" v-model="acForm.activity_image" autocomplete="off" />
      </el-form-item>
      <el-form-item label="需求人数" :label-width="70">
        <el-input placeholder="请输入数字" v-model="acForm.title" autocomplete="off" />
      </el-form-item>

    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="acInsert">
          确认
        </el-button>
      </span>
    </template>
  </el-dialog>
  <el-button type="primary" @click="dialogVisible=true">活动插入</el-button>
  <el-button type="danger" @click="acDelete">批量删除</el-button>

  <el-table :data="acList"
            height="650"
            style="width: 100%"
            v-if="isShow"
            @selection-change="handleSelectionChange">
    <el-table-column type="selection" width="55" />
    <el-table-column prop="title" label="活动主题" width="230" />
    <el-table-column prop="content" label="活动内容" width="180" />
    <el-table-column prop="date_time" label="发起时间" width="180" />
    <el-table-column prop="user.name" label="发起人" width="230" />
    <el-table-column prop="state" label="活动状态" width="230" />
  </el-table>
</template>

<script setup lang="ts">
import API from "../../axiosinstance/axiosInstance.js"
import  {onMounted,ref,inject} from "vue";
import { ElMessage } from 'element-plus'
import {useStore} from '../../pinia/index.js'

const dialogVisible = ref(false)
const store=useStore()
const reLoad=inject('reLoad')
const isShow=ref(false)
const acList=ref()
const multipleSelection = ref([])
const acIds=ref([])
const acForm=ref({
  id:123,
  title:'',
  content:'',
  activity_image:'',
  date_time:'',
  num_required:0,
  num_participants:0,
  state:0,
})
const acInsert=()=>{
  const cur_user=store.user
  if (checkAc(acForm.value)){
    API({
      url:'/admin/insertActivity',
      method:'POST',
      data:{
        id:123,
        title:acForm.value.title,
        content:acForm.value.content,
        activity_image:acForm.value.activity_image,
        date_time:acForm.value.date_time,
        num_required:acForm.value.num_required,
        num_participants:0,
        state:1,
        user:cur_user,
      }
    }).then((res)=>{
      //iftrue
      ElMessage({
        message: '操作成功',
        type: 'success',
      })
      reLoad()

    })

  }
  else {
    ElMessage.error('表单项不能为空，请检查')
  }
}
const checkAc=(form)=>{
  return (form.title!==''&&form.content!=''&&form.num_required!=0)?true:false
}
const acDelete=()=>{
  getIds(multipleSelection.value)
  console.log(acIds.value)
  if(acIds.value.length==0){
    ElMessage('未选中活动')
  }
  else{
    API({
      url:'/admin/delActivityByIds',
      method:"DELETE",
      data:{
        ids:acIds.value
      }
    }).then((res)=>{
      if(res.data.status==200){
        ElMessage({
          message: '操作成功',
          type: 'success',
        })
        reLoad()
      }
    })
  }
}
const getIds=(classes)=>{
  acIds.value=[]
  for (let [key,item] of classes.entries() ){
      acIds.value[key]=item.id
    }
}
const handleSelectionChange = (val) => {
  multipleSelection.value = val
}

onMounted(()=>{
  API({
    url:'/activity/findall',
    method:"GET",
  }).then((res)=>{
      // iftrue
    acList.value=res.data
  isShow.value=true
  })
})
</script>

<style scoped>



</style>
