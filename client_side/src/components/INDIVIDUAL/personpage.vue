
<script lang="ts" setup>
  import { reactive, toRefs } from 'vue'
  import {onMounted, ref} from "vue";
  import {useRouter} from "vue-router";
  import MENU from '../COMPONENT/menu.vue'
  import API from "../../axiosinstance/axiosInstance.js"

  const state = reactive({
  circleUrl:
  'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png',
  squareUrl:
  'https://cube.elemecdn.com/9/c2/f0ee8a3c7c9638a54940382568c9dpng.png',
})

  const { circleUrl, squareUrl, sizeList } = toRefs(state)

  const router=useRouter()
  const userData=ref()
  const postsData=ref()
  const commentData=ref()

  const isShow=ref(false)

  const dateSolver=(date:string)=>{
    return date.substring(0,9)
  }
  const userRole=(role)=>{
    const rules=['已封禁','管理员','普通用户','志愿者']
    return rules[(role+1)%4]
  }
  const toPost=(plate,id)=>{
    router.push({
      name:'post',
      params:{
        plateid:plate,
        postid:id,
      }
    })
  }
  onMounted(()=>{
    const userName=router.currentRoute.value.params.id
    console.log(userName)
    API({
      url:'/user/findDetail',
      method:'GET',
      // params:{
      //   name:userName
      // }
    }).then((res)=>{
      if (res.data.resp.status==200){
        userData.value=res.data.user
        postsData.value=res.data.posts
        commentData.value=res.data.comments

        userData.value.state=userRole(userData.value.role)
        for(let item of postsData.value){

            item.date_time=dateSolver(item.date_time)
        }
        for(let item of commentData.value){
          item.date_time=dateSolver(item.date_time)
        }
        isShow.value=true
        console.log(userData.value)
        console.log(postsData.value)
        console.log(commentData.value)
      }
    })
  })
</script>

<template>
  <MENU ></MENU>
<div class="wrap1" v-if="isShow">
  <div class="wrap2">
    <div class="main">
    <div id="headinfo">
<!--      头部背景-->头部背景
<!--      <img>-->
    </div>
        <div id="userinfo">
          <div class="userinfo_left">
<!--            此处添加用户信息左侧内容-->
            <div class="userinfo_left_head">
              <el-avatar size="large" :src="userData.head_url" shape="circle">
<!--               用户头像-->
<!--                :src="circleUrl/squareUrl表示圆形实例或方形实例“-->
              </el-avatar>
            </div>
          </div>
          <div class="userinfo_middle">
<!--            此处添加用户信息中部内容，还可加性别、id等-->
              <div class="userinfo_middle_name">
                {{userData.name}}
              </div>
            <div class="userinfo_middle_details">
              <div class="user_info">
             <div class="user_role"> 用户组：{{ userData.state }}</div>
              <div class="user_sex">性别：{{userData.sex}}</div>
            </div>
              <div class="record_time">
                <div>注册日期：{{userData.record_date}}</div>
              </div>
              <div class="forum_info">
                <div >发帖数：{{userData.post_qty}}</div>
                <div>回复数：{{userData.reply_qty}}</div>
              </div>
            </div>
          </div>
          <div class="userinfo_right">
            <el-button type="primary" >修改头像</el-button>
            <el-button type="primary" >修改密码</el-button>

<!--            此处添加用户信息右侧内容，可是功能按钮（修改密码等）修改头像-->
          </div>
        </div>
    <div id="container">
      <div class="ihome">
<!--       ihome内还可添加主要内容以外的的东西（排行榜等） -->
        <div class="content" >
        <div class="show_block">
        <div class="post_item" v-for="item in postsData">
          <div class="class_block">发帖</div>
          <div class="post_title" @click="toPost(item.plate.id,item.id)"><h4>{{item.title}}</h4></div>
          <div class="text_">{{item.content}}</div>
          <div class="flex-grow" />

          <div class="up_num">点赞：{{item.up_qty}}</div>
          <div class="reply_num">回复：{{item.reply_qty}}</div>
          <div class="date_post">发表日期：{{item.date_time}}</div>
            </div>
        </div>

        <div class="show_block">

          <div class="comment_item" v-for="item in commentData">
            <div class="class_block">回复</div>
            <div class="post_title" @click="toPost(item.post.plate.id,item.post.id)"><h4>{{ item.post.title }}</h4></div>
            <div class="text_">{{item.content}}</div>
            <div class="flex-grow" />

            <div class="date_post">发表日期：{{item.date_time}}</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
  </div>
</div>
</template>

<style scoped>
.main{
  background-color:#f6f6f6;/*此处设置页面大背景*/
  min-height: 47vw;
}
#headinfo{
  width:980px;
  height: 220px;
  margin: 20px auto 0;
  position: relative;
  background-color: #1280b4;/*此处设置头部页面背景*/
  margin-top: 0px ;
  text-align: center;
  line-height: 220px;
  color: white;
}
#userinfo{
  min-height: 120px;
  width: 978px;
  margin: 10px auto;
  border-style: solid;
  border-color: #8FC0D3;
  border-width: 0 1px;
  background: #F5F7FA;
  position: relative;
}
.userinfo_left{
  position: relative;
  width: 190px;
  height: 110px;
  float: left;
}
.userinfo_left_head{
  position: absolute;
  left:20px;
  top:25px;
}
.userinfo_middle{
  width: 500px;
  float: left;
  margin-left: -80px;
  //margin-top: 30px;
}
.userinfo_right{
  line-height: 100px;
  text-align: right;
  padding-right: 30px;
}
.user_info,
.forum_info,
.record_time{
  display: flex;
  margin: 5px 0;

}
.user_info div,
.forum_info div,
.record_time div{
  margin-right: 15px;
}
.userinfo_middle_name{
font-weight: bolder;
}
#container{
  width: 980px;
  margin: 0 auto;
  border-top-style:solid;
  border-width:  2px;
}
.ihome{
  padding-bottom: 10px;
}
.content{
  width: 978px;
  border-style: solid;
  border-width: 1px;
  background-color: white;
}
.post_item,
.comment_item{
  display: flex;
  border-bottom: 1px solid #ccc;
}
.post_item div,
.comment_item div{
  margin:5px;
}
.text_{
  max-width: 200px;
  white-space:nowrap;
  overflow:hidden;
  text-overflow:ellipsis;
}
.post_title{
  cursor: pointer;
}
</style>