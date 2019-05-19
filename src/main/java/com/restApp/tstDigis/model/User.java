package com.restApp.tstDigis.model;

import com.restApp.tstDigis.Gender;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"login"})})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @Column(name = "login")
    private String login;
//    @Column(name = "fullName")
    private String fullName;
//    @Column(name = "dateOfBirth")
    private String dateOfBirth;   //need to change to the date of the calendar
//    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private
    Gender gender;

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

    public void setId(Long id) {
        this.id = id;
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

    public void setFullName(String full_name) {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", full_name='" + fullName + '\'' +
                ", date_of_birth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                '}';
    }
}
