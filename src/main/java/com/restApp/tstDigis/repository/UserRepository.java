package com.restApp.tstDigis.repository;

import com.restApp.tstDigis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();

    /*    User findByLogin(String login);
    User findByFullName(String fullName);
    User findByGender(String gender);*/

}
