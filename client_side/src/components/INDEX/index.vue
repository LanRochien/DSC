<template>
  <MENU></MENU>
  <div class="carousel">
  <el-carousel indicator-position="outside" height="800px">
    <el-carousel-item v-for="item in 4" :key="item">
<!--      <h3 text="2xl" justify="center">{{ item }}</h3>-->
      <div class="carousel_img" >

      </div>
    </el-carousel-item>
  </el-carousel>
  </div>
<!--  信息card-->
  <div class="info">
  <el-card v-for="(item,index) in infoList " :key="index"  class="info_item">
    <div class="info_img" :style="{'background-image':'url('+ item.imgUrl +')'}">
    </div>
    <div class="info_text">
<!--      <h3>test</h3>//介绍标题-->
      <h5>{{item.infoTitle}}</h5>
<!--      介绍大标题-->
      <p>{{ item.infoDetail}}</p>
<!--      //介绍详情-->
    </div>
  </el-card>
  </div>
</template>
<script lang="ts" setup>
import MENU from '../MENU/menu.vue'
import { ref } from 'vue'
const infoTitle=ref(["titlea","titleb","titlec","titled"])
const infoDetail=ref(["phara","pharb","pharc","phard"])
const infoList=ref([{
  infoTitle:"titlea",
  infoDetail:"phara",
  imgUrl:"/src/assets/test2.png"
},
  {
    infoTitle: "titleb",
    infoDetail:"pharb",
    imgUrl:"https://marvel-b1-cdn.bc0a.com/f00000000210829/www.lionsclubs.org/sites/default/files/styles/photo_lockup/public/2020-05/kindnessmatters.jpg?itok=k90nkjKB"
  },
  {
    infoTitle: "titlec",
    infoDetail:"pharc",
    imgUrl:"https://marvel-b1-cdn.bc0a.com/f00000000210829/www.lionsclubs.org/sites/default/files/styles/photo_lockup/public/2020-05/kindnessmatters.jpg?itok=k90nkjKB"
  },
  {
    infoTitle: "titled",
    infoDetail:"phard",
    imgUrl:"https://marvel-b1-cdn.bc0a.com/f00000000210829/www.lionsclubs.org/sites/default/files/styles/photo_lockup/public/2020-05/kindnessmatters.jpg?itok=k90nkjKB"
  },
])

const activityList=ref([{
    activityTitle:"1",
    activityDetail:"test1",
    activityImg:"",
},{
    activityTitle:"",
    activityDetail:"",
    activityImg:"",
  },{
    activityTitle:"",
    activityDetail:"",
    activityImg:"",
  },{
    activityTitle:"",
    activityDetail:"",
    activityImg:"",
  },])
</script>

<style scoped>
/*.menu{
  position: fixed;
  width: 100%;
  //min-width: 900px;
  height: 50px;
  z-index: 99;
}*/
.el-carousel__item h3 {

  display: flex;
  color: #475669;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
}
.carousel_img{
  width: 100%;
  height: 100%;
  background-repeat: no-repeat;
  background-size: 100%;
  background-image: url("/src/assets/test4.png");
}
.info_item{
  position: relative;
  margin: 100px;
  height: 500px;
}
.info_text{
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.info_item:nth-child(odd) .info_img{
  position: absolute;
  right: 20px;
  background-repeat: no-repeat;
  height: 100%;
  width: 50%;
}
.info_item:nth-child(even) .info_img{
  position: absolute;
  left: 20px;
  background-repeat: no-repeat;
  height: 100%;
  width: 50%;
}
.info_item:nth-child(odd) .info_text{
  position: absolute;
  left: 0;
  top: 0;
}
.info_item:nth-child(even) .info_text{
  position: absolute;
  right: 0;
  top: 0;
}
</style>
