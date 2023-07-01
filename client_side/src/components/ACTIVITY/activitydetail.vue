<script setup lang="ts">
import API from "../../axiosinstance/axiosInstance.js"
import MENU from '../COMPONENT/menu.vue'
import {onMounted, ref} from "vue";
import {useRoute, useRouter} from "vue-router";
import {useStore} from "../../pinia/index.js";
import { ElMessage, ElMessageBox } from 'element-plus'
import type { UploadProps, UploadUserFile } from 'element-plus'


const store=useStore()
const router=useRouter()
const route=useRoute()
const activityId=ref()
const activityInfo=ref({
  activity_title:"",
  activity_sponsor:'',
  activity_date:'',
  activity_image:'',
  activity_content:'',
})
const isShow=ref(false)
onMounted(()=>{
  activityId.value=router.currentRoute.value.params.activity_id
  activityInfo.value=store.activity
  isShow.value=true
})
const downLoad=()=>{
  const href=''
  const title=''
  const a=document.createElement('a')
  a.setAttribute('href',href)
  a.setAttribute('download',title)
  a.click()
}

//上传文件组件函数
const fileList = ref<UploadUserFile[]>([

])
const handleExceed: UploadProps['onExceed'] = (files, uploadFiles) => {
  ElMessage.warning(
      `The limit is 1, you selected ${files.length} files this time, add up to ${
          files.length + uploadFiles.length
      } totally`
  )
}
</script>


  <template>
    <div class="common-layout">
      <el-container>
        <el-header class="head" style="padding:0px;">
          <MENU current="/activities"></MENU>
        </el-header>
        <el-main   class="main" v-if="isShow" >
        <h1 class="title">{{activityInfo.activity_title}}</h1>
          <div class="author">{{activityInfo.activity_sponsor}}
          <span class="date">{{activityInfo.activity_date}}</span>
          </div>
          <div class="content">
            <img :src="activityInfo.activity_image" height="270" width="480">
            <div class="article-body">
              <div class="container">
                <p class="article">
                  {{activityInfo.activity_content}}
                  <br>
                  希利眼科研究所医生和研究员们在治疗视网膜变异、青光眼、糖尿病性视网膜病变和其他原发性眼疾方面取得了可喜的发展。希望这里的发现对全球产生影响。未间断地对眼库标本研究中的一方面包括按生物地理血统来识别眼疾的生物标志物，了解标记如何适用于不同祖先的个体。
                </p>
              </div>
            </div>
          </div>

          <el-button type="success" size="large" @click="downLoad()">下载表单</el-button>
<!--          //上传,action为请求路径-->
          <el-upload
              v-model:file-list="fileList"
              class="upload-demo"
              action="https://run.mocky.io/v3/9d059bf9-4660-45f2-925d-ce80ad6c4d15"
              multiple
              :show-file-list="false"
              :limit="1"
              :on-exceed="handleExceed"
          >
            <el-button size="large" type="primary">上传表单</el-button>
            <template #tip>
              <div class="el-upload__tip">
                jpg/png files with a size less than 500KB.
              </div>
            </template>
          </el-upload>

          <div class="footer">请注意：您通过下载并填写指定表单参与活动；表单填写完成后请以原格式上传，我们的管理员会对您的信息进行审核。</div>

        </el-main>
        <el-footer>
        </el-footer>
      </el-container>

    </div>
  </template>


<style scoped>
.common-layout{
  background-color: #f6f6f6;
}

.main{
  text-align: center;
  background-color:#fff;
  width:60%;
  margin: 0 auto;
}
.title{
  font-size: 60px;
  line-height: 60px;
  letter-spacing: .5px;
  margin: 15px 0;
  font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "微软雅黑", Arial, sans-serif;

}
.author{
  color: #0a3dab;
  font-family: "Helvetica";
  font-size: 16px;
  line-height: 24px;
  letter-spacing: 1px;
  margin: 36px 0 60px;
  display: block;
}
.author span{
  color: black;
}
.date{
  margin: 0 5px;
}
body{
  text-rendering: auto;

}
.container{
  margin: 5px 30px 5px;
}

.article{
  font-size: 24px;
  line-height: 32px;
  letter-spacing: 4px;
}
button{
  display: inline-block;
  margin-top: 5vw;
}
.footer{
  margin-top: 20px;
  padding-top: 10px;
  font-size: 12px;
  border-top: 1px solid #cccccc;
  color: #ccc;
}

</style>