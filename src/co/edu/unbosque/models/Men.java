package co.edu.unbosque.models;

import java.time.LocalDate;
/**
 * Clase men, que se extiende de la clase People.
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Alfaro
 *
 */
public class Men extends People {
	/**
	 * Variable del salario mensual de tipo double.
	 */
	protected double monthlySalary;
	/**
	 * Metodo constructor de la clase men, con sus datos respectivos. 
	 * <b>pre</b> La clase debe esatar extendida de la clase People.<br>
	 * <b>post</b> Se inicializa la clase men con sus variables y las variables de la clase People. <br>
	 * @param userName es el nombre de usuario del usuario. userName != null, userName != " ". <br>
	 * @param password es la contraseña del usuario. password != null, password != " ". <br>
	 * @param email es correo electronico del usuario. email != null, email != " ". <br>
	 * @param status es correo electronico del usuario. status != null, status != " ". <br>
	 * @param gender es el genero del usuario. gender != null, gender != " ". <br>
	 * @param name es el nombre del usuario. name != null, name != " ". <br>
	 * @param birthDate es la fecha de cumpleaños del usuario. birthDate != null, birthDate != " ". <br>
	 * @param height es la fecha de cumpleaños del usuario. height != null, height != " ". <br>
	 * @param monthlySalary es el salario mensual del usuario. monthlySalary != null, monthlySalary != " ". <br>
	 */
	public Men(String userName, String password, String email, String status, String gender, String name,
			LocalDate birthDate, int height, double monthlySalary) {
		super(userName, password, email, status, gender, name, birthDate, height);
		this.monthlySalary = monthlySalary;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable monthlySalary de tipo double. <br>
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param monthlySalary es el salario mensual del usuario. monthlySalary != null, monthlySalary != " ". <br>
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

}
