package com.models;


import java.util.ArrayList;
import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:12 PM
 */
public class Illness {

	private UUID illnessId;
	private ArrayList<Symptom> symtomps;
	private ArrayList<Treatment> treatment;

	public Illness(){

	}

	public void finalize() throws Throwable {

	}
}//end Illness