package com.restApp.tstDigis.repository;

import com.restApp.tstDigis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(final String login);

    User findByFullName(String fullName);

    User findByGender(String gender);

}
