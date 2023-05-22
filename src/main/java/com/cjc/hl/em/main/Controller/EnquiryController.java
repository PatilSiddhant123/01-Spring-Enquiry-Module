package com.cjc.hl.em.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.em.main.Service.EnquiryService;
import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.IncomeDetails;



@CrossOrigin("*")
@RestController
@RequestMapping("/Enquiry")
public class EnquiryController {
	
	@Autowired
	private EnquiryService enquiryservice;
	
	
	
	
	 @PostMapping("/addEnquiry")
	    public ResponseEntity<Enquiry> newEnquirey(@RequestBody Enquiry enquiry) {
	       
		   enquiryservice.newEnquiry(enquiry);
		   
	        return new ResponseEntity<>(enquiry, HttpStatus.CREATED);
	    }

	 @GetMapping("/getAllEnquiry")
	 public List<Enquiry> getAllList() {
		 return enquiryservice.getAllEnquiry();
	 }
	 
	 
	 @PutMapping(value = "/reRejection")
		public ResponseEntity<String> reRejection(@RequestBody Enquiry enquiry) {

			return new ResponseEntity<String>(enquiryservice.reRejection(enquiry), HttpStatus.OK);

		}

		@PutMapping(value ="/Approved")
		public ResponseEntity<String> Approved(@RequestBody Enquiry enquiry) {

			System.out.println("ghg");
			return new ResponseEntity<String>(enquiryservice.Approved(enquiry), HttpStatus.OK);

		}
		
		@GetMapping(value = "getApprovedList")
		public ResponseEntity<List<Enquiry>> getApproveList(){
			return new ResponseEntity<List<Enquiry>>(enquiryservice.getApprovedList(),HttpStatus.OK);
		}
	 

}
