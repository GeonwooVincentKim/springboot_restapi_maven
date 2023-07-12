package com.example.maven_restapi.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.maven_restapi.entity.User;
import com.example.maven_restapi.service.UserService;

import static org.assertj.core.api.Assertions.assertThat;

// Unit Test 진행
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private UserService userService;

	@BeforeEach
	public void startUp() {

	}
	
	@Test
	public void registerTest() {
		User sample = User.sample();
		this.userService.register(sample);
		assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
		assertThat(this.userService.register(sample)).isEqualTo(1);
	}

	@Test
	public void find() {

	}

	@AfterEach
	public void cleanUp() {
		
	}
}
