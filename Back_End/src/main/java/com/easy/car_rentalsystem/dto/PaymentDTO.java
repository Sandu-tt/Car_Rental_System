package com.easy.car_rentalsystem.dto;

import com.easy.car_rentalsystem.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author : SANDU
 * @created 02/11/2023
 * @project Car_Rental_System
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class PaymentDTO {
    private String paymentID;
    private RentDTO rentID;
    private PaymentType paymentType;
    private LocalDate date;
    private LocalTime time;
    private Double lostDamage;
    private Double rentFee;
    private Double driverFee;
    private Double total;
}
