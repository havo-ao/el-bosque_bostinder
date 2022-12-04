package co.edu.unbosque.models;

import java.util.ArrayList;

public class App_DTO {
	private ArrayList<People> usersList;

	public App_DTO() {
		usersList = new ArrayList<People>();
	}

	public ArrayList<People> getUsersList() {
		return usersList;
	}

	public void setUsersList(ArrayList<People> usersList) {
		this.usersList = usersList;
	}
	
	public ArrayList<People>listaPersona(){
		return usersList;
	}
	
}
