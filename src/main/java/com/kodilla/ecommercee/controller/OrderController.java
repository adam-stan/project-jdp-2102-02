package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.OrderDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @GetMapping(value = "getOrders")
    public List<OrderDto> getOrders() {
        System.out.println("These are all orders.");
        return new ArrayList<>();
    }

    @GetMapping(value = "getOrder")
    public OrderDto getOrder(@RequestParam Long orderId) {
        return new OrderDto(1L, "Test order name.", true, new Date());
    }

    @PostMapping(value = "postOrder",consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto createOrder(@RequestBody OrderDto orderDto) {
        return new OrderDto(1L, "Created test order name.", true, new Date());
    }

    @PutMapping(value = "updateOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return new OrderDto(1L, "Edited test order name.", true, new Date());
    }

    @DeleteMapping(value = "deleteOrder")
    public void deleteTask(@RequestParam Long orderId) {
        System.out.println("Order has been canceled.");
    }
}
