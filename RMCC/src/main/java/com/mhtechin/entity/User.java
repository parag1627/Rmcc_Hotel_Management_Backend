package com.mhtechin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="User")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name="User_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Userid;
    
    @Column(name="User_name", length = 255)
    private String Username;
    
    @Column(name="role", length = 255)
    private String role;

	@Column(name="email", length = 255)
    private String email;
    
    @Column(name="password", length = 255)
    private String password;
    
    public User() {}
    
    public User(int Userid, String Username, String role, String email, String password) {
        this.Userid = Userid;
        this.Username = Username;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public User(String Username, String role, String email, String password) {
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
		return "User [Userid=" + Userid + ", Username=" + Username + ", role=" + role + ", email=" + email
				+ ", password=" + password + "]";
	}
    
    
}
