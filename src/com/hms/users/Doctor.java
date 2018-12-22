package com.hms.users;

public class Doctor extends Staff {
	//doctorId (long), specialization (String)  
	private long doctorId;
	private String specialization;
	
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
}
