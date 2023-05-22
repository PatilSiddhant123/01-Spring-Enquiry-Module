package com.cjc.hl.em.main.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.model.Document;

public interface DocumentService {

	Document saveDocumentUsingRegID(Integer registrationId, MultipartFile adharCard, MultipartFile panCard,
			MultipartFile photo, MultipartFile sign, MultipartFile salarySlip, MultipartFile itr,
			MultipartFile bankPass, MultipartFile incomeCertificate, MultipartFile propertyDocument,
			MultipartFile guarantorSign, MultipartFile guarantorBankPass) throws IOException;

	List<Document> getAllDocument();

}
