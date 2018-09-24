package com.imooc.order.dataobject;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * Created by zhengwu on 2018/9/22.
 */
@Data
@Entity
public class OrderMaster {
    @Id
    /** 订单id. */
    private String     orderId;

    /** 买家名字. */
    private String     buyerName;

    /** 买家手机号. */
    private String     buyerPhone;

    /** 买家地址. */
    private String     buyerAddress;

    /** 买家微信Openid. */
    private String     buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer    orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer    payStatus;

    /** 创建时间. */
    private Date       createTime;

    /** 更新时间. */
    private Date       updateTime;
}
