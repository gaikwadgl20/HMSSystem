package com.hms.billing;

import com.hms.users.*;

public class Billing {
	   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        
        if(patientInsurancePlan == null) {
        	payments[0]=0;
        	payments[1]= amount - 20; 
        }
        else if(patientInsurancePlan instanceof GoldPlan) {
        	((GoldPlan) patientInsurancePlan).goldCoverage();
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 40;
        }
        else if(patientInsurancePlan instanceof PlatinumPlan) {
        	((PlatinumPlan) patientInsurancePlan).plataniumCoverage();
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 50;
        }
        else if(patientInsurancePlan instanceof SilverPlan) {
        	((SilverPlan) patientInsurancePlan).silverCoverage();
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 30;
        }
        else {
        	((BronzePlan) patientInsurancePlan).bronzeCoverage();
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 25;
        }
        // your logic        

        return payments;
    }
  /*  
    public static double monthlyPremium(User user, double amount) {
    	HealthInsurancePlan userPlan = user.getInsurancePlan();
    	double monthPremiun =0 ;
    	if(user.getInsurancePlan() == null) {
    		monthPremiun = 0;
    	}
    	else if(userPlan instanceof GoldPlan) {
    		monthPremiun = userPlan.computeMonthlyPremium(amount);
        }
    	else if(userPlan instanceof PlatinumPlan) {
    		monthPremiun = userPlan.computeMonthlyPremium(amount);
        }
    	else if(userPlan instanceof SilverPlan) {
    		monthPremiun = userPlan.computeMonthlyPremium(amount);
        }
    	else if(userPlan instanceof BronzePlan) {
    		monthPremiun = userPlan.computeMonthlyPremium(amount);
        }    	
    	return monthPremiun;
    }*/
    
}