package com.cjc.hl.em.main.Service;

import java.util.List;

import com.cjc.hl.em.main.model.Enquiry;
  
public interface EnquiryService {

	 void newEnquiry(Enquiry enquiry);

	List<Enquiry> getAllEnquiry();

	String reRejection(Enquiry enquiry);

	String Approved(Enquiry enquiry);

	List<Enquiry> getApprovedList();
	
	

}
