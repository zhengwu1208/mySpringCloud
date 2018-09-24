package com.imooc.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imooc.order.dataobject.OrderDetail;

/**
 * Created by zhengwu on 2018/9/22.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
