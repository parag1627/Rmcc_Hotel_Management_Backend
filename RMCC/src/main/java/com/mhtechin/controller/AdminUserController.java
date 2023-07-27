package com.mhtechin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhtechin.entity.UserDTO;
import com.mhtechin.entity.UserSaveDTO;
import com.mhtechin.entity.UserUpdateDTO;
import com.mhtechin.service.IUserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/User")
public class AdminUserController
{
    @Autowired
    private IUserService UserService;
    
    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO UserSaveDTO)
    {
        String id = UserService.addUser(UserSaveDTO);
        return id;
    }
    
    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllUser()
    {
       List<UserDTO>allUsers = UserService.getAllUser();
       return allUsers;
    }
    @PutMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO UserUpdateDTO)
    {
        String id = UserService.updateUsers(UserUpdateDTO);
        return id;
    }
    @DeleteMapping(path = "/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") int id)
    {
        boolean deleteUser = UserService.deleteUser(id);
        System.out.print("***************************");
        return "deleted";
    }
}
