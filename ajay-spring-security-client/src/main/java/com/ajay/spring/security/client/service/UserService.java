package com.ajay.spring.security.client.service;

import java.util.Optional;

import com.ajay.spring.security.client.entity.User;
import com.ajay.spring.security.client.entity.VerificationToken;
import com.ajay.spring.security.client.model.UserModel;

public interface UserService {

	User registerUser(UserModel userModel);

	void saveVerificationTokenForUser(User user, String token);

	VerificationToken generateNewVerificationToken(String oldToken);

	String validateVerificationToken(String token);

	User findUserByEmail(String email);

	void createPasswordResetTokenForUser(User user, String token);

	String validatePasswordResetToken(String token);

	Optional<User> getUserByPasswordResetToken(String token);

	void changePassword(User user, String newPassword);

	boolean checkIfValidOldPassword(User user, String oldPassword);
   
}
