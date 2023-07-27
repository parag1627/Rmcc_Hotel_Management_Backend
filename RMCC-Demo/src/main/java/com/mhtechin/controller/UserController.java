package com.mhtechin.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhtechin.entity.LoginDTO;
import com.mhtechin.entity.UserDTO;
import com.mhtechin.response.LoginResponse;
import com.mhtechin.service.UserServiceIMPL;


@RestController
//@CrossOrigin
@RequestMapping("/user")
public class UserController {
	
    @Autowired
    private UserServiceIMPL userService;
//    
    @PostMapping("/save")
    public String addUser(@RequestBody UserDTO userDTO)
    {
        String id = userService.addUser(userDTO);
        return id;
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse.getMessage());
    }
    
}
