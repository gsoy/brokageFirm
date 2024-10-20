package com.gsoy.brokagefirm.controller;

import com.gsoy.brokagefirm.model.Order;
import com.gsoy.brokagefirm.model.request.OrderRequest;
import com.gsoy.brokagefirm.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping("/sell")
    public ResponseEntity<?> sell(@RequestBody OrderRequest request) {
        service.sell(request);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<Order>> findAllOrders() {
        return ResponseEntity.ok(service.findAll());
    }
}
