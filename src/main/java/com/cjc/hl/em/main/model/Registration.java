package com.cjc.hl.em.main.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "abc")
	@SequenceGenerator(name = "abc",initialValue = 300,allocationSize = 1,sequenceName = "registrationId_seq")
	private Integer registrationId;
	private Integer enquiryId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dob;
	private String email;
	private Long phoneNo;
	private String panNo;
	private Long adharNo;
	private Double loanAmount;
	private String loantype;
	private LocalDate date;
	private String cmStatus;
	private String occuption;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousLoan;
	@OneToOne(cascade = CascadeType.ALL)
	private Guarantor guarantor;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails addressDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDetails propertyDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private IncomeDetails incomeDetails;
	
	
	
	public String getCmStatus() {
		return cmStatus;
	}
	public void setCmStatus(String cmStatus) {
		this.cmStatus = cmStatus;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public IncomeDetails getIncomeDetails() {
		return incomeDetails;
	}
	public void setIncomeDetails(IncomeDetails incomeDetails) {
		this.incomeDetails = incomeDetails;
	}
	public Integer getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	public Integer getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getOccuption() {
		return occuption;
	}
	public void setOccuption(String occuption) {
		this.occuption = occuption;
	}
	public PreviousLoan getPreviousLoan() {
		return previousLoan;
	}
	public void setPreviousLoan(PreviousLoan previousLoan) {
		this.previousLoan = previousLoan;
	}
	
	public Guarantor getGuarantor() {
		return guarantor;
	}
	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}
	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}
	public Registration(Integer registrationId, Integer enquiryId, String firstName, String middleName, String lastName,
			String gender, String dob, String email, Long phoneNo, String panNo,Long adharNo, Double loanAmount,
			String occuption, PreviousLoan previousLoan,  Guarantor guarantor,
			BankDetails bankDetails, AddressDetails addressDetails, PropertyDetails propertyDetails) {
		super();
		this.registrationId = registrationId;
		this.enquiryId = enquiryId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phoneNo = phoneNo;
		this.panNo = panNo;
		this.adharNo = adharNo;
		this.loanAmount = loanAmount;
		this.occuption = occuption;
		this.previousLoan = previousLoan;
	
		this.guarantor = guarantor;
		this.bankDetails = bankDetails;
		this.addressDetails = addressDetails;
		this.propertyDetails = propertyDetails;
	}
	public Registration() {
		super();
	}
	
	
	

}
