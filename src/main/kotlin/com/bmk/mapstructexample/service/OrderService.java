package com.bmk.mapstructexample.service;

import com.bmk.mapstructexample.domain.model.Order;
import org.springframework.stereotype.Service;

import java.util.Collections;

import static com.bmk.mapstructexample.util.MockObjectsKt.getBook;
import static com.bmk.mapstructexample.util.MockObjectsKt.getLibrary;

@Service
public class OrderService {

    public Order getById(Long id) {
        Order order = new Order();
        order.setId(id);
        order.setLibrary(getLibrary());
        order.setBooks(Collections.singletonList(getBook()));
        return order;
    }
}
