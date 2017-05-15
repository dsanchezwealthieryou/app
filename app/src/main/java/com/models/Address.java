package com.models;


import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:14 PM
 */
public class Address {
    public UUID addressID;
	public UUID userId;
	private String firstStreetLine;
    private String secondStreetLine;
    private String city;
    private String state;
    private int zipCode;
    private String country;

	public Address(){

	}

    public String getFirstStreetLine() {
        return firstStreetLine;
    }

    public void setFirstStreetLine(String firstStreetLine) {
        this.firstStreetLine = firstStreetLine;
    }

    public String getSecondStreetLine() {
        return secondStreetLine;
    }

    public void setSecondStreetLine(String secondStreetLine) {
        this.secondStreetLine = secondStreetLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void finalize() throws Throwable {

	}
}//end Address