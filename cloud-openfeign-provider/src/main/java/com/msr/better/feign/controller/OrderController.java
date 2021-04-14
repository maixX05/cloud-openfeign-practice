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
@RequestMapping("/order")
public class OrderController {

    /**
     * Get方法传递实体类
     *
     * @param order
     * @return
     */
    @GetMapping(value = "/add")
    public String addOrder(Order order) {

        return "hello," + order.getName();
    }

    /**
     * POST方法传递实体类
     *
     * @param order
     * @return
     */
    @PostMapping(value = "/update")
    public String updateOrder(@RequestBody Order order, HttpServletRequest request) {
        String token = request.getHeader("token");
        return "hello," + order.getName() + " " + "haha!I get a token: " + token;
    }

}
