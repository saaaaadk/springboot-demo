import axios from 'axios'

// 创建axios实例
const request = axios.create({
    // axios中请求配置有baseURL选项，表示请求URL公共部分
    baseURL: '/api/admin',
    // 超时
    timeout: 10000,
    // 设置Content-Type，规定了前后端的交互使用json
    headers: { 'Content-Type': 'application/json;charset=utf-8' }
})
export default request