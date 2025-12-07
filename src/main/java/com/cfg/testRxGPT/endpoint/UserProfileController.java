package com.cfg.testRxGPT.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cfg.testRxGPT.model.UsersProfile;
import com.cfg.testRxGPT.repo.UserProfileRepo;


@RestController
public class UserProfileController {

	
    @Autowired
    private UserProfileRepo userProfileRepo;
    
    @GetMapping("/userProfile") // Read
    public List<UsersProfile> getAllUsers() {
        System.out.println("Getting All users from database");
        return userProfileRepo.findAll();
    }

    @PostMapping("/saveOrUpdateUserProfile") // Insert
    public UsersProfile saveOrUpdateUserProfile(@RequestBody UsersProfile userProfile) {
    	System.out.println(userProfile.toString());
        System.out.println("Getting All users from database");
        UsersProfile savedUserProfile = userProfileRepo.save(userProfile);
        return savedUserProfile;
    }

    @DeleteMapping("/UserProfile/{id}") // delete
    public void deleteUser(@PathVariable Integer id) {
        System.out.println("Getting All users from database");
        userProfileRepo.deleteById(id);
    }
}
