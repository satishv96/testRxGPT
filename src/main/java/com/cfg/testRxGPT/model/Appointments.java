package com.cfg.testRxGPT.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "appointments")
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
    
}
