package com.demo.service.impl;

import com.demo.dao.ProductInfoDAO;
import com.demo.enums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductInfoDAO dao;

    @Test
    public void findOne() {
    }

    @Test
    public void findUpAll() {
        System.out.println(ProductStatusEnum.UP.getCode());
        dao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
    }
}