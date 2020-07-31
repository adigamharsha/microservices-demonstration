package com.javaadmirer.app.ws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsRequest {
	
	private String firstName;
	private String lastName;
	private String userId;

}
