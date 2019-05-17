package com.demo.dto;

import com.demo.dataObject.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    /**
     * 买家微信openid
     */
    private String buyerOpenid;

    private BigDecimal orderAmount;

    /**
     * 订单状态:默认为新订单
     */
    private Integer orderStatus;

    /**
     * 支付状态:默认为支付
     */
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
