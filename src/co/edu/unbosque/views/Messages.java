/**
 * Este paquete corresponde a la parte grafica
 */
package co.edu.unbosque.views;

import java.awt.Component;

import javax.swing.JOptionPane;
/**
 * 
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class Messages {
	/**
	 * Este metodo se encarga de mostrar la informadción en una ventana flotante.
	 * <b>pre</b> El mensaje debe esatr inicializado previamente. <br>
	 * <b>post</b> Se muestra la información requerida. <br> 
	 * @param message es el mensaje que se va a mostrar. message != null, message != " ". <br>
	 */
	public void mostrarInfo(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * Este metodo se encarga de mostrar el error al usuario por medio de una ventana flotante.
	 * <b>pre</b> Debe suceder un error. <br>
	 * <b>post</b> Se le avisa al usuario que ha cometido un errror. <br>
	 * @param message es el mensaje que se va a mostrar. message != null, message != " ". <br>
	 */
	public void mostrarError(String message) {
		JOptionPane.showMessageDialog(null,message, "OJO!",JOptionPane.ERROR_MESSAGE);	
	}
	/**
	 * Este metodo permite ingresar un String por medio de una ventana flotante.
	 * <b>pre</b> 
	 * <b>post</b> El String fue ingresado. <br>
	 * @param w es la clase padre del mensaje. w != null, w != " ". <br>
	 * @param message es el mensaje que se va a mostrar. message != null, message != " ". <br>
	 * @return Regresa el mensaje 
	 */
	public String ingresarString(Object w, String message) {
		String aux = JOptionPane.showInputDialog(null,message);

		return aux;
	}
	/**
	 * Este metodo se encarga de leer los datos de tipo entero  en una ventana flotante. 
	 * <b>pre</b> Se debe ingresar una linea de texto. <br>
	 * <b>post</b> El dato de tipo entero ha sido leido.
	 * @param w es la clase padre del mensaje. w != null, w != " ". <br>
	 * @param mensaje es el mensaje ingresado como Strin para pasarlo a entero. mensaje != null, mensaje != " ". <br>
	 * @return Regresa el mensaje ingresado como tipo entero.
	 */
	public int leerDatoEntero(Object w, String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	/**
	 * Este metodo se encarga de recibir Strings y convertirlos en datos de tipo double.
	 * <b>pre</b> Se debe ingresar una linea de texto. <br>
	 * <b>post</b> Se ha leido el dato de tipo double. <br>
	 * @param m es la clase padre del mensaje. m != null, m != " ". <br>
	 * @param mensaje es el mensaje ingresado como Strin para pasarlo a entero. mensaje != null, mensaje != " ". <br>
	 * @return Regresa el mensaje ingresado como tipo double.
	 */
	public double leerDatoDouble(Object m, String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje);
		double dato = Double.parseDouble(aux);
		return dato;
	}
}
