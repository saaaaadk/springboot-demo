<template>
  <!--
    <el-button type="primary" @click="handleLogin">测试登录</el-button>
    <el-button type="danger" @click="handleUserList">测试获取用户请求</el-button>
  -->
  <router-view/>
</template>
<script setup>
/*
import request from "@/util/request";
import store from "@/store";

const handleLogin = async () => {
  let result = await request.get("test/login");
  let data = result.data;
  if (data.code === 200) {
    let token = data.token;
    console.log("登陆成功,token=" + token)
    store.commit("SET_TOKEN", token);
  } else {
    console.log("登录出错")
  }
}

const handleUserList = async () => {
  let result = await request.get("test/user/list");
  let data = result.data;
  if (data.code === 200) {
    let userList = data.list;
    console.log("用户列表信息：" + userList);
  }
}
*/
</script>

<style>
html, body, #app {
  height: 100%;
}

.app-container {
  padding: 20px
}
</style>
