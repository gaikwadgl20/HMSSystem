package com.hms.billing;

public class HealthInsurancePlan {
    // Code for 'coverage' field goes here
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;
	private double coverage;
	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}

	public double getCoverage() {
		return coverage;
	}
	public void setCoverage(double coverage) {
		System.out.println(coverage +"Test ");
		this.coverage = coverage;
	}
}
