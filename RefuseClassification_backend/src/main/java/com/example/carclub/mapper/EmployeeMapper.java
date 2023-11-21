package com.example.carclub.mapper;

import com.example.carclub.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author LENOVO
* @description 针对表【employee】的数据库操作Mapper
* @createDate 2022-11-21 23:26:58
* @Entity com.example.carclub.entity.Employee
*/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}




