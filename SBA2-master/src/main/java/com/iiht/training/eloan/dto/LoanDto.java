package com.iiht.training.eloan.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoanDto {
	@NotNull(message="loanName is mandatory")
	@NotBlank(message="loanName can not be null")
	@Size(min=3,max=100,message="loanName must be 4 to 50 chars in length")
	private String loanName;
	
	@NotNull(message="loanAmount is mandate")
	@Min(value=1, message = "loanAmount should be greater than 1")
	private Double loanAmount;
	
	private String loanApplicationDate;
	private String businessStructure;
	private String billingIndicator;
	private String taxIndicator;
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanApplicationDate() {
		return loanApplicationDate;
	}
	public void setLoanApplicationDate(String loanApplicationDate) {
		this.loanApplicationDate = loanApplicationDate;
	}
	public String getBusinessStructure() {
		return businessStructure;
	}
	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}
	public String getBillingIndicator() {
		return billingIndicator;
	}
	public void setBillingIndicator(String billingIndicator) {
		this.billingIndicator = billingIndicator;
	}
	public String getTaxIndicator() {
		return taxIndicator;
	}
	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
	}
	
	
}
