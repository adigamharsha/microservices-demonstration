package com.javaadmirer.app.ws.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessageBean {
	
	private Date timeStamp;
	private String message;

}
