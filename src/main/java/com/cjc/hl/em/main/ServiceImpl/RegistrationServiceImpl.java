package com.cjc.hl.em.main.ServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.Repository.EnquiryRepository;
import com.cjc.hl.em.main.Repository.RegistrationRepository;
import com.cjc.hl.em.main.Service.RegistrationService;
import com.cjc.hl.em.main.model.Document;
import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.Guarantor;
import com.cjc.hl.em.main.model.Registration;
import com.google.gson.Gson;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationRepository registrationRepository;

	@Autowired
	private EnquiryRepository enquiryRepository;
	
	@Autowired
	private JavaMailSender sender;



	@Override
	public Registration saveRegistration(Registration reg, Integer enquiryId) {

		Registration r = new Registration();

		Enquiry enquiry = enquiryRepository.findById(enquiryId).get();

		if (enquiry.getEnquiryId() == enquiryId) {
			r.setEnquiryId(enquiryId);
			r.setDate(enquiry.getDate());
			r.setFirstName(enquiry.getFirstName());
			r.setMiddleName(enquiry.getMiddleName());
			r.setLastName(enquiry.getLastName());
			r.setGender(enquiry.getGender());
			r.setDob(enquiry.getDob());
			r.setEmail(enquiry.getEmail());
			r.setPhoneNo(enquiry.getPhoneNo());
			r.setPanNo(enquiry.getPanNo());
			r.setAdharNo(enquiry.getAdharNo());
			r.setLoanAmount(enquiry.getLoanAmount());
			r.setLoantype(enquiry.getLoantype());
			r.setIncomeDetails(enquiry.getIncomeDetails());
			r.setOccuption(reg.getOccuption());

			r.setPreviousLoan(reg.getPreviousLoan());
			r.setBankDetails(reg.getBankDetails());
			r.setAddressDetails(reg.getAddressDetails());

			Guarantor guarantor = reg.getGuarantor();
			guarantor.setGurantorAddress(reg.getGuarantor().getGurantorAddress());
			guarantor.setIncomeDetails(reg.getGuarantor().getIncomeDetails());
			r.setGuarantor(guarantor);

			r.setPropertyDetails(reg.getPropertyDetails());

			return registrationRepository.save(r);
		} else {
			return null;
		}
	}

	@Override
	public List<Registration> getAllRegistration() {

		return registrationRepository.findAll();
	}

	
	public Registration cmRejection(Registration registration) {
		registration.setCmStatus("Rejected");

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(registration.getEmail());
		message.setText("Your application of loan is rejected From Credit Manager desk ");
		sender.send(message);

		registrationRepository.save(registration);

		return registration;
	}

	public Registration cmApproved(Registration registration) {

		registration.setCmStatus("Approved");

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(registration.getEmail());
		message.setText("Your application of loan is Approved From Credit Manager desk ");
		sender.send(message);
		System.out.println("cmaAppro impl called");
		registrationRepository.save(registration);
		return registration;
	}

	@Override
	public List<Registration> getAllApprovedList() {
		
		ArrayList<Registration> regList=new ArrayList<Registration>();
		List<Registration>findAll=registrationRepository.findAll();
		
		Iterator<Registration> itr=findAll.iterator();
		while(itr.hasNext()) {
			Registration next=itr.next();
			
			if(next.getCmStatus().equals("Approved")) {
				regList.add(next);
			}
		}
		return regList;
	}
}
