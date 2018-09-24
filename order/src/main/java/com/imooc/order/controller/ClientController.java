package com.imooc.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        //1.第一种方式：(直接使用RestTemplate)
        //       RestTemplate restTemplate = new RestTemplate();
        //       String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);

        //2.第二种方式：(通过LoadBalancerClient通过应用名获取url，然后再使用RestTemplate)
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("product");
        String url = String.format("http://%s:%s", serviceInstance.getHost(),
            serviceInstance.getPort()) + "/msg";
        String response = restTemplate.getForObject(url, String.class);
        //1.第三种方式：(利用@LoadBalanced，可以在restTemplate里使用应用名字)
        //        String response = restTemplate.getForObject("http://product/msg", String.class);
        log.info("response={}", response);
        return response;
    }
}
