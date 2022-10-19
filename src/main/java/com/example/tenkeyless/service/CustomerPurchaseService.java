package com.example.tenkeyless.service;


import com.example.tenkeyless.dto.CustomerPurchaseAcknowledgement;
import com.example.tenkeyless.dto.CustomerPurchaseRequest;
import com.example.tenkeyless.entity.CustomerInfo;
import com.example.tenkeyless.entity.PaymentInfo;
import com.example.tenkeyless.repository.CustomerInfoRepository;
import com.example.tenkeyless.repository.PaymentInfoRepository;
import com.example.tenkeyless.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class CustomerPurchaseService {

    @Autowired
    private CustomerInfoRepository customerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public CustomerPurchaseAcknowledgement customerPurchase(CustomerPurchaseRequest request){
        CustomerInfo customerInfo = request.getCustomerInfo();
        customerInfoRepository.save(customerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimits(paymentInfo.getAccountNo(), customerInfo.getTotalCost());

        paymentInfo.setCustomerId(customerInfo.getCId());
        paymentInfo.setAmount(customerInfo.getTotalCost());
        paymentInfoRepository.save(paymentInfo);

        return new CustomerPurchaseAcknowledgement("Success", customerInfo.getTotalCost(), UUID.randomUUID().toString().split("-")[0], customerInfo);


    }
}
