package com.easy.car_rentalsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class DriverSchedule {
    private String driverID;
    private String rentID;
}
