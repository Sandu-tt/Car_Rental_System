package com.easy.car_rentalsystem.service;

import com.easy.car_rentalsystem.dto.CarDTO;
import com.easy.car_rentalsystem.dto.CustomDTO;
import com.easy.car_rentalsystem.entity.Car;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
public interface CarService {
    void saveCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String car_Id);
    ArrayList<CarDTO> getAllCar();
    CustomDTO carIdGenerate();
    Car searchCarId(String id);
    CustomDTO getSumCar();
    CustomDTO getSumAvailableCar();
    CustomDTO getSumReservedCar();
    CustomDTO getSumMaintainCar();
    CustomDTO getSumUnderMaintainCar();
    ArrayList<CarDTO> getFilerData(String type,String fuelType);
    ArrayList<CarDTO> filterCarDetails(String name, String fuel_Type,String type, String transmission_Type);

}
