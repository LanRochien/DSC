import axios from 'axios'
const API=axios.create({
    baseURL: 'http://localhost:8129',//服务器地址+端口号
    timeout: 20000
})
export default API