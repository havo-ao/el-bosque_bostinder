package co.edu.unbosque.models;

import java.util.ArrayList;
/**
 * Esta clase se encarga de contener el ArrayList de los usuarios.<br>
 * @@author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class App_DTO {
	/**
	 * ArrayList usersList de tipo People.<br>
	 */
	private ArrayList<People> usersList;
	/**
	 * Metodo constructor de la clase que se encarga de inicializar el ArrayList. <br>
	 * <b>pre</b> El Arraylist debe estar inicializado, <br>
	 * <b>post</b> El Arraylist fue inicializado. <br>
	 */
	public App_DTO() {
		usersList = new ArrayList<People>();
	}
	/**
	 * Este metodo permite que otras clases accedan al ArrayList. <br>
	 * <b>pre</b> El ArrayList esta instanciada e inicializada, <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el ArrayList usersList de tipo People. <br>
	 */
	public ArrayList<People> getUsersList() {
		return usersList;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param usersList es el ArrayList de los usuarios. usersList != null, usersList != " ". <br>
	 */
	public void setUsersList(ArrayList<People> usersList) {
		this.usersList = usersList;
	}

	/**
	 * Metodo que se encarga de listar a los usuarios
	 * <b>pre</b> La lista debe estar inicializada. <br>
	 * <b>post</b> Se lista todo el contenido del ArrayList. <br>
	 * @return Regresa userList donde se encuentran todos los usuarios.
	 */
	public ArrayList<People>listaPersona(){
		return usersList;
	}
	
}
