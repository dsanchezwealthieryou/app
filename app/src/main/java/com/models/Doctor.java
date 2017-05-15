package com.models;


import java.util.Date;
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
	private String specialty;

	public Doctor(String username, String password, Date dateAdded, Date dateOfBirth,
				  String firstName, String lastName, Gender gender, UUID userId,
				  UUID doctorId, UUID officeId) {
		super(username, password, dateAdded, dateOfBirth, firstName, lastName, gender, userId);
		this.doctorId = doctorId;
		this.userId = userId;
		this.officeId = officeId;
	}

	public void finalize() throws Throwable {

	}

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}//end Doctor