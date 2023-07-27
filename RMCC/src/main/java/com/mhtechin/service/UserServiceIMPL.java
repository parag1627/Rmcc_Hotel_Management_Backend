package com.mhtechin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhtechin.entity.User;
import com.mhtechin.entity.UserDTO;
import com.mhtechin.entity.UserSaveDTO;
import com.mhtechin.entity.UserUpdateDTO;
import com.mhtechin.repo.UserRepo;

@Service
public class UserServiceIMPL implements IUserService {
	    @Autowired
	    private UserRepo UserRepo;
	    @Override
	    public String addUser(UserSaveDTO UserSaveDTO)
	    {
	        User User = new User(
	                UserSaveDTO.getUsername(),
	                UserSaveDTO.getRole(),
	                UserSaveDTO.getEmail(),
	                UserSaveDTO.getPassword()
	                
	        );
	        UserRepo.save(User);
	        return User.getUsername();
	    }
	    @Override
	    public List<UserDTO> getAllUser() {
	       List<User> getUsers = UserRepo.findAll();
	       List<UserDTO> UserDTOList = new ArrayList<>();
	       for(User a:getUsers)
	       {
	           UserDTO UserDTO = new UserDTO(
	                   a.getUserid(),
	                   a.getUsername(),
	                   a.getRole(),
	                   a.getEmail(),
	                   a.getPassword()
	           );
	           UserDTOList.add(UserDTO);
	       }
	       return  UserDTOList;
	    }
	    @Override
	    public String updateUsers(UserUpdateDTO UserUpdateDTO)
	    {
	        if (UserRepo.existsById(UserUpdateDTO.getUserid())) {
	            User User = UserRepo.getById(UserUpdateDTO.getUserid());
	            User.setUsername(UserUpdateDTO.getUsername());
	            User.setRole(UserUpdateDTO.getRole());
	            User.setEmail(UserUpdateDTO.getEmail());
	            User.setPassword(UserUpdateDTO.getPassword());
	            UserRepo.save(User);
	        }
	            else
	            {
	                System.out.println("User ID do not Exist");
	            }
	                return null;
	        }
	    @Override
	    public boolean deleteUser(int id) {
	        if(UserRepo.existsById(id))
	        {
	            UserRepo.deleteById(id);
	        }
	        else
	        {
	            System.out.println("User id not found");
	        }
	        return true;
	}
	
}
