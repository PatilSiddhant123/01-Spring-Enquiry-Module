package com.cjc.hl.em.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class PreviousLoan {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "abc")
	@SequenceGenerator(name = "abc",initialValue = 1000,allocationSize = 1,sequenceName = "previousLoanId_seq")
	private Integer previousLoanId;
	private String previousLoanStatus;
	private Integer loanId;
	public Integer getPreviousLoanId() {
		return previousLoanId;
	}
	public void setPreviousLoanId(Integer previousLoanId) {
		this.previousLoanId = previousLoanId;
	}
	public String getPreviousLoanStatus() {
		return previousLoanStatus;
	}
	public void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	
	
	

}
