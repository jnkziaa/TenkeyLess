package com.example.tenkeyless;

import com.example.tenkeyless.dto.CustomerPurchaseAcknowledgement;
import com.example.tenkeyless.dto.CustomerPurchaseRequest;
import com.example.tenkeyless.service.CustomerPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TenkeyLessApplication {

    @Autowired
    private CustomerPurchaseService service;

    @PostMapping("/customerPurchase")
    public CustomerPurchaseAcknowledgement customerPurchase(@RequestBody CustomerPurchaseRequest request){
        return service.customerPurchase(request);
    }
    public static void main(String[] args) {
        SpringApplication.run(TenkeyLessApplication.class, args);
    }

}
