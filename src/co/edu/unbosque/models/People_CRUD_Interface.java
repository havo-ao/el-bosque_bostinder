package co.edu.unbosque.models;

import java.util.ArrayList;
/**
 * En esta interfacem se crea la carcasa de la logica. <br>
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Alfaro
 *
 */
public interface People_CRUD_Interface {
	/**
	 * Metodo abstracto para crear un usuario
	 * @param user es un usuario dentro del programa. user != null, user != " ". <br>
	 * @param usersList es la lista donde estan guardadas las personas. usersList != null, usersList != " ". <br>
	 * @return Regresa el mensaje de error dependiendo del caso o un mensaje de exito.
	 */
	String create(People user, ArrayList<People> usersList);
	/**
	 * Metodo abstracto para borrar un usuario
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param usersList es la lista donde estan guardadas las personas. usersList != null, usersList != " ". <br>
	 * @return Regresa falso o verdadero dependiendo si el usuario fue borrado.
	 */
	boolean delete(String userName, ArrayList<People> usersList);
	/**
	 * Metodo abstracto para modificar un usuario
	 * @param prevUser es el usuario anterior de la lista. prevUser != null, prevUser != " ". <br>
	 * @param nextUser es el usuario anterior de la lista. nextUser != null, nextUser != " ". <br>
	 * @param usersList es la lista donde estan guardadas las personas. usersList != null, usersList != " ". <br>
	 * @return Regresa falso o verdadero dependiendo si el usuario fue borrado.
	 */
	boolean modify(People prevUser, People nextUser, ArrayList<People> usersList);

	/**
	 * Metodo abstracto para buscar un usuario.
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param usersList es la lista donde estan guardadas las personas. usersList != null, usersList != " ". <br>
	 * @return Regresa una usuario de tipo persona
	 */

	People findByUserName(String userName, ArrayList<People> usersList);
	/**
	 * Metodo abstracto para buscar un usuario
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param usersList es la lista donde estan guardadas las personas. usersList != null, usersList != " ". <br>
	 * @return Regresa falso o verdadero dependiendo si el usuario existe.
	 */
	boolean isUserExist(String userName, ArrayList<People> usersList);
}
