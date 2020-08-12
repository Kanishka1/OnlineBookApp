//package com.bookapp.service;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.bookapp.bean.AppUsers;
//import com.bookapp.dao.AppUserRepository;
//
//@Service
//public class MongoUserDetailsService implements UserDetailsService{
//
//	@Autowired
//	AppUserRepository appUserRepository;
//	
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		AppUsers user = appUserRepository.findByUsername(username);
//		if(user==null) {
//			throw new UsernameNotFoundException("user not found");
//			
//		}
//		String name = user.getUsername();
//		String password = user.getPassword();
//		List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("USER"));
//		return new User(name,password,authorities);
//		
//	}
//
//}