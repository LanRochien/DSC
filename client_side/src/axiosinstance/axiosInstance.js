import axios from 'axios'
const API=axios.create({
    baseURL: 'http://localhost:8888',//服务器地址+端口号
    timeout: 2000
})
export default API