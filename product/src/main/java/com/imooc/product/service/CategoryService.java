package com.imooc.product.service;

import java.util.List;

import com.imooc.product.dataobject.ProductCategory;

/**
 * Created by zhengwu on 2018/9/22.
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
