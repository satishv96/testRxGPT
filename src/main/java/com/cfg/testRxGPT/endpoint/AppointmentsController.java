package com.cfg.testRxGPT.endpoint;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cfg.testRxGPT.model.Appointments;
import com.cfg.testRxGPT.repo.AppointmentsRepo;


@RestController
public class AppointmentsController {

	private static final Logger logger = LogManager.getLogger(AppointmentsController.class);
	
    @Autowired
    private AppointmentsRepo appointmentsRepo;
    
	
	  @GetMapping("/getAppointments") // 
	  public List<Appointments> getAppointments() {
		  
		  logger.info("getAppointments endpoint called");
	      logger.error("getAppointments error log");
		  
		  return appointmentsRepo.findAll(); 
		  
	  }
	  
	  @GetMapping("/getAppointmentsById/{id}") // Read
	    public Optional<Appointments> getAppointmentsById(@PathVariable Integer id) {
	        
	        logger.info("getAppointmentsById endpoint called");
	        logger.error("getAppointmentsById error log");
	        
	        return appointmentsRepo.findById(id);
	    }

	  
	  @PostMapping("/saveOrUpdateAppointments") // Insert 
	  public Appointments saveOrUpdateAppointments(@RequestBody Appointments appointment) {
		  				  
		  logger.info("saveOrUpdateAppointments endpoint called", appointment.toString());
	      logger.error("saveOrUpdateAppointments error log");
	      
		  Appointments objAppointment =  appointmentsRepo.save(appointment); 
		  return objAppointment; 
	 }
	  
	  @DeleteMapping("/deleteAppointments/{id}") // delete 
	  public void deleteAppointments(@PathVariable Integer id) {
		  logger.info("getAllAppointments endpoint called", id);
	      logger.error("getAllAppointments error log");
	      
		  appointmentsRepo.deleteById(id); 
	  }
	 
}

/*
 * { "patient_id": "1", "provider_id": "2", "appointment_type": "string",
 * "scheduled_at": "2025-12-10T20:14:31.300Z", "duration_minutes": "30",
 * "status": "scheduled", "reason": "done", "notes": "string",
 * "is_telemedicine": "string", "meeting_link": "string", "created_at":
 * "2025-12-10T20:14:31.300Z", "updated_at": "2025-12-10T20:14:31.300Z" }
 */
