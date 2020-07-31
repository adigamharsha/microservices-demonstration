package com.javaadmirer.app.ws.resource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaadmirer.app.ws.model.UserDetailsRequest;
import com.javaadmirer.app.ws.model.Users;

@RestController
@RequestMapping("users")
public class UserResource {

	@GetMapping(path = "/getUsers", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Users>> getHello() {
		return new ResponseEntity<List<Users>>(
				Stream.of(new Users("harsha", "kiran", "harshakiran"), new Users("hanshal", "deep", "hanshaldeep"),
						new Users("sowjanya", "harsha", "sowjanyaharshakiran")).collect(Collectors.toList()),
				HttpStatus.OK);
	}

	@PostMapping(path = "/createUser", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Users> createUser(@RequestBody UserDetailsRequest request) {
		return new ResponseEntity<Users>(new Users(request.getFirstName(), request.getLastName(), "101"), HttpStatus.CREATED);

	}

}
