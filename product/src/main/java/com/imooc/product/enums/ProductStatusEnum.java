package com.imooc.product.enums;

/**
 * Created by zhengwu on 2018/9/22.
 */

import lombok.Getter;

/**
 * 商品上下线状态
 */
@Getter
public enum ProductStatusEnum {
                               UP(0, "在架"), DOWN(1, "下架");

    private Integer code;
    private String  message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
