package com.cjc.hl.em.main.ServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.cjc.hl.em.main.Repository.EnquiryRepository;
import com.cjc.hl.em.main.Repository.IncomedetailRepository;
import com.cjc.hl.em.main.Service.EnquiryService;
import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.IncomeDetails;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Autowired
	private EnquiryRepository enqrepo;
	
	@Autowired
	private MailSender sender;
	
	@Override
	public void newEnquiry(Enquiry enquiry) {
		
		
		enquiry.setDate(LocalDate.now());
		
		enqrepo.save(enquiry);
	}



	@Override
	public List<Enquiry> getAllEnquiry() {
		
		return enqrepo.findAll();
	}
	
	
	@Override
	public String reRejection(Enquiry enquiry) {
		
		enquiry.setStatus("Rejected");
		
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(enquiry.getEmail());
		msg.setText("Your Application  is Rejected From RE Desc");
		sender.send(msg);
		
		enqrepo.save(enquiry);
		return "Saved";
	}
	
	@Override
	public String Approved(Enquiry enquiry) {
		
		enquiry.setStatus("Approved");
		
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(enquiry.getEmail());
		msg.setText("Your Application  is Approved From RE Desc");
		sender.send(msg);
		
		enqrepo.save(enquiry);
		return "Saved";
	}

	@Override
	public List<Enquiry> getApprovedList() {
	
		ArrayList<Enquiry> reList = new ArrayList<Enquiry>();
		List<Enquiry> findAll = enqrepo.findAll();
		
		Iterator<Enquiry> itr = findAll.iterator();
		while(itr.hasNext()) {
			Enquiry next = itr.next();
			if(next.getStatus()!=null) {
				if(next.getStatus().equals("Approved")) {
					reList.add(next);
				}
			}
		}
		return reList;
	}

}
