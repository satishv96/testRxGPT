package com.cfg.testRxGPT.repo;

import com.cfg.testRxGPT.model.User1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User1Repo extends JpaRepository<User1, Integer> {
}
