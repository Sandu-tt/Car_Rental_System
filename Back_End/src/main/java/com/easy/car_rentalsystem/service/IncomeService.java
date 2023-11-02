package com.easy.car_rentalsystem.service;

import com.easy.car_rentalsystem.dto.IncomeDTO;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */
public interface IncomeService {
    ArrayList<IncomeDTO> dailyIncome();
    ArrayList<IncomeDTO> monthlyIncome();
    ArrayList<IncomeDTO> AnnuallyIncome();
}
