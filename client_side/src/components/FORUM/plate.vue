<script setup>
//板块等待分页
import {onMounted} from "vue";
import {useRouter} from "vue-router";
import {ref} from 'vue'
import Menu from "@/components/COMPONENT/menu.vue";
import API from "../../axiosinstance/axiosInstance.js"//API路径

const current='/forum'
const router=useRouter()
const plate_data=ref({})
const plateid=ref()
const toPost=(plateid,postid)=>{
  router.push({
    name:'post',
    params:{
      plateid:plateid,
      postid:postid,
    }
  })
}
onMounted(()=>{
  const  plateId=router.currentRoute.value.params.plateid
  plateid.value=plateId
  API({
    url:"http://localhost:8080/posts",
    // 传参，使用指定板块号
    method:'GET'
  }).then((res)=>{
    plate_data.value=res.data
    console.log(plate_data.value)
    console.log(plate_data.value.posts[0].user)
  })
})
</script>

<template>
  <Menu :current=current></Menu>
  <div class="wrapper">
  <div class="plate_header">
    <el-card class="header-card">
      <el-avatar shape="square" :size="100" :fit="fill" :src="plate_data.plate_image" />
      <div class="plate_info">
        <h3 class="plate_name">{{plate_data.plate_name}}</h3>
        <div >点击数：{{plate_data.click_qty}}</div>
        <div >贴子数：{{plate_data.post_qty}}</div>
      </div>
        <div class="plate_exp">{{plate_data.explain}}</div>
    </el-card>
  </div>
  <div class="plate_body">
    <el-card>
    <div class="plate_content">
      <div class="plate_block" v-for="item in plate_data.posts">
       <div class="plate_title" @click="toPost(plateid,item.post_id)"><h5>{{ item.title }}</h5></div>
         <div class="flex_grow"/>
        <div class="user_name" @click="toUser(item.user.id)" ><el-icon class="icon"><User /></el-icon>{{item.user.name}}</div>
        <div class="post_time"><div>{{item.datetime}}</div></div>
      </div>
    </div>
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
}
.icon{
  margin:5px;
}
.post_time{
  margin: 5px;
}
</style>