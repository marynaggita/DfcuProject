package com.interswitchug.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interswitchug.model.RequestDetailsModel;

@RestController
public class NameController {
	HashMap<String, String> reply = null;
	
	@GetMapping(path = "/returname")
	public String name() {
		return "Mary";
	}
	

	
	@PostMapping(path = "/newrequest")
	public HashMap<String, String> responsecode(@RequestBody RequestDetailsModel request ){
		
		reply = new HashMap<>();
		
		System.out.println("Username: "+ request.getUsername());
		System.out.println("Password: "+ request.getPassword());
		System.out.println("Reference: "+ request.getReference());
		
		reply.put("responseCode", "00");
		reply.put("description", "Transaction Sucessful");
		
		return reply;
		
	}

}




