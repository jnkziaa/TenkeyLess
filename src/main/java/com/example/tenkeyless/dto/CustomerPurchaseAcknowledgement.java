package com.example.tenkeyless.dto;

import com.example.tenkeyless.entity.CustomerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPurchaseAcknowledgement {
    private String status;
    private double actualCost;
    private String pnrNo;
    private CustomerInfo customerInfo;


}
