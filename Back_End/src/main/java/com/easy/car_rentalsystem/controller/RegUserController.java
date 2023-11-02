package com.easy.car_rentalsystem.controller;

import com.easy.car_rentalsystem.dto.CustomDTO;
import com.easy.car_rentalsystem.dto.RegUserDTO;
import com.easy.car_rentalsystem.dto.UserDTO;
import com.easy.car_rentalsystem.entity.RegUser;
import com.easy.car_rentalsystem.service.RegUserService;
import com.easy.car_rentalsystem.util.ResponseUtil;
import embeded.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

@RestController
@CrossOrigin
@RequestMapping("/reg_User")
public class RegUserController {

    @Autowired
    private RegUserService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveUser(@ModelAttribute RegUserDTO regUserDTO, @ModelAttribute UserDTO user, @ModelAttribute Name name) {
        regUserDTO.setName(name);
        regUserDTO.setUser(user);
        System.out.println(regUserDTO);
        service.saveUser(regUserDTO);
        return new ResponseUtil("OK", "Successfully Registered.!", null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/update")
    public ResponseUtil updateUser(@ModelAttribute RegUserDTO regUserDTO, @ModelAttribute UserDTO user, @ModelAttribute Name name) {
        regUserDTO.setName(name);
        regUserDTO.setUser(user);
        System.out.println(user);
        System.out.println(name);
        System.out.println(regUserDTO);
        service.updateUser(regUserDTO);
        return new ResponseUtil("OK", "Successfully Updated. :" + regUserDTO.getUser_Id(), null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteUser(@RequestParam String id) {
        service.deleteUser(id);
        return new ResponseUtil("OK", "Successfully Deleted. :" + id, null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/loadAllUsers")
    public ResponseUtil getAllUser() {
        return new ResponseUtil("OK", "Successfully Loaded. :", service.getAllUser());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/reg_UserIdGenerate")
    public @ResponseBody
    CustomDTO customerIdGenerate() {
        return service.userIdGenerate();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/searchCustomer", params = {"cus_Id"})
    public RegUser searchDriverId(String cus_Id) {
        return service.searchUserId(cus_Id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/customerCount")
    public @ResponseBody CustomDTO getSumCustomer() {
        return service.getSumUser();
    }

}
