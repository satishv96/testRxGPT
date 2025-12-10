package com.cfg.testRxGPT.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfg.testRxGPT.model.Appointments;

@Repository
public interface AppointmentsRepo extends JpaRepository<Appointments, Integer> {

	
}




