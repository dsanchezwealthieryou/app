package com.models;


import java.util.ArrayList;
import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:11 PM
 */
public class MedicalOffice {

	private Address address;
	private ArrayList<Assistant> assistants;
	private ArrayList<Doctor> doctors;
	private final UUID officeId;
	private ArrayList<Patient> patients;

	public MedicalOffice(Address address, UUID officeId){
        this.address = address;
        this.officeId = officeId;
	}

	public void finalize() throws Throwable {

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Assistant> getAssistants() {
		return assistants;
	}

	public void setAssistants(ArrayList<Assistant> assistants) {
		this.assistants = assistants;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public UUID getOfficeId() {
		return officeId;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
}//end MedicalOffice