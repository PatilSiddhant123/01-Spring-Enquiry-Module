package com.cjc.hl.em.main.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.Service.DocumentService;
import com.cjc.hl.em.main.model.Document;

@RestController
@CrossOrigin("*")
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
	@PostMapping(value = "/saveDocument/{registrationId}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Document> saveDocumentUsingRegID(@PathVariable Integer registrationId,
			@RequestPart(required = true, value = "pancard") MultipartFile panCard,
			@RequestPart(required = true, value = "adharcard") MultipartFile adharCard,
			@RequestPart(required = true, value = "photo") MultipartFile photo,
			@RequestPart(required = true, value = "sign") MultipartFile sign,
			@RequestPart(required = true, value = "salaryslip") MultipartFile salarySlip,
			@RequestPart(required = true, value = "itr") MultipartFile itr,
			@RequestPart(required = true, value = "bankpass") MultipartFile bankPass,
			@RequestPart(required = true, value = "incomecertificate") MultipartFile incomeCertificate,
			@RequestPart(required = true, value = "propertydocument") MultipartFile propertyDocument,
			@RequestPart(required = true, value = "guarantorsign") MultipartFile guarantorSign,
			@RequestPart(required = true, value = "guarantorbankpass") MultipartFile guarantorBankPass
			)throws IOException{

		return new ResponseEntity<Document>(documentService.saveDocumentUsingRegID(registrationId,adharCard,panCard,photo
				,sign,salarySlip,itr,bankPass,incomeCertificate,propertyDocument
				,guarantorSign,guarantorBankPass),HttpStatus.CREATED);
	}

	
	public ResponseEntity<List<Document>> getAllDocument(){
		
		return new ResponseEntity<List<Document>>(documentService.getAllDocument(),HttpStatus.OK);
	}

}
