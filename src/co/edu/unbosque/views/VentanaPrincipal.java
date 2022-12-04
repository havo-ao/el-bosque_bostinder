package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**
 * Esta clase es de la ventana principal del programa<br>
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class VentanaPrincipal extends JFrame {
	/**
	 * Objeto pimg de tipo PanelImagenFondo
	 */
	private PanelImagenFondo pimg;
	/**
	 * Objeto register de tipo JButton
	 */
	private JButton register;
	/**
	 * Objeto log de tipo JButton
	 */
	private JButton log;

	/**
	 * Metodo que crea e inicializa la ventana principal. 
	 * <b>pre</b> Se hace el llamado de la clase. <br>
	 * <b>post</b> Se ha inicializado la ventana principal. <br>
	 */
	public VentanaPrincipal() {
		setSize(746, 596); 
		setTitle("Bostinder APP"); //titulo esqu
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pa que se pueda cerrar
		setResizable(false); //pa que no se expanda
		inicializar();
		setLocationRelativeTo(null);//centrar
		
		
		setVisible(true);
	}

	/**
	 * Metodo que permite iniciliar los componentes graficos de la clase
	 * <b>pre</b> Los objetos debieron ser creados previamente. <br>
	 * <b>post</b> Se inicializa cada componente de la clase. <br>
	 */
	public void inicializar() {

		pimg = new PanelImagenFondo();
		pimg.setBorder(new EmptyBorder(5,5,5,5)); //transparente
		pimg.setLayout(null); //coordenadas
		setContentPane(pimg);

		register = new JButton("Register");
		register.setActionCommand("Registrar"); //poderlo usar despues
		register.setEnabled(true);//poder interactuar
		register.setFocusPainted(true); //para pintar
		register.setBorderPainted(true);
		register.setContentAreaFilled(true); //pq despues sale vacio y f
		register.setBounds(456, 156, 165,55);
		register.setForeground(new Color(255,255,255));//color letra
		register.setBackground(new Color(22, 20, 20));
		register.setFont(new Font("Calisto MT",Font.BOLD,30));
		add(register);
		
		log = new JButton("Log in");
		log.setActionCommand("logging"); //poderlo usar despues
	//	log.setEnabled(true);//poder interactuar
		log.setFocusPainted(true); //para pintar
		log.setBorderPainted(true);
		log.setContentAreaFilled(true); //pq despues sale vacio y f
		log.setBounds(456, 356, 165,55);
		log.setForeground(new Color(255,255,255));//color letra
		log.setBackground(new Color(22, 20, 20));
		log.setFont(new Font("Calisto MT",Font.BOLD,25)); //SansSerif
		add(log);
	}

	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto de tipo PanelImagenFondo nombrado como pimg. <br>
	 */
	public PanelImagenFondo getPimg() {
		return pimg;
	}

	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param pimg es el panel de la imagen de fondo. pimg != null, pimg != " ". <br>
	 */
	public void setPimg(PanelImagenFondo pimg) {
		this.pimg = pimg;
	}

	/**
	 /**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada, <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto de tipo JButton nombrado como register. <br>
	 */
	public JButton getRegister() {
		return register;
	}

	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param register es el botón para acceder al registro de usuario. register != null, register != " ". <br>
	 */
	public void setRegister(JButton register) {
		this.register = register;
	}

	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada, <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto de tipo JButton nombrado como log. <br>
	 */
	public JButton getLog() {
		return log;
	}

	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param log es el botón para acceder al inicio de seión. log != null, log != " ". <br>
	 */
	public void setLog(JButton log) {
		this.log = log;
	}

}
