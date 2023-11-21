package com.example.carclub.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;
import cn.hutool.core.date.Quarter;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.carclub.common.Result;
import com.example.carclub.entity.Employee;
import com.example.carclub.entity.Money;
import com.example.carclub.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;


    @PostMapping
    public boolean save(@RequestBody Money money){
        System.out.println(money.getMoney());
        System.out.println(money.getMdate());
        System.out.println(money.getVipnum());
        return moneyService.saveOrUpdate(money);
    }

    @DeleteMapping("/{id}")
    public boolean del(@PathVariable int id){
        return moneyService.removeById(id);
    }

    @GetMapping("/chart")
    public List<Money> select(){
        return moneyService.select();
    }

    @GetMapping("/charts")
    public Result charts(){
        List<Money> list = moneyService.list();
        int q1 = 0; // 第一季度
        int q2 = 0; // 第二季度
        int q3 = 0; // 第三季度
        int q4 = 0; // 第四季度
        for (Money money : list) {
            Date createTime = money.getMdate();
            Quarter quarter = DateUtil.quarterEnum(createTime);
            switch (quarter) {
                case Q1: q1 += money.getMoney(); break;
                case Q2: q2 += money.getMoney(); break;
                case Q3: q3 += money.getMoney(); break;
                case Q4: q4 += money.getMoney(); break;
                default: break;
            }
        }
        return Result.success(CollUtil.newArrayList(q1, q2, q3, q4));
    }

    @GetMapping("/mcharts")
    public Result mcharts(){
        List<Money> list = moneyService.list();
        int j = 0; // 一月
        int f = 0; // 二月
        int m = 0; // 三月
        int a = 0; // 四月
        int ma = 0; // 五月
        int jun = 0; // 六月
        int ju = 0; // 七月
        int au = 0; // 八月
        int se = 0; // 九月
        int o = 0; // 十月
        int n = 0; // 十一月
        int d = 0; // 十二月
        for (Money money : list) {
            Date createTime = money.getMdate();
            Month month = DateUtil.monthEnum(createTime);
            switch (month) {
                case JANUARY: j += money.getMoney(); break;
                case FEBRUARY: f += money.getMoney(); break;
                case MARCH: m += money.getMoney(); break;
                case APRIL: a += money.getMoney(); break;
                case MAY: ma += money.getMoney(); break;
                case JUNE: jun += money.getMoney(); break;
                case JULY: ju += money.getMoney(); break;
                case AUGUST: au += money.getMoney(); break;
                case SEPTEMBER: se += money.getMoney(); break;
                case OCTOBER: o += money.getMoney(); break;
                case NOVEMBER: n += money.getMoney(); break;
                case DECEMBER: d += money.getMoney(); break;
                default: break;
            }
        }
        return Result.success(CollUtil.newArrayList(j, f, m, a,ma,jun,ju,au,se,o,n,d));
    }

    @PostMapping("/del/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids){
        return moneyService.removeByIds(ids);
    }

    @GetMapping("/page")
    public IPage<Money> findpage(@RequestParam Integer pageNum,
                                    @RequestParam Integer pageSize,
                                    @RequestParam(defaultValue = "") String VIPnum,
                                    @RequestParam(defaultValue = "") String Mdate)
    {
        System.out.println(pageSize);
        IPage<Money> page = new Page<>(pageNum,pageSize);
        QueryWrapper<Money> queryWrapper = new QueryWrapper<>();
        if (!"".equals(VIPnum))
            queryWrapper.like("VIPnum",VIPnum);
        if (!"".equals(Mdate))
            queryWrapper.like("Mdate",Mdate);
        return moneyService.page(page,queryWrapper);
    }
}
