package co.edu.unbosque.views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
/**
 * Esta clase es la Ventana de usuario
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Alfaro
 *
 */
public class UserWindowApp extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Variable para la imagen del usuario de tipo PanelImagenPersona.
	 */
	private PanelImagenPersona panelPersona;
	/**
	 * Variables para indicar like o dislike de tipo botón.
	 */
	private JButton like, dislike;
	/**
	 * Variable para salir de la ventana o para avanzar a otro perfil. 
	 */
	private JButton salir,siguiente;
	/**
	 * Variable de tipo label, para mostar el nombre, edad.
	 */
	private JLabel lblName,txt1, age, txt2;
	/**
	 * Metodo que crea e inicializa la ventana de usuario. 
	 * <b>pre</b> Se hace el llamado de la clase. <br>
	 * <b>post</b> Se ha inicializado la ventana de usuario. <br>
	 */
	public UserWindowApp() {
		setSize(746, 596); 
		setTitle("Bostinder APP"); //titulo esqu
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pa que se pueda cerrar
		setResizable(false); //pa que no se expanda
		setLayout(null);

		inicializar();

		setLocationRelativeTo(null);//centrar
		//	getContentPane().setBackground(new Color(255,182,175));

		setVisible(false);

	}
	/**
	 * Metodo que permite iniciliar los componentes graficos de la clase
	 * <b>pre</b> Los objetos debieron ser creados previamente. <br>
	 * <b>post</b> Se inicializa cada componente de la clase. <br>
	 */
	public void inicializar() {

		panelPersona = new PanelImagenPersona();
		panelPersona.setBounds(10,10, 400, 400);
		add(panelPersona);

		like = new JButton("LIKE");
		like.setActionCommand("match");
		like.setFocusPainted(true); //para pintar
		like.setBorderPainted(true);
		like.setContentAreaFilled(true); //pq despues sale vacio y f
		like.setForeground(new Color(255,255,255));//color letra
		like.setBackground(new Color(22, 20, 20));
		like.setBounds(420,34,70,50);
		add(like);

		dislike = new JButton("noks");
		dislike.setActionCommand("NOTLIKED");
		dislike.setFocusPainted(true); //para pintar
		dislike.setBorderPainted(true);
		dislike.setContentAreaFilled(true); //pq despues sale vacio y f
		dislike.setBounds(550, 456, 100,55);
		dislike.setForeground(new Color(255,255,255));//color letra
		dislike.setBackground(new Color(22, 20, 20));
		dislike.setBounds(420,150,70,50);
		add(dislike);

		lblName = new JLabel("Name:");
		lblName.setBounds(10,400,100,100);
		add(lblName);

		txt1 = new JLabel();
		txt1.setBounds(40,400,100,100);
		add(txt1);

		age = new JLabel("Age:");
		age.setBounds(10,440,100,100);
		add(age);

		txt2 = new JLabel();
		txt2.setBounds(40,440,100,100);
		add(txt2);

		siguiente = new JButton("Next");
		siguiente.setActionCommand("SalirMatch"); //poderlo usar despues
		//	log.setEnabled(true);//poder interactuar
		siguiente.setFocusPainted(true); //para pintar
		siguiente.setBorderPainted(true);
		siguiente.setContentAreaFilled(true); //pq despues sale vacio y f
		siguiente.setBounds(550, 400, 100,55);
		siguiente.setForeground(new Color(255,255,255));//color letra
		siguiente.setBackground(new Color(22, 20, 20));
		add(siguiente);


		salir = new JButton("Salir");
		salir.setActionCommand("SalirMatch"); //poderlo usar despues
		//	log.setEnabled(true);//poder interactuar
		salir.setFocusPainted(true); //para pintar
		salir.setBorderPainted(true);
		salir.setContentAreaFilled(true); //pq despues sale vacio y f
		salir.setBounds(550, 456, 100,55);
		salir.setForeground(new Color(255,255,255));//color letra
		salir.setBackground(new Color(22, 20, 20));
		add(salir);
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el panel donde se encuentra la imagen del usuario.
	 */
	public PanelImagenPersona getPanelPersona() {
		return panelPersona;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param panelPersona es el panel donde se encuentra la imagen del usuario. panelPersona != null, panelPersona != " ". <br>
	 */
	public void setPanelPersona(PanelImagenPersona panelPersona) {
		this.panelPersona = panelPersona;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton para inidicar un like.
	 */
	public JButton getLike() {
		return like;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param like es el boton para inidicar un like. like != null, like != " ". <br>
	 */
	public void setLike(JButton like) {
		this.like = like;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Rgeresa el boton para indicar un dislike.
	 */
	public JButton getDislike() {
		return dislike;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param dislike el boton para indicar un dislike. dislike != null, dislike != " ". <br>
	 */
	public void setDislike(JButton dislike) {
		this.dislike = dislike;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Rgeresa el boton para volver a la pagina anterior.
	 */
	public JButton getSalir() {
		return salir;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param salir es el boton para volver a la pagina anterior. salir != null, salir != " ". <br>
	 */
	public void setSalir(JButton salir) {
		this.salir = salir;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton para avanzar al siguiente usuario.
	 */
	public JButton getSiguiente() {
		return siguiente;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param siguiente es el boton para avanzar al siguiente usuario. siguiente != null, siguiente != " ". <br>
	 */
	public void setSiguiente(JButton siguiente) {
		this.siguiente = siguiente;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del nombre del usuario.
	 */
	public JLabel getLblName() {
		return lblName;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param lblName es el label del nombre del usuario. name != null, name != " ". <br>
	 */
	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label del texto 1.
	 */
	public JLabel getTxt1() {
		return txt1;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txt1 es el label del texto 1. txt1 != null, txt1 != " ". <br>
	 */
	public void setTxt1(JLabel txt1) {
		this.txt1 = txt1;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el label de la edad del usuario.
	 */
	public JLabel getAge() {
		return age;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param age es el label de de la edad del usuario. age != null, age != " ". <br>
	 */
	public void setAge(JLabel age) {
		this.age = age;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Rgeresa el label del texto 2.
	 */
	public JLabel getTxt2() {
		return txt2;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param txt2 es el label del texto 2. txt2 != null, txt2 != " ". <br>
	 */
	public void setTxt2(JLabel txt2) {
		this.txt2 = txt2;
	}
	
}
