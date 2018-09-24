package com.imooc.product.service;

import java.util.List;

import com.imooc.product.dataobject.ProductInfo;

/**
 * Created by zhengwu on 2018/9/22.
 */
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

}
