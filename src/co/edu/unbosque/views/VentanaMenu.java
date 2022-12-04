/**
 * Este paquete corresponde a la parte grafica
 */
package co.edu.unbosque.views;
/**
 * Se genera cuando se llama al código que depende de un teclado,
 *  una pantalla o un mouse en un entorno que no admite un teclado, una pantalla o un mouse.
 */
import java.awt.Color;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**

 * Esta es la clase de la ventana del menu del programa. <br>
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class VentanaMenu extends JFrame{
	/**
	 * Objeto pim de tipo PanelImgGuia. <br>
	 */
	private PanelImgGuia pim;
	/**
	 * Objeto admin de tipo JButton. <br>
	 */
	private JButton admin; 
	/**
	 * Objeto user y volver de tipo JButton. <br>
	 */
	private JButton user, volver;
	
	/**
	 * Metodo que crea e inicializa la ventana del menú. <br>
	 * <b>pre</b> Se hace el llamado de la clase. <br>
	 * <b>post</b> Se ha inicializado la ventana del menú. <br>
	 */
	public VentanaMenu() {

		setSize(742,595);
		setTitle("Menu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //pa que no se expanda
		inicializar();
		setLocationRelativeTo(null);


		setVisible(false);
	}
	/**
	 * Metodo que permite iniciliar los componentes graficos de la clase
	 * <b>pre</b> Los objetos debieron ser creados previamente. <br>
	 * <b>post</b> Se inicializa cada componente de la clase. <br>
	 */
	public void inicializar() {
		pim = new PanelImgGuia();
		pim.setBorder(new EmptyBorder(5,5,5,5)); //transparente
		pim.setLayout(null); //coordenadas
		setContentPane(pim);

		user = new JButton("USER");
		user.setActionCommand("usuario");
		//user.setEnabled(false);
		user.setBackground(new Color(22, 20, 20));
		user.setForeground(new Color(255,255,255));
		user.setFont(new Font("Calisto MT",Font.BOLD,25));
		user.setBounds(40,40,130,65);
		add(user);

		admin = new JButton("ADMIN");
		admin.setActionCommand("adminis");
		admin.setBackground(new Color(22, 20, 20));
		admin.setForeground(new Color(255,255,255));
		admin.setFont(new Font("Calisto MT",Font.BOLD,25));
		admin.setBounds(550,350,130,50);
		add(admin);

		volver = new JButton("Return");
		volver.setActionCommand("Volver1");
		volver.setBackground(new Color(22, 20, 20));
		volver.setForeground(new Color(255,255,255));
		volver.setFont(new Font("Calisto MT",Font.BOLD,20));
		volver.setBounds(600,500,100,50);
		add(volver);
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto de tipo PanelImgGuia, nombrado como pim. <br>
	 */
	public PanelImgGuia getPim() {
		return pim;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param pim es el es el panel del imagen de fondo. pim != null, pim != " ". <br>
	 */
	public void setPim(PanelImgGuia pim) {
		this.pim = pim;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto de tipo JButton, nombrado como admin. <br>
	 */
	public JButton getAdmin() {
		return admin;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param admin es el botón para acceder al perfil del administrador. admin != null, admin != " ". <br>
	 */
	public void setAdmin(JButton admin) {
		this.admin = admin;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Rgeresa el objeto user de tipo JButton. <br>
	 */
	public JButton getUser() {
		return user;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param user es el botón para acceder al perfil del usuario. user != null, user != " ". <br>
	 */
	public void setUser(JButton user) {
		this.user = user;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto volver de tipo JButton. <br>
	 */
	public JButton getVolver() {
		return volver;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable. <br>
	 * @param volver es el botón para retrocedder a la ventana principal. volver != null, volver != " ". <br>
	 */
	public void setVolver(JButton volver) {
		this.volver = volver;
	}



}
