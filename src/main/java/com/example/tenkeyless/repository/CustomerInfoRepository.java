package com.example.tenkeyless.repository;

import com.example.tenkeyless.entity.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {

}
