package com.example.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderDto;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public ResponseEntity<?> getOrders() {
        List<OrderDto> orders = orderService.getOrders();
        Map<String, Object> response = new HashMap();
        response.put("success", true);
        response.put("message", "Orders fetched successfully");
        response.put("status", Response.SC_OK);
        response.put("data", orders);
        return new ResponseEntity<Map>(response, HttpStatus.OK);

    }

    @PutMapping("/{orderId}")
    public ResponseEntity<?> updateOrder(@RequestParam String status, @PathVariable String orderId) {
        orderService.updateOrderStatus(status, orderId);
        Map<String, Object> response = new HashMap();
        response.put("success", true);
        response.put("message", "Order status updated successfully");
        response.put("status", Response.SC_OK);
        response.put("data", "");
        return new ResponseEntity<Map>(response, HttpStatus.OK);

    }

    @PostMapping("")
    public ResponseEntity<?> checkoutOrder(@RequestBody OrderDto orderDto) {
        System.out.println("ipwkcv,mrt4e" + orderDto);

        orderService.checkoutOrder(orderDto);
        Map<String, Object> response = new HashMap();
        response.put("success", true);
        response.put("message", "Order checked out successfully");
        response.put("status", Response.SC_OK);
        response.put("data", "");
        return new ResponseEntity<Map>(response, HttpStatus.OK);

    }

}