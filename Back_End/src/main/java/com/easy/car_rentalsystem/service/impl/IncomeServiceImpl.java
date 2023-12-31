package com.easy.car_rentalsystem.service.impl;

import com.easy.car_rentalsystem.dto.IncomeDTO;
import com.easy.car_rentalsystem.repo.IncomeRepo;
import com.easy.car_rentalsystem.service.IncomeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private IncomeRepo incomeService;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ArrayList<IncomeDTO> dailyIncome() {
        return new ArrayList<IncomeDTO>(incomeService.dailyIncome());
    }

    @Override
    public ArrayList<IncomeDTO> monthlyIncome() {
        return new ArrayList<IncomeDTO>(incomeService.MonthlyIncome());
    }

    @Override
    public ArrayList<IncomeDTO> AnnuallyIncome() {
        return new ArrayList<IncomeDTO>(incomeService.AnnuallyIncome());
    }
}
