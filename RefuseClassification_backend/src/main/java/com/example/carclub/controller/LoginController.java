package com.example.carclub.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.carclub.common.Constants;
import com.example.carclub.common.Result;
import com.example.carclub.entity.Employee;
import com.example.carclub.entity.dto.Employeedto;
import com.example.carclub.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public Result login(@RequestBody Employeedto employeedto){
        String username = employeedto.getUser();
        String password = employeedto.getPassword();
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            System.out.println("有问题");
            return Result.error(Constants.CODE_400,"参数错误");
        }
        System.out.println("执行L");
        Employeedto dto = employeeService.login(employeedto);
        return Result.success(dto);

    }

}
