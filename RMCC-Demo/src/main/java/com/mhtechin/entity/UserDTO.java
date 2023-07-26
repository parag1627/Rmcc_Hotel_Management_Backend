package com.mhtechin.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

	private int UserId;
    private String UserName;
    private String email;
    private String password;
	

   
    
   
}
