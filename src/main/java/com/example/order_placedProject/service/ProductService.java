package com.example.order_placedProject.service;

import com.example.order_placedProject.model.Product;
import com.example.order_placedProject.repositiries.IProduct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private IProduct productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}
