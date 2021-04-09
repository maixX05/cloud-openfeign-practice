package com.msr.better.feign.controller;

import com.msr.better.feign.model.Order;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-07-03
 */
@RestController
@RequestMapping("/user")
public class OrderController {

    @GetMapping(value = "/add")
    public String addUser(Order order, HttpServletRequest request) {
        String token = request.getHeader("oauthToken");
        return "hello," + order.getName();
    }

    @PostMapping(value = "/update")
    public String updateUser(@RequestBody Order order) {
        return "hello," + order.getName();
    }

}
