package com.guodx.springCloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: guodx
 * @Date: 2020/10/8 8:54 下午
 * @Description:
 * @Version: 1.0
 */
@Service
@FeignClient(value = "cloud-hystrix-payment-service",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/payment/ok")
    String ok();

    @GetMapping("/payment/timeout")
    String timeout();
}
