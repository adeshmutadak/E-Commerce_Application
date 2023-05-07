package com.example.order_placedProject.service;

import com.example.order_placedProject.model.Address;
import com.example.order_placedProject.repositiries.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private IAddress addressRepository;


    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Optional<Address> getAddressById(Integer id) {
        return addressRepository.findById(id);
    }

    public List<Address> getAllAddresses() {
        return (List<Address>) addressRepository.findAll();
    }
}