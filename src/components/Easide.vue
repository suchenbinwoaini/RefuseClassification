<template>
  <el-menu :default-openeds="[]" style="height: 100%;overflow-x: hidden"
           background-color="rgb(129,157,106)"
           text-color="#fff"
           active-text-color="#ffd04b"
           :collapse-transition="false"
           :collapse="isCollapse"
           router
  >
    <div style="height: 60px;line-height: 60px;text-align: center">
      <img src="../assets/logo.png" alt="" style="width: 20px;position: relative;top: 6px;margin-right: 10px">
      <b style="color: white" v-show="!isCollapse">垃圾分类站</b>
    </div>
    <el-menu-item index="/home">
      <i class="el-icon-s-home"></i>
      <span>主页</span>
    </el-menu-item>
    <el-menu-item index="/news">
      <template slot="title">
        <i class="el-icon-s-order"></i>
        <span>通知公告</span>
      </template>
    </el-menu-item>
    <el-menu-item index="/knowledge">
      <template slot="title">
        <i class="el-icon-s-marketing"></i>
        <span>垃圾图谱</span>
      </template>
    </el-menu-item>
    <el-menu-item index="/search">
      <template slot="title">
        <i class="el-icon-s-comment"></i>
        <span>分类查询</span>
      </template>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  name: "Easide",
  props:{
    isCollapse:Boolean,
    logoTextshow:Boolean
  }
}
</script>

<style scoped>
.el-icon-s-home{
  color: ghostwhite;
}
.el-icon-s-order{
  color: ghostwhite;
  /*size: ledger;*/
}
.el-icon-s-marketing{
  color: ghostwhite;
}
.el-icon-s-comment{
  color: ghostwhite;
}

</style>