package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhengwu on 2018/9/23.
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String msg() {
        return "this is product msg1";
    }
}
