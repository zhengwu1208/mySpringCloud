package com.imooc.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.imooc.order.client.ProductClient;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhengwu on 2018/9/23.
 */
@RestController
@Slf4j
public class ClientController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate       restTemplate;

    @Autowired
    private ProductClient      productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        String response = productClient.productMsg();
        log.info("response={}", response);
        return response;
    }
}
