package com.cfg.testRxGPT.model;


import java.util.Date;

//import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {
	
// // LocalDate myObj = LocalDate.now(); // Create a date object
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    
    @NotNull
    private String first_name;
    
    @NotNull
    private String last_name;
    
    @NotNull
    private Date date_of_birth;
    
    @NotNull
    private String gender;
    
    
    private String primary_phone;
    
    private String secondary_phone;
    
    @NotNull
    private String email;
    
    @NotNull
    private String password_hash;
    
    private String location;
    private String role;   // DEFAULT 'patient',
    
    private String is_verified;
    private String is_active;
    
    @NotNull
    private Date created_at;
    
    @NotNull
    private Date updated_at;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimary_phone() {
		return primary_phone;
	}

	public void setPrimary_phone(String primary_phone) {
		this.primary_phone = primary_phone;
	}

	public String getSecondary_phone() {
		return secondary_phone;
	}

	public void setSecondary_phone(String secondary_phone) {
		this.secondary_phone = secondary_phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword_hash() {
		return password_hash;
	}

	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIs_verified() {
		return is_verified;
	}

	public void setIs_verified(String is_verified) {
		this.is_verified = is_verified;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "User [id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", date_of_birth="
				+ date_of_birth + ", gender=" + gender + ", primary_phone=" + primary_phone + ", secondary_phone="
				+ secondary_phone + ", email=" + email + ", password_hash=" + password_hash + ", location=" + location
				+ ", role=" + role + ", is_verified=" + is_verified + ", is_active=" + is_active + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
    

}
