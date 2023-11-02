package com.easy.car_rentalsystem.service.impl;

import com.easy.car_rentalsystem.dto.CustomDTO;
import com.easy.car_rentalsystem.dto.RegUserDTO;
import com.easy.car_rentalsystem.entity.RegUser;
import com.easy.car_rentalsystem.entity.User;
import com.easy.car_rentalsystem.enums.RoleType;
import com.easy.car_rentalsystem.repo.RegUserRepo;
import com.easy.car_rentalsystem.service.RegUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

@Service
@Transactional
public class RegUserServiceImpl implements RegUserService {

    @Autowired
    private RegUserRepo repo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveUser(RegUserDTO dto) {

        RegUser regUser = new RegUser(dto.getUser_Id(), dto.getName(), dto.getContact_No(), dto.getAddress(), dto.getEmail(), dto.getNic(), dto.getLicense_No(), "", "", new User(dto.getUser().getUser_Id(), dto.getUser().getRole_Type(), dto.getUser().getUser_Name(), dto.getUser().getPassword()));
        if (repo.existsById(dto.getUser_Id()))
            throw new RuntimeException("User Already Exist. Please enter another id..!");

        try {

            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getNic_Img().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getNic_Img().getOriginalFilename()));
            dto.getLicense_Img().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getLicense_Img().getOriginalFilename()));

            regUser.setNic_Img("uploads/" + dto.getNic_Img().getOriginalFilename());
            regUser.setLicense_Img("uploads/" + dto.getLicense_Img().getOriginalFilename());


        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println(regUser);
        repo.save(regUser);

    }

    @Override
    public void updateUser(RegUserDTO dto) {

        RegUser regUser = new RegUser(dto.getUser_Id(), dto.getName(), dto.getContact_No(), dto.getAddress(), dto.getEmail(), dto.getNic(), dto.getLicense_No(), "", "", new User(dto.getUser().getUser_Id(), dto.getUser().getRole_Type(), dto.getUser().getUser_Name(), dto.getUser().getPassword()));
        if (!repo.existsById(dto.getUser_Id())) {
            throw new RuntimeException("User Not Exist. Please enter Valid id..!");
        }

        try {

            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getNic_Img().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getNic_Img().getOriginalFilename()));
            dto.getLicense_Img().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getLicense_Img().getOriginalFilename()));

            regUser.setNic_Img("uploads/" + dto.getNic_Img().getOriginalFilename());
            regUser.setLicense_Img("uploads/" + dto.getLicense_Img().getOriginalFilename());


        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println(regUser);
        regUser.getUser().setRole_Type(RoleType.REGISTERED_USER);
        repo.save(regUser);

    }

    @Override
    public void deleteUser(String reg_ID) {
        if (!repo.existsById(reg_ID)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(reg_ID);
    }

    @Override
    public ArrayList<RegUserDTO> getAllUser() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<RegUser>>() {
        }.getType());
    }

    @Override
    public CustomDTO userIdGenerate() {
        return new CustomDTO(repo.getLastIndex());
    }

    @Override
    public RegUser searchUserId(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Wrong ID. Please enter Valid id..!");
        }
        System.out.println(id);
        return mapper.map(repo.findById(id).get(), RegUser.class);
    }

    @Override
    public CustomDTO getSumUser() {
        return new CustomDTO(repo.getSumUsers());
    }

    @Override
    public RegUserDTO availableUser(String userName) {
        return repo.availableUser(userName);
    }

}
