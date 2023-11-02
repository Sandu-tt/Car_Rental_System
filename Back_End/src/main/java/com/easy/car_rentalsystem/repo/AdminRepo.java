package com.easy.car_rentalsystem.repo;

import com.easy.car_rentalsystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
public interface AdminRepo extends JpaRepository<Admin,String> {

}
