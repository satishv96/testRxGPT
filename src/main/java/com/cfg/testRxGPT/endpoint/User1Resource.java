package com.cfg.testRxGPT.endpoint;

import com.cfg.testRxGPT.model.User1;
import com.cfg.testRxGPT.repo.User1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * swagger url: http://localhost:8081/swagger-ui/index.html
 * http://localhost:8081/hello
 * 
 */
@RestController
public class User1Resource {

    @Autowired
    private User1Repo user1Repo;

    @GetMapping("/users1") // Read
    public List<User1> getAllUsers() {
        System.out.println("Getting All users from database");
        return user1Repo.findAll();
    }

    @PostMapping("/saveUsers1") // Insert
    public User1 saveUser(@RequestBody User1 user) {
    	System.out.println(user.toString());
        System.out.println("Getting All users from database");
        User1 savedUser = user1Repo.save(user);
        return savedUser;
    }

    @DeleteMapping("/users1/{id}") // delete
    public void deleteUser(@PathVariable Integer id) {
        System.out.println("Getting All users from database");
        user1Repo.deleteById(id);
    }

    @GetMapping("/hello")
    public String getHello() {
        System.out.println("Getting hello");
        return "Hello World!";
    }
}
