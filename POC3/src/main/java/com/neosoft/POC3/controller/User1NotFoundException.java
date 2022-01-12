package com.neosoft.POC3.controller;

import org.springframework.web.bind.annotation.ResponseStatus;
import static org.springframework.http.HttpStatus.NOT_FOUND;

	@SuppressWarnings("serial")
	@ResponseStatus(NOT_FOUND)
	public class User1NotFoundException extends RuntimeException {
		public User1NotFoundException() {

			super();

		}

	}



