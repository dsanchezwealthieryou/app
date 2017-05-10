package System;


/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:11 PM
 */
public class MedicalOffice {

	private Address address;
	private ArrayList<Assistant> assistants;
	private ArrayList<Doctor> doctors;
	private UUID officeId;
	private ArrayList<Patient> patients;

	public MedicalOffice(){

	}

	public void finalize() throws Throwable {

	}
}//end MedicalOffice