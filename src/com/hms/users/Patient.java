/**
 * 
 */
package com.hms.users;

/**
 * @author Ganesh
 *
 */
public class Patient extends User{
	//patientId (long), insured (boolean)  
	private long patientId;
	
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
}
