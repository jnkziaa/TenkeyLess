package com.example.tenkeyless.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_INFO")
public class CustomerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cId;

    private String username;
    private String email;
    private String phoneNumber;
    private String city;
    private String state;
    private double totalCost;



}
