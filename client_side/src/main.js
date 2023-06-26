import './assets/main.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import { createApp } from 'vue'
import App from './App.vue'
import router from '/src/router/index.js'
const app=createApp(App)
app.use(ElementPlus)
app.use(router)
app.config.globalProperties.$ElEMENT={size:'large'}
app.mount('#app')