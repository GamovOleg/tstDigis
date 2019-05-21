package com.restApp.tstDigis.controller;

import com.restApp.tstDigis.model.User;
import com.restApp.tstDigis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("GET/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PutMapping("PUT/user/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @PostMapping("POST/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

/*      // Sandbox _Detailed requests_

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") long id) {
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
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }   */
}
