package com.gsoy.brokagefirm.services;

import com.gsoy.brokagefirm.model.Order;
import com.gsoy.brokagefirm.model.enums.Side;
import com.gsoy.brokagefirm.model.enums.Status;
import com.gsoy.brokagefirm.model.request.OrderRequest;
import com.gsoy.brokagefirm.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public void sell(OrderRequest request) {
        var order = Order.builder()
                .customerId(request.getCustomerId())
                .assetName(request.getAssetName())
                .size(request.getSize())
                .price(request.getPrice())
                .status(Status.PENDING.name())
                .orderSide(Side.SELL.name())
                .build();
        repository.save(order);
    }


    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Order> findAll() {
        return repository.findAll();
    }
}
