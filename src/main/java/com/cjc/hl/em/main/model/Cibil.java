package com.cjc.hl.em.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cibil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "zzz")
	@SequenceGenerator(name = "zzz",initialValue = 200,allocationSize = 1,sequenceName = "cibilId_seq")
	private Integer cibilId;
	private Integer enquiryId;
	private Long cibilScore;
	private LocalDate cibilDate;
	private String cibilRemark;
	
	private String panNo;
	public Integer getCibilId() {
		return cibilId;
	}
	public void setCibilId(Integer cibilId) {
		this.cibilId = cibilId;
	}
	public Integer getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}
	public Long getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(Long cibilScore) {
		this.cibilScore = cibilScore;
	}
	public LocalDate getCibilDate() {
		return cibilDate;
	}
	public void setCibilDate(LocalDate localDate) {
		this.cibilDate = localDate;
	}
	public String getCibilRemark() {
		return cibilRemark;
	}
	public void setCibilRemark(String cibilRemark) {
		this.cibilRemark = cibilRemark;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	
	
}
