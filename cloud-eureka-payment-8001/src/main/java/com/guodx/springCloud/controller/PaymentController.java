package com.guodx.springCloud.controller;

import com.guodx.springCloud.dao.PaymentMapper;
import com.guodx.springCloud.entities.CommonResult;
import com.guodx.springCloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:36 上午
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentMapper paymentMapper;
    @Value("${server.port}")
    private Integer port;

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int i = paymentMapper.insertPayment(payment);
        if (i > 0) {
            return new CommonResult<>(200, "创建成功,port:" + port, payment);
        } else {
            return new CommonResult<>(500, "创建失败", null);
        }
    }

    @GetMapping("/getById/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = paymentMapper.getPaymentById(id);
        return new CommonResult<>(200, "查询成功,port:" + port, payment);
    }

    @GetMapping("/timeout")
    public Integer feignTimout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
