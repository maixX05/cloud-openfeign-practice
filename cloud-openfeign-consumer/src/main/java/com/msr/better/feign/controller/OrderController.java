package com.msr.better.feign.controller;

import com.msr.better.feign.api.OrderApiService;
import com.msr.better.feign.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-07-03
 */
@RestController
@RequestMapping("api")
public class OrderController {

    @Autowired
    private OrderApiService orderApiService;

    /**
     * @param order
     * @return
     */
    @PostMapping("/get/pojo")
    public String getPojo(@RequestBody Order order) {
        return orderApiService.addUser(order);
    }

    @PostMapping("/post/pojo")
    String postPojo(@RequestBody Order order){
        return orderApiService.updateUser(order);
    }
}
