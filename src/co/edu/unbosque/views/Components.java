package co.edu.unbosque.views;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Components {

	// Función para agregar botones estándar
	public JButton addButton(JButton button, String text, int x, int y, int width, int height) {

		button.setText(text); // Asignar texto al botón
		button.setBounds(x, y, width, height); // Asignar ubicación y tamaño al botón
		return button; // Devolver botón componente
	}

	// Función para agregar labeles estándar
	public JLabel addLabel(JLabel label, String text, int x, int y, int width, int height, int aligment,
			String imagePath) {

		label.setText(text); // Asignar texto al label
		label.setBounds(x, y, width - 20, height); // Asignar ubicación y tamaño al label
		label.setHorizontalAlignment(aligment); // Asignar orientación vertical del texto

		// Validar si se trata de una imagen
		if (!imagePath.equals(""))
			label.setIcon(new ImageIcon(imagePath)); // Asignar path de imagen al label

		return label; // Devolver label componente
	}

	// Función para agregar inputs de texto estándar
	public JTextField addTextInput(JTextField textInput, String text, int x, int y, int width, int height) {

		textInput.setText(text); // Asignar texto al input
		textInput.setBounds(x - 20, y, width + 20, height); // Asignar unicación y tamaño al input
		return textInput; // Devolver input text componente
	}
}
