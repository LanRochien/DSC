import axios from 'axios'
const API=axios.create({
    baseURL: 'http://localhost:8888/user/findall',
    timeout: 2000
})
export default API