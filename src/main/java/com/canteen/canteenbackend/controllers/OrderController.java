package com.canteen.canteenbackend.controllers;

import com.canteen.canteenbackend.models.dbmodels.Order;
import com.canteen.canteenbackend.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<Order> getOrders(@RequestParam String email) {

        return orderRepository.findAllByEmail(email);
    }
}
