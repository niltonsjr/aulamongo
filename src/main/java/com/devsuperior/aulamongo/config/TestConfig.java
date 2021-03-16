package com.devsuperior.aulamongo.config;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devsuperior.aulamongo.models.entities.User;
import com.devsuperior.aulamongo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void init() {
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@mail.com");
		User alex = new User(null, "Alex Green", "alex@mail.com");
		User bob = new User(null, "Bob Grey", "bob@mail.com");		
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));		
		
	}
}
