package com.imooc.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhengwu on 2018/9/25.
 */
@FeignClient(name="product")
public interface ProductClient {
    @GetMapping("msg")
    String productMsg();
}
