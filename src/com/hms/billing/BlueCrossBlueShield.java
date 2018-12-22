package com.hms.billing;

public class BlueCrossBlueShield implements InsuranceBrand {
	public long id;
	public String name;
	
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		// TODO Auto-generated method stub
		double monthlyPremium = 0.0;
		if(insurancePlan == null   ) {
			return monthlyPremium;
		}
		else if(insurancePlan instanceof PlatinumPlan) {
			if(age < 55 && smoking == false)
				monthlyPremium = 0.0;
			else if(age > 55 && smoking == false)
				monthlyPremium = 200;
			else if(age > 55 && smoking == true) 
				monthlyPremium = 200 + 100 ;
			else 
			monthlyPremium =100;
		}
		else if(insurancePlan instanceof GoldPlan) {
			if(age < 55 && smoking == false)
				monthlyPremium = 0.0;
			else if(age > 55 && smoking == false)
				monthlyPremium = 150;
			else if(age > 55 && smoking == true) 
				monthlyPremium = 150 +90 ;
			else 
				monthlyPremium =90;
		}
		else if(insurancePlan instanceof SilverPlan) {
			if(age < 55 && smoking == false)
				monthlyPremium = 0.0;
			else if(age > 55 && smoking == false)
				monthlyPremium = 100;
			else if(age > 55 && smoking == true) 
				monthlyPremium = 100 +80 ;
			else 
				monthlyPremium =80;
		}
		else if(insurancePlan instanceof BronzePlan) {
			if(age < 55 && smoking == false)
				monthlyPremium = 0.0;
			else if(age > 55 && smoking == false)
				monthlyPremium = 50;
			else if(age > 55 && smoking == true) 
				monthlyPremium = 100 +70 ;
			else 
				monthlyPremium =70;
		}
		return monthlyPremium;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

}
