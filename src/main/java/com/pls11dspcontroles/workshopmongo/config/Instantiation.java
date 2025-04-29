package com.pls11dspcontroles.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pls11dspcontroles.workshopmongo.domain.User;
import com.pls11dspcontroles.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepoistory;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepoistory.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com"); 
		User alex = new User(null, "Alex Green", "alex@gmail.com"); 
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepoistory.saveAll(Arrays.asList(maria, alex, bob));
	}

}
