package com.hms.billing;

import com.hms.users.Patient;

public class TestBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthInsurancePlan insurancePlan = new PlatinumPlan();        
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);
		        
		double[] payments = Billing.computePaymentAmount(patient, 1000.0);
		for(double bill :payments) {
			System.out.println(bill);
		}		
	}

}
