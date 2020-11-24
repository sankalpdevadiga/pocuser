package com.pocuserproject.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<SimpleGrantedAuthority> roles= null;
		
		if(username.equals("admin")) {
			roles=Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
			return new User("admin","$2a$10$JkfhgpOP1yoA3hCV/OmVru8hiL46pQeBtOGIT6XmPBSkaWWSh1sxq",roles);
		}
		
		if(username.equals("user")) {
			roles=Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
			return new User("user","$2a$10$LU0F68FXkBj6/06cleYnxuLdnUhK97o0rWTBAfksd83pnjTUXoypq",roles);
		}
		throw new UsernameNotFoundException("User not found exception"+username);
	}

}
