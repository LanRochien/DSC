<script setup>
import {ElTable} from "element-plus";
import  {onMounted,ref,inject} from "vue";
import API from "@/axiosinstance/axiosInstance";
import { ElMessage } from 'element-plus'

const reLoad=inject('reLoad')
const isShow=ref(false)

const multipleSelection = ref([])
const pList=ref()
const pIds=ref()



const pDelete=()=>{
  getIds(multipleSelection.value)
  console.log(pIds.value)
  if(pIds.value.length==0){
    ElMessage('未选中活动')
  }
  else{
    API({
      url:'/admin/delPostByIds',
      method:"DELETE",
      data:{
        ids:pIds.value
      }
    }).then((res)=>{
      if(res.data.status===200){
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
  pIds.value=[]
  for (let [key,item] of classes.entries() ){
    pIds.value[key]=item.id
  }
}
const handleSelectionChange = (val) => {
  multipleSelection.value = val
}
onMounted(()=>{

  API({
    url:'/post/findall',
    method:"GET",
  }).then((res)=>{
    // iftrue
    pList.value=res.data.posts
    isShow.value=true
  })
})
</script>


<template>

  <el-button type="danger" @click="pDelete">批量删除</el-button>

  <el-table :data="pList"
            height="650"
            style="width: 100%"
            ref="singleTableRef"
            v-if="isShow"
            @selection-change="handleSelectionChange"
  >

    <el-table-column type="selection" width="55" />
    <el-table-column prop="title" label="帖子标题" width="230" />
    <el-table-column prop="id" label="帖子id" width="180" />
    <el-table-column prop="reply_qty" label="回复数" width="180" />
    <el-table-column prop="date_time" label="发表时间" width="180" />
    <el-table-column prop="plate.name" label="所属板块" width="230" />
    <el-table-column prop="user.name" label="发布用户" width="180" />
  </el-table>
</template>

<style scoped>

</style>