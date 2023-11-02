package com.easy.car_rentalsystem.service;

import com.easy.car_rentalsystem.dto.AdminDTO;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
public interface AdminService {
    void saveAdmin(AdminDTO dto);
    void updateAdmin(AdminDTO dto);
    void deleteAdmin(String reg_ID);
    ArrayList<AdminDTO> getAllAdmin();
}
