/**
 * Este paquete conecta la parte graffica con el modelo
 */
package co.edu.unbosque.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.views.RegisterWindow;
import co.edu.unbosque.models.App_DTO;
import co.edu.unbosque.models.EnviarCorreos;
import co.edu.unbosque.models.People;
import co.edu.unbosque.models.People_CRUD;
import co.edu.unbosque.models.People_CRUD_Interface;
import co.edu.unbosque.views.Messages;
import co.edu.unbosque.views.PanelImagenPersona;
import co.edu.unbosque.views.UserWindowApp;
import co.edu.unbosque.views.VentanaAdmin;
import co.edu.unbosque.views.VentanaMenu;
import co.edu.unbosque.views.VentanaPrincipal;
import co.edu.unbosque.views.VentanaStadistics;

/**
 * Clase Controller, que se encarga de conectar el view y el model
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class Controller implements ActionListener{ //ItemListener {
	/**
	 * Objeto mainWindow de tipo VentanaPrincipal.
	 */
	private VentanaPrincipal mainWindow;
	/**
	 * Objeto menuWindow de tipo VentanaMenu.
	 */
	private VentanaMenu menuWindow;
	/**
	 * Objeto adminWindow de tipo VentanaAdmin.
	 */
	private VentanaAdmin adminWindow;
	/**
	 * Objeto registerWindow de tipo RegisterWindow.
	 */
	private RegisterWindow registerWindow;
	/**
	 * Objeto peopleDao de tipo People_CRUD.
	 */
	private People_CRUD peopleDao;
	/**
	 * Objeto app_DTO de tipo App_DTO.
	 */
	private App_DTO app_DTO;
	/**
	 * Objeto floatingWindow de tipo Messages.
	 */
	private Messages floatingWindow;
	/**
	 * Objeto stadisticWindow de tipo VentanaStadistics.
	 */
	private VentanaStadistics stadisticWindow;
	/**
	 * Objeto userWindowApp de tipo UserWindowApp.
	 */
	private UserWindowApp  userWindowApp;
	/**
	 * Objeto sendEmail de tipo EnviarCorreos
	 */
	private EnviarCorreos sendEmail;
	/**
	 * Metodo constructor de la clase donde se incializan los objetos.
	 * <b>pre</b> Los objetos debieron ser creados dentro de la clase previamente. <br>
	 * <b>post</b> Los objetos fueron inicializados.
	 */
	public Controller() {
		mainWindow = new VentanaPrincipal();
		menuWindow = new VentanaMenu();
		adminWindow = new VentanaAdmin();

		registerWindow = new RegisterWindow();

		peopleDao = new People_CRUD();
		app_DTO = new App_DTO();
		floatingWindow = new Messages();
		stadisticWindow = new VentanaStadistics();
		userWindowApp = new UserWindowApp();
		sendEmail = new EnviarCorreos();

		addListeners();
	}

	/**
	 * Este metodo proporcina los Listeners a los objetos.
	 * <b>pre</b> Los objetos debieron ser previamente inicializados. <br>
	 * <b>post</b> Se les asignó a cada objeto un ActionListener. <br>
	 */
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

		stadisticWindow.getEstadisticaGen().addActionListener(this);
		stadisticWindow.getEstadisticaPersonal().addActionListener(this);
		stadisticWindow.getModifyP().addActionListener(this);
		stadisticWindow.getVolverEs().addActionListener(this);
		

	}


	@Override
	/**
	 * Metodo que se encarga de capturar los eventos.
	 * <b>pre</b> Los objetos deben estar inicializados. <br>
	 * <b>post</b> Se capturan los eventos y se aplican. <br>
	 */
	public void actionPerformed(ActionEvent e) {

		String comand = e.getActionCommand();

		try {

			if (comand.equals("logging")) { 
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);
				// JOptionPane.showMessageDialog(null, "panitaaa");


			}
			if (comand.equals("Registrar")) { 
				mainWindow.setVisible(false);
				registerWindow.setVisible(true);

				//JOptionPane.showInputDialog(null,"en proceso");
				//				floatingWindow.mostrarInfo("Procesoo");
			}
			if (comand.equals("usuario")) { 
				mainWindow.setVisible(false);
				JOptionPane.showInputDialog(null, "en proceso");

			}

			if (comand.equals("Volver1")) {
				//	JOptionPane.showInputDialog(null,"en proceso");
				floatingWindow.mostrarInfo("Proceso");
			}

			if(comand.equals("Volver1")) {
				mainWindow.setVisible(true);
				menuWindow.setVisible(false);
			}
			if (comand.equals("adminis")) { 
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(true);
			}
			if (comand.equals("EXIT2")) { 
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(false);
			}
			if (comand.equals("returnAdm")) {
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);
				adminWindow.setVisible(false);
			}

			if(comand.equals("Filtrarr")) { 
			}		
			if(comand.equals("mostrarAsc")) { 

			}
			if(comand.equals("mostrarDEC")) { 

			}
			if(comand.equals("Estadisticas")) { 
				stadisticWindow.setVisible(true);
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(false);
			}
			
			if(comand.equals("personal")) { 
				//	stadisticWindow.setVisible(true);

			}
			if(comand.equals("Actgeneral")) { 
				//stadisticWindow.setVisible(true);

			}
			if(comand.equals("modify")) { 
					stadisticWindow.setVisible(false);
//					People = new People(comand, comand, comand, comand, comand, comand, null, 0)

			}
			if(comand.equals("volverEstadistic1")) { 
				stadisticWindow.setVisible(false);
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(true);
			}

			

			if(comand.equals("borrar")) {  
				//	String nombre = JOptionPane.showInputDialog(null,"INGRESE EL USER A ELIMINAR");
				String nombre = floatingWindow.ingresarString(null,"Ingrese el user a Eliminar");
				System.out.println(nombre);
				boolean delete = peopleDao.delete(nombre, app_DTO.getUsersList());

				if(delete = true) {
					System.out.println("DELETED "+nombre);
					peopleDao.show(app_DTO.getUsersList());
				}
				else {
					//JOptionPane.showMessageDialog(, e);
					floatingWindow.mostrarInfo("Not deleted");
				}
			}


		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null,"ERROR", "OJO!",JOptionPane.ERROR_MESSAGE);
			//		e2.printStackTrace();
		}
	}

	//	@Override
	//	public void itemStateChanged(ItemEvent itemEvent) {
	//
	//	}
}
