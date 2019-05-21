package com.restApp.tstDigis.service;

import com.restApp.tstDigis.Gender;
import com.restApp.tstDigis.model.User;
import com.restApp.tstDigis.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.*;

import static com.restApp.tstDigis.Gender.FEMALE;
import static com.restApp.tstDigis.Gender.MALE;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void getUserTest() {
    }

    @Test
    public void updateUserTest() {
        User input = new User(1L,"Login1", "Name1 Surname1", "11/04/2001" , FEMALE);
        User returned = new User(1L,"NewLogin", "Name1 Surname1", "11/04/2001" , FEMALE);

        when(userRepository.getOne(1L)).thenReturn(input);
        when(userRepository.save(input)).thenReturn(returned);

        User result = userService.updateUser(1L, input);
        assertEquals("NewLogin", result.getLogin());
    }

    @Test
    public void saveUserTest() {
    }

/*    List<User> users = new ArrayList<>();
    int usersSize;

    @Before
    public void setUp() throws Exception{
        User user1 = new User(0L,"Login1", "Name1 Surname1", "11/04/2001" , FEMALE);
        User user2 = new User(1L,"Login2", "Name2 Surname2", "12/04/2002" , MALE);
        User user3 = new User(2L,"Login3", "Name3 Surname3", "13/04/2003" , FEMALE);
        User user4 = new User(3L,"Login4", "Name4 Surname4", "14/04/2004" , MALE);
        User user5 = new User(4L,"Login5", "Name5 Surname5", "15/04/2005" , FEMALE);
        User user6 = new User(5L,"Login6", "Name6 Surname6", "16/04/2006" , MALE);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        usersSize = users.size();
    }

    @Test
    public void getAllUsers() {
        when(userRepository.findAll()).thenReturn(users);
        assertEquals(usersSize, userService.getAllUsers().size());
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByLogin() {
    }

    @Test
    public void findByFullName() {
    }

    @Test
    public void findByGender() {
    }

    @Test
    public void update() {
    }

    @Test
    public void create() {
    }*/
}