package com.example.tenkeyless.dto;

import com.example.tenkeyless.entity.CustomerInfo;
import com.example.tenkeyless.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPurchaseRequest {
    private CustomerInfo customerInfo;
    private PaymentInfo paymentInfo;
}
