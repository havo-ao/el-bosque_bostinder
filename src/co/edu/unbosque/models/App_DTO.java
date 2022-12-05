package co.edu.unbosque.models;

import java.io.File;
import java.util.ArrayList;

public class App_DTO {

	private ArrayList<People> usersList;
	private File fileMan;
	private File fileWoman;
	private ArrayList<People> mens;
	private ArrayList<People> womens;

	
	public App_DTO() {
		usersList = new ArrayList<People>();
		mens = new ArrayList<People>();
		womens = new ArrayList<People>();
	
	
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
