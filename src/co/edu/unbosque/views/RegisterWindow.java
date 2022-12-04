package co.edu.unbosque.views;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterWindow extends JFrame {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private Components components = new Components();

	private JLabel lblBanner = new JLabel();
	private JLabel lblUsername = new JLabel();
	private JLabel lblEmail = new JLabel();
	private JLabel lblName = new JLabel();
	private JLabel lblLastNameOne = new JLabel();
	private JLabel lblLastNameTwo = new JLabel();
	private JLabel lblAge = new JLabel();
	private JLabel lblPass = new JLabel();
	private JLabel lblConfirmPass = new JLabel();
	private JLabel lblGender = new JLabel();
	private JLabel lblWomen = new JLabel();
	private JLabel lblDivorces = new JLabel();
	private JLabel lblMen = new JLabel();
	private JLabel lblIncome = new JLabel();
	private JLabel lblHeight = new JLabel();
	private JLabel lblPhoto = new JLabel();

	private JTextField txtUsername = new JTextField();
	private JTextField txtEmail = new JTextField();
	private JTextField txtName = new JTextField();
	private JTextField txtLastNameOne = new JTextField();
	private JTextField txtLastNameTwo = new JTextField();
	private JTextField txtPass = new JTextField();
	private JTextField txtConfirmPass = new JTextField();
	private JTextField txtDivorces = new JTextField();
	private JTextField txtIncome = new JTextField();
	private JTextField txtHeight = new JTextField();

	private JComboBox<String> cmbGender = new JComboBox<String>();
	private JComboBox<String> cmbBirthDay = new JComboBox<String>();
	private JComboBox<String> cmbBirthMonth = new JComboBox<String>();
	private JComboBox<String> cmbBirthYear = new JComboBox<String>();

	private JButton btnRegister = new JButton();
	private JButton btnBack = new JButton();
	private JButton btnPhoto = new JButton();

	final int defaultWidth = 200;
	final int defaultHeight = 40;

	final int paddingX = 10;
	final int paddingY = 10;

	// Constructor of Register Window
	public RegisterWindow() {

		setSize(880, 760);
		setTitle("Registrar nuevo usuario");
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
		addComboBoxes();
	}

	// Function to add labels
	private void addLabels() {
		// Banner
		add(components.addLabel(lblBanner, "", 0, 0, 880, 160, SwingConstants.LEFT,
				"src/imagenes/logo_bostinder_880.png"));

		// Col 1
		add(components.addLabel(lblUsername, "Nombre de usuario", getCol(1), getRow(1), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblEmail, "Correo", getCol(1), getRow(2), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblName, "Nombre", getCol(1), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblLastNameOne, "Primer Apellido", getCol(1), getRow(4), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblLastNameTwo, "Segundo Apellido", getCol(1), getRow(5), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblAge, "Fecha de Nacimiento", getCol(1), getRow(6), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblPass, "Contraseña", getCol(1), getRow(7), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblConfirmPass, "Confirmar Contraseña", getCol(1), getRow(8), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

		// Col 3
		add(components.addLabel(lblGender, "Género", getCol(3), getRow(1), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblWomen, "Exclusivo para Mujeres", getCol(3), getRow(2), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblDivorces, "No. de divorcios", getCol(3), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblMen, "Exclusivo para Hombres", getCol(3), getRow(4), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblIncome, "Ingresos Mensuales", getCol(3), getRow(5), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(components.addLabel(lblHeight, "Altura", getCol(3), getRow(6), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		// Col 4
		add(components.addLabel(lblPhoto, "", getCol(4), getRow(7), defaultWidth, (defaultHeight * 4) + (paddingY * 3),
				SwingConstants.CENTER, "src/imagenes/person_woman.png"));
	}

	// Function to add Inputs
	private void addTextInputs() {
		// Col 2
		add(components.addTextInput(txtUsername, "", getCol(2), getRow(1), defaultWidth, defaultHeight));
		add(components.addTextInput(txtEmail, "", getCol(2), getRow(2), defaultWidth, defaultHeight));
		add(components.addTextInput(txtName, "", getCol(2), getRow(3), defaultWidth, defaultHeight));
		add(components.addTextInput(txtLastNameOne, "", getCol(2), getRow(4), defaultWidth, defaultHeight));
		add(components.addTextInput(txtLastNameTwo, "", getCol(2), getRow(5), defaultWidth, defaultHeight));
		add(components.addTextInput(txtPass, "", getCol(2), getRow(7), defaultWidth, defaultHeight));
		add(components.addTextInput(txtConfirmPass, "", getCol(2), getRow(8), defaultWidth, defaultHeight));

		// Col 4
		add(components.addTextInput(txtDivorces, "", getCol(4), getRow(3), defaultWidth, defaultHeight));
		add(components.addTextInput(txtIncome, "", getCol(4), getRow(5), defaultWidth, defaultHeight));
		add(components.addTextInput(txtHeight, "", getCol(4), getRow(6), defaultWidth, defaultHeight));
	}

	// Function to add ComboBoxes
	private void addComboBoxes() {
		cmbGender.setBounds(getCol(4) - 20, getRow(1), defaultWidth + 20, defaultHeight);
		cmbGender.addItem("Hombre");
		cmbGender.addItem("Mujer");
		add(cmbGender);

		cmbBirthDay.setBounds(getCol(2) - 20, getRow(6), 70, defaultHeight);
		for (int day = 1; day <= 31; day++) {
			cmbBirthDay.addItem(String.valueOf(day));
		}
		((JLabel) cmbBirthDay.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
		add(cmbBirthDay);

		cmbBirthMonth.setBounds(getCol(2) + 50, getRow(6), 70, defaultHeight);
		for (int month = 1; month <= 12; month++) {
			cmbBirthMonth.addItem(String.valueOf(month));
		}
		((JLabel) cmbBirthMonth.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
		add(cmbBirthMonth);

		int todayYear = 2022;
		int maxAge = 120;
		cmbBirthYear.setBounds(getCol(2) + 120, getRow(6), 85, defaultHeight);
		for (int year = todayYear; year >= todayYear - maxAge; year--) {
			cmbBirthYear.addItem(String.valueOf(year));
		}
		((JLabel) cmbBirthYear.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
		add(cmbBirthYear);
	}

	// Function to add Buttons
	private void addButtons() {

		/*
		 * add(components.addButton(btnPhoto, "Subir foto", getCol(3), getRow(8),
		 * defaultWidth, defaultHeight)); btnPhoto.setActionCommand("uploadPhoto");
		 */

		add(components.addButton(btnRegister, "Registrarse", getCol(4), getRow(11), defaultWidth, defaultHeight));
		btnRegister.setActionCommand("registerUser");

		add(components.addButton(btnBack, "Volver", getCol(3), getRow(11), defaultWidth, defaultHeight));
		btnBack.setActionCommand("backToLoginRegister");
	}

	// Function to get row number by integer
	private int getRow(int row) {
		return 180 + ((row - 1) * (defaultHeight + paddingY));
	}

	// Function to get col number by integer
	private int getCol(int col) {
		return 30 + ((col - 1) * (defaultWidth + paddingX));
	}

	public void genderEvents(String registerGender) {
		if (registerGender.equals("Mujer")) {
			getLblWomen().setEnabled(true);
			getLblDivorces().setEnabled(true);
			getTxtDivorces().setEnabled(true);

			getLblMen().setEnabled(false);
			getLblIncome().setEnabled(false);
			getLblHeight().setEnabled(false);
			getTxtHeight().setEnabled(false);
			getTxtHeight().setText("");
			getTxtIncome().setEnabled(false);
			getTxtIncome().setText("");
			
			lblPhoto.setIcon(new ImageIcon("src/imagenes/person_woman.png"));
		} else {
			getLblMen().setEnabled(true);
			getLblIncome().setEnabled(true);
			getLblHeight().setEnabled(true);
			getTxtHeight().setEnabled(true);
			getTxtIncome().setEnabled(true);

			getLblWomen().setEnabled(false);
			getLblDivorces().setEnabled(false);
			getTxtDivorces().setEnabled(false);
			getTxtDivorces().setText("");
			
			lblPhoto.setIcon(new ImageIcon("src/imagenes/person_man.png"));

		}
	}

	public JLabel getLblBanner() {
		return lblBanner;
	}

	public void setLblBanner(JLabel lblBanner) {
		this.lblBanner = lblBanner;
	}

	public JLabel getLblUsername() {
		return lblUsername;
	}

	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public JLabel getLblName() {
		return lblName;
	}

	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}

	public JLabel getLblLastNameOne() {
		return lblLastNameOne;
	}

	public void setLblLastNameOne(JLabel lblLastNameOne) {
		this.lblLastNameOne = lblLastNameOne;
	}

	public JLabel getLblLastNameTwo() {
		return lblLastNameTwo;
	}

	public void setLblLastNameTwo(JLabel lblLastNameTwo) {
		this.lblLastNameTwo = lblLastNameTwo;
	}

	public JLabel getLblAge() {
		return lblAge;
	}

	public void setLblAge(JLabel lblAge) {
		this.lblAge = lblAge;
	}

	public JLabel getLblPass() {
		return lblPass;
	}

	public void setLblPass(JLabel lblPass) {
		this.lblPass = lblPass;
	}

	public JLabel getLblConfirmPass() {
		return lblConfirmPass;
	}

	public void setLblConfirmPass(JLabel lblConfirmPass) {
		this.lblConfirmPass = lblConfirmPass;
	}

	public JLabel getLblGender() {
		return lblGender;
	}

	public void setLblGender(JLabel lblGender) {
		this.lblGender = lblGender;
	}

	public JLabel getLblWomen() {
		return lblWomen;
	}

	public void setLblWomen(JLabel lblWomen) {
		this.lblWomen = lblWomen;
	}

	public JLabel getLblDivorces() {
		return lblDivorces;
	}

	public void setLblDivorces(JLabel lblDivorces) {
		this.lblDivorces = lblDivorces;
	}

	public JLabel getLblMen() {
		return lblMen;
	}

	public void setLblMen(JLabel lblMen) {
		this.lblMen = lblMen;
	}

	public JLabel getLblIncome() {
		return lblIncome;
	}

	public void setLblIncome(JLabel lblIncome) {
		this.lblIncome = lblIncome;
	}

	public JLabel getLblHeight() {
		return lblHeight;
	}

	public void setLblHeight(JLabel lblHeight) {
		this.lblHeight = lblHeight;
	}

	public JLabel getLblPhoto() {
		return lblPhoto;
	}

	public void setLblPhoto(JLabel lblPhoto) {
		this.lblPhoto = lblPhoto;
	}

	public JTextField getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(JTextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}

	public JTextField getTxtLastNameOne() {
		return txtLastNameOne;
	}

	public void setTxtLastNameOne(JTextField txtLastNameOne) {
		this.txtLastNameOne = txtLastNameOne;
	}

	public JTextField getTxtLastNameTwo() {
		return txtLastNameTwo;
	}

	public void setTxtLastNameTwo(JTextField txtLastNameTwo) {
		this.txtLastNameTwo = txtLastNameTwo;
	}

	public JTextField getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(JTextField txtPass) {
		this.txtPass = txtPass;
	}

	public JTextField getTxtConfirmPass() {
		return txtConfirmPass;
	}

	public void setTxtConfirmPass(JTextField txtConfirmPass) {
		this.txtConfirmPass = txtConfirmPass;
	}

	public JTextField getTxtDivorces() {
		return txtDivorces;
	}

	public void setTxtDivorces(JTextField txtDivorces) {
		this.txtDivorces = txtDivorces;
	}

	public JTextField getTxtIncome() {
		return txtIncome;
	}

	public void setTxtIncome(JTextField txtIncome) {
		this.txtIncome = txtIncome;
	}

	public JTextField getTxtHeight() {
		return txtHeight;
	}

	public void setTxtHeight(JTextField txtHeight) {
		this.txtHeight = txtHeight;
	}

	public JComboBox<String> getCmbGender() {
		return cmbGender;
	}

	public void setCmbGender(JComboBox<String> cmbGender) {
		this.cmbGender = cmbGender;
	}

	public JComboBox<String> getCmbBirthDay() {
		return cmbBirthDay;
	}

	public void setCmbBirthDay(JComboBox<String> cmbBirthDay) {
		this.cmbBirthDay = cmbBirthDay;
	}

	public JComboBox<String> getCmbBirthMonth() {
		return cmbBirthMonth;
	}

	public void setCmbBirthMonth(JComboBox<String> cmbBirthMonth) {
		this.cmbBirthMonth = cmbBirthMonth;
	}

	public JComboBox<String> getCmbBirthYear() {
		return cmbBirthYear;
	}

	public void setCmbBirthYear(JComboBox<String> cmbBirthYear) {
		this.cmbBirthYear = cmbBirthYear;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JButton getBtnPhoto() {
		return btnPhoto;
	}

	public void setBtnPhoto(JButton btnPhoto) {
		this.btnPhoto = btnPhoto;
	}

}
