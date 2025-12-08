package com.cfg.testRxGPT.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cfg.testRxGPT.model.User;
import com.cfg.testRxGPT.repo.UserRepo;

@RestController
public class UserController {

	
    @Autowired
    private UserRepo userRepo;
    
    @GetMapping("/hello")
    public String getHello() {
        System.out.println("Getting hello");
        return "Hello World!";
    }
    
    @GetMapping("/users") // Read
    public List<User> getAllUsers() {
        System.out.println("Getting All users from database");
        return userRepo.findAll();
    }

    @PostMapping("/saveOrUpdateUsers") // Insert
    public User saveOrUpdateUsers(@RequestBody User user) {
    	System.out.println(user.toString());
        System.out.println("Getting All users from database");
        User savedUser = userRepo.save(user);
        return savedUser;
    }

    @DeleteMapping("/users/{id}") // delete
    public void deleteUser(@PathVariable Integer id) {
        System.out.println("Getting All users from database");
        userRepo.deleteById(id);
    }
    
}
