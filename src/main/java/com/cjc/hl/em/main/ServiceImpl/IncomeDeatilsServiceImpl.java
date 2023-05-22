package com.cjc.hl.em.main.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.em.main.Repository.EnquiryRepository;
import com.cjc.hl.em.main.Repository.IncomedetailRepository;
import com.cjc.hl.em.main.Service.IncomeDetailService;
import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.IncomeDetails;

@Service
public class IncomeDeatilsServiceImpl implements IncomeDetailService{
	
	@Autowired
	private IncomedetailRepository inrepo;
	
	@Autowired
	private EnquiryRepository enqrepo;
	

//	@Override
//	public void addIncomeDetails(IncomeDetails incd) {
//		inrepo.save(incd);
//		
//	}
//
//	@Override
//	public List<IncomeDetails> getAllIncomeDetail() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public void saveIncomewithEnquiry(IncomeDetails incd) {
//		
//		Integer enquiryId = incd.getEnquiryId()
//		 Enquiry enquiry = enqrepo.findById(enquiryId).get();
//		 
//		 if(enquiry.getEnquiryId()==enquiryId) {
//			 
//		 enquiry.setIncomeDetails(incd);
//		 inrepo.save(incd);
//		 }
//		 else {
//			 inrepo.save(incd);
//		 }
//		
//		
//	}

}
