package com.imooc.product.VO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Created by zhengwu on 2018/9/22.
 */
@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String     productId;

    @JsonProperty("name")
    private String     productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String     productDescription;

    @JsonProperty("icon")
    private String     productIcon;

}
