package com.hms.billing;

public class PlatinumPlan extends HealthInsurancePlan {
	public void plataniumCoverage() {
		setCoverage(0.9);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		// TODO Auto-generated method stub
		return (0.08 * salary);
	}
}
