package com.demo.wearway.controller;

import com.demo.wearway.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

}
