package com.cjc.hl.em.main.ServiceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.Repository.DocumentRepository;
import com.cjc.hl.em.main.Repository.RegistrationRepository;
import com.cjc.hl.em.main.Service.DocumentService;
import com.cjc.hl.em.main.model.Document;
import com.cjc.hl.em.main.model.Registration;

@Service
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private DocumentRepository docrepo;
	@Autowired
	private RegistrationRepository regrepo;
	
	@Override
	public Document saveDocumentUsingRegID(Integer registrationId, MultipartFile adharCard, MultipartFile panCard,
			MultipartFile photo, MultipartFile sign, MultipartFile salarySlip, MultipartFile itr,
			MultipartFile bankPass, MultipartFile incomeCertificate, MultipartFile propertyDocument,
			MultipartFile guarantorSign, MultipartFile guarantorBankPass) throws IOException {
		
		Registration registration = regrepo.findById(registrationId).get();
		
		if(registration.getRegistrationId()==registrationId) {
			
			Document d=new Document();
			
			d.setRegistrationId(registrationId);
			d.setAdharcard(adharCard.getBytes());
			d.setPancard(panCard.getBytes());
			d.setPhoto(photo.getBytes());
			d.setSign(sign.getBytes());
			d.setSalaryslip(salarySlip.getBytes());
			d.setItr(itr.getBytes());
			d.setBankpass(bankPass.getBytes());
			d.setIncomecertificate(incomeCertificate.getBytes());
			d.setPropertydocument(propertyDocument.getBytes());
			d.setGurantorsign(guarantorSign.getBytes());
			d.setGarantorbankpass(guarantorBankPass.getBytes());
			
			return docrepo.save(d);
			
		}
		else {
		

			return null;
		}
		
	}

	@Override
	public List<Document> getAllDocument() {
		
		return docrepo.findAll();
	}

}
