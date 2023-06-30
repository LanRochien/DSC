<script setup>
//帖子等待分页
import {ref,shallowRef,onBeforeUnmount,onMounted} from "vue";
import {useRouter} from "vue-router";
import {Editor,Toolbar} from '@wangeditor/editor-for-vue'
import Menu from "@/components/COMPONENT/menu.vue";
import API from "../../axiosinstance/axiosInstance.js"
import {useStore} from "@/pinia";
//API路径

const editorRef = shallowRef()
const toolbarConfig = {}

const valueHtml = ref()
const editorConfig =
    { placeholder: '请输入内容...' ,
    }

const current='/forum'
const router=useRouter()
const postId=ref()
const post_data=ref({})
const isShow=ref(false)
const user=ref(null)
const store=useStore()
const handleCreated = (editor) => {
  editorRef.value = editor // 记录 editor 实例，重要！
}
const handleChange=()=>{
  console.log(valueHtml.value)
}
//menu里传user
//post_data传post信息
//事件处理
const getDate=(n)=>{
  n=new Date(n)
  return n.toLocaleDateString().replace(/\//g,"-") + " " + n.toTimeString().substring(0,7)
}
const toSubmit=()=>{
  //获取当前时间
 const currentDate=getDate(Date.now())

  API({
    url:'',
    method:'POST',
    data:{
            comment:{
              id:0,
              content:valueHtml,
              datetime:currentDate,
              up_qty:0,
            },
            user:store.user,
            post:post_data.value.post
    }
  }).then((res)=>{
    // if(res.data.resp.msg===200){
      window.alert("success")
    // }
  })
  console.log(post_data.value.post)
  console.log(store.user)
}
onMounted(()=>{
  postId.value=router.currentRoute.value.params.postid
  API({
    url:'http://localhost:8080/posttest',
    params:{
      // id:postId.value
    },
    method:'GET'
  }).then((res)=>{
    post_data.value=res.data
    isShow.value=true
  })
})
onBeforeUnmount(() => {
  const editor = editorRef.value
  if (editor == null) return
  editor.destroy()
})
</script>

<template>
<Menu :current=current></Menu>
  <el-card class="post_section" v-if="isShow">
    <div class="post_title" ><h2>{{post_data.post.title}}</h2></div>
    <div class="post_list">
        <div class="post_main">
          <div class="user_block">
            <div class="user_info">
              <ul >
                <li ><el-avatar :size="70" ></el-avatar></li>
                <li>{{post_data.post.user.name}}</li>
                <li>性别：{{post_data.post.user.sex}}</li>
              </ul>
            </div>
          </div>
          <div class="content_block">
            <div class="content_docker">
            <div class="content_warp">
              <div class="content" v-html="post_data.post.content"></div>
            </div>
            <div class="content_info">
              <span>1楼</span>
              <span>{{post_data.post.datetime}}</span>
            </div>
          </div>
          </div>
        </div>
      <div class="post_comment" v-for="(item,key) in post_data.comments" >
        <div class="post_main">
          <div class="user_block">
            <div class="user_info">
              <ul v-if="isShow">
                <li ><el-avatar :size="70" :src="item.head_image" ></el-avatar></li>
                <li>{{item.user.name}}</li>
                <li></li>
                <li>性别：{{item.user.sex}}</li>
              </ul>
            </div>
          </div>
          <div class="content_block">
            <div class="content_docker">
              <div class="content_warp">
                <div class="content" v-html="item.content"></div>
              </div>
              <div class="content_info">
                <span>{{key+2}}楼</span>
                <span>{{item.datetime}}</span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </el-card>
  <div class="editor" style="border: 1px solid #ccc">

    <Toolbar
        style="border-bottom: 1px solid #ccc"
        :editor="editorRef"
        :defaultConfig="toolbarConfig"
        mode="default"
    />
    <div class="editor_block">
    <Editor
        style="height: 300px; overflow-y: hidden;"
        v-model="valueHtml"
        :defaultConfig="editorConfig"
        mode="default"
        @onCreated="handleCreated"
        @onChange="handleChange"
    />
    </div>
    <div class="submit"><el-button @click="toSubmit" type="primary">提交</el-button></div>

  </div>
</template>

<style scoped>
.post_title{
  padding-bottom: 10px;
  border-bottom: 1px solid #cccccc;
}
.post_section{
  margin: 0 auto;
  width: 50%;
}
.post_main{
  width: 100%;
  display: flex;
  min-height: 300px;
  border-bottom: 1px solid #cccccc;
}
.user_block{
  width: 30%;

}
.user_info{
  width: 100%;
  margin: 15px auto;
}
.user_info ul{
text-align: center;
}
.user_info li{
  padding: 6px;
}
.content_block{
  width: 70%;

}
.content_docker{
  height: 100%;
  padding-left: 15px;
  padding-bottom: 5px;

}
.content_warp{
  min-height: 240px;
  padding-top: 25px;

}
.content_info{
  margin-right: 5px;
  height: 20px;
  font-size: 15px;
  color: #7e7e7e;

  float: right;
  position: relative;
}
.content_info span{
  padding-right: 10px;
}
.editor  {
  box-sizing: border-box;
  width: 50%;
  //max-height: 300px;
  margin: 30px auto;
  padding-left: 30px;
  padding-top: 15px;
}
.submit{
  margin-right: 30px;
  margin-bottom: 15px;
  text-align: right;
}

</style>