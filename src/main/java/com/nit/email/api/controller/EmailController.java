package com.nit.email.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.email.api.dto.MailRequest;
import com.nit.email.api.dto.MailResponse;
import com.nit.email.api.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	private EmailService service;
	
	
	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "HYDERABAD,INDIA");
		return service.sendEmail(request, model);

	}

}
