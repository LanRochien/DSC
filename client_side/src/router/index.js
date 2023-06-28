// vue路由配置
// 项目路由文件
import { createRouter,createWebHashHistory } from "vue-router";

import LOGIN from "/src/components/LOGIN/login.vue"
import INDEX from "/src/components/INDEX/index.vue"
import REGISTER from "/src/components/REGISTER/register.vue"
import ACTIVITY from "/src/components/ACTIVITY/activities.vue"


const routes=[
    {
        path: '/',
        redirect:'/index'
    },
    {
        path:'/login',
        component:LOGIN
    },
    {
        path:'/index',
        component:INDEX
    },
    {
        path:'/register',
        component:REGISTER
    },
    {
        path:'/activities',
        component:ACTIVITY
    },
]
export default createRouter({
    // 设置路由模式，设置每次加载新路由地址，页面位置顶部开始
    history:createWebHashHistory(),
    routes,
    scrollBehavior(){
        return {top:0}
    }
})