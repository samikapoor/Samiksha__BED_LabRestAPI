package com.gl.CollegeFestDebateSpring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.CollegeFestDebateSpring.boot.config.UserDetailsImpl;
import com.gl.CollegeFestDebateSpring.boot.entity.User;
import com.gl.CollegeFestDebateSpring.boot.repository.UserRepository;


public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepository.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		return new UserDetailsImpl(user);
	}


	

}
