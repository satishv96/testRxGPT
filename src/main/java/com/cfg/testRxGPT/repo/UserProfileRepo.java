package com.cfg.testRxGPT.repo;

import com.cfg.testRxGPT.model.UsersProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepo extends JpaRepository<UsersProfile, Integer> {

	
}




