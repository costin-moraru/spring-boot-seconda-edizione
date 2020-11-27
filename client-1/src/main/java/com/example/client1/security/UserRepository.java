package com.example.client1.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.client1.model.MyUserDetails;

@Repository
public interface UserRepository extends JpaRepository<MyUserDetails, Integer> {
	
	Optional<MyUserDetails> findOneByUsername(String username);

}
