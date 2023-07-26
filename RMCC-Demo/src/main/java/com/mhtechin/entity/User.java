package com.mhtechin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="User")
public class User {
    @Id
    @Column( length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int UserId;
    
    @Column(name="User_name", length = 255)
    private String UserName;
    
    @Column(name="email", length = 255)
    private String email;
    
    @Column(name="password", length = 255)
    private String password;
    
    
    
}
