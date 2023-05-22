package com.cjc.hl.em.main.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.model.Registration;

public interface RegistrationService {


	Registration saveRegistration(Registration reg, Integer enquiryId);

	List<Registration> getAllRegistration();

	Registration cmRejection(Registration reg);

	Registration cmApproved(Registration reg);

	List<Registration> getAllApprovedList();
	
	

}
