package com.mhtechin.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private int Userid;
    private String Username;
    private String role;
    private String email;
    private String password;
    
    public UserDTO() {
    }
    public UserDTO(int Userid, String Username,String role, String email, String password) {
        this.Userid = Userid;
        this.Username = Username;
        this.role = role;
        this.email = email;
        this.password = password;
    }
	
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int Userid) {
		this.Userid = Userid;
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
		return "UserDTO [Userid=" + Userid + ", Username=" + Username + ", role=" + role + ", email=" + email
				+ ", password=" + password + "]";
	}
    
   
}
