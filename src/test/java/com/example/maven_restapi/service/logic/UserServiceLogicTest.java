package com.example.maven_restapi.service.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import com.example.maven_restapi.demo.DemoApplication;
import com.example.maven_restapi.service.UserService;
import com.example.maven_restapi.store.UserStore;

@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class UserServiceLogicTest {
  @Autowired
  private UserServiceLogic userServiceLogic;

  @MockBean
  private UserStore userStore;


  @Test
  public void exampleTest() {
    assertEquals(2, 1 + 1);
  }
}
