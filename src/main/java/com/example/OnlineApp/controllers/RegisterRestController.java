package com.example.OnlineApp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineApp.buisness.RegisterUseCase;
import com.example.OnlineApp.buisness.UserResource;

@RestController
public class RegisterRestController {
	/*
	 * 
	 * private final RegisterUseCase registerUseCase;
	 * 
	 * @PostMapping("/forums/{forumId}/register") UserResource register(
	 * 
	 * @PathVariable("forumId") Long forumId,
	 * 
	 * @Valid @RequestBody UserResource userResource,
	 * 
	 * @RequestParam("sendWelcomeMail") boolean sendWelcomeMail) {
	 * 
	 * User user = new User( userResource.getName(), userResource.getEmail()); Long
	 * userId = registerUseCase.registerUser(user, sendWelcomeMail);
	 * 
	 * return new UserResource( user.getName(), user.getEmail()); }
	 * 
	 */}
