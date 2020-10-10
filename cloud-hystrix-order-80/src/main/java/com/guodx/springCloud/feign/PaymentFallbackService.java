package com.guodx.springCloud.feign;

import org.springframework.stereotype.Service;

/**
 * @Author: guodx
 * @Date: 2020/10/9 5:04 下午
 * @Description:
 * @Version: 1.0
 */
@Service
public class PaymentFallbackService implements PaymentService {
    @Override
    public String ok() {
        return "PaymentFallbackService,O(∩_∩)O哈哈~";
    }

    @Override
    public String timeout() {
        return "PaymentFallbackService,o(╥﹏╥)o";
    }
}
