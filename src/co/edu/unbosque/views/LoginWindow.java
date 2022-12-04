package co.edu.unbosque.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private Components components = new Components();

	private JLabel lblBanner = new JLabel();
	private JLabel lblTitle = new JLabel();
	private JLabel lblUser = new JLabel();
	private JLabel lblPass = new JLabel();
	private JLabel lblInfo = new JLabel();

	private JTextField txtUser = new JTextField();
	private JTextField txtPass = new JTextField();

	private JButton btnGoToRegister = new JButton();
	private JButton btnLogin = new JButton();
	private JButton btnBack = new JButton();

	private String userRole;
	private String loginMessage;

	final int defaultWidth = 200;
	final int defaultHeight = 40;

	final int paddingX = 10;
	final int paddingY = 10;

	public LoginWindow(String userRole) {
		this.userRole = userRole;

		setSize(470, 530);
		setTitle("Iniciar Sesión");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		initializeComponents();
	}

	private void initializeComponents() {
		addLabels();
		addTextInputs();
		addButtons();
	}

	private void addLabels() {
		// Banner
		add(components.addLabel(lblBanner, "", 0, 0, 880, 160, SwingConstants.LEFT,
				"src/imagenes/logo_bostinder_880.png"));

		String userToLog;
		if (userRole.equals("admin")) {
			userToLog = "como Administrador";
		} else
			userToLog = "";

		add(components.addLabel(lblTitle, "Iniciar sesión " + userToLog, getCol(1), getRow(1),
				(defaultWidth * 2) + paddingX, defaultHeight, SwingConstants.CENTER, ""));
		add(components.addLabel(lblUser, "Usuario o Correo", getCol(1), getRow(2), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblPass, "Contraseña", getCol(1), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		
		if (userRole.equals("admin")) {
			loginMessage = "Solo los administradores ya creados pueden crear otros.";
		} else {
			loginMessage = "¿No estás registrado?";
		}

		add(components.addLabel(lblInfo, loginMessage, getCol(1), getRow(4),
				(defaultWidth * 2) + paddingX, defaultHeight, SwingConstants.CENTER, ""));

	}

	// Function to add Inputs
	private void addTextInputs() {
		// Col 2
		add(components.addTextInput(txtUser, "", getCol(2), getRow(2), defaultWidth, defaultHeight));
		add(components.addTextInput(txtPass, "", getCol(2), getRow(3), defaultWidth, defaultHeight));
	}

	// Function to add Buttons
	private void addButtons() {

		// Col 1
		if (!userRole.equals("admin")) {
			add(components.addButton(btnGoToRegister, "Registrarse", getCol(1) + (defaultWidth / 2), getRow(5),
					defaultWidth, defaultHeight));
			btnGoToRegister.setActionCommand("goToRegister");
		}

		add(components.addButton(btnBack, "Volver", getCol(1), getRow(6), defaultWidth, defaultHeight));
		add(components.addButton(btnLogin, "Iniciar Sesión", getCol(2), getRow(6), defaultWidth, defaultHeight));
		
		if (userRole.equals("admin")) {
			btnLogin.setActionCommand("loginAdmin");
			btnBack.setActionCommand("goToMenuAdmin");
		}else {
			btnLogin.setActionCommand("loginUser");
			btnBack.setActionCommand("goToMenuUser");
		}

	}

	public JLabel getLblBanner() {
		return lblBanner;
	}

	public void setLblBanner(JLabel lblBanner) {
		this.lblBanner = lblBanner;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}

	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JLabel getLblUser() {
		return lblUser;
	}

	public void setLblUser(JLabel lblUser) {
		this.lblUser = lblUser;
	}

	public JLabel getLblPass() {
		return lblPass;
	}

	public void setLblPass(JLabel lblPass) {
		this.lblPass = lblPass;
	}

	public JLabel getLblInfo() {
		return lblInfo;
	}

	public void setLblInfo(JLabel lblInfo) {
		this.lblInfo = lblInfo;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JTextField getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(JTextField txtPass) {
		this.txtPass = txtPass;
	}

	public JButton getBtnGoToRegister() {
		return btnGoToRegister;
	}

	public void setBtnGoToRegister(JButton btnGoToRegister) {
		this.btnGoToRegister = btnGoToRegister;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public String getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}

	// Function to get row number by integer
	private int getRow(int row) {
		return 180 + ((row - 1) * (defaultHeight + paddingY));
	}

	// Function to get col number by integer
	private int getCol(int col) {
		return 30 + ((col - 1) * (defaultWidth + paddingX));
	}

}
