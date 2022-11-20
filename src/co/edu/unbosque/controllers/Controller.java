package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.views.VentanaAdmin;
import co.edu.unbosque.views.VentanaMenu;
import co.edu.unbosque.views.VentanaPrincipal;

public class Controller implements ActionListener{ //ItemListener {

	private VentanaPrincipal mainWindow;
	private VentanaMenu menuWindow;
	private VentanaAdmin adminWindow;

	public Controller() {
		mainWindow = new VentanaPrincipal();
		menuWindow = new VentanaMenu();
		adminWindow = new VentanaAdmin();
		addListeners();
	}



	public void addListeners() {
		mainWindow.getRegister().addActionListener(this);
		mainWindow.getLog().addActionListener(this);
		
		menuWindow.getUser().addActionListener(this);
		menuWindow.getAdmin().addActionListener(this);
		menuWindow.getVolver().addActionListener(this);
		
		adminWindow.getStadistic().addActionListener(this);
		adminWindow.getShow_asc().addActionListener(this);
		adminWindow.getShow_dec().addActionListener(this);
		adminWindow.getFilter().addActionListener(this);
		adminWindow.getDelete().addActionListener(this);
		adminWindow.getExit2().addActionListener(this);
		adminWindow.getVolver_adm().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comand = e.getActionCommand();

		try {

			if(comand.equals("logging")) {  //el de vnt log
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);
			//	JOptionPane.showMessageDialog(null, "panitaaa");

			}
			if(comand.equals("Registrar")) {  //la parte de registra
				mainWindow.setVisible(false);
				JOptionPane.showInputDialog(null,"en proceso");

			}
			if(comand.equals("usuario")) { //la de usuarios
				mainWindow.setVisible(false);
				JOptionPane.showInputDialog(null,"en proceso");

			}
			
			if(comand.equals("Volver1")) {
				mainWindow.setVisible(true);
				menuWindow.setVisible(false);
			}
			if(comand.equals("adminis")) { //VENTANA INFO ADMINS antes de abrir esta debe servir el log in de @ solo que aqui lo hice accesible de una
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(true);
			}
			if(comand.equals("EXIT2")) { //es el boton de salida en la vnt de admin
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(false);
			}
			if(comand.equals("returnAdm")) {
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);
				adminWindow.setVisible(false);
			}
			if(comand.equals("Filtrarr")) { //es el boton de filtrar la info tal vez sea inecesario
				
			}		
			if(comand.equals("mostrarAsc")) { //boton de organizar ascen
				
			}
			if(comand.equals("mostrarDEC")) { //boton de organizar dez
				
			}
			if(comand.equals("Estadisticas")) { //Lo de mostrar las esst
				
			}



			
			
			
			
			
			
			
		} catch (Exception e2) {
			//lo de las vainas flotantes
			JOptionPane.showInputDialog(null,"ERROR", "OJO!",JOptionPane.ERROR_MESSAGE);
		}
	}

//	@Override
//	public void itemStateChanged(ItemEvent itemEvent) {
//
//	}
}
