package com.easy.car_rentalsystem.entity;

import embeded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegUser {
    @Id
    private String user_Id;

    @Embedded
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private String nic_Img;
    private String license_Img;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
}
