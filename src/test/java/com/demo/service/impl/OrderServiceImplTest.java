package com.demo.service.impl;

import com.demo.dataObject.OrderDetail;
import com.demo.dto.CartDTO;
import com.demo.dto.OrderDTO;
import com.demo.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("罗哲");
        orderDTO.setBuyerAddress("民生银行");
        orderDTO.setBuyerPhone("115510570788");
        orderDTO.setBuyerOpenid("110110");

        List<OrderDetail> cartDTOList = new ArrayList<>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("1");
        orderDetail.setProductQuantity(2);

        cartDTOList.add(orderDetail);

        orderDTO.setOrderDetailList(cartDTOList);
        orderService.create(orderDTO);

    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}