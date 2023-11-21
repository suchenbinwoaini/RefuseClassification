package com.example.carclub.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carclub.entity.Employee;
import com.example.carclub.entity.dto.Employeedto;
import com.example.carclub.service.EmployeeService;
import com.example.carclub.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author LENOVO
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2022-11-21 23:26:58
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

    @Override
    public Employeedto login(Employeedto employeedto) {
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("USER",employeedto.getUser());
        queryWrapper.eq("PASSWORD",employeedto.getPassword());
        System.out.println(employeedto.getUser());
        System.out.println(employeedto.getPassword());
        Employee one = getOne(queryWrapper);
        if (one!=null){
            BeanUtil.copyProperties(one,employeedto,true);
            System.out.println(one);
            return employeedto;
        }
        else
            return null;
    }
}




