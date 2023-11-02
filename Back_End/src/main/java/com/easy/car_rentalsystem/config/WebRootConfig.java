package com.easy.car_rentalsystem.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */


@Configuration
@Import(JPAConfig.class)
@ComponentScan(basePackages ="c")
        public class WebRootConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
