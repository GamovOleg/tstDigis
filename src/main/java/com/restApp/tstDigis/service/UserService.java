package com.restApp.tstDigis.service;

import com.restApp.tstDigis.exception.UserAlreadyExistsException;
import com.restApp.tstDigis.exception.UserException;
import com.restApp.tstDigis.exception.UserInvalidException;
import com.restApp.tstDigis.exception.UserNotFoundException;
import com.restApp.tstDigis.model.User;
import com.restApp.tstDigis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //GET

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) throws UserException {
        User user = repository.getOne(id);
        if (user == null) {
            throw new UserNotFoundException();
        }
        return user;
    }

    public User findByLogin(String login) throws UserNotFoundException {
        return repository.findByLogin(login);
    }

    public User findByFullName(String fullName) throws UserNotFoundException {
        return repository.findByFullName(fullName);
    }

    public User findByGender(String gender) {
        return repository.findByGender(gender);
    }

    //PUT

    public User update(User user) throws UserException {
        User inDb = repository.getOne(user.getId());
        if (inDb == null) {
            throw new UserNotFoundException();
        }
        if (user.getLogin() == null || user.getLogin().isEmpty()) {
            return inDb;
        }
        if (user.getFullName() == null || user.getFullName().isEmpty()) {
            return inDb;
        }
        if (user.getDateOfBirth() == null) {
            return inDb;
        }
        if (user.getGender() == null) {
            return inDb;
        }
        return repository.save(user);
    }

    //POST

    public User create(User user) throws UserException {
        if (repository.getOne(user.getId()) != null) {
            throw new UserAlreadyExistsException();
        }
        if (user.getFullName() == null || user.getFullName().isEmpty()) {
            throw new UserInvalidException();
        }
        if (user.getLogin() == null || user.getLogin().isEmpty()) {
            throw new UserInvalidException();
        }
        if (user.getDateOfBirth() == null) {
            throw new UserInvalidException();
        }
        if (user.getGender() == null) {
            throw new UserInvalidException();
        }
        return repository.save(user);
    }

}
