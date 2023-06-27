import process from "vue-grid-layout/.eslintrc";

export default {
    method:'get',
    baseUrl:process.env.BASE_URL,
    headers:{
        'Content-Type':'application/json;charset=UTF-8'
    },
    data:{},
    timeout:10000,
    withCredentials:true,
    responseType:'json'
}