package com.ust.greetapp.api;

import com.ust.greetapp.model.User;
import com.ust.greetapp.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
       return userRepository.save(user);
    }


}
