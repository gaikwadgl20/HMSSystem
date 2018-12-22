package com.hms.billing;

public class BronzePlan extends HealthInsurancePlan{
	
	public void bronzeCoverage() {
		setCoverage(0.6);
	}

	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return 0.05 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
