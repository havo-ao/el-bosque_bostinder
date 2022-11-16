package co.edu.unbosque.models;

import java.util.ArrayList;

public class People_CRUD implements People_CRUD_Interface {
	
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

	@Override
	public People findByUserName(String userName, ArrayList<People> usersList) {
		People userFound = null;

		if (!usersList.isEmpty()) {
			for (People user : usersList) {
				if (userName.equals(user.getUserName().toLowerCase()))
					userFound = user;
			}
		}

		return userFound;
	}

	@Override
	public boolean isUserExist(String userName, ArrayList<People> usersList) {

		return false;
	}
}
