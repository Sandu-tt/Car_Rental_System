package com.easy.car_rentalsystem.repo;

import com.easy.car_rentalsystem.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
public interface DriverRepo extends JpaRepository<Driver,String> {
    @Query(value = "SELECT user_Id FROM Driver ORDER BY user_Id DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();

    @Query(value = "SELECT COUNT(user_Id) FROM Driver", nativeQuery = true)
    int getSumDriver();

    @Query(value = "SELECT COUNT(user_Id) FROM Driver WHERE driverAvailability='AVAILABLE'", nativeQuery = true)
    int getSumAvailableDriver();

    @Query(value = "SELECT COUNT(user_Id) FROM Driver WHERE driverAvailability='UNAVAILABLE'", nativeQuery = true)
    int getSumUnavailableDriver();

    @Query(value = "SELECT * FROM Driver WHERE driverAvailability='AVAILABLE'", nativeQuery = true)
    List<Driver> availableDrivers();
}
