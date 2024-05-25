package com.taskmanager;

import com.taskmanager.Controller.UserController;
import com.taskmanager.pojo.DTO.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class TaskManagerSeApplicationTests {

    @Autowired
    private UserController userController;
    @Test
    public void registerSuccess(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("123");
        userDTO.setPassword("123");
        String actual = userController.register(userDTO);
        String expected = "注册成功";
        assertEquals(expected,actual);
    }
    @Test
    public void loginSuccess(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("123");
        userDTO.setPassword("123");
        userController.register(userDTO);
        String expected = "登录成功";
        String actual = userController.login(userDTO);
        assertEquals(expected,actual);
    }
    @Test
    public void loginError(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("123");
        userDTO.setPassword("123");
        String actual = userController.login(userDTO);
        String expected =  "登录成功";
        assertEquals(expected,actual);
    }
}
