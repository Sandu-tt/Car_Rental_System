package com.easy.car_rentalsystem.dto;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

import com.easy.car_rentalsystem.enums.RoleType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
public class UserDTO {
    private String user_Id;
    private RoleType role_Type;
    private String user_Name;
    private String password;

}
