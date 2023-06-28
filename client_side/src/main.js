import './assets/main.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import { createApp } from 'vue'
import App from './App.vue'
import axios from '@/axiosinstance/axiosInstance';
import './mock/index'
import router from '/src/router/index.js'

const app=createApp(App)
app.use(ElementPlus)
app.use(router)
app.mount('#app')
app.config.globalProperties.$axios=axios;
