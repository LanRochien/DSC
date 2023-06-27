<script lang="ts" setup>
import { ref } from 'vue'

const currentDate = ref(new Date())
</script>

<template>
  <div class="common-layout">
    <el-container>
      <el-header class="header">Header</el-header>
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
        <el-row>
          <el-col
              v-for="(o, index) in 5"
              :key="o"
              :span="4"
              :offset="index > 0 ? 1 : 0"
          >
            <el-card :body-style="{ padding: '0px' }">
              <img
                  src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                  class="image"
              />
              <div style="padding: 14px">
                <span>Yummy hamburger</span>
                <div class="bottom">
                  <p>activities txt</p>
                  <el-button text class="button">Operating</el-button>
                </div>
              </div>
            </el-card>
          </el-col>
        </el-row>
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
</style>