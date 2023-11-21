import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from "@/views/Login";
import HomeView from "@/views/home/HomeView";
import manageHomeView from "@/views/home/manageHomeView"
Vue.use(VueRouter)
import store from "@/store";

const routes = [
  {
    path: '/',
    name: 'login',
    component: Login
  },
  {
    path: '/employeeHome',
    name: 'HomeView',
    component: HomeView,
    redirect:'/home',
    children: [
      {
        path: '/home',
        name:'首页',
        component:() => import('../views/home/Home')
      },
      {
        path: '/news',
        name:'通知公告',
        component:() => import('../views/news/news')
      },
      {
        path: '/knowledge',
        name: '知识图谱',
        component:() => import('../views/knowledge/knowledge')
      },
      {
        path: '/search',
        name:'分类查询',
        component:() => import('../views/search/search')
      },
      {
        path: '/helps',
        name:'帮助界面',
        component:() => import('../views/helps')
      },
    ]
  },
  {
    path: '/manageHome',
    name: 'manageHome',
    component: manageHomeView,
    redirect:'/manageHome',
    children: [
      {
        path: '/manageHome',
        name:'首页',
        component:() => import('../views/home/Home')
      },
      {
        path: '/manageNews',
        name:'通知公告',
        component:() => import('../views/news/news')
      },
      {
        path: '/manageKnowledge',
        name: '知识图谱',
        component:() => import('../views/knowledge/knowledge')
      },
      {
        path: '/manageSearch',
        name:'分类查询',
        component:() => import('../views/search/search')
      },
      {
        path: '/manageHelps',
        name:'帮助界面',
        component:() => import('../views/helps')
      },
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

// 路由守卫
router.beforeEach((to, from, next) => {
  localStorage.setItem("currentPathName", to.name)  // 设置当前的路由名称，为了在Header组件中去使用
  store.commit("setPath")  // 触发store的数据更新
  next()  // 放行路由
})

export default router
