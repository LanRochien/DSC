<script setup>
import {onMounted} from "vue";
import {useRouter} from "vue-router";
import {ref} from 'vue'
import Menu from "@/components/COMPONENT/menu.vue";
import API from "../../axiosinstance/axiosInstance.js"//API路径
const current='/forum'
const router=useRouter()
const postId=ref()
const postdata=ref({})
onMounted(()=>{
  postId.value=router.currentRoute.value.params.postid
  API({
    url:'http://localhost:8080/post',
    //传参使用指定postid
    method:'GET'
  }).then((res)=>{
    postdata.value=res.data
    console.log(postdata.value)
  })

})
</script>

<template>
<Menu :current=current></Menu>
  <el-card class="post_section">
    <div class="post_title"><h2>{{postdata.title}}</h2></div>
    <div class="post_list">
      <div class="post_main">
        <div class="user_block">
          <div class="user_info">
            <ul>
              <li><el-avatar :src="postdata.head_image"></el-avatar></li>
              <li>{{postdata.user.name}}</li>
<!--              <li>性别：{{postdata.user.sex}}</li>-->
            </ul>
          </div>
        </div>
        <div class="content"></div>
      </div>
      <div class="post_comment" v-for="item in postdata.commentlist">

      </div>
    </div>
  </el-card>
</template>

<style scoped>

</style>