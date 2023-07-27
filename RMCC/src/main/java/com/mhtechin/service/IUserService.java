package com.mhtechin.service;

import java.util.List;

import com.mhtechin.entity.UserDTO;
import com.mhtechin.entity.UserSaveDTO;
import com.mhtechin.entity.UserUpdateDTO;

public interface IUserService {
	
	String addUser(UserSaveDTO UserSaveDTO);
	
    List<UserDTO> getAllUser();
    
    String updateUsers(UserUpdateDTO UserUpdateDTO);
    
    boolean deleteUser(int id);
}
