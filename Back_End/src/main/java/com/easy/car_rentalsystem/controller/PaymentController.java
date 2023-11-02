package com.easy.car_rentalsystem.controller;

import com.easy.car_rentalsystem.dto.CustomDTO;
import com.easy.car_rentalsystem.dto.PaymentDTO;
import com.easy.car_rentalsystem.service.PaymentService;
import com.easy.car_rentalsystem.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/paymentIdGenerate")
    public @ResponseBody
    CustomDTO customerIdGenerate() {
        return service.paymentIdGenerate();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil savePayment(@RequestBody PaymentDTO dto, @RequestParam String rentID) {
        System.out.println(dto);
        System.out.println(rentID);
        service.savePayment(dto, rentID);
        return new ResponseUtil("OK", "Successfully Payment.!", null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping
    public ResponseUtil getAllPayment() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllPayment());
    }
}
