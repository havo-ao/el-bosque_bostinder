package co.edu.unbosque.views;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * Clase donde se encuentran los metodos para la creacion estandar de componentes graficos.
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class Components {

	/**
	 * Metodo paara agregar botones estandar.
	 * <b>pre</b> Se debe ingresar todos los valores requeridos. <br>
	 * <b>post</b> Se ajustan los valores para todo los botones. <br>
	 * @param button es un boton estandar. button != null, button != " ". <br>
	 * @param text es el area de texto dentro el boton. text != null, text != " ". <br>
	 * @param x es la posición en x predeterminada para el botón. x != null, x != " ". <br>
	 * @param y es la posición en y predeterminada para el botón. y != null, y != " ". <br>
	 * @param width es la anchura predeterminada para el botón. width != null, width != " ". <br>
	 * @param height es la altura predeterminada para el botón. height != null, height != " ". <br>
	 * @return Regresa los valores para todos los botones.
	 */
	public JButton addButton(JButton button, String text, int x, int y, int width, int height) {

		button.setText(text); 
		button.setBounds(x, y, width, height); 
		return button; 
	}

	
	/**
	 * Metodo para añadir labels.
	 * <b>pre</b> Se debe ingresar todos los valores requeridos. <br>
	 * <b>post</b> Se ajustan los valores para todo los labels. <br>
	 * @param label es un label estandar. label != null, label != " ". <br>
	 * @param text es el area de texto dentro el boton. text != null, text != " ". <br>
	 * @param x es la posición en x predeterminada para el botón. x != null, x != " ". <br>
	 * @param y es la posición en y predeterminada para el botón. y != null, y != " ". <br>
	 * @param width es la anchura predeterminada para el botón. width != null, width != " ". <br>
	 * @param height es la altura predeterminada para el botón. height != null, height != " ". <br>
	 * @param aligment
	 * @param imagePath
	 * @return Regresa los valores para todos los labels.
	 */
	public JLabel addLabel(JLabel label, String text, int x, int y, int width, int height, int aligment,
			String imagePath) {

		label.setText(text); 
		label.setBounds(x, y, width, height); 
		label.setHorizontalAlignment(aligment); 

		
		if (!imagePath.equals(""))
			label.setIcon(new ImageIcon(imagePath)); 

		return label; 
	}

	/**
	 * Metodo para agregar entradas de textos estandar.
	 * <b>pre</b> Se debe ingresar todos los valores requeridos. <br>
	 * <b>post</b> Se ajustan los valores para todo las entradas de texto. <br> 
	 * @param textInput es un entrada de texto estandar. textInput != null, textInput != " ". <br>
	 * @param text es el area de texto dentro el boton. text != null, text != " ". <br>
	 * @param x es la posición en x predeterminada para el botón. x != null, x != " ". <br>
	 * @param y es la posición en y predeterminada para el botón. y != null, y != " ". <br>
	 * @param width es la anchura predeterminada para el botón. width != null, width != " ". <br>
	 * @param height es la altura predeterminada para el botón. height != null, height != " ". <br>
	 * @return Regresa los valores para todos las entradas de texto.
	 */
	public JTextField addTextInput(JTextField textInput, String text, int x, int y, int width, int height) {

		textInput.setText(text);
		textInput.setBounds(x, y, width, height); 
		return textInput; 
	}
}
