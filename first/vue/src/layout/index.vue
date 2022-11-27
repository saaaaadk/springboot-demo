<template>
  <el-button type="danger" @click="testHandler">测试接口</el-button>
</template>

<script setup>
import request from "@/util/request";

const testHandler = async () => {
  let result = await request.get("test/user/list");
}
</script>

<style scoped>

</style>