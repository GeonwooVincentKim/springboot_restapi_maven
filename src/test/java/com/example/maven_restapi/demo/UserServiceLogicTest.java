package com.example.maven_restapi.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import com.example.maven_restapi.entity.User;
import com.example.maven_restapi.service.UserService;
// import com.example.maven_restapi.service.logic.UserServiceLogic;

import static org.assertj.core.api.Assertions.assertThat;

// Unit Test 진행
@SpringBootTest
@RunWith(Spring)
public class UserServiceLogicTest {
	@Autowired
	private UserService userService;

	// private User kim;
	// private User lee;

	// @BeforeEach
	// public void startUp() {
	// 	this.kim = new User("Kim", "kim@gmail.com");
	// 	this.lee = new User("Lee", "lee@gmail.com");
	// }

	@Test
	public void test() {
		// System.out.println("");
		assertEquals(2, 1 + 1);
		assertThat(2).isEqualTo(1 + 1);
	}
	
	@Test
	public void registerTest() {
		User sample = User.sample();
		this.userService.register(sample);
		assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
		assertThat(this.userService.register(sample)).isEqualTo(3);	// Array Size (N + 1) = Number of people (N) + Empty Size (1)

		this.userService.remove(sample.getId());
	}

	// @Test
	// public void find() {
	// 	assertThat(this.userService.find(lee.getId())).isNotNull();
	// 	assertThat(this.userService.find(lee.getId()).getEmail()).isEqualTo(lee.getEmail());
	// }

	// @AfterEach
	// public void cleanUp() {
	// 	// 
	// 	this.userService.remove(kim.getId());
	// 	this.userService.remove(lee.getId());
	// }
}
