package com.easy.car_rentalsystem.service;

import com.easy.car_rentalsystem.dto.CustomDTO;
import com.easy.car_rentalsystem.dto.PaymentDTO;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @created 02/11/2023
 * @project Car_Rental_System
 */
public interface PaymentService {
    CustomDTO paymentIdGenerate();
    void savePayment(PaymentDTO dto, String rentID);
    ArrayList<PaymentDTO> getAllPayment();
}
