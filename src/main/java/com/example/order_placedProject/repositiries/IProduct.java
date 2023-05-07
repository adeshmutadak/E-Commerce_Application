package com.example.order_placedProject.repositiries;

import com.example.order_placedProject.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProduct extends CrudRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
