import request from "./index";

// 新增用户
// 查询用户列表
export function listUser(query) {
    return request({
        url: '/user',
        method: 'get',
        params: query
    })
}
