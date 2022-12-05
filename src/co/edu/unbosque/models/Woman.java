package co.edu.unbosque.models;

import java.time.LocalDate;

public class Woman extends People{

		protected 	String divorces;
	
	public Woman(String userName, String password, String email, String status, String gender, String name,
			LocalDate birthDate, int height, String divorces) {
		super(userName, password, email, status, gender, name, birthDate, height);
		this.divorces = divorces;
	}

	public String getDivorces() {
		return divorces;
	}

	public void setDivorces(String divorces) {
		this.divorces = divorces;
	}
	
	
	
}
