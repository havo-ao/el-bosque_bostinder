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
import co.edu.unbosque.views.LoginWindow;
import co.edu.unbosque.views.Messages;
import co.edu.unbosque.views.PanelImagenPersona;
import co.edu.unbosque.views.ProfilesWindow;
import co.edu.unbosque.views.UserWindowApp;
import co.edu.unbosque.views.VentanaAdmin;
import co.edu.unbosque.views.VentanaMenu;
import co.edu.unbosque.views.VentanaPrincipal;
import co.edu.unbosque.views.VentanaStadistics;

public class Controller implements ActionListener { // ItemListener {

	private VentanaPrincipal mainWindow;

	private VentanaMenu menuWindow;

	private VentanaAdmin adminWindow;
	private RegisterWindow registerWindow;
	private LoginWindow loginWindow;
	private LoginWindow loginAdminWindow;
	private ProfilesWindow profilesWindow;

	private People_CRUD peopleDao;

	private App_DTO app_DTO;

	private Messages floatingWindow;

	private VentanaStadistics stadisticWindow;

	private UserWindowApp userWindowApp;
	// private PanelImagenPersona panelPersona;
	private EnviarCorreos sendEmail;

	public Controller() {
		mainWindow = new VentanaPrincipal();
		menuWindow = new VentanaMenu();
		adminWindow = new VentanaAdmin();

		registerWindow = new RegisterWindow();
		loginWindow = new LoginWindow("");
		loginAdminWindow = new LoginWindow("admin");
		profilesWindow = new ProfilesWindow();

		peopleDao = new People_CRUD();
		app_DTO = new App_DTO();
		floatingWindow = new Messages();
		stadisticWindow = new VentanaStadistics();
		userWindowApp = new UserWindowApp();
		sendEmail = new EnviarCorreos();

		addListeners();
	}

