package co.edu.unbosque.models;

import java.time.LocalDate;
/**
 * Clase People donde se crea la información base de los usuarios.
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Alfaro
 *
 */
public class People {
	/**
	 * Variables userName, email, status, gender, name de tipo String
	 */
	protected String userName, email, status, gender, name;
	/**
	 * Variable de la fecha de cumpelaños de tipo LocalDate.
	 */
	protected LocalDate birthDate;
	/**
	 * Variable altura de tipo int.
	 */
	protected int height;
	/**
	 * Metodo constructor de la clase People, que se encarga de inciializar las variables
	 * <b>pre</b> Las variables debieron ser creadas previamente.<br>
	 * <b>post</b> Se inicializa las variables de la clase. <br>
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param password es la contraseña del usuario. password != null, password != " ". <br>
	 * @param email es correo electronico del usuario. email != null, email != " ". <br>
	 * @param status es correo electronico del usuario. status != null, status != " ". <br>
	 * @param gender es el genero del usuario. gender != null, gender != " ". <br>
	 * @param name es el nombre del usuario. name != null, name != " ". <br>
	 * @param birthDate es la fecha de cumpleaños del usuario. birthDate != null, birthDate != " ". <br>
	 * @param height es la fecha de cumpleaños del usuario. height != null, height != " ". <br>
	 */
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
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable del nombre de usuario de tipo String.
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param userName es el nombe de usuario del usuario. userName != null, userName != " ". <br>
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable email de tipo String.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param email es el correo electronico del usuario. email != null, email != " ". <br>
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable status de tipo String.
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param status es el estado civil del usuario. status != null, status != " ". <br>
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable gender de tipo String.
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param gender es el genero del usuario. gender != null, gender != " ". <br>
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable name de tipo String.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param name es el nombre real del usuario. name != null, name != " ". <br>
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable birthDate de tipo LocalDate.
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param birthDate es la fecha de cumpleaños del usuario. birthDate != null, birthDate != " ". <br>
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable height de tipo int.
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param height es la fecha de cumpleaños del usuario. height != null, height != " ". <br>
	 */
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
