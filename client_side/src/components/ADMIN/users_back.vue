<template>


  <el-table :data="userList" height="650" style="width: 100%" v-if="isShow">
    <el-table-column prop="name" label="用户名" width="230" />
    <el-table-column prop="id" label="用户id" width="180" />
    <el-table-column prop="state" label="用户权限" width="180" />
    <el-table-column prop="record_date" label="注册时间" width="230" />
    <el-table-column prop="password" label="密码" width="230" />
    <el-table-column prop="" label="设置封禁" >
      <template v-slot="scope">
        <el-button @click="userBan(scope.row.id,scope.row.role)" >编辑</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script setup lang="ts">

import API from "../../axiosinstance/axiosInstance.js"
import  {onMounted,ref,inject} from "vue";
import { ElMessage } from 'element-plus'

const reLoad=inject('reLoad')
const userList=ref([])
const isShow=ref(false)
// const scope=ref()


const userBan=(id,role)=>{
  if((role+1)%4==1){
    ElMessage('用户为管理员，无法操作')
  }
  else{
    API({
      url:'/admin/banUserById',
      method:'get',
      // params:{
      //   id:id,
      //   role:role,
      // }
    }).then((res)=>{
      ElMessage({
        message: '操作成功',
        type: 'success',
      })
      reLoad()
    })
  }
  console.log(id ,role)
}
const userRole=(role)=>{
  const rules=['已封禁','管理员','普通用户','志愿者']
  return rules[(role+1)%4]
}
onMounted(()=>{
//请求用户信息
  API({
    url:'/admin/findall',
    method:'GET',
  }).then((res)=>{
    if(res.data.resp.status==200){
    userList.value=res.data.users
      for (let user of userList.value){
        user.state=userRole(user.role)
      }

      isShow.value=true
    }
  })
})


</script>

<style scoped>


</style>
