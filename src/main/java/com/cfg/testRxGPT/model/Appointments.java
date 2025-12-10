package com.cfg.testRxGPT.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Appointments")
public class Appointments {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointment_id;
    
    @NotNull
    private Integer patient_id;
    
    private Integer provider_id;
    
    private String appointment_type;
    
    @NotNull
    private Date scheduled_at;
    
    private String duration_minutes;
    
    private String status;  // DEFAULT 'scheduled',
    
    @NotNull
    private String reason;
    
    private String notes;
    
    private String is_telemedicine;
    
    private String meeting_link;
    
    @NotNull
    private Date created_at;
    
    @NotNull
    private Date updated_at;

	public Integer getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(Integer appointment_id) {
		this.appointment_id = appointment_id;
	}

	public Integer getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Integer patient_id) {
		this.patient_id = patient_id;
	}

	public Integer getProvider_id() {
		return provider_id;
	}

	public void setProvider_id(Integer provider_id) {
		this.provider_id = provider_id;
	}

	public String getAppointment_type() {
		return appointment_type;
	}

	public void setAppointment_type(String appointment_type) {
		this.appointment_type = appointment_type;
	}

	public Date getScheduled_at() {
		return scheduled_at;
	}

	public void setScheduled_at(Date scheduled_at) {
		this.scheduled_at = scheduled_at;
	}

	public String getDuration_minutes() {
		return duration_minutes;
	}

	public void setDuration_minutes(String duration_minutes) {
		this.duration_minutes = duration_minutes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getIs_telemedicine() {
		return is_telemedicine;
	}

	public void setIs_telemedicine(String is_telemedicine) {
		this.is_telemedicine = is_telemedicine;
	}

	public String getMeeting_link() {
		return meeting_link;
	}

	public void setMeeting_link(String meeting_link) {
		this.meeting_link = meeting_link;
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
		return "Appointments [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", provider_id="
				+ provider_id + ", appointment_type=" + appointment_type + ", scheduled_at=" + scheduled_at
				+ ", duration_minutes=" + duration_minutes + ", status=" + status + ", reason=" + reason + ", notes="
				+ notes + ", is_telemedicine=" + is_telemedicine + ", meeting_link=" + meeting_link + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
    
    
}
