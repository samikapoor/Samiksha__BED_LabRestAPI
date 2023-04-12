package com.gl.CollegeFestDebateSpring.boot.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.gl.CollegeFestDebateSpring.boot.entity.Role;
import com.gl.CollegeFestDebateSpring.boot.entity.User;



public class UserDetailsImpl implements UserDetails{

	private User user;
	
	public UserDetailsImpl(User user)
	{
		this.user=user;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<Role> roles=user.getRoles();
		List<SimpleGrantedAuthority> auth=new ArrayList<>();
		for(Role role:roles)
			auth.add(new SimpleGrantedAuthority(role.getName()));
		return auth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}}
