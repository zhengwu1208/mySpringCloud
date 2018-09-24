package com.imooc.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imooc.product.dataobject.ProductInfo;

/**
 * Created by zhengwu on 2018/9/22.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);

}
