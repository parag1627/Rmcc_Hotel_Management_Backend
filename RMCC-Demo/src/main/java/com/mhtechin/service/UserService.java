package com.mhtechin.service;

import com.mhtechin.entity.LoginDTO;
import com.mhtechin.entity.UserDTO;
import com.mhtechin.response.LoginResponse;

public interface UserService {
	
	String addUser(UserDTO userDTO);
	
    LoginResponse loginUser(LoginDTO loginDTO);
    

}
