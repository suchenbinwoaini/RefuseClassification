package com.example.carclub.service;

import com.example.carclub.entity.Money;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author LENOVO
* @description 针对表【money】的数据库操作Service
* @createDate 2022-11-23 23:47:10
*/
public interface MoneyService extends IService<Money> {

    List<Money> select();
}
