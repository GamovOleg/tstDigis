package com.restApp.tstDigis.model;

import com.restApp.tstDigis.Gender;
import com.restApp.tstDigis.exception.UserInvalidException;

import javax.persistence.*;

import static com.restApp.tstDigis.Gender.FEMALE;
import static com.restApp.tstDigis.Gender.MALE;

@Entity
@Table(name = "USERS", uniqueConstraints = {@UniqueConstraint(columnNames = {"login"})})
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String fullName;
    private String dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public User() {
    }

    public User(Long id, String login, String fullName, String dateOfBirth, Gender gender) {
        this.id = id;
        this.login = login;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /*    public void checkUserFields() throws UserInvalidException {
        if ((login == null || login.isEmpty()) || (fullName == null || fullName.isEmpty()) || (dateOfBirth == null || dateOfBirth.isEmpty())) {
            throw new UserInvalidException();
        }
    }*/

/*    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                '}';
    }*/
}
