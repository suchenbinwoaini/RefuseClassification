<template>
  <div class="container">
    <h1 class="title">通知公告</h1>
    <div class="divider"></div>
    <ul class="notice-list">
      <li v-for="notice in displayedNotices" :key="notice.id">
        <div class="notice-item">
          <i class="el-icon-s-comment"></i>
          <div class="notice-content">
            <a :href="`/news/${notice.id}`" class="notice-title">{{ notice.title }}</a>
            <span class="date">{{ notice.date }}</span>
          </div>
        </div>
      </li>
    </ul>
    <div class="block">
      <el-pagination
          @current-change="handleCurrentChange"
          :current-page.sync="currentPage"
          :page-size="pageSize"
          layout="prev, pager, next, jumper"
          :total="notices.length"
          background:true
      >
      </el-pagination>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(currentPage) {
      console.log(`当前页: ${currentPage}`);
      this.currentPage = currentPage;
    }
  },
  data() {
    return {
      notices: [
        { id: 1, title: '垃圾分类的重要性', date: '2023-10-25' },
        { id: 2, title: '如何正确进行垃圾分类', date: '2023-10-24' },
        { id: 3, title: '最新的垃圾分类政策解读', date: '2023-10-23' },
        { id: 4, title: '垃圾分类的重要性', date: '2023-10-25' },
        { id: 5, title: '如何正确进行垃圾分类', date: '2023-10-24' },
        { id: 6, title: '最新的垃圾分类政策解读', date: '2023-10-23' },
        { id: 7, title: '垃圾分类的重要性', date: '2023-10-25' },
        { id: 8, title: '如何正确进行垃圾分类', date: '2023-10-24' },
        { id: 9, title: '最新的垃圾分类政策解读', date: '2023-10-23' },
        { id: 10, title: '垃圾分类的重要性', date: '2023-10-25' },
        { id: 11, title: '如何正确进行垃圾分类', date: '2023-10-24' },
        { id: 12, title: '最新的垃圾分类政策解读', date: '2023-10-23' },
        { id: 13, title: '垃圾分类的重要性', date: '2023-10-25' },
        { id: 14, title: '如何正确进行垃圾分类', date: '2023-10-24' },
        { id: 15, title: '最新的垃圾分类政策解读', date: '2023-10-23' },
        { id: 16, title: '垃圾分类的重要性', date: '2023-10-25' },
        { id: 17, title: '如何正确进行垃圾分类', date: '2023-10-24' },
        { id: 18, title: '最新的垃圾分类政策解读', date: '2023-10-23' },
        // 添加更多通知公告...
      ],
      currentPage:1,
      pageSize: 10
    };
  },
  computed: {
    displayedNotices() {
      const startIndex = (this.currentPage - 1) * this.pageSize;
      const endIndex = startIndex + this.pageSize;
      return this.notices.slice(startIndex, endIndex);
    }
  }
};
</script>

<style>
.container {
  margin: 20px;
}

.title {
  font-size: 24px;
  margin-bottom: 10px;
  text-align: left;
  color: #819d6a;
}

.el-icon-s-comment {
  color: #819d6a;
  margin-right: 10px;
}

.divider {
  width: 100%;
  height: 1px;
  background: #ccc;
  margin-bottom: 20px;
}

.notice-list {
  list-style: none;
  padding: 0;
}

.notice-item {
  display: flex;
  align-items: center;
  margin-bottom: 10px;
}

.notice-content {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
}

.notice-title {
  margin-right: 10px;
  color: #333;
  text-decoration: none;
}

.date {
  color: #999;
}

</style>
