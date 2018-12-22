package com.hms.billing;

public class SilverPlan extends HealthInsurancePlan{
	public void silverCoverage() {
		setCoverage(0.7);
	}
	
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return 0.06 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
