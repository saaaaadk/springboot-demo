<template>
  <div class="login">
    <el-form ref="loginRef" :model="loginForm" rules="loginRules" class="login-form">
      <h3 class="title">Java1234 Vue3 后台管理系统</h3>
      <el-form-item prop="username">
        <el-input type="text" size="large" autocomplete="off" placeholder="账号"/>
      </el-form-item>
      <el-form-item prop="password">
        <el-input type="password" size="large" autocomplete="off" placeholder="密码" @keyup.enter="handleLogin"/>
      </el-form-item>
      <el-checkbox style="margin:0 0 25px 0;">记住密码</el-checkbox>
      <el-form-item style="width: 100px;">
        <el-button size="large" type="primary" style="width: 100px" @click.prevent="handleLogin">
          <span>登录</span>
        </el-button>
      </el-form-item>
    </el-form>
    <div class="el-login-footer">
      <span>Copyright © 2013-2022 <a href="https://leileigwl.gitee.io/"
                                     target="_blank">leileigwl.gitee.io</a> 版权所有.</span>
    </div>
  </div>
</template>

<script>
export default {
  name: "login"
}
</script>

<style lang="scss" scoped>

a {
  color: white
}

.login {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  background-image: url("@/assets/styles/images/1.jpg");
  background-size: cover;
}

.title {
  margin: 0px auto 30px auto;
  text-align: center;
  color: #707070;
}

.login-form {
  border-radius: 6px;
  background: #ffffff;
  width: 400px;
  padding: 25px 25px 5px 25px;

  .el-input {
    height: 40px;


    input {
      display: inline-block;
      height: 40px;
    }
  }

  .input-icon {
    height: 39px;
    width: 14px;
    margin-left: 0px;
  }

}

.login-tip {
  font-size: 13px;
  text-align: center;
  color: #bfbfbf;
}

.login-code {
  width: 33%;
  height: 40px;
  float: right;

  img {
    cursor: pointer;
    vertical-align: middle;
  }
}

.el-login-footer {
  height: 40px;
  line-height: 40px;
  position: fixed;
  bottom: 0;
  width: 100%;
  text-align: center;
  color: #fff;
  font-family: Arial;
  font-size: 12px;
  letter-spacing: 1px;
}

.login-code-img {
  height: 40px;
  padding-left: 12px;
}
</style>