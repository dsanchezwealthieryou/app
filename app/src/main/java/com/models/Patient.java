package com.models;


import java.util.Date;
import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:07 PM
 */
public class Patient extends User{

	private UUID userId;

	public Patient(String username, String password, Date dateAdded, Date dateOfBirth, String firstName, String lastName, Gender gender, UUID userId) {
		super(username, password, dateAdded, dateOfBirth, firstName, lastName, gender, userId);
	}

	public void finalize() throws Throwable {

	}
}//end Patient