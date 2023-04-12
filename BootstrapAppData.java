package com.gl.CollegeFestDebateSpring.boot.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gl.CollegeFestDebateSpring.boot.entity.Role;
import com.gl.CollegeFestDebateSpring.boot.entity.User;
import com.gl.CollegeFestDebateSpring.boot.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BootstrapAppData {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	@EventListener(ApplicationReadyEvent.class)
	public void insertAdmin(ApplicationReadyEvent event)
	{
		User admin=new User();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		Role adminRole=new Role();
		adminRole.setName("ADMIN");
		List<Role> list=new ArrayList<>();
		list.add(adminRole);
		admin.setRoles(list);
		
		
		
		User user=new User();
		user.setUsername("user");
		user.setPassword(passwordEncoder.encode("user"));
		Role userRole=new Role();
		userRole.setName("USER");
		List<Role> list1=new ArrayList<>();
		list1.add(userRole);
		user.setRoles(list1);
		userRepository.save(admin);
		userRepository.save(user);
	}
	
}
