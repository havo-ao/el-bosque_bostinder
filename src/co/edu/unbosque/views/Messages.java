package co.edu.unbosque.views;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Messages {
	public void mostrarInfo(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public void mostrarError(String message) {
		JOptionPane.showMessageDialog(null,message, "OJO!",JOptionPane.ERROR_MESSAGE);	
	}

	public String ingresarString(Object w, String message) {
		String aux = JOptionPane.showInputDialog(null,message);

		return aux;
	}

	public int leerDatoEntero(Object w, String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	public double leerDatoDouble(Object m, String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje);
		double dato = Double.parseDouble(aux);
		return dato;
	}
}
