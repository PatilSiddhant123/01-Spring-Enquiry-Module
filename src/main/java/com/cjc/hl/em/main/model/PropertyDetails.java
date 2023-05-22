package com.cjc.hl.em.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PropertyDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "abc")
	@SequenceGenerator(name = "abc",initialValue = 800,allocationSize = 1,sequenceName = "propertyId_seq")
	private Integer propertyId;
	private String propertyName;
	private String estimatedAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails addressDetails;

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(String estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}


	
	

}
