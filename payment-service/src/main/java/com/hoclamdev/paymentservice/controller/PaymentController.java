package com.hoclamdev.paymentservice.controller;

import com.hoclamdev.paymentservice.dto.PaymentRequest;
import com.hoclamdev.paymentservice.dto.PaymentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/v1/payment")
    @ResponseBody
    public ResponseEntity<PaymentResponse> payment(@RequestBody PaymentRequest paymentRequest) {

        var response = new PaymentResponse();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
