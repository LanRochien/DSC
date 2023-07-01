// vue路由配置
// 项目路由文件
import { createRouter,createWebHashHistory } from "vue-router";

import LOGIN from "/src/components/LOGIN/login.vue"
import INDEX from "/src/components/INDEX/index.vue"
import REGISTER from "/src/components/REGISTER/register.vue"
import ACTIVITIES from "/src/components/ACTIVITY/activities.vue"
import ACTIVITY from "/src/components/ACTIVITY/activitydetail.vue"
import FORUMINDEX from "/src/components/FORUM/forum_index.vue"
import PLATE from "/src/components/FORUM/plate.vue"
import POST from "/src/components/FORUM/post.vue"
import SEARCH from "/src/components/SEARCH/search.vue"
import ADMIN from "/src/components/ADMIN/admin.vue"
import BACKACT from "/src/components/ADMIN/activities_back.vue"
import BACKFORUM from "/src/components/ADMIN/luntan_back.vue"
import BACKUSER from "/src/components/ADMIN/users_back.vue"

import INDIVIDUAL from  "/src/components/INDIVIDUAL/personpage.vue"


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
        component:ACTIVITIES
    },
    {
        path:'/FORUM',
        component:FORUMINDEX
    },
    {
        path:'/FORUM/:plateid',
        name:'plate',
        component:PLATE
    },
    {
        path:'/FORUM/:plateid/post/:postid',
        name:'post',
        component: POST
    },
    {
        path:'/activities/:activity_id',
        name:'activity',
        component: ACTIVITY
    },
    {
        path:'/search/:key',
        name:'search',
        component: SEARCH
    },

    {
        path:'/individual/:id',
        name:'personal',
        component: INDIVIDUAL
    },
    {
        path:'/admin',

        component: ADMIN,
        children:[
            {
                path:'activity',
                component: BACKACT
            },
            {
                path:'forum',
                component: BACKFORUM
            },
            {
                path:'users',
                component: BACKUSER
            },
        ]

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