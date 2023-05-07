package com.example.order_placedProject.repositiries;

import com.example.order_placedProject.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddress extends CrudRepository<Address,Integer> {
}
