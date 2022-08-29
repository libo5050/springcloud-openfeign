package com.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="stock-service", url="localhost:8081/stock")
public interface StockFeignService {

    @RequestMapping("/reduce")
    String reduce();
}
