<template>
  <div id="main">
    <el-carousel :interval="4000" type="card">
      <el-carousel-item v-for="item in 6" :key="item" ></el-carousel-item>
    </el-carousel>
    <div style="font-size: xxx-large;font-weight: bolder;margin-bottom: 25px;color: #819D6A">垃圾分类，从我做起！</div>

    <div><span class="author">版权所有：汪子茵、刘紫暄、韩文华、杜睿凯</span></div>

  </div>

</template>

<script>
export default {
  name: "Home"
}
</script>

<style>
body{
  background-image: url("../../../src/assets/background.png");
}
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}

.el-carousel__item:nth-child(6n) {
  background: url("../../assets/i1.png");
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.el-carousel__item:nth-child(6n+1) {
  background: url("../../assets/i2.png");
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.el-carousel__item:nth-child(6n+2) {
  background: url("../../assets/i3.png");
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.el-carousel__item:nth-child(6n+3) {
  background: url("../../assets/i4.png");
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.el-carousel__item:nth-child(6n+4) {
  background: url("../../assets/i5.png");
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.author{
  font-size: small;
  color: #cccccc;
}
</style>