package com.gck.ichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * 
 * 
 * @author Ganesh Chaitanya Kale
 *
 */
@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class IchiTaiIchiSsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IchiTaiIchiSsApplication.class, args);
	}

}
