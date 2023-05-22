package com.cjc.hl.em.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.em.main.Service.RegistrationService;
import com.cjc.hl.em.main.model.Registration;

@RestController
@CrossOrigin("*")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	
	@PostMapping(value = "/saveRegistration/{enquiryId}")
	public ResponseEntity<Registration> saveRegistration(@RequestBody Registration reg,@PathVariable Integer enquiryId){
		
		return new ResponseEntity<Registration>(registrationService.saveRegistration(reg,enquiryId),HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "/getAllRegistration")
	public ResponseEntity<List<Registration>> getAllRegistrtion(){
		return new ResponseEntity<List<Registration>>(registrationService.getAllRegistration(),HttpStatus.OK);
	}
	
	
	
	@PutMapping(value = "/cmRejection")
	public ResponseEntity<Registration> cmRejection(@RequestBody Registration reg){
		
		return new ResponseEntity<Registration>(registrationService.cmRejection(reg),HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/cmApproved")
	public ResponseEntity<Registration> cmApproved(@RequestBody Registration reg){
		
		return new ResponseEntity<Registration>(registrationService.cmApproved(reg),HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/ApprvedList")
	public ResponseEntity<List<Registration>>getRegistraton(){
		return new ResponseEntity<List<Registration>>(registrationService.getAllApprovedList(),HttpStatus.OK);
	}

}
