package com.hms.billing;

public class GoldPlan extends HealthInsurancePlan {
	public void goldCoverage() {
		setCoverage(0.8);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		// TODO Auto-generated method stub
		return (0.07 * salary);
	}
	
}
