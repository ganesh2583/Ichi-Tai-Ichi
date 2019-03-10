package com.gck.ichi.websecurity;

import org.springframework.security.core.userdetails.User;

/**
 * 
 * @author Ganesh Chaitanya Kale
 *
 */
public class IchiTaiIchiUser extends User {
	
	private static final long serialVersionUID = 1L;

	public IchiTaiIchiUser(IchiTaiEntity user) {
		super(user.getUsername(), user.getPassword(), user.getGrantedAuthoritiesList());
	}
}