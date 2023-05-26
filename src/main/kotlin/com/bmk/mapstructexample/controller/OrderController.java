package com.bmk.mapstructexample.controller;

import com.bmk.mapstructexample.domain.dto.response.OrderResponse;
import com.bmk.mapstructexample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderservice;

    @Autowired
    private ConversionService conversionService;

    @GetMapping
    public OrderResponse getById(@RequestParam Long id) {
        return conversionService.convert(orderservice.getById(id), OrderResponse.class);
    }
}
