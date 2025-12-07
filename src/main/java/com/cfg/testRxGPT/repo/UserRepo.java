
package com.cfg.testRxGPT.repo;

import com.cfg.testRxGPT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>  {

}

