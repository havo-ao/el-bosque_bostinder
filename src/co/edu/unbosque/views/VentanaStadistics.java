package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Esta clase es la ventana de las estadisicas del programa. <br>
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Alfaro
 *
 */
public class VentanaStadistics extends JFrame{
	/**
	 * Objeto para crear los informes de tipo JButton.
	 */
	private JButton estadisticaGen;
	/**
	 * Objeto para ver las estadisticas de los usuarios de tipo JButton.
	 */
	private JButton estadisticaPersonal;
	/**
	 * Objeto modificar perfil de tipo JButton.
	 */
	private JButton modifyP ;
	/**
	 * Objeto para volver a la ventana anterior de tipo JButton.
	 */
	private JButton volverEs;
	/**
	 * Metodo que crea e inicializa la ventana de estadisticas. 
	 * <b>pre</b> Se hace el llamado de la clase. <br>
	 * <b>post</b> Se ha inicializado la ventana de estadisticas. <br>
	 */
	public VentanaStadistics() {
		setSize(386,300);
		setTitle("Menu2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //pa que no se expanda
		inicializar();
		setLocationRelativeTo(null);
		setBackground(new Color(248, 228, 230));
		setLayout(null);
		setVisible(false);
	}
	/**
	 * Metodo que permite iniciliar los componentes graficos de la clase
	 * <b>pre</b> Los objetos debieron ser creados previamente. <br>
	 * <b>post</b> Se inicializa cada componente de la clase. <br>
	 */
	private void inicializar() {
		estadisticaPersonal = new JButton("Personal");
		estadisticaPersonal.setActionCommand("personal");  //ACTIONCOMMANDD DE PERSONAL
		estadisticaPersonal.setBorderPainted(true);
		estadisticaPersonal.setContentAreaFilled(true);
		estadisticaPersonal.setForeground(new Color(255,255,255));
		estadisticaPersonal.setBackground(new Color(22, 20, 20));
		estadisticaPersonal.setBounds(30, 40, 90, 50);
		estadisticaPersonal.setFont(new Font("Calisto MT",Font.BOLD,12));
		add(estadisticaPersonal);

		estadisticaGen = new JButton("GENERAL");
		estadisticaGen.setActionCommand("Actgeneral"); //PARA GENERAL
		estadisticaGen.setBorderPainted(true);
		estadisticaGen.setContentAreaFilled(true);
		estadisticaGen.setForeground(new Color(255,255,255));
		estadisticaGen.setBackground(new Color(22, 20, 20));
		estadisticaGen.setBounds(230, 40, 96, 50);
		estadisticaGen.setFont(new Font("Calisto MT",Font.BOLD,12));
		add(estadisticaGen);
		
		modifyP = new JButton("Modificar Persona");
		modifyP.setActionCommand("modify"); //PARA Modificar
		modifyP.setBorderPainted(true);
		modifyP.setContentAreaFilled(true);
		modifyP.setForeground(new Color(255,255,255));
		modifyP.setBackground(new Color(22, 20, 20));
		modifyP.setBounds(100, 125, 150, 50);
		modifyP.setFont(new Font("Calisto MT",Font.BOLD,12));
		add(modifyP);
		
		volverEs = new JButton("Volver");
		volverEs.setActionCommand("volverEstadistic1"); //PARA Modificar
		volverEs.setBorderPainted(true);
		volverEs.setContentAreaFilled(true);
		volverEs.setForeground(new Color(255,255,255));
		volverEs.setBackground(new Color(22, 20, 20));
		volverEs.setBounds(260, 200, 75, 50);
		volverEs.setFont(new Font("Calisto MT",Font.BOLD,12));
		add(volverEs);

	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el botón que crea los informes.
	 */
	public JButton getEstadisticaGen() {
		return estadisticaGen;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param estadisticaGen es el boton para crear los informes. estadisticaGen != null, estadisticaGen != " ". <br>
	 */
	public void setEstadisticaGen(JButton estadisticaGen) {
		this.estadisticaGen = estadisticaGen;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton para ver las estadisticas de los usuarios.
	 */
	public JButton getEstadisticaPersonal() {
		return estadisticaPersonal;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param estadisticaPersonal es el boton para ver las estadisticas de los usuarios. estadisticaPersonal != null, estadisticaPersonal != " ". <br>
	 */
	public void setEstadisticaPersonal(JButton estadisticaPersonal) {
		this.estadisticaPersonal = estadisticaPersonal;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton modificar perfil de un usuario.
	 */
	public JButton getModifyP() {
		return modifyP;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param modifyP es el boton modificar perfil de un usuario. estadisticaPersonal != null, estadisticaPersonal != " ". <br>
	 */
	public void setModifyP(JButton modifyP) {
		this.modifyP = modifyP;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el boton para volver a la ventana anterior.
	 */
	public JButton getVolverEs() {
		return volverEs;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param volverEs  es el boton para volver a la ventana anterior. estadisticaPersonal != null, estadisticaPersonal != " ". <br>
	 */
	public void setVolverEs(JButton volverEs) {
		this.volverEs = volverEs;
	}
	
	
}
