package com.easy.car_rentalsystem.dto;

import com.easy.car_rentalsystem.enums.RentRequest;
import com.easy.car_rentalsystem.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class RentDTO {
    private String rentID;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private RequestType requestType;
    private RentRequest rentType;
    private String location;
    private RegUserDTO regUser;

    private List<RentDetailsDTO> rentDetails;
}
