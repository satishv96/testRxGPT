package com.cfg.testRxGPT.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cfg.testRxGPT.model.User;
import com.cfg.testRxGPT.repo.UserRepo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);
	
    @Autowired
    private UserRepo userRepo;
    
    @GetMapping("/hello")
    public String getHello() {
        System.out.println("Getting hello");
        
        logger.info("Hello endpoint called");
        logger.error("Sample error log");
        
        return "Hello World!";
    }
    
    @GetMapping("/getUsersList") // Read
    public List<User> getAllUsers() {
        System.out.println("Getting All users from database");
        
        logger.info("getUsersList endpoint called");
        logger.error("getUsersList error log");
        
        return userRepo.findAll();
    }

    @PostMapping("/saveOrUpdateUsers") // Insert
    public User saveOrUpdateUsers(@RequestBody User user) {
    	
        logger.info("saveOrUpdateUsers endpoint called", user.toString());
        logger.error("saveOrUpdateUsers error log");
        
        User savedUser = userRepo.save(user);
        return savedUser;
    }
    
    @GetMapping("/getUserById/{id}") // Read
    public Optional<User> getUserById(@PathVariable Integer id) {
        System.out.println("Getting users by Id from database!");
        
        logger.info("getUserById endpoint called");
        logger.error("getUserById error log");
        
        return userRepo.findById(id);
    }

    @DeleteMapping("/users/{id}") // delete
    public void deleteUser(@PathVariable Integer id) {    
    	
    	  logger.info("deleteUser endpoint called");
          logger.error("deleteUser error log");
          
        userRepo.deleteById(id);
        System.out.println("Deleted successfully!");
    }
    
}
