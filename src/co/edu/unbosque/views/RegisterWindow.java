/**
 * Este paquete corresponde a la parte grafica
 */
package co.edu.unbosque.views;

import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 * Clase de la ventana para el registro del usuario
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class RegisterWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Variable CMcomponents de tipo Components
	 */
	private Components CMcomponents = new Components();
	/**
	 * Variable para el banner de tipo Label
	 */
	private JLabel lblBanner = new JLabel();
	/**
	 * Variable para elnombe de usuario de tipo Label
	 */
	private JLabel lblUsername = new JLabel();
	/**
	 * Variable para el correo electronico de tipo Label
	 */
	private JLabel lblEmail = new JLabel();
	/**
	 * Variable para el nombre del usuario de tipo Label
	 */
	private JLabel lblName = new JLabel();
	/**
	 * Variable para el apellido del usuario de tipo Label
	 */
	private JLabel lblLastNameOne = new JLabel();
	/**
	 * Variable para el segundo appellid del usuario de tipo Label
	 */
	private JLabel lblLastNameTwo = new JLabel();
	/**
	 * Variable para la edada del usuario de tipo Label
	 */
	private JLabel lblAge = new JLabel();
	/**
	 * Variable para la contrasela de tipo Label
	 */
	private JLabel lblPass = new JLabel();
	/**
	 * Variable para confirmar la contraseña de tipo Label
	 */
	private JLabel lblConfirmPass = new JLabel();
	/**
	 * Variable para el genero de tipo Label
	 */
	private JLabel lblGender = new JLabel();
	/**
	 * Variable para el texto que separa ls preguntas exclsuivas para mujeres de tipo Label
	 */
	private JLabel lblWomen = new JLabel();
	/**
	 * Variable para confirmar si esta divorciada de tipo Label
	 */
	private JLabel lblDivorces = new JLabel();
	/**
	 * Variable para separar las preguntsa exclusivas para los hombres de tipo Label
	 */
	private JLabel lblMen = new JLabel();
	/**
	 * Variable para los ingresos mensuales de tipo Label
	 */
	private JLabel lblIncome = new JLabel();
	/**
	 * Variable para la altura de tipo Label
	 */
	private JLabel lblHeight = new JLabel();
	/**
	 * Variable para mostrar la foto del usuario de tipo Label
	 */
	private JLabel lblPhoto = new JLabel();
	/**
	 * Variable para ingresar el nombre de usuario de tipo JTextField. 
	 */
	private JTextField txtUsername = new JTextField();
	/**
	 * Variable para ingresar el correo electronico del usuario de tipo JTextField. 
	 */
	private JTextField txtEmail = new JTextField();
	/**
	 * Variable para ingresar el nombre real del usuario de tipo JTextField. 
	 */
	private JTextField txtName = new JTextField();
	/**
	 * Variable para ingresar el primer apellido del usuario de tipo JTextField. 
	 */
	private JTextField txtLastNameOne = new JTextField();
	/**
	 * Variable para ingresar elsegundo apellido del usuario de tipo JTextField. 
	 */
	private JTextField txtLastNameTwo = new JTextField();
	/**
	 * Variable para ingresar la edad del usuario de tipo JTextField. 
	 */
	private JTextField txtAge = new JTextField();
	/**
	 * Variable para ingresar la contraseña del usuario de tipo JTextField. 
	 */
	private JTextField txtPass = new JTextField();
	/**
	 * Variable para ingresar la confirmación de la contraseña del usuario de tipo JTextField. 
	 */
	private JTextField txtConfirmPass = new JTextField();
	/**
	 * Variable para ingresar el numero de divorcios del usuario de tipo JTextField. 
	 */
	private JTextField txtDivorces = new JTextField();
	/**
	 * Variable para ingresar los ingresos mensuales del usuario de tipo JTextField. 
	 */
	private JTextField txtIncome = new JTextField();
	/**
	 * Variable para ingresar la altura del usuario de tipo JTextField. 
	 */
	private JTextField txtHeight = new JTextField();
	/**
	 * Variable para seleccionar el genero de tipo JComboBox.
	 */
	private JComboBox<String> cmbGender = new JComboBox<String>();
	/**
	 * Variable para seleccionar el dia de nacimiento de tipo JComboBox.
	 */
	private JComboBox<String> cmbBirthDay = new JComboBox<String>();
	/**
	 * Variable para seleccionar el mes de nacimiento de tipo JComboBox.
	 */
	private JComboBox<String> cmbBirthMonth = new JComboBox<String>();
	/**
	 * Variable para seleccionar el año de nacimiento de tipo JComboBox.
	 */
	private JComboBox<String> cmbBirthYear = new JComboBox<String>();
	/**
	 * Variable para envir la información de tipo JButton.
	 */
	private JButton btnRegister = new JButton();
	/**
	 * Variable para regresar a la ventana anterior de tipo JButton.
	 */
	private JButton btnBack = new JButton();
	/**
	 * Variable para subir la foto de perfil del usuario de tipo JButton.
	 */
	private JButton btnPhoto = new JButton();
	/**
	 * Variable para un valor prederterminado de la anchuro de los componentes
	 */
	final int defaultWidth = 200;
	/**
	 * Variable para un valor prederterminado de la altura de los componentes
	 */
	final int defaultHeight = 40;
	/**
	 * Variable de espaciado entre columnas en x
	 */
	final int paddingX = 10;
	/**
	 * Variable de espaciado entre columnas en y
	 */
	final int paddingY = 10;

	/**
	 * Metodo constructor de la ventana RegisterWindow.
	 * <b>pre</b> Los componentes que se van a inicializar debieron ser previamente creados. <br>
	 * <b>post</b> Los componentes fueron inicializados. <br>
	 */
	public RegisterWindow() {

		setSize(880, 740);
		setTitle("Agregar productos");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		initializeComponents();
	}
	/**
	 * Metodo para inicializar los demás metodos de la clase. 
	 * <b>pre</b> Los metodos deben estar creados. <br>
	 * <b>post</b> Los metodos fueron inicializados. <br>
	 */
	private void initializeComponents() {
		addLabels();
		addTextInputs();
		addButtons();
		addComboBoxes();
	}

	
	/**
	 * Este metodo se encarga de añadir los labels de la ventana.
	 * <b>pre</b> Los labels deben estar creados previamente. <br>
	 * <b>post</b> Los labels fueron ajustados de una manera estandar. <br>
	 */
	private void addLabels() {
	
		add(CMcomponents.addLabel(lblBanner, "", 0, 0, 880, 140, SwingConstants.LEFT, "src/imagenes/logo_bostinder_880.png"));

	
		add(CMcomponents.addLabel(lblUsername, "Nombre de usuario", getCol(1), getRow(1), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblEmail, "Correo", getCol(1), getRow(2), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblName, "Nombre", getCol(1), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblLastNameOne, "Primer Apellido", getCol(1), getRow(4), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblLastNameTwo, "Segundo Apellido", getCol(1), getRow(5), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblAge, "Fecha de Nacimiento", getCol(1), getRow(6), defaultWidth, defaultHeight, SwingConstants.LEFT,
				""));
		add(CMcomponents.addLabel(lblPass, "ContraseÃ±a", getCol(1), getRow(7), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblConfirmPass, "Confirmar ContraseÃ±a", getCol(1), getRow(8), defaultWidth,
				defaultHeight, SwingConstants.LEFT, ""));

	
		add(CMcomponents.addLabel(lblGender, "GÃ©nero", getCol(3), getRow(1), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblWomen, "Exclusivo para Mujeres", getCol(3), getRow(2), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblDivorces, "No. de divorcios", getCol(3), getRow(3), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblMen, "Exclusivo para Hombres", getCol(3), getRow(4), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblIncome, "Ingresos Mensuales", getCol(3), getRow(5), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));
		add(CMcomponents.addLabel(lblHeight, "Altura", getCol(3), getRow(6), defaultWidth, defaultHeight,
				SwingConstants.LEFT, ""));

		
		add(CMcomponents.addLabel(lblPhoto, "", getCol(4), getRow(7), defaultWidth, (defaultHeight * 4) + (paddingY * 3),
				SwingConstants.LEFT, "src/imagenes/person_gray.png"));

	}

	/**
	 * Este metodo se encarga de añadir las entradas de texto de la ventana.
	 * <b>pre</b> las entradas de texto deben estar creadas previamente. <br>
	 * <b>post</b> Las entradas fueron ajustadas de una manera estandar. <br>
	 */
	private void addTextInputs() {
		
		add(CMcomponents.addTextInput(txtUsername, "", getCol(2), getRow(1), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtEmail, "", getCol(2), getRow(2), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtName, "", getCol(2), getRow(3), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtLastNameOne, "", getCol(2), getRow(4), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtLastNameTwo, "", getCol(2), getRow(5), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtPass, "", getCol(2), getRow(7), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtConfirmPass, "", getCol(2), getRow(8), defaultWidth, defaultHeight));

		add(CMcomponents.addTextInput(txtDivorces, "", getCol(4), getRow(3), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtIncome, "", getCol(4), getRow(5), defaultWidth, defaultHeight));
		add(CMcomponents.addTextInput(txtHeight, "", getCol(4), getRow(6), defaultWidth, defaultHeight));
	}

	
	/**
	 * Metodo en el que se ajustan las características de los ComboBoxes
	 * <b>pre</b> Los componentes debieron ser inicializados previamente. <br>
	 * <b>post</b> Los componentes fueron inicializados. <br>
	 */
	private void addComboBoxes() {
		cmbGender.setBounds(getCol(4), getRow(1), defaultWidth, defaultHeight);
		cmbGender.addItem("Hombre");
		cmbGender.addItem("Mujer");
		add(cmbGender);

		cmbBirthDay.setBounds(getCol(2), getRow(6), 70, defaultHeight);
		for (int day = 1; day <= 31; day++) {
			cmbBirthDay.addItem(String.valueOf(day));
		}
		add(cmbBirthDay);

		cmbBirthMonth.setBounds(getCol(2) + 60, getRow(6), 70, defaultHeight);
		for (int month = 1; month <= 12; month++) {
			cmbBirthMonth.addItem(String.valueOf(month));
		}
		add(cmbBirthMonth);

		int todayYear = 2022;
		int maxAge = 120;
		cmbBirthYear.setBounds(getCol(2) + 120, getRow(6), 85, defaultHeight);
		for (int year = todayYear; year >= todayYear - maxAge; year--) {
			cmbBirthYear.addItem(String.valueOf(year));
		}
		add(cmbBirthYear);
	}

	/**
	 * Metodo para añadir botones de una manera predeterminada
	 * <b>pre</b> Los componentes deben esatar creados previamente. <br>
	 * <b>post</b> Los componentens fueron inicializados. <br>
	 */
	private void addButtons() {
		add(CMcomponents.addButton(btnPhoto, "Subir foto", getCol(3), getRow(8), defaultWidth, defaultHeight));
		add(CMcomponents.addButton(btnRegister, "Registrarse", getCol(3), getRow(11), defaultWidth, defaultHeight));

		add(CMcomponents.addButton(btnBack, "Volver", getCol(4), getRow(11), defaultWidth, defaultHeight));
	}

	// Function to get row number by integer
	private int getRow(int row) {
		return 160 + ((row - 1) * (defaultHeight + paddingY));
	}
 	// Function to get col number by integer
	private int getCol(int col) {
		return 30 + ((col - 1) * (defaultWidth + paddingX));
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa la variable CMcomponentes. <br>
	 */
	public Components getCMcomponents() {
		return CMcomponents;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param cMcomponents. cMcomponents != null, cMcomponents != " ". <br>
	 */
	public void setCMcomponents(Components cMcomponents) {
		CMcomponents = cMcomponents;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del banner.
	 */
	public JLabel getLblBanner() {
		return lblBanner;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblBanner es el label del banner. lblBanner != null, lblBanner != " ". <br>
	 */
	public void setLblBanner(JLabel lblBanner) {
		this.lblBanner = lblBanner;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del nombre de usuario. 
	 */
	public JLabel getLblUsername() {
		return lblUsername;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblUsername es el label del nombre de usuario. lblUsername != null, lblUsername != " ".
	 */
	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del correo del usuario.
	 */
	public JLabel getLblEmail() {
		return lblEmail;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblEmail es el label del correo del usuario. lblUsername != null, lblUsername != " ". <br>
	 */
	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del nombre real.
	 */
	public JLabel getLblName() {
		return lblName;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblName es el label del nombre real. lblName != null, lblName != " ". <br> 
	 */
	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del primer apellido del usuario.
	 */
	public JLabel getLblLastNameOne() {
		return lblLastNameOne;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblLastNameOne es el label del primer apellido del usuario. lblLastNameOne != null, lblLastNameOne != " ". <br> 
	 */
	public void setLblLastNameOne(JLabel lblLastNameOne) {
		this.lblLastNameOne = lblLastNameOne;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del segundo apellido del usuario.
	 */
	public JLabel getLblLastNameTwo() {
		return lblLastNameTwo;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblLastNameTwo es el label del segundo apellido del usuario. lblLastNameTwo != null, lblLastNameTwo != " ". <br> 
	 */
	public void setLblLastNameTwo(JLabel lblLastNameTwo) {
		this.lblLastNameTwo = lblLastNameTwo;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de la edad.
	 */
	public JLabel getLblAge() {
		return lblAge;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblAge es el label de la edad. lblAge != null, lblAge != " ". <br> 
	 */
	public void setLblAge(JLabel lblAge) {
		this.lblAge = lblAge;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de la contraseña. <br>
	 */
	public JLabel getLblPass() {
		return lblPass;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblPass es el label de la contraseña. lblPass != null, lblPass != " ". <br> 
	 */
	public void setLblPass(JLabel lblPass) {
		this.lblPass = lblPass;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de la confirmación de la contraseña.
	 */
	public JLabel getLblConfirmPass() {
		return lblConfirmPass;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblConfirmPass es el label de la confirmación de la contraseña. lblConfirmPass != null, lblConfirmPass != " ". <br> 
	 */
	public void setLblConfirmPass(JLabel lblConfirmPass) {
		this.lblConfirmPass = lblConfirmPass;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del genero.
	 */
	public JLabel getLblGender() {
		return lblGender;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblGender es el label del genero. lblGender != null, lblGender != " ". <br> 
	 */
	public void setLblGender(JLabel lblGender) {
		this.lblGender = lblGender;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de las preguntas de las mujeres.
	 */
	public JLabel getLblWomen() {
		return lblWomen;
	}	
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblWomen es el label de las preguntas de las mujeres. lblGender != null, lblGender != " ". <br> 
	 */
	public void setLblWomen(JLabel lblWomen) {
		this.lblWomen = lblWomen;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del numero de divorcios.
	 */
	public JLabel getLblDivorces() {
		return lblDivorces;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblDivorces es el label del numero de divorcios. lblDivorces != null, lblDivorces != " ". <br> 
	 */
	public void setLblDivorces(JLabel lblDivorces) {
		this.lblDivorces = lblDivorces;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de las preguntas de los hombres.
	 */
	public JLabel getLblMen() {
		return lblMen;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblMen es el label de las preguntas de los hombres. lblMen != null, lblMen != " ". <br> 
	 */
	public void setLblMen(JLabel lblMen) {
		this.lblMen = lblMen;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de los ingresos mensuales.
	 */
	public JLabel getLblIncome() {
		return lblIncome;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblIncome es el label de los ingresos mensuales. lblIncome != null, lblIncome != " ". <br> 
	 */
	public void setLblIncome(JLabel lblIncome) {
		this.lblIncome = lblIncome;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de la altura.
	 */
	public JLabel getLblHeight() {
		return lblHeight;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblHeight es el label de la altura. lblHeight != null, lblHeight != " ". <br> 
	 */
	public void setLblHeight(JLabel lblHeight) {
		this.lblHeight = lblHeight;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de la foto.
	 */
	public JLabel getLblPhoto() {
		return lblPhoto;
	}	
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblPhoto es el label de la foto. lblPhoto != null, lblPhoto != " ". <br> 
	 */
	public void setLblPhoto(JLabel lblPhoto) {
		this.lblPhoto = lblPhoto;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField del nombre de usuario.
	 */
	public JTextField getTxtUsername() {
		return txtUsername;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtUsername es el JTextField del nombre de usuario. txtUsername != null, txtUsername != " ". <br> 
	 */
	public void setTxtUsername(JTextField txtUsername) {
		this.txtUsername = txtUsername;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField del correo electronico.
	 */
	public JTextField getTxtEmail() {
		return txtEmail;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtEmail es el JTextField del correo electronico. txtEmail != null, txtEmail != " ". <br> 
	 */
	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField del nombre real del usuario.
	 */
	public JTextField getTxtName() {
		return txtName;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtName es  el JTextField del nombre real del usuario. txtName != null, txtName != " ". <br> 
	 */
	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField del primer appelido.
	 */
	public JTextField getTxtLastNameOne() {
		return txtLastNameOne;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtLastNameOne es el JTextField del primer appelido. txtLastNameOne != null, txtLastNameOne != " ". <br>
	 */
	public void setTxtLastNameOne(JTextField txtLastNameOne) {
		this.txtLastNameOne = txtLastNameOne;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField del segundo apellido.
	 */
	public JTextField getTxtLastNameTwo() {
		return txtLastNameTwo;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtLastNameTwo es el JTextField del segundo apellido. txtLastNameTwo != null, txtLastNameTwo != " ". <br>
	 */
	public void setTxtLastNameTwo(JTextField txtLastNameTwo) {
		this.txtLastNameTwo = txtLastNameTwo;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField de la edad.
	 */
	public JTextField getTxtAge() {
		return txtAge;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtAge es el JTextField de la edad. txtAge != null, txtAge != " ". <br>
	 */
	public void setTxtAge(JTextField txtAge) {
		this.txtAge = txtAge;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField de la contraseña.
	 */
	public JTextField getTxtPass() {
		return txtPass;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtPass es el JTextField de la contraseña. txtPass != null, txtPass != " ". <br>
	 */
	public void setTxtPass(JTextField txtPass) {
		this.txtPass = txtPass;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField de la confiramción de la contraseña.
	 */
	public JTextField getTxtConfirmPass() {
		return txtConfirmPass;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtConfirmPass es el JTextField de la confiramción de la contraseña. txtConfirmPass != null, txtConfirmPass != " ". <br>
	 */
	public void setTxtConfirmPass(JTextField txtConfirmPass) {
		this.txtConfirmPass = txtConfirmPass;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField es el numero de divorcios.
	 */
	public JTextField getTxtDivorces() {
		return txtDivorces;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtDivorces es el JTextField es el numero de divorcios. txtDivorces != null, txtDivorces != " ". <br>
	 */
	public void setTxtDivorces(JTextField txtDivorces) {
		this.txtDivorces = txtDivorces;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField de los ingresos mensuales.
	 */
	public JTextField getTxtIncome() {
		return txtIncome;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtIncome es el JTextField de los ingresos mensuales. txtIncome != null, txtIncome != " ". <br>
	 */
	public void setTxtIncome(JTextField txtIncome) {
		this.txtIncome = txtIncome;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JTextField de la altura.
	 */
	public JTextField getTxtHeight() {
		return txtHeight;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txtHeight es el JTextField de la altura. txtHeight != null, txtHeight != " ". <br>
	 */
	public void setTxtHeight(JTextField txtHeight) {
		this.txtHeight = txtHeight;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JComboBox del genero.
	 */
	public JComboBox<String> getCmbGender() {
		return cmbGender;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param cmbGender es el JComboBox del genero. cmbGender != null, cmbGender != " ". <br>
	 */
	public void setCmbGender(JComboBox<String> cmbGender) {
		this.cmbGender = cmbGender;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JComboBox del dia de nacimiento. 
	 */
	public JComboBox<String> getCmbBirthDay() {
		return cmbBirthDay;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param cmbBirthDay es el JComboBox del dia de nacimiento. cmbBirthDay != null, cmbBirthDay != " ". <br>
	 */
	public void setCmbBirthDay(JComboBox<String> cmbBirthDay) {
		this.cmbBirthDay = cmbBirthDay;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JComboBox del mes de nacimiento.
	 */
	public JComboBox<String> getCmbBirthMonth() {
		return cmbBirthMonth;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param cmbBirthMonth es el JComboBox del mes de nacimiento. cmbBirthMonth != null, cmbBirthMonth != " ". <br>
	 */
	public void setCmbBirthMonth(JComboBox<String> cmbBirthMonth) {
		this.cmbBirthMonth = cmbBirthMonth;
	}	
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el JComboBox del año de nacimiento.
	 */
	public JComboBox<String> getCmbBirthYear() {
		return cmbBirthYear;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param cmbBirthYear es el JComboBox del año de nacimiento. cmbBirthYear != null, cmbBirthYear != " ". <br>
	 */
	public void setCmbBirthYear(JComboBox<String> cmbBirthYear) {
		this.cmbBirthYear = cmbBirthYear;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton para enviar la información.
	 */
	public JButton getBtnRegister() {
		return btnRegister;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param btnRegister es el boton para enviar la información. cmbBirthYear != null, cmbBirthYear != " ". <br>
	 */
	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}	
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton de regresar a la ventana anterior.
	 */
	public JButton getBtnBack() {
		return btnBack;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param btnBack es el boton de regresar a la ventana anterior. btnBack != null, btnBack != " ". <br>
	 */
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton para subir la imagen de perfil.
	 */
	public JButton getBtnPhoto() {
		return btnPhoto;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param btnPhoto es el boton para subir la imagen de perfil. btnBack != null, btnBack != " ". <br>
	 */
	public void setBtnPhoto(JButton btnPhoto) {
		this.btnPhoto = btnPhoto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el tamaño predeterminado de la anchura para los componentes.
	 */
	public int getDefaultWidth() {
		return defaultWidth;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el tamaño predeterminado de la altura para los componentes.
	 */
	public int getDefaultHeight() {
		return defaultHeight;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el tamaño predeterminado entre el esapciado de columnas en X
	 */
	public int getPaddingX() {
		return paddingX;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el tamaño predeterminado entre el esapciado de columna en Y
	 */
	public int getPaddingY() {
		return paddingY;
	}

}
