package com.guodx.springCloud.feign;

import com.guodx.springCloud.entities.CommonResult;
import com.guodx.springCloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: guodx
 * @Date: 2020/10/8 8:54 下午
 * @Description:
 * @Version: 1.0
 */
@Service
@FeignClient("cloud-eureka-payment-service")
public interface PaymentService {

    @GetMapping("/payment/getById/{id}")
    CommonResult<Payment> getById(@PathVariable("id") Long id);

    @GetMapping("payment/timeout")
    Integer feignTimout();
}
