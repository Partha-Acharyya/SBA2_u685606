package com.iiht.training.eloan.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class SanctionDto {
	@NotNull(message="loanAmountSanctioned is mandate")
	@Min(value=1, message = "loanAmountSanctioned should be greater than 1")
	private Double loanAmountSanctioned;
	
	@NotNull(message="termOfLoan is mandate")
	@Min(value=1, message = "termOfLoan should be greater than 1")
	private Double termOfLoan;
	private String paymentStartDate;
	public Double getLoanAmountSanctioned() {
		return loanAmountSanctioned;
	}
	public void setLoanAmountSanctioned(Double loanAmountSanctioned) {
		this.loanAmountSanctioned = loanAmountSanctioned;
	}
	public Double getTermOfLoan() {
		return termOfLoan;
	}
	public void setTermOfLoan(Double termOfLoan) {
		this.termOfLoan = termOfLoan;
	}
	public String getPaymentStartDate() {
		return paymentStartDate;
	}
	public void setPaymentStartDate(String paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}
	
	
}
