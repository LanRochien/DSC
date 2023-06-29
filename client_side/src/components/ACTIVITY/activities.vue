<script lang="ts" setup>
import { ref } from 'vue'
import MENU from '../COMPONENT/menu.vue'
import API from "../../axiosinstance/axiosInstance.js"//API路径
var images=ref([{content:''}])
    const   current='/activities';
    const testData = ref({});
    //测试请求方法
    const getData = function(){
      API({
        // url:'/activity/findall',//目的数据详细路基
        method:'GET'
      }).then((res)=>{
        // alert('请求成功!');
        let arr=res.data.map((item)=>{
          return Object.assign({},{content:item.content})
        })//将获取的数组整理为只含图片地址的数组
       images.value=arr;
      });
    }



</script>

<template >
  <MENU :current=current></MENU>
  <div class="common-layout" @mouseover="getData">

    <el-container>
      <el-main class="main">
        <div class="jieshao">
          <div class="huodongxuechuan">
            <div class="block text-center" style="height: 300px">
              <el-carousel height="auto" autoplay>
                <el-carousel-item style="height: 300px">
                  <a href="#">
                  <h3 class="small justify-center" text="2xl">test txt0</h3>
                  </a>
                </el-carousel-item>
                <el-carousel-item style="height: 300px">
                  <a href="#">
                  <h3 class="small justify-center" text="2xl">test txt1</h3>
                  </a>
                </el-carousel-item>
                <el-carousel-item style="height: 300px">
                  <a href="#">
                  <h3 class="small justify-center" text="2xl">test txt2</h3>
                  </a>
                </el-carousel-item>
                <el-carousel-item style="height: 300px">
                  <a href="#">
                  <h3 class="small justify-center" text="2xl">test txt3</h3>
                  </a>
                </el-carousel-item>
              </el-carousel>
            </div>
          </div>
      </div>
      <div class="huodongview">
        <div class="testfirst">
        <el-row >
          <el-col
              v-for="image in images"
              :span="4"
              :offset="1"
          >
            <a href="#" class="cardin">
            <el-card :body-style="{ padding: '0px' }">

              <img
                  :src=image.content
                  @loadstart="getData"
                  class="image"
              />

              <div style="padding: 14px;">

                <span>Yummy hamburger</span>
                <div class="bottom">
                  <p>activities txt</p>
                  <el-button text class="button">Operating</el-button>
                </div>

              </div>

            </el-card>
            </a>
          </el-col>
        </el-row>
        </div>

      </div>
      </el-main>
    </el-container>
  </div>
</template>

<style scoped>
.header{
  text-align: center;
  background-color: aquamarine;
}
.jieshao{
  width: 100%;
  min-height: 300px;
  background: aquamarine;
  margin-bottom: 2vw;
  text-align: center;
}
.huodongview{
  width:100%;
  min-height: 50vw;
  background-color: coral;
}


.el-carousel__item h3 {
  color: #475669;
  opacity: 0.75;
  display: block;
  align-items: center;
  margin: 0;
  text-align: center;
  height: 100%;
  line-height: 550px;
  margin-right: 90%;
}


.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}



.bottom {
  margin-top: 13px;
  line-height: 12px;
  display: block;
  justify-content: space-between;
  align-items: center;
}

.button {
  padding: 0;
  min-height: auto;
}

.image {
  width: 100%;
  display: block;
}
.testfirst{
  margin-left: 10vw;
}



</style>