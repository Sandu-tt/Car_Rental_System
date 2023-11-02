package com.easy.car_rentalsystem.service;

import com.easy.car_rentalsystem.dto.CustomDTO;
import com.easy.car_rentalsystem.dto.RegUserDTO;
import com.easy.car_rentalsystem.entity.RegUser;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @created 02/11/2023
 * @project Car_Rental_System
 */
public interface RegUserService {
    void saveUser(RegUserDTO dto);
    void updateUser(RegUserDTO dto);
    void deleteUser(String reg_ID);
    ArrayList<RegUserDTO> getAllUser();
    CustomDTO userIdGenerate();
    RegUser searchUserId(String id);
    CustomDTO getSumUser();
    RegUserDTO availableUser(String userName);

}
