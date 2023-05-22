package com.cjc.hl.em.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Guarantor {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "abc")
	@SequenceGenerator(name = "abc",initialValue = 500,allocationSize = 1,sequenceName = "gurantorId_seq")
	private Integer gurantorId;
	private String gurantorFirstName;
	private String gurantorLastName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private IncomeDetails incomeDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails gurantorAddress;
	public Integer getGurantorId() {
		return gurantorId;
	}
	public void setGurantorId(Integer gurantorId) {
		this.gurantorId = gurantorId;
	}
	public String getGurantorFirstName() {
		return gurantorFirstName;
	}
	public void setGurantorFirstName(String gurantorFirstName) {
		this.gurantorFirstName = gurantorFirstName;
	}
	public String getGurantorLastName() {
		return gurantorLastName;
	}
	public void setGurantorLastName(String gurantorLastName) {
		this.gurantorLastName = gurantorLastName;
	}
	public IncomeDetails getIncomeDetails() {
		return incomeDetails;
	}
	public void setIncomeDetails(IncomeDetails incomeDetails) {
		this.incomeDetails = incomeDetails;
	}
	public AddressDetails getGurantorAddress() {
		return gurantorAddress;
	}
	public void setGurantorAddress(AddressDetails gurantorAddress) {
		this.gurantorAddress = gurantorAddress;
	}
	
	
	

}
