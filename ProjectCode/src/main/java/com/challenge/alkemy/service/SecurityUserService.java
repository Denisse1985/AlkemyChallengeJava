package com.challenge.alkemy.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.challenge.alkemy.dao.UserDao;
import com.challenge.alkemy.domain.UserDomain;

@Service("userDetailsService")
public class SecurityUserService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDomain user= userDao.findByUserName(username);
		
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		
		var roles=new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority(user.getUserType().getDescription()));
		return new User(user.getUserName(), user.getPassword(), roles);
	}

	
}
