package com.easy.car_rentalsystem.dto;

import com.easy.car_rentalsystem.enums.AvailabilityType;
import embeded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DriverDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic_No;
    private String license_No;
    private MultipartFile license_Img;
    private AvailabilityType driverAvailability;
}
