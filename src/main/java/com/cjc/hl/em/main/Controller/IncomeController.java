package com.cjc.hl.em.main.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.Service.IncomeDetailService;
import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.IncomeDetails;
import com.google.gson.Gson;


@RestController
public class IncomeController {

	@Autowired
	private IncomeDetailService incomedetailservice;
	
	public void end() {
		//Changes in HIS-134
	}
	
//	@RequestMapping(value = "/addIncome", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public ResponseEntity<IncomeDetails> newEnquiry(
//			@RequestPart(required = true, value = "incomeCertificate") MultipartFile f1, @RequestPart("doc") String doc)
//			throws IOException {
//
//		IncomeDetails incd = new IncomeDetails();
//
//		incd.setIncomeCertificate(f1.getBytes());
//
//		Gson g = new Gson();
//
//		IncomeDetails inc = g.fromJson(doc, IncomeDetails.class);
//
//		incd.setEmployerName(inc.getEmployerName());
//		incd.setEmploymentType(inc.getEmploymentType());
//        incd.setOccupation(inc.getOccupation());
//        incd.setAnnualIncome(inc.getAnnualIncome());
//        incd.setOtherIncome(inc.getOtherIncome());
//		
//		incomedetailservice.addIncomeDetails(incd);
//
//		return new ResponseEntity<>(incd, HttpStatus.CREATED);
//
//	}
	
//	
//	@RequestMapping(value = "/AddIncomeWithEnquiry" ,method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public ResponseEntity<IncomeDetails> saveIncome(@RequestPart(required = true, value = "incomeCertificate") MultipartFile f1, @RequestPart("doc") String doc)
//		throws IOException {
//
//	IncomeDetails incd = new IncomeDetails();
//
//	//incd.setIncomeCertificate(f1.getBytes());
//
//	Gson g = new Gson();
//
//	IncomeDetails inc = g.fromJson(doc, IncomeDetails.class);
//
//	incd.setEmployerName(inc.getEmployerName());
//	incd.setEmploymentType(inc.getEmploymentType());
//    incd.setOccupation(inc.getOccupation());
//    incd.setAnnualIncome(inc.getAnnualIncome());
//    incd.setOtherIncome(inc.getOtherIncome());
//    incd.setEnquiryId(inc.getEnquiryId());
//	
//		
//		
//		incomedetailservice.saveIncomewithEnquiry(incd);
//		
//		return new ResponseEntity<IncomeDetails>(incd,HttpStatus.CREATED);
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	@GetMapping("/getAllIncomeDetails")
//	public ResponseEntity<List<IncomeDetails>> getIncome(){
//		
//		return new ResponseEntity<List<IncomeDetails>>(incomedetailservice.getAllIncomeDetail(),HttpStatus.OK);
//	}

}
