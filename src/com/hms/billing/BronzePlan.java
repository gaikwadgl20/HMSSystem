package com.hms.billing;

public class BronzePlan extends HealthInsurancePlan {
	
	public void bronzeCoverage() {
		setCoverage(0.6);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		// TODO Auto-generated method stub
		return (0.05 * salary);
	}
}
