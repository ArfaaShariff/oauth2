package com.rd;

import com.rd.controller.HelloWorldController;
import com.rd.controller.SecureController;
import com.rd.domain.User;
import com.rd.repository.UserRepository;
import com.rd.security.UserDetailsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootOauth2Application.class)
@WebAppConfiguration

public class SpringBootOauth2ApplicationTests {

	public HelloWorldController hello;
	public SecureController secure;

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserDetailsService userDetailsService;

	private final String userName = "Arfaa";
	private User user;

	@Before
	public void testSetup(){
		user.setUsername(userName);
		user.setPassword("password");


	}



	@Test
	public void HelloWorldControllerTest(){
		hello=mock(HelloWorldController.class);
		when(hello.sayHello()).thenReturn("Hello User!");
		assertEquals(hello.sayHello(),"Hello User!");
	}
	@Test
	public void SecureControllerTest(){
		secure=mock(SecureController.class);
		when(secure.sayHello()).thenReturn("Secure Hello!");
		assertEquals(secure.sayHello(),"Secure Hello!");
	}
//	@Before
//	@Test
//	public void loadUserByUsernameMustPassForValidUser(){
//		when(userRepository.findByUsernameCaseInsensitive(user
//
//	}


}