	public void addListeners() {
		registerWindow.getBtnBack().addActionListener(this);
		registerWindow.getBtnPhoto().addActionListener(this);
		registerWindow.getBtnRegister().addActionListener(this);
		registerWindow.getCmbGender().addActionListener(this);

		mainWindow.getRegister().addActionListener(this);
		mainWindow.getLog().addActionListener(this);

		loginWindow.getBtnBack().addActionListener(this);
		loginWindow.getBtnGoToRegister().addActionListener(this);
		loginWindow.getBtnLogin().addActionListener(this);

		loginAdminWindow.getBtnBack().addActionListener(this);
		loginAdminWindow.getBtnLogin().addActionListener(this);
		
		profilesWindow.getBtnLike().addActionListener(this);
		profilesWindow.getBtnDislike().addActionListener(this);
		profilesWindow.getBtnLogout().addActionListener(this);

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
	public void actionPerformed(ActionEvent event) {

		String registerGender = (String) registerWindow.getCmbGender().getSelectedItem();

		String comand = event.getActionCommand();

		try {

			registerWindow.genderEvents(registerGender);

			if (comand.equals("login")) { // el de vnt log
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);
			}
			
			if (comand.equals("registerUser")) { // el de vnt log
				registerUserActions();
			}
			
			if (comand.equals("loginUser")) { // el de vnt log
				loginUserActions();
			}
			
			if (comand.equals("loginAdmin")) { // el de vnt log
				loginAdminWindow.setVisible(false);
				adminWindow.setVisible(true);
			}
			
			if (comand.equals("goTologin")) { // el de vnt log
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);

			}
			
			if (comand.equals("backToLoginRegister")) { // el de vnt log
				registerWindow.setVisible(false);
				loginWindow.setVisible(true);
			}

			if (comand.equals("Registrar")) { // la parte de registra
				mainWindow.setVisible(false);
				registerWindow.setVisible(true);

				// JOptionPane.showInputDialog(null,"en proceso");
				// floatingWindow.mostrarInfo("Procesoo");
			}
			if (comand.equals("usuario")) { // la de usuarios
				mainWindow.setVisible(false);
				JOptionPane.showInputDialog(null, "en proceso");

			}

			if (comand.equals("goToMenuAdmin")) {
				menuWindow.setVisible(true);
				loginAdminWindow.setVisible(false);
			}

			if (comand.equals("goToMenuUser")) {
				menuWindow.setVisible(true);
				loginWindow.setVisible(false);
			}

			if (comand.equals("adminLogin")) {
				menuWindow.setVisible(false);
				loginAdminWindow.setVisible(true);
			}

			if (comand.equals("userLogin")) {
				menuWindow.setVisible(false);
				loginWindow.setVisible(true);
			}

			if (comand.equals("goToRegister")) {
				loginWindow.setVisible(false);
				registerWindow.setVisible(true);
			}

			if (comand.equals("Volver1")) {
				mainWindow.setVisible(true);
				menuWindow.setVisible(false);
			}
			if (comand.equals("adminis")) { // VENTANA INFO ADMINS antes de abrir esta debe servir el log in de @ solo
				// que aqui lo hice accesible de una
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(true);
			}
			if (comand.equals("EXIT2")) { // es el boton de salida en la vnt de admin
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(false);
			}
			if (comand.equals("returnAdm")) {
				mainWindow.setVisible(false);
				menuWindow.setVisible(true);
				adminWindow.setVisible(false);
			}

			if (comand.equals("Filtrarr")) { // es el boton de filtrar la info tal vez sea inecesario

			}
			if (comand.equals("mostrarAsc")) { // boton de organizar ascen

			}
			if (comand.equals("mostrarDEC")) { // boton de organizar dez

			}
			if (comand.equals("Estadisticas")) { // Lo de mostrar las esst
				stadisticWindow.setVisible(true);
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(false);
			}
			// estos se refieren al de venEstadisticaas
			if (comand.equals("personal")) { // Lo de mostrar las esst personales
				// stadisticWindow.setVisible(true);

			}
			if (comand.equals("Actgeneral")) { // Lo de mostrar las esst general
				// stadisticWindow.setVisible(true);

			}
			if (comand.equals("modify")) { // Lo de modificar usuario
				// stadisticWindow.setVisible(true);
				// People = new People(comand, comand, comand, comand, comand, comand, null, 0)

			}
			if (comand.equals("volverEstadistic1")) { // Lo de mostrar las esst
				stadisticWindow.setVisible(false);
				mainWindow.setVisible(false);
				menuWindow.setVisible(false);
				adminWindow.setVisible(true);
			}

			// Esto se refiere al borrar user

			if (comand.equals("borrar")) { // Lo de dar de baja
				// String nombre = JOptionPane.showInputDialog(null,"INGRESE EL USER A
				// ELIMINAR");
				String nombre = floatingWindow.ingresarString(null, "Ingrese el user a Eliminar");
				System.out.println(nombre);
				boolean delete = peopleDao.delete(nombre, app_DTO.getUsersList());

				if (delete = true) {
					System.out.println("DELETED " + nombre);
					peopleDao.show(app_DTO.getUsersList());
				} else {
					// JOptionPane.showMessageDialog(, e);
					floatingWindow.mostrarInfo("Not deleted");
				}
			}

		} catch (Exception e2) {
			// lo de las vainas flotantes
			JOptionPane.showMessageDialog(null, "ERROR", "OJO!", JOptionPane.ERROR_MESSAGE);
			// e2.printStackTrace();
		}
	}
	
	public void registerUserActions() {
		floatingWindow.mostrarInfo("Usuario Registrado con Éxito");
		registerWindow.setVisible(false);
		loginWindow.setVisible(true);
	}
	
	public void loginUserActions() {
		loginWindow.setVisible(false);
		profilesWindow.setVisible(true);
	}

	// @Override
	// public void itemStateChanged(ItemEvent itemEvent) {
	//
	// }
}
