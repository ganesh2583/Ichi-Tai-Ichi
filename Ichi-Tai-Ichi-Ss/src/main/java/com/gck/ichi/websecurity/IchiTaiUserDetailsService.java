/**
 * 
 */
package com.gck.ichi.websecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Ganesh Chaitanya Kale
 *
 */

@Service
public class IchiTaiUserDetailsService implements UserDetailsService {

	@Autowired
	OAuthDao oauthDao;

	@Override
	public IchiTaiIchiUser loadUserByUsername(final String username) throws UsernameNotFoundException {
		IchiTaiEntity userEntity = null;
		try {
			userEntity = oauthDao.getUserDetails(username);
			IchiTaiIchiUser customUser = new IchiTaiIchiUser(userEntity);
			return customUser;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("User " + username + " was not found in the database");
		}
	}
}
