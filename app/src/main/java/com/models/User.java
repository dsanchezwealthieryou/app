package System;


/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:02 PM
 */
public class User {

	private Address address;
	private ArrayList<Appointment> appointments;
	private DateTime dateAdded;
	private DateTime dateOfBirth;
	private ArrayList<Doctor> doctors;
	private String firstName;
	private Gender gender;
	private float height;
	private boolean isDoctor;
	private String lastName;
	private MedicalHistory medicalHistory;
	private Messages messages;
	private String middleName;
	private NotificationSettings notifications;
	private Settings settings;
	private UUID userId;
	private float weight;

	public User(){

	}

	public void finalize() throws Throwable {

	}
}//end User