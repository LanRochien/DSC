<template>
  <div class="about">
    <h1>This is an about page</h1>
    <button @click="getData()">test axios 请求数据</button>
    <p>这是请求到的数据{{testData.list}}</p>
  </div>

</template>
<script>
import { reactive } from 'vue'
import API from "../test/axiosInstance"

export default{
  name:'About',
  setup(){
    //数据
    const testData = reactive({
      users:[]
    });

    //测试请求方法
    const getData = function(){
      API({
        url:'/user/findall',
        method:'get'
      }).then((res)=>{
        alert('请求成功!');
        testData.list = res.data.dataList;
      });
    }
    return{
      testData,
      getData,
    }
  }

}
</script>
