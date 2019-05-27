package com.restApp.tstDigis.service;

import com.restApp.tstDigis.Gender;
import com.restApp.tstDigis.exception.UserNotFoundException;
import com.restApp.tstDigis.model.User;
import com.restApp.tstDigis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(Long id){
        User result = userRepository.getOne(id);
        if(result == null)
            throw  new UserNotFoundException();
        return result;
    }

    public User updateUser(Long id, User user) {
        User updatedUser = userRepository.getOne(id);
        if(updatedUser == null)
            throw new UserNotFoundException();
        updatedUser.setLogin(user.getLogin());
        updatedUser.setFullName(user.getFullName());
        updatedUser.setDateOfBirth(user.getDateOfBirth());
        updatedUser.setGender(user.getGender());
        return userRepository.save(updatedUser);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

/*    //GET

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) throws UserException {
        User user = userRepository.getOne(id);
        if (user == null) {
            throw new UserNotFoundException();
        }
        return user;
    }

    public User findByLogin(String login) throws UserNotFoundException {
        return userRepository.findByLogin(login);
    }

    public User findByFullName(String fullName) throws UserNotFoundException {
        return userRepository.findByFullName(fullName);
    }

    public User findByGender(String gender) {
        return userRepository.findByGender(gender);
    }

    //PUT

    public User update(Long id, User user) throws UserException {
        User updatedUser = userRepository.getOne(id);
        if (updatedUser == null)
            throw new UserNotFoundException();
        updatedUser.setLogin(user.getLogin());
        updatedUser.setFullName(user.getFullName());

        return userRepository.save(updatedUser);
    }

    //POST

    public User create(User user) throws UserException {
        if (userRepository.getOne(user.getId()) != null) {
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
        return userRepository.save(user);
    }   */
}
