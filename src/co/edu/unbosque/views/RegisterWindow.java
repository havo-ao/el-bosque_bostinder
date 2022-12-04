package co.edu.unbosque.views;

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
		setTitle("Agregar productos");
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
				SwingConstants.LEFT, "src/imagenes/person_gray.png"));

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
		// Col 3
		add(components.addButton(btnPhoto, "Subir foto", getCol(3), getRow(8), defaultWidth, defaultHeight));
		add(components.addButton(btnRegister, "Registrarse", getCol(3), getRow(11), defaultWidth, defaultHeight));

		// Col 4
		add(components.addButton(btnBack, "Volver", getCol(4), getRow(11), defaultWidth, defaultHeight));
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
