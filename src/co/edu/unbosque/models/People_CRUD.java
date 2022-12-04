package co.edu.unbosque.models;

import java.util.ArrayList;

	
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Esta clase implementa la interface People_CRUD_Interface, para la persistencia.
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class People_CRUD implements People_CRUD_Interface {

/**
 * Variable constants de tipo Constants
 */
	Constants constants;
	/**
	 * Metodo constructor de la clase People_CRUD, que se encarga de inicializar las variables
	 * <b>pre</b> Las variables ddebieron ser llamadas previamente. <br>
	 * <b>post</b> Las variables fueron inicializadas. <br>
	 */
	public People_CRUD() {
		constants = new Constants();
	}

	@Override
	/**
	 * Metodo que se encarga de crear un usuario.
	 * <b>pre</b> El ArrayListe debe haber sido inicialziado. <br>
	 * <b>post</b> El usuario fue agregado a la lista. <br>
	 * @param user es el usuario. user != null, user != " ". <br>
	 * @param usersList es la lista de todos los usuarios. usesrList != null, usersList != " ". <br>
	 * @return Regresa result en el cual almacena si el usuario existe o no dentro de la lista.
	 */
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
	/**
	 * Metodo que se encarga de eliminar un usuario de la lista.
	 * <b>pre</b> El ArrayListe debe haber sido inicialziado. <br>
	 * <b>post</b> El usuario fue eliminado de la lista. <br>
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param usersList es la lista de todos los usuarios. usesrList != null, usersList != " ". <br>
	 * @return Regresa deleted confirmando si el usuario fue eliminado o no de la lista.
	 */
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
	/**
	 * Metodo que permite modficar la infromación del usuario.
	 * <b>pre</b> El usuario debe existir dentro de la lista. <br>
	 * <b>post</b> L información deseada del usuario fue modificada. <br>
	 * @param prevUser es el usuario anterior de la lista . prevUser != null, prevUser != " ". <br>
	 * @param nextUser es el siguiente usuario dentro de la lista. nextUser != null, nextUser != " ". <br>
	 * @param usersList es la lista de todos los usuarios. usesrList != null, usersList != " ". <br>
	 * @return Regresa modified, confirmando si la modificación fue hecha o no.
	 */
	public boolean modify(People prevUser, People nextUser, ArrayList<People> usersList) {
		boolean modified = false;

		if (prevUser != null) {
			delete(prevUser.getUserName(), usersList);
			create(nextUser, usersList);
			modified = true;
		}

		return modified;

	}

	/**
	 * Metodo para modificar la información de un usuario.
	 * <b>pre</b> Todos los parametros debieron ser previamente inicializados. <br>
	 * <b>post</b> La información del usuario fue modificada. <br>
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param password es la contraseña del usuario. password != null, password != " ". <br>
	 * @param email es correo electronico del usuario. email != null, email != " ". <br>
	 * @param status es correo electronico del usuario. status != null, status != " ". <br>
	 * @param gender es el genero del usuario. gender != null, gender != " ". <br>
	 * @param name es el nombre del usuario. name != null, name != " ". <br>
	 * @param birthDate es la fecha de cumpleaños del usuario. birthDate != null, birthDate != " ". <br>
	 * @param height es la fecha de cumpleaños del usuario. height != null, height != " ". <br>
	 * @param usersList es la lista de todos los usuarios. userList != null, userList != " ". <br>
	 * @return Regresa la información del usuario modificada.
	 */
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
	/**
	 * Metodo para buscar un usuario por el nombre de usuario.
	 * <b>pre</b> La lista debe estar inicializada previamente. <br>
	 * <b>post</b> Si el usuario existe entro de la lista, se muestra su información. <br>
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param usersList es la lista de todos los usuarios. usesrList != null, usersList != " ". <br>
	 * @return Regresa el perfil del usuario o regresa nulo.
	 */
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
	/**
	 * Metodo que se encarga de verificar si el usuario existe.
	 * <b>pre</b> La lista debe estar inicializada previamente. <br>
	 * <b>post</b> Regresa falso. <br>
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param usersList es la lista de todos los usuarios. usersList != null, usersList != " ". <br>
	 * @return Regresa falso como respuesta predeterminada.
	 */
	public boolean isUserExist(String userName, ArrayList<People> usersList) {

		return false;
	}
 
	/**
	 * Este metodo se encarga de mostrar el contenido de la llista de los usuarios. 
	 * <b>pre</b> La lista debe estar inicializada. <br>
	 * <b>post</b> Se muestra la información de la lista. <br>
	 * @param usersList es la lista de todos los usuarios. usersList != null, usersList != " ". <br>
	 * @return Regresa el usuario que se va a mostrar
	 */
	public String show(ArrayList<People> usersList) {
		String res="";
		for(People p : usersList ) {
		res += p.toString();
		}
		return res;
	}
}
