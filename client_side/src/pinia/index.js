import { defineStore } from 'pinia'
// useStore 可以是 useUser、useCart 之类的任何东西
// 第一个参数是应用程序中 store 的唯一 id
export const useStore = defineStore('main', {
    state(){
        return {
            user:{},
            activity:{},
            searchKey:'',
            searchStatus:true,
        }
    },
    persist:{
        enabled:true,
        strategies:[{
            key:'user',
            storage:localStorage,
            paths:['name']
        }]
    },
    getters:{

    },
    actions:{

    }
    // other options...
})