package com.example.carclub.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.carclub.entity.Employee;
import com.example.carclub.entity.Money;
import com.example.carclub.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;


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
