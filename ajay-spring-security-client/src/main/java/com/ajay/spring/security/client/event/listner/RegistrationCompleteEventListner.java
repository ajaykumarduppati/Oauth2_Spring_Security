package com.ajay.spring.security.client.event.listner;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ajay.spring.security.client.entity.User;
import com.ajay.spring.security.client.event.RegistrationCompleteEvent;
import com.ajay.spring.security.client.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RegistrationCompleteEventListner implements ApplicationListener<RegistrationCompleteEvent> {

	@Autowired
	private UserService userService;
	
	@Override
	public void onApplicationEvent(RegistrationCompleteEvent event) {
		User user = event.getUser();
		String token = UUID.randomUUID().toString();
		userService.saveVerificationTokenForUser(user,token);
		String url = event.getApplicationUrl()+"/verifyRegistration?Token="+token;
		log.info("click the link to verify your account: {}",url);
	}

}
