package com.example.order_placedProject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;



    private String email;

    private String password;


    private String phoneNumber;

    @JsonBackReference
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List address;
//
//    @OneToMany(mappedBy = "")
//    private Order order;
}