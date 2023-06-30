
<script lang="ts" setup>
  import { reactive, toRefs } from 'vue'

  const state = reactive({
  circleUrl:
  'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png',
  squareUrl:
  'https://cube.elemecdn.com/9/c2/f0ee8a3c7c9638a54940382568c9dpng.png',
})

  const { circleUrl, squareUrl, sizeList } = toRefs(state)


</script>

<template>
<div class="wrap1" >
  <div class="wrap2">
    <div class="head">
<!--      导航栏/搜索框-->
    </div>
    <div class="main">
    <div id="headinfo">
<!--      头部背景-->头部背景
    </div>
        <div id="userinfo">
          <div class="userinfo_left">
<!--            此处添加用户信息左侧内容-->
            <div class="userinfo_left_head">
              <el-avatar size="large" :src="squareUrl" shape="square">
<!--               用户头像-->
<!--                :src="circleUrl/squareUrl表示圆形实例或方形实例“-->
              </el-avatar>
            </div>
          </div>
          <div class="userinfo_middle">
<!--            此处添加用户信息中部内容，还可加性别、id等-->
              <div class="userinfo_middle_name">
                用户名
              </div>
            <div class="userinfo_middle_details">
              说明信息
            </div>
          </div>
          <div class="userinfo_right">
            <el-button type="info" >功能/跳转</el-button>
<!--            此处添加用户信息右侧内容，可是功能按钮（修改密码等）-->
          </div>
        </div>
    <div id="container">
      <div class="ihome">
<!--       ihome内还可添加主要内容以外的的东西（排行榜等） -->
        <div class="content" >帖子展示处</div>
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
  min-height: 110px;
  width: 978px;
  margin: 0 auto;
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
  margin-top: 30px;
}
.userinfo_right{
  line-height: 100px;
  text-align: right;
  padding-right: 30px;
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
  text-align: center;
  line-height: 200px;
  border-style: solid;
  border-width: 1px;
  background-color: white;
}
.head{
  height: 90px;
  background: aquamarine;
}
</style>