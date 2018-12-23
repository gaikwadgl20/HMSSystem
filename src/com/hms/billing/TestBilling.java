package com.hms.billing;

import com.hms.users.Nurse;
import com.hms.users.Patient;
import com.hms.users.User;

public class TestBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		Patient patient = new Patient();
		patient.setInsurancePlan(insurancePlan);

		Nurse nurse = new Nurse();
		nurse.setInsurancePlan(insurancePlan);

		User staff = new User();
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan1 = new PlatinumPlan();

		insurancePlan1.setOfferedBy(insuranceBrand);
		staff.setInsurancePlan(insurancePlan1);
		System.out.println("Monthly Premium : " + insurancePlan1.computeMonthlyPremium(5000, 56, true));

		/*
		 * double monthlyPremium = Billing.monthlyPremium(nurse, 5000);
		 * System.out.println(" Montly premium fot staff:" + monthlyPremium);
		 */

		double[] payments = Billing.computePaymentAmount(patient, 1000.0);
		for (double bill : payments) {
			System.out.println(bill);
		}
	}

}
