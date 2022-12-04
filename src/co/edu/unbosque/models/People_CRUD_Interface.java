package co.edu.unbosque.models;

import java.util.ArrayList;

public interface People_CRUD_Interface {
	String create(People user, ArrayList<People> usersList);

	boolean delete(String userName, ArrayList<People> usersList);

	boolean modify(People prevUser, People nextUser, ArrayList<People> usersList);

	People findByUserName(String userName, ArrayList<People> usersList);

	boolean isUserExist(String userName, ArrayList<People> usersList);
}
