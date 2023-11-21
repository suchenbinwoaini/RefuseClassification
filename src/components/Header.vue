<template>
  <div style="font-size: 12px;line-height: 60px;display: flex;color: #55b9f3" :style="{'color':theme}">
    <div style="flex: 1; font-size: 22px;" >
      <div style="float: left">
        <span :class="collapseBtnClass" style="cursor: pointer; col" @click="collapse" ></span>
        <el-breadcrumb separator="/" style="display: inline-block; margin-left: 10px">
          <el-breadcrumb-item :to="'/home'">首页</el-breadcrumb-item>
                  <el-breadcrumb-item>{{ currentPathName }}</el-breadcrumb-item>
        </el-breadcrumb>
      </div>

    </div>
  </div>
</template>

<script>
export default {
  name: "Header",
  props:{
    collapseBtnClass:String,
    collapse:Function,
  },
  data(){
    return{
      theme:"#789163",
      // user:localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
      // ename:localStorage.getItem("ename")
    }
  },
  computed: {
    currentPathName () {
      return this.$store.state.currentPathName;　　//需要监听的数据
    }
  },
  methods:{
    logout(){
      this.$router.push("")
    }
  }
}
</script>

<style scoped>

</style>