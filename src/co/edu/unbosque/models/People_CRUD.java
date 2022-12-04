package co.edu.unbosque.models;

import java.util.ArrayList;

	
import java.time.LocalDate;
import java.util.ArrayList;

public class People_CRUD implements People_CRUD_Interface{

	Constants constants;

	public People_CRUD() {
		constants = new Constants();
	}

	@Override
	public String create(People user, ArrayList<People> usersList) {
		String result;

		People userFound = findByUserName(user.getUserName(), usersList);

		if (userFound == null) {
			usersList.add(user);
			result = constants.CREATED;
		} else {
			result = constants.EXISTING;
		}

		return result;

	}

	@Override
	public boolean delete(String userName, ArrayList<People> usersList) {
		boolean deleted = false;

		People user = findByUserName(userName, usersList);

		if (user != null) {
			usersList.remove(user);
			deleted = true;
		}

		return deleted;

	}


	

	@Override
	public boolean modify(People prevUser, People nextUser, ArrayList<People> usersList) {
		boolean modified = false; 
		if (prevUser != null) {
			delete(prevUser.getUserName(), usersList);
			create(nextUser, usersList);
			modified = true;
		}

		return modified;

	}

	
	public boolean modificar(String userName, String password, String email, String status, String gender, String name,
			LocalDate birthDate, int height, ArrayList<People> usersList) {
		boolean modified = false;

		for (int i = 0; i < usersList.size(); i++) {
			if (usersList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
			
				usersList.get(i).setUserName(userName);
				usersList.get(i).setEmail(email);

				usersList.get(i).setStatus(status);
				usersList.get(i).setGender(gender);
				usersList.get(i).setName(name);
				usersList.get(i).setBirthDate(birthDate);
				usersList.get(i).setHeight(height);

				return true;
			}

		}
		return modified;

	}
	
	@Override
	public People findByUserName(String userName, ArrayList<People> usersList) {
		People userFound = null;

		
		if (!usersList.isEmpty()) { //si no esta vacio
			for (People user : usersList) {
				if (userName.toLowerCase().equals(user.getUserName().toLowerCase()))
					userFound = user;
			}
		}

		return userFound;
	}

	@Override
	public boolean isUserExist(String userName, ArrayList<People> usersList) {

		return false;
	}
 

	public String show(ArrayList<People> usersList) {
		String res="";
		for(People p : usersList ) {
		res += p.toString();
		}
		return res;
	}
}
