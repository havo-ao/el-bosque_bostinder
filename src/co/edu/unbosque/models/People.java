package co.edu.unbosque.models;

import java.time.LocalDate;

public class People {

	protected String userName, email, status, gender, name;
	protected LocalDate birthDate;
	protected int height;

	public People(String userName, String password, String email, String status, String gender, String name,
			LocalDate birthDate, int height) {
		this.userName = userName;
		this.email = email;
		this.status = status;
		this.gender = gender;
		this.name = name;
		this.birthDate = birthDate;
		this.height = height;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
//	
//	@Override
//	public String toString() {
//		String res ="";
//	//	res+=this.userName+","+this.email+","+this.status+","+this.gender+","+this.name+","+this.birthDate+","+this.height;
//		res+=this.userName+","+this.name+","+this.birthDate;
//		return res;	 
//		
//		//que pasa con la edad y el apellido?
//	}

}
