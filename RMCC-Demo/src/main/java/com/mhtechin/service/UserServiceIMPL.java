package com.mhtechin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mhtechin.entity.LoginDTO;
import com.mhtechin.entity.User;
import com.mhtechin.entity.UserDTO;
import com.mhtechin.repo.UserRepo;
import com.mhtechin.response.LoginResponse;
import com.mhtechin.service.IUserService;

@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserRepo UserRepo;
    
   // @Autowired
   // private PasswordEncoder passwordEncoder;
    
    
    public String addUser(UserDTO userDTO) {
        User User = new User(
                userDTO.getUserId(),
                userDTO.getUserName(),
                userDTO.getEmail(),
               //this.passwordEncoder.encode(UserDTO.getPassword())
                userDTO.getPassword()
        );
        UserRepo.save(User);
        System.out.println("******************************************************");
        System.out.println(User.getUserName());
        return User.getUserName();
    }
    
    UserDTO UserDTO;
    @Override
    public LoginResponse  loginUser(LoginDTO loginDTO) {
      
        User User1 = UserRepo.findByEmail(loginDTO.getEmail());
        if (User1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = User1.getPassword();
            //Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            
            
            if (password.equals(encodedPassword)) {
                Optional<User> User = UserRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (User.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
 
}
