package com.models;


import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:02 PM
 */
public class User {

    private final Date dateAdded;
    private final Date dateOfBirth;
    private final Gender gender;
    private final UUID userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private ArrayList<Appointment> appointments;
	private ArrayList<Doctor> doctors;
	private float height;
	private boolean isDoctor;
	private MedicalHistory medicalHistory;
	private Messages messages;
	private String middleName;
	private NotificationSettings notifications;
	private Settings settings;
	private float weight;
    private Address address;

	public User(String username, String password, Date dateAdded,
                Date dateOfBirth, String firstName, String lastName, Gender gender, UUID userId){
	    this.username = username;
        this.password = password;
        this.dateAdded = dateAdded;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.userId = userId;
	}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Gender getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isDoctor() {
		return isDoctor;
	}

	public void setDoctor(boolean doctor) {
		isDoctor = doctor;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public MedicalHistory getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(MedicalHistory medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public Messages getMessages() {
		return messages;
	}

	public void setMessages(Messages messages) {
		this.messages = messages;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public NotificationSettings getNotifications() {
		return notifications;
	}

	public void setNotifications(NotificationSettings notifications) {
		this.notifications = notifications;
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public UUID getUserId() {
		return userId;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void finalize() throws Throwable {

	}
}//end User