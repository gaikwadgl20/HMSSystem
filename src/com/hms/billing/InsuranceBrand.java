package com.hms.billing;

public interface InsuranceBrand {

	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking);

}
