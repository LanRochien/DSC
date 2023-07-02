<script setup>
//板块等待分页
import {onMounted, shallowRef,inject} from "vue";
import {useRouter} from "vue-router";
import {ref} from 'vue'
import Menu from "@/components/COMPONENT/menu.vue";
import API from "../../axiosinstance/axiosInstance.js"//API路径
import {useStore} from '../../pinia/index.js'
import {Editor, Toolbar} from "@wangeditor/editor-for-vue";
import { ElMessage } from 'element-plus'

const reLoad=inject('reLoad')
const store=useStore()
const current='/forum'
const router=useRouter()
const plate_data=ref({})
const posts_data=ref({})
const plateid=ref()
const editorRef = shallowRef()
const toolbarConfig = {}
const isShow=ref(false)
const isLogin=ref()

const post=ref({
  title:'',
  content:'',
})
const handleCreated = (editor) => {
  editorRef.value = editor // 记录 editor 实例，重要！
}

const handleChange=()=>{
  console.log(post.value.content)
}
const editorConfig =
    { placeholder: '请输入内容...' ,
    }
const toPost=(plateid,postid)=>{
  //跳转帖子页面
  router.push({
    name:'post',
    params:{
      plateid:plateid,
      postid:postid,
    }
  })
}
const toUser=(name)=>{
  router.push({
    name:'personal',
    params:{
      id:name,
    }
  })
}
const getDate=(n)=>{
  n=new Date(n)
  return n.toLocaleDateString().replace(/\//g,"-") + " " + n.toTimeString().substring(0,7)
}
const toSubmit=()=>{

  const currentDate=getDate(Date.now())
  if((typeof post.value.title)!==undefined&&post.value.title!==""){
    if(typeof(post.value.content)!==undefined&&post.value.content!=="" ){
      API({
        url:'/post/insertPost',
        method:'POST',
        data:{
          id:'3',
          title:post.value.title,
          content:post.value.content,
          date_time:currentDate,
          reply_qty:0,
          click_qty:0,
          up_qty:0,
          user:store.user,
          plate:plate_data.value
        }
      }).then((res)=>{
        if(res.data.resp.status==200){
          ElMessage({
            message: '发布成功！',
            type: 'success',
          })
          reLoad()
        }
      })
    }
    else{
        ElMessage({
          message: '请输入帖子内容！！',
          type: 'warning',
        })
    }
  }
  else {
      ElMessage({
        message: '请输入题目！',
        type: 'warning',
      })
    }
}
onMounted(()=>{
  const  plateId=router.currentRoute.value.params.plateid
  plateid.value=plateId
  API({
    url: "plate/plateDetails",
    // 传参，使用指定板块号
  //   params:{
  //   id:plateId
  // },
    method:'GET'
  }).then((res)=>{
    plate_data.value=res.data.plate
    posts_data.value=res.data.posts
    isShow.value=true
    console.log(plate_data.value)
    console.log(posts_data.value)
  })
})
</script>

<template>
  <Menu :current=current ref="isLogin"></Menu>
  <div class="wrapper" v-if="isShow">
  <div class="plate_header">
    <el-card class="header-card">
      <el-avatar shape="square" :size="100" :fit="fill" :src="plate_data.plate_image" />
      <div class="plate_info">
        <h3 class="plate_name">{{plate_data.name}}</h3>
        <div >点击数：{{plate_data.click_qty}}</div>
        <div >贴子数：{{plate_data.post_qty}}</div>
      </div>
        <div class="exp_block"><div class="plate_exp">{{plate_data.detail}}</div></div>
    </el-card>
  </div>
  <div class="plate_body">
    <el-card>
    <div class="plate_content">
      <div class="plate_block" v-for="item in posts_data">
        <div class="like"><el-icon><Star /></el-icon>{{item.up_qty}}</div>
       <div class="plate_title" @click="toPost(plateid,item.id)">
         <h5>{{ item.title }}</h5>
       </div>

         <div class="flex_grow"/>
        <div class="user_name" @click="toUser(item.user.name)" ><el-icon class="icon"><User /></el-icon>{{item.user.name}}</div>
        <div class="post_time"><div>{{item.date_time}}</div></div>
      </div>
    </div>
    </el-card>
  </div>
<div class="post_post">
  <el-card shadow="never" body-style="">
      <el-form :model="post" label-width="60px">
        <el-form-item label="题目">
          <el-input v-model="post.title" />
        </el-form-item>
          <el-form-item label="内容">
            <div class="editor" v-if="isShow" style="border: 1px solid #ccc">
              <Toolbar
                  style="border-bottom: 1px solid #ccc"
                  :editor="editorRef"
                  :defaultConfig="toolbarConfig"
                  mode="default"
              />
              <div class="editor_block">
                <Editor
                    style="height: 200px; overflow-y: hidden;"
                    v-model="post.content"
                    :defaultConfig="editorConfig"
                    mode="default"
                    @onCreated="handleCreated"
                    @onChange="handleChange"
                />
              </div>
              <div class="submit"><el-button @click="toSubmit" type="primary" :disabled="!isLogin.login">提交</el-button></div>

            </div>
        </el-form-item>
      </el-form>
  </el-card>
</div>
  </div>
</template>

<style scoped>
.plate_header{
  margin: 20px auto;
  width: 80%;
}
.header-card>>>.el-card__body{
  width: inherit;
  display: flex;
  flex-wrap: wrap;
  padding-right: 40px;
  justify-content: space-between;
}
.header-card h3{
  margin:10px auto ;
}

.header-card div{
  font-size: 14px;
}
.plate_info{
  height: fit-content;
}
.exp_block{
  width: 100%;
  min-height: 200px;
}
.plate_exp{
  width: 100%;
  height: fit-content;
  color: #cccccc;
  font-size: 13px;
}
.plate_body{
  width: 80%;
  height: 100%;
  margin: 0 auto;

}
.flex_grow{
  flex-grow: 1;
}
.plate_block{
  border-bottom: 1px solid #cccccc;
  padding-bottom: 15px;
  padding-top: 15px;
  display: flex;
  align-items: center;
}
.plate_title h5{
  display: block;
  line-height: inherit;
  cursor: pointer;

}
.user_name{
  display: flex;
  flex-direction: row;
  align-items: center;
  cursor: pointer;
}
.editor  {
  box-sizing: border-box;
  width: 50%;
  margin: 20px auto 40px;
  padding-left: 30px;
  padding-top: 15px;
}
.icon{
  margin:5px;
}
.post_time{
  margin: 5px;
}
.post_post{
  width: 80%;
  margin: 20px auto;
}
.editor{
  width: 100%;
}
.like{
  margin-right: 10px;
}
</style>