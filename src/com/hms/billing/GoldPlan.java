package com.hms.billing;

public class GoldPlan extends HealthInsurancePlan {
	public void goldCoverage() {
		setCoverage(0.8);
	}

	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return 0.07 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
	
}
