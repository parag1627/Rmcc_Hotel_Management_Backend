package com.mhtechin.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserSaveDTO {

	
    private String Username;
    private String role;
    private String email;
    private String password;
    
    public UserSaveDTO() {
    }
    public UserSaveDTO(String Username,String role, String email, String password) {
        this.Username = Username;
        this.role = role;
        this.email = email;
        this.password = password;
    }
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDTO [Username=" + Username + ", role=" + role + ", email=" + email
				+ ", password=" + password + "]";
	}
    
   
}
