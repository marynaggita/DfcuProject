package com.interswitchug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.interswitchug*")
public class DfcuAgencyProcessorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfcuAgencyProcessorProjectApplication.class, args);
	}

}
