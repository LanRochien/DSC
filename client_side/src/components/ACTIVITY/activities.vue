<script lang="ts" setup>
import {onMounted, ref} from 'vue'
import MENU from '../COMPONENT/menu.vue'
import API from "../../axiosinstance/axiosInstance.js"
import {useRouter} from 'vue-router'
import {useStore} from "../../pinia";
import { Edit,} from '@element-plus/icons-vue'
import {ElMessage, ElMessageBox, UploadProps, UploadUserFile} from 'element-plus'

//API路径
    const activityVisible=ref(false)
    const volVisible=ref(false)
    const store= useStore()
    const router=useRouter()
    const isShow=ref(false)
    const activities=ref([
      {
        id:0,
        activity_image:'',
        title:'',
        date_time:'',
        num_required:0,
        num_participants:0,
        state:0,
        stateString:'',
        user:{}}
    ])
    const   current='/activities';
    const acState=ref('true')
const activeFileList = ref<UploadUserFile[]>([
])
const volFileList = ref<UploadUserFile[]>([
])
const handleExceed: UploadProps['onExceed'] = (files, uploadFiles) => {
  ElMessage.warning(
      `The limit is 1, you selected ${files.length} files this time, add up to ${
          files.length + uploadFiles.length
      } totally`
  )
}
const downLoad=()=>{
  const href=''
  const title=''
  const a=document.createElement('a')
  a.setAttribute('href',href)
  a.setAttribute('download',title)
  a.click()
}
    const dateSolver=(date:string)=>{
      return date.substring(0,9)
    }
    const stateMap=['待审核','进行中','已结束']
    const toActivity=(ac:object)=>{
        store.activity={
          activity_title:ac.title,
          activity_content:ac.content,
          activity_date:ac.date_time,
          activity_image:ac.activity_image,
          activity_state:ac.stateString,
          activity_sponsor:ac.user.name,
        }
        router.push({
          name:'activity',
          params:{
            activity_id:ac.id,
          }
        })
    }


const handleClose = (done: () => void) => {
  ElMessageBox.confirm('Are you sure to close this dialog?')
      .then(() => {
        done()
      })
      .catch(() => {
        // catch error
      })
}
    onMounted(()=>{
      API({
        url:'/activity/findall',
        method:'get'
      }).then((res)=>{
        // iftrue
        console.log(res.data)
        activities.value=res.data
        isShow.value=true

        for (let cur of activities.value){//for of 遍历对象

            cur.date_time=dateSolver(cur.date_time)
            cur.stateString=stateMap[cur.state%3]
        }
        console.log(activities.value)
      })
    })




</script>

<template >
  <MENU :current=current></MENU>
  <div class="button_group">
    <el-button-group>
      <el-button style="padding-left: 10px" type="primary" @click="activityVisible=true">申请活动  <el-icon><Edit /></el-icon> </el-button >
      <el-button type="primary" @click="volVisible=true">加入我们  <el-icon><Check /></el-icon> </el-button   >
    </el-button-group>
  </div>
  <div class="activities_wrapper" v-if="isShow" >
      <div class="activity_view">
        <div class="activity_card" v-for="activity in activities">
            <el-card :body-style="{ height:'420px',padding:'0px',width:'320px'}">
              <div class="image_block">
              <img
                  :src="activity.activity_image"
                  class="activity_image"
              />
              </div>
              <div style="padding: 14px;">
                <div class="activity_title">
                  <h4>{{activity.title}}</h4>
                  <div class="enter_button"><el-button  class="button" @click="toActivity(activity)">查看详情</el-button></div>
                </div>
                <div class="activity_detail">
                  <!--                需要人数 参与人数-->
                  <div class="need_info">
                    <div class="parti_num">已参与人数：{{activity.num_participants}}</div>
                    <div class="required_num">需要人数：{{activity.num_required}}</div>
                  </div>
<!--                  发布时间 发起人-->
                  <div class="author_info">
                    <div class="">发起人</div>
                    <div class="sponsor">{{activity.user.name}}</div>
                  </div>
                  <div class="time_info">
                    <div class="">发起时间</div>
                    <div class="post_time">{{activity.date_time}}</div>
                  </div>
<!--                  活动状态-->
                  <div class="state_info">
                    <div class="">当前状态：</div>
                    <div class="">{{activity.stateString}}</div>
                  </div>

                </div>
              </div>
            </el-card>
        </div>
      </div>
  </div>
<!--  下载-->
  <el-dialog
      class="dialog_block"
      v-model="activityVisible"
      title="活动申请表"
      width="30%"
      :before-close="handleClose"
      center
  >
    <el-button class="download_button" type="success" size="large" @click="downLoad()">下载表单</el-button>
    <el-upload
        v-model:file-list="activeFileList"
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
        </div>
      </template>
    </el-upload>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="activityVisible = false">Cancel</el-button>
        <el-button type="primary" @click="activityVisible = false">
          Confirm
        </el-button>
      </span>
    </template>
  </el-dialog>
<!--  加入我们-->
  <el-dialog
      v-model="volVisible"
      title="志愿者申请表"
      width="30%"
      :before-close="handleClose"
  >
    <el-button class="download_button" type="success" size="large" @click="downLoad()">下载表单</el-button>
    <el-upload
        v-model:file-list="volFileList"
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
        </div>
      </template>
    </el-upload>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="volVisible = false">Cancel</el-button>
        <el-button type="primary" @click="volVisible = false">
          Confirm
        </el-button>
      </span>
    </template>
  </el-dialog>
</template>

<style scoped>
.activities_wrapper{
  width: 100%;
  height: fit-content;

}

.activity_view{
  width: 1440px;
  overflow: hidden;
  margin: 0 auto;
}
.activity_card{
  max-width: 320px;
  margin-left: 20px;
  margin-right: 20px;
  margin-top: 20px;
  float: left;
}
.image_block{
  height: 240px;
}
.activity_image{
  width: 100%;
  height: 100%;
}
.activity_title{
  padding-bottom: 10px;
}
.need_info{
  font-size: 15px;
  padding-bottom: 5px;
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
.activity_title,
.author_info,
.time_info,
.state_info{
  font-size: 14px;
  padding-bottom: 5px;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  align-items: center;
}
.activity_title{
  margin-bottom: 10px;
}
.button_group {
  margin-top: 20px;
  text-align: right;
}
.download_button{
  margin-bottom: 20px;
}


</style>