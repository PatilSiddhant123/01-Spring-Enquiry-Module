package com.cjc.hl.em.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnquiryModuleApplication {
	private Map<String,Objet> map=HashMap();

	public static void main(String[] args) {
		SpringApplication.run(EnquiryModuleApplication.class, args);
		System.out.println("App Working");
	}
	
	public void m1()
	{}
	

}
