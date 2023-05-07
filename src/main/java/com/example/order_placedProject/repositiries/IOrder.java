package com.example.order_placedProject.repositiries;

import com.example.order_placedProject.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrder  extends CrudRepository<Order, Integer> {
}
