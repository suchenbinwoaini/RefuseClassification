<template>
  <div class="wrapper">
    <rain></rain>
    <button class="goin" @click="login">-></button>
    <button class="goin" @click="manageLogin"><-</button>
  </div>
</template>

<script>
import request from "@/utils/request";
import rain from "../rain";
export default {
  name: "Login",
  components:{
    rain
  },
  methods: {
    login() {
      this.$router.push('/employeeHome')
    },
    manageLogin() {
      this.$router.push('/manageHome')
    }
  }
}
</script>

<style scoped>
.wrapper {
  height: 100vh;
  background: url("../assets/bg1.png");
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
  overflow: hidden;
}
.goin{
  margin-top: 480px;
  width: 80px; /* 按钮宽度 */
  height: 80px; /* 按钮高度 */
  border-radius: 50%; /* 边框半径设置为宽度和高度的一半，实现圆形 */
  border: none; /* 去掉边框 */
  background-color: #819d6a;
  font-size: larger;
  font-weight: bolder;
  cursor: pointer;
  opacity: 0.9;
  transition: background-color 0.3s ease;
  transition: transform 0.3s ease;
  /*bottom: 10px;*/
}
.goin:hover{
  background-color: #4d5942;
  transform: translateY(-5px);
}
</style>