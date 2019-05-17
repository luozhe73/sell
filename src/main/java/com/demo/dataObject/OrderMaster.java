package com.demo.dataObject;

import com.demo.enums.OrderStatusEnum;
import com.demo.enums.PayStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@DynamicUpdate
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderMaster {

    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**
     * 支付状态:默认为支付
     */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

    /**数据库对应时不会对应该字段*/
    // @Transient
    // private List<OrderDetail> orderDetailList;

}
