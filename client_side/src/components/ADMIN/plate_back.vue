<script setup lang="ts">
import API from "../../axiosinstance/axiosInstance.js"
import  {onMounted,ref,inject} from "vue";
import { ElMessage } from 'element-plus'
import { ElTable } from 'element-plus'



const reLoad=inject('reLoad')
const isShow=ref(false)
const multipleSelection = ref([])
const dialogVisible = ref(false)
const pList=ref()
const currentRow = ref()
const singleTableRef = ref<InstanceType<typeof ElTable>>()
const pForm=ref({
  id:124,
  name:'',
  detail:'',
  plate_image:''
})

const checkP=(plate)=>{
  return plate.name!==''&&plate.detail!==''
}
const pInsert=()=>{
  if(checkP(pForm.value)){
    API({
      url:'/admin/insert',
      method:'POST',
      data:{
        id:124,
        name:pForm.value.name,
        detail:pForm.value.detail,
        plate_image:pForm.value.plate_image,
        click_qty:0,
        post_qty:0,
      }
    }).then((res)=>{
      if(res.data.status==200){
        ElMessage({
          message: '操作成功',
          type: 'success',
        })
        reLoad()
      }
      else{
        ElMessage.error('未知错误')
      }
    })
  }
  else{
    ElMessage.error('除图片外不能为空，请检查')

  }
}
const pDelete=()=>{
  const id=getId(currentRow.value)
  API({
    url:'/admin/delPlateById',
    method:'DELETE',
    params:{
      id:id
    }
  }).then((res)=>{
    //true
    setTimeout(()=>{
      reLoad()
    },3000)
    ElMessage({
      message: '操作成功',
      type: 'success',
    })
  })

}
const getId=(plate)=>{
  if( typeof (plate)!=="undefined"&&typeof (plate)!=="null"){
    return plate.id
  }
  else{
    ElMessage('请选择板块')
  }

}
const handleCurrentChange = (val) => {
  currentRow.value = val
  // console.log(currentRow.value)
}
const setCurrent = (row) => {
  singleTableRef.value!.setCurrentRow(row)
  // console.log(currentRow.value)
}
onMounted(()=>{
  API({
    url:'/plate/findall',
    method:"GET",
  }).then((res)=>{
    // iftrue
    pList.value=res.data
    isShow.value=true
  })
})
</script>

<template>
  <el-dialog v-model="dialogVisible" title="新建板块">
    <el-form :model="pForm">
      <el-form-item label="板块主题" :label-width="70">
        <el-input placeholder="请输入题目" v-model="pForm.name" autocomplete="off" />
      </el-form-item>
      <el-form-item label="板块简介" :label-width="70">
        <el-input
            v-model="pForm.detail"
            :rows="2"
            type="textarea"
            placeholder="Please input"
        />
      </el-form-item>
      <el-form-item label="活动图片" :label-width="70">
        <el-upload
            class="avatar-uploader"
            action="https://run.mocky.io/v3/9d059bf9-4660-45f2-925d-ce80ad6c4d15"
            :show-file-list="false"
        >
          <img v-if="pForm.plate_image" :src="pForm.plate_image" class="avatar" />
          <el-icon v-else class="avatar-uploader-icon"><Plus /></el-icon>
        </el-upload>
        <el-input placeholder="上传图片地址" v-model="pForm.plate_image" autocomplete="off" />
      </el-form-item>


    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="pInsert">
          确认
        </el-button>
      </span>
    </template>
  </el-dialog>
  <el-button type="primary" @click="dialogVisible=true">板块插入</el-button>
  <el-button type="danger" @click="pDelete">板块删除</el-button>
  <el-button @click="setCurrent">清除选择</el-button>
  <el-table :data="pList"
            height="650"
            style="width: 100%"
            highlight-current-row
            ref="singleTableRef"
            v-if="isShow"
            @current-change="handleCurrentChange"
            id="content"
            >
    <el-table-column type="index" width="50" />
    <el-table-column prop="name" label="板块主题" width="230" />
    <el-table-column prop="id" label="板块ID" width="180" />
    <el-table-column prop="detail" label="板块简介" width="180" />
    <el-table-column prop="click_qty" label="点击数" width="180" />
    <el-table-column prop="post_qty" label="主题数" width="230" />
  </el-table>
</template>

<style scoped>

</style>