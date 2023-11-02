package com.easy.car_rentalsystem.repo;

import com.easy.car_rentalsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : SANDU
 * @created 02/11/2023
 * @project Car_Rental_System
 */
public interface PaymentRepo extends JpaRepository<Payment, String> {
    @Query(value = "SELECT paymentID FROM Payment ORDER BY paymentID DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();
}
