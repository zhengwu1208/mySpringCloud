package com.imooc.product.VO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Created by zhengwu on 2018/9/22.
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String      categoryName;

    @JsonProperty("type")
    private Integer     categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;

}
