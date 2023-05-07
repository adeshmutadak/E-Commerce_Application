package com.example.order_placedProject.controller;

import com.example.order_placedProject.model.Address;
import com.example.order_placedProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/addresses")
public class AddreshController {
    @Autowired
    private AddressService addressService;

    public AddreshController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @GetMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable Integer id) {
        return addressService.getAddressById(id);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
}
