package com.demo.dao;

import com.demo.dataObject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDAOTest {

    @Autowired
    private OrderMasterDAO orderMasterDAO;

    @Test
    public void save() {

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("罗哲");
        orderMaster.setBuyerAddress("民生银行");
        orderMaster.setBuyerPhone("15510570788");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(23.5));
        orderMasterDAO.save(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() {

        PageRequest pageRequest = new PageRequest(5, 3);
        Page<OrderMaster> page = orderMasterDAO.findByBuyerOpenid("110110", pageRequest);
        System.out.println(page.getTotalElements());
    }

}