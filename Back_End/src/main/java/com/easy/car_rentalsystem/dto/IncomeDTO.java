package com.easy.car_rentalsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IncomeDTO {
    private String date;
    private int count;
    private double total;
}
