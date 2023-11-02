package com.easy.car_rentalsystem.service;

import com.easy.car_rentalsystem.dto.UserDTO;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username,String password);
}
