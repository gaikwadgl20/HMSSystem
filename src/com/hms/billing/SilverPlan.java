package com.hms.billing;

public class SilverPlan extends HealthInsurancePlan {
	public void silverCoverage() {
		setCoverage(0.7);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		// TODO Auto-generated method stub
		return (0.06 * salary);
	}
}
