package com.hms.billing;

public class PlatinumPlan extends HealthInsurancePlan {
	public void plataniumCoverage() {
		setCoverage(0.9);
	}

	
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return 0.08 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
