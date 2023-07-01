<script setup>
import Menu from "@/components/COMPONENT/menu.vue";
import {onMounted, ref,inject} from 'vue'
import API from "../../axiosinstance/axiosInstance.js"//API路径
import {useRouter} from 'vue-router'
import {useStore} from "@/pinia";

const store= useStore()
const reLoad=inject('reLoad')
const router=useRouter()
const isShow=ref(false)
const answer=ref(false)
const searchData=ref({})
const handleChange=()=>{
  store.searchStatus=!store.searchStatus
  reLoad()

}
const toDetail=(item,flag)=>{
if(flag){
  router.push({
    name:'activity',
    params:{
      activity_id:item.id
    }
  })
}
else{
  router.push({
    name:'post',
    params:{
      plateid:item.plate.id,
      postid:item.id
    }
  })
}
}
onMounted(()=>{
  if(typeof (store.searchKey)!==undefined&&store.searchKey!==''){
      if(store.searchStatus){

    API({
      url:'/activity/findActivityByStr',
      methods:'GET',
      // params:{
      //   Str:store.searchKey
      // }
    }).then((res)=>{
      if(res.data.resp.status===200){
      searchData.value=res.data.activities
        answer.value=true
        isShow.value=true
      }
      else{
        isShow.value=true
      }
    })
  }
      else{//发送帖子查询
        API({
          url:'/post/findPostByStr',
          methods:'GET',
          // params:{
          //   Str:store.searchKey
          // }
        }).then((res)=>{
          if(res.data.resp.status===200){
            searchData.value=res.data.posts
            console.log('post:',searchData.value)
            answer.value=true
            isShow.value=true
          }
          else{
            isShow.value=true
          }
        })
      }
  }
})
</script>

<template>
<Menu current=""></Menu>
<div class="result_wrapper">
  <div class="header">
    <div class="switch">
      <el-button :type="store.searchStatus?'primary':'success'" @click="handleChange()">Primary</el-button>

    </div>
    <div class="current_search">
      当前查询：{{store.searchStatus?"活动":"帖子"}}
    </div>
  <h1 class="result_title">查询结果：</h1>

  </div>
  <div class="answer_block" v-if="answer===true&&isShow===true">

    <el-card class="box-card" v-for="item in searchData" >
      <div class="block_result">
        <div class="title_result" @click="toDetail(item,store.searchStatus)">
          {{item.title}}
        </div>
        <div class="content_result">
          {{item.content}}
        </div>
        <div class="flex-grow"/>
        <div class="time_result">
          {{item.date_time}}
        </div>
      </div>
    </el-card>
  </div>
  <div class="fault_block" v-if="answer===false&&isShow===true">
      <h2 class="falut_result">查询失败！</h2>
  </div>
</div>
</template>

<style scoped>
.box-card{
  margin:10px auto;
}
.block_result{
  display: flex;
}
.block_result .content_result{
  max-width: 200px;
  white-space:nowrap;
  overflow:hidden;
  text-overflow:ellipsis;
  margin-left: 20px;
}
</style>