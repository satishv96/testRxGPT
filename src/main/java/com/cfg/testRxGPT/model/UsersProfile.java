package com.cfg.testRxGPT.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "users_profile")
public class UsersProfile {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profile_id;
    
	@NotNull
	private Integer user_id;     // foreign_Key
	 
    
    private String profile_picture_url;
    
    private String address;
    
    private String city;
    
    private String state;
    
    private String zip_code;
    
    private String country;
    
    private String emergency_contact_name;
    
    private String blood_type;
    
    private String allergies;
    
    @NotNull
    private Date created_at;
    
    @NotNull
    private Date updated_at;

	public Integer getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(Integer profile_id) {
		this.profile_id = profile_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getProfile_picture_url() {
		return profile_picture_url;
	}

	public void setProfile_picture_url(String profile_picture_url) {
		this.profile_picture_url = profile_picture_url;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmergency_contact_name() {
		return emergency_contact_name;
	}

	public void setEmergency_contact_name(String emergency_contact_name) {
		this.emergency_contact_name = emergency_contact_name;
	}

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
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
		return "usersprofile [profile_id=" + profile_id + ", user_id=" + user_id + ", profile_picture_url="
				+ profile_picture_url + ", address=" + address + ", city=" + city + ", state=" + state + ", zip_code="
				+ zip_code + ", country=" + country + ", emergency_contact_name=" + emergency_contact_name
				+ ", blood_type=" + blood_type + ", allergies=" + allergies + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
    

}
