package com.grats.pack.Security1;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.grats.pack.entity.User;
import com.grats.pack.exception.UserException;
import com.grats.pack.repo.UserRepo;

@Service
public class CustomUserDetails implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	
	

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	User user =	userRepo.findByEmail(email).orElseThrow(
				 () -> new UserException(String.format("User with email id %s is not found", email))
				);
		Set<String> roles = new HashSet<>();
		roles.add("ROLES_ADMIN");
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), userAuthorities(roles));
	}

	public Collection<? extends GrantedAuthority> userAuthorities(Set<String> roles){
		return roles.stream().map(
				role -> new SimpleGrantedAuthority(role)
				).collect(Collectors.toList());
		
	}

}
