package com.cjc.hl.em.main.ServiceImpl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.hl.em.main.Repository.CibilRepository;
import com.cjc.hl.em.main.Repository.EnquiryRepository;
import com.cjc.hl.em.main.Service.CibilService;
import com.cjc.hl.em.main.model.Cibil;
import com.cjc.hl.em.main.model.Enquiry;

@Service
public class CibilServiceImpl implements CibilService{

	@Autowired
	private CibilRepository cibilRepository;

	@Autowired
	private EnquiryRepository enquiryRepository;
	
	@Autowired
	private JavaMailSender sender;

	static Long getRandomCibilNo(Long min, Long max) {
		Long n = (long) (Math.random() * (max - min) + min);
		return n;
	}

	@Override
	public String createCibilScore(Cibil c, String panNo) {

		Enquiry enquiry = enquiryRepository.findBypanNo(panNo);

		if (enquiry.getPanNo().equals(panNo)) {

			Long cibilNo = getRandomCibilNo(600l, 900l);
			//Long cibilNo=600l;
			if(cibilNo>=750) {
				
				
				SimpleMailMessage smm=new SimpleMailMessage();
				smm.setTo(enquiry.getEmail());
				smm.setText("Hello \n"+"Mr."+enquiry.getFirstName()+" "+enquiry.getLastName()+"\n"+"*Congratulation* You are eligible for Home Loan");
				sender.send(smm);
				
				c.setEnquiryId(enquiry.getEnquiryId());
				c.setPanNo(panNo);
				c.setCibilScore(cibilNo);
				c.setCibilDate(LocalDate.now());
				c.setCibilRemark("Approved");
				cibilRepository.save(c);

				
				return "Your Cibil Score Is" + cibilNo;

			}
			else {
				
				SimpleMailMessage smm=new SimpleMailMessage();
				smm.setTo(enquiry.getEmail());
				smm.setText("Hello \n"+"Mr."+enquiry.getFirstName()+" "+enquiry.getLastName()+"\n"+"Sorry Sir.. You are Not eligible for Home Loan.\n Because Your Cibil score is Less Than 750.? \n *Thank You* ");
				sender.send(smm);
				
				c.setEnquiryId(enquiry.getEnquiryId());
				c.setPanNo(panNo);
				c.setCibilScore(cibilNo);
				c.setCibilDate(LocalDate.now());
				c.setCibilRemark("Your are Dis-Approved");
				cibilRepository.save(c);
				
				return "Sorry Your application is rejected. Because your Cibil Score Is Less Than 750 \n Your Current Cibil Score Is"+cibilNo;
			}
		} 
		else 
		{
			return "Please Enter Correct PanCardNo";
		}

	}

	
	
	
	
	@Override
	public List<Cibil> getAllCibil() {
		
		return cibilRepository.findAll();
	}

	
	@Override
	public List<Cibil> getAllApoveList() {
	
		
		List<Cibil> allList = cibilRepository.findAll();
		
		ArrayList<Cibil> reList = new ArrayList<Cibil>();
		
		Iterator<Cibil> itr = allList.iterator();
		
		while(itr.hasNext()) {
			Cibil next = itr.next();
			if(next.getCibilRemark()!=null) {
				if(next.getCibilRemark().equals("Approved"))
				{
					reList.add(next);				
				}
			}
		}
		return reList;
	}

}
