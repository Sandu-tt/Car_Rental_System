package com.easy.car_rentalsystem.dto;

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
public class RegUserDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private MultipartFile nic_Img;
    private MultipartFile license_Img;


    private UserDTO user;
}
