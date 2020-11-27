package com.example.client1.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.client1.model.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	//////Punto in comune
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findOneByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("Utente non trovato"));
	}
	
	////// fine punto in comune
	
	// Lista di tutti gli uteni
	public List<MyUserDetails> findAll() {
		return userRepository.findAll();
	}

	// Save user
	public MyUserDetails register(MyUserDetails userDetails) {
		userDetails.setPassword(passwordEncoder.encode(userDetails.getPassword()));
		return userRepository.save(userDetails);
	}


}
