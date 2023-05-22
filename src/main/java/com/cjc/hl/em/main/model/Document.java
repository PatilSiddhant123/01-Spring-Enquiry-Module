package com.cjc.hl.em.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "zzz")
	@SequenceGenerator(name = "zzz",initialValue = 400,allocationSize = 1,sequenceName = "documentId_seq")
	private Integer documentId;
	private Integer registrationId;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] sign;
	@Lob
	private byte[] salaryslip;
	@Lob
	private byte[] itr;
	@Lob
	private byte[] bankpass;
	@Lob
	private byte[] incomecertificate;
	@Lob
	private byte[] gurantorsign;
	@Lob
	private byte[] garantorbankpass;
	@Lob
	private byte[] propertydocument;
	public Integer getDocumentId() {
		return documentId;
	}
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	public Integer getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	public byte[] getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}
	public byte[] getPancard() {
		return pancard;
	}
	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getSign() {
		return sign;
	}
	public void setSign(byte[] sign) {
		this.sign = sign;
	}
	public byte[] getSalaryslip() {
		return salaryslip;
	}
	public void setSalaryslip(byte[] salaryslip) {
		this.salaryslip = salaryslip;
	}
	public byte[] getItr() {
		return itr;
	}
	public void setItr(byte[] itr) {
		this.itr = itr;
	}
	public byte[] getBankpass() {
		return bankpass;
	}
	public void setBankpass(byte[] bankpass) {
		this.bankpass = bankpass;
	}
	public byte[] getIncomecertificate() {
		return incomecertificate;
	}
	public void setIncomecertificate(byte[] incomecertificate) {
		this.incomecertificate = incomecertificate;
	}
	public byte[] getGurantorsign() {
		return gurantorsign;
	}
	public void setGurantorsign(byte[] gurantorsign) {
		this.gurantorsign = gurantorsign;
	}
	public byte[] getGarantorbankpass() {
		return garantorbankpass;
	}
	public void setGarantorbankpass(byte[] garantorbankpass) {
		this.garantorbankpass = garantorbankpass;
	}
	public byte[] getPropertydocument() {
		return propertydocument;
	}
	public void setPropertydocument(byte[] propertydocument) {
		this.propertydocument = propertydocument;
	}

	
	

	
	
	

}
