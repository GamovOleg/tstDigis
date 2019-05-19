package com.restApp.tstDigis.controller;

import com.restApp.tstDigis.model.User;
import com.restApp.tstDigis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") Long id) {
        return service.getUserById(id);
    }

    @GetMapping("/bylogin")
    public User getUserByLogin(@RequestParam(name = "value") String login) {
        return service.findByLogin(login);
    }

    @GetMapping("/byfullname")
    public User getUserByFullName(@RequestParam(name = "value") String fullName) {
        return service.findByFullName(fullName);
    }

    @GetMapping("/gender")
    public User getUserByGender(@RequestParam(name = "value") String gender) {
        return service.findByGender(gender);
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return service.create(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return service.update(user);
    }

}
