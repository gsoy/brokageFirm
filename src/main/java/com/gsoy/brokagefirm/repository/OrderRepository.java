package com.gsoy.brokagefirm.repository;

import com.gsoy.brokagefirm.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Modifying
    @Query("update Order o set o.status = 'CANCELED' where o.id = ?1")
    void deleteById(Integer userId);
}
