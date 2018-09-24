package com.imooc.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imooc.product.dataobject.ProductCategory;

/**
 * Created by zhengwu on 2018/9/22.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
