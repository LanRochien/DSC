<script setup>
import {onMounted} from "vue";
import {useRouter} from "vue-router";
import {ref,onBeforeMount} from 'vue'
import Menu from "@/components/COMPONENT/menu.vue";
import API from "../../axiosinstance/axiosInstance.js"//API路径

const current='/forum'
const router=useRouter()
const postId=ref()
const post_data=ref({})
const isShow=ref(false)

onMounted(()=>{
  postId.value=router.currentRoute.value.params.postid
  API({
    url:'http://localhost:8080/posttest',
    //传参使用指定postid
    method:'GET'
  }).then((res)=>{
    post_data.value=res.data
    isShow.value=true
  })

})
</script>

<template>
<Menu :current=current></Menu>
  <el-card class="post_section">
    <div class="post_title"><h2>{{post_data.title}}</h2></div>
    <div class="post_list">
        <div class="post_main">
          <div class="user_block">
            <div class="user_info">
              <ul v-if="isShow">
                <li ><el-avatar :size="70" ></el-avatar></li>
                <li>{{post_data.user.name}}</li>
                <li>性别：{{post_data.user.sex}}</li>
              </ul>
            </div>
          </div>
          <div class="content_block">
            <div class="content_docker">
            <div class="content_warp">
              <p class="content">{{post_data.content}}</p>
            </div>
            <div class="content_info">
              <span>1楼</span>
              <span>{{post_data.datetime}}</span>
            </div>
          </div>
          </div>
        </div>
      <div class="post_comment" v-for="(item,key) in post_data.commentlist" >
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
                <p class="content">{{item.content}}</p>
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
  //flex: 1;
  float: right;
  position: relative;
}
.content_info span{
  padding-right: 10px;
}
</style>