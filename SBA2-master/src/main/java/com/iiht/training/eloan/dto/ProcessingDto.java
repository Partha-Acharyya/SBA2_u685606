package com.iiht.training.eloan.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class ProcessingDto {
	@NotNull(message="acresOfLand is mandate")
	@Min(value=1, message = "acresOfLand should be greater than 1")
	private Double acresOfLand;
	
	@NotNull(message="landValue is mandate")
	@Min(value=1, message = "landValue should be greater than 1")
	private Double landValue;
	private String appraisedBy;
	private String valuationDate;
	
	@NotNull(message="addressOfProperty is mandatory")
	@Length(max = 150, min = 3)
	private String addressOfProperty;
	
	@NotNull(message="suggestedAmountOfLoan is mandate")
	@Min(value=1, message = "suggestedAmountOfLoan should be greater than 1")
	private Double suggestedAmountOfLoan;
	
	public Double getAcresOfLand() {
		return acresOfLand;
	}
	public void setAcresOfLand(Double acresOfLand) {
		this.acresOfLand = acresOfLand;
	}
	public Double getLandValue() {
		return landValue;
	}
	public void setLandValue(Double landValue) {
		this.landValue = landValue;
	}
	public String getAppraisedBy() {
		return appraisedBy;
	}
	public void setAppraisedBy(String appraisedBy) {
		this.appraisedBy = appraisedBy;
	}
	public String getValuationDate() {
		return valuationDate;
	}
	public void setValuationDate(String valuationDate) {
		this.valuationDate = valuationDate;
	}
	public String getAddressOfProperty() {
		return addressOfProperty;
	}
	public void setAddressOfProperty(String addressOfProperty) {
		this.addressOfProperty = addressOfProperty;
	}
	public Double getSuggestedAmountOfLoan() {
		return suggestedAmountOfLoan;
	}
	public void setSuggestedAmountOfLoan(Double suggestedAmountOfLoan) {
		this.suggestedAmountOfLoan = suggestedAmountOfLoan;
	}
	
	
}
