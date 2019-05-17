package com.demo.dao;

import com.demo.dataObject.OrderDetail;
import org.hibernate.validator.constraints.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDAOTest {

    @Autowired
    private OrderDetailDAO orderDetailDAO;

    @Test
    public void save() {

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("1");
        orderDetail.setProductIcon("http:xx");
        orderDetail.setProductName("皮皮虾");
        orderDetail.setProductPrice(new BigDecimal(90));
        orderDetail.setProductQuantity(3);
        orderDetailDAO.save(orderDetail);
    }

    @Test
    public void findByOrderId(){

        List<OrderDetail> list = orderDetailDAO.findByOrderId("123456");
        System.out.println(list.toString());
    }
}