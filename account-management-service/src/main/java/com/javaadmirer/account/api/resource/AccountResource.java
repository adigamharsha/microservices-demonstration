package com.javaadmirer.account.api.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountResource {

	@GetMapping(path = "/getAccountDetails")
	public String getAccountDetails() {

		return String.format("%s", "InAccountDetails.");

	}

}
