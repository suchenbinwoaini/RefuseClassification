package com.example.carclub.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carclub.entity.Money;
import com.example.carclub.service.MoneyService;
import com.example.carclub.mapper.MoneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author LENOVO
* @description 针对表【money】的数据库操作Service实现
* @createDate 2022-11-23 23:47:10
*/
@Service
public class MoneyServiceImpl extends ServiceImpl<MoneyMapper, Money>
    implements MoneyService{


    @Resource
    private MoneyMapper moneyMapper;

    @Override
    public List<Money> select() {
        return moneyMapper.selectList(null);
    }
}




