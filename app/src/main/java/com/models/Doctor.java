package com.models;


import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:06 PM
 */
public class Doctor extends User{

	private final UUID doctorId;
	private final UUID officeId;
	private final UUID userId;

	public Doctor(UUID doctorId, UUID userId, UUID officeId){
	    this.doctorId = doctorId;
        this.userId = userId;
        this.officeId = officeId;
	}

    public void finalize() throws Throwable {

	}
}//end Doctor