package co.edu.unbosque.views;

import java.awt.Color;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**
 * Esta es la clase de la ventana del perfil del administrador. <br>
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Alfaro
 *
 */
public class VentanaAdmin extends JFrame{ //hereda de ...
	/**
	 * Objetos stadistic, delete,show_asc,show_dec,filter, de tipo JButton. 
	 */
	private JButton stadistic, delete,show_asc,show_dec,filter;
	/**
	 * Objetos exit2, volver_adm de tipo JButton.
	 */
	private JButton exit2, volver_adm;
	/**
	 * Objeto pad de tipo PanelImagenAdmin.
	 */
	private PanelImagenAdmin pad;
	
	/**
	 * Metodo que crea e inicializa la ventana del administrador. 
	 * <b>pre</b> Se hace el llamado de la clase. <br>
	 * <b>post</b> Se ha inicializado la ventana del administrador. <br>
	 */
	public VentanaAdmin() {
		setSize(746, 596); 
		setTitle("Bostinder APP"); //titulo esqu
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pa que se pueda cerrar
		setResizable(false); //pa que no se expanda
		inicializar();
		setLocationRelativeTo(null);//centrar


		setVisible(false);
	}
	/**
	 * Metodo que permite iniciliar los componentes graficos de la clase
	 * <b>pre</b> Los objetos debieron ser creados previamente. <br>
	 * <b>post</b> Se inicializa cada componente de la clase. <br>
	 */
	public void inicializar() {
		pad = new PanelImagenAdmin();
		pad.setBorder(new EmptyBorder(5,5,5,5));
		pad.setLayout(null);
		setContentPane(pad);

		stadistic  = new JButton("Estadisticas");
		stadistic.setActionCommand("Estadisticas");
		stadistic.setBorderPainted(true);
		stadistic.setContentAreaFilled(true);
		stadistic.setForeground(new Color(255,255,255));
		stadistic.setBackground(new Color(22, 20, 20));
		stadistic.setBounds(225, 25, 145, 50);
		stadistic.setFont(new Font("Calisto MT",Font.BOLD,18));
		add(stadistic);
		
		delete  = new JButton("Delete");
		delete.setActionCommand("borrar");
		delete.setBorderPainted(true);
		delete.setContentAreaFilled(true);
		delete.setForeground(new Color(255,255,255));
		delete.setBackground(new Color(22, 20, 20));
		delete.setBounds(400, 100, 150, 50);
		delete.setFont(new Font("Calisto MT",Font.BOLD,18));
		add(delete);
		
		show_asc  = new JButton("Show ascendent");
		show_asc.setActionCommand("mostrarAsc");
		show_asc.setBorderPainted(true);
		show_asc.setContentAreaFilled(true);
		show_asc.setForeground(new Color(255,255,255));
		show_asc.setBackground(new Color(22, 20, 20));
		show_asc.setBounds(225, 200, 185, 50);
		show_asc.setFont(new Font("Calisto MT",Font.BOLD,18));
		add(show_asc);

	
		filter  = new JButton("Filter");
		filter.setActionCommand("Filtrarr");
		filter.setBorderPainted(true);
		filter.setContentAreaFilled(true);
		filter.setForeground(new Color(255,255,255));
		filter.setBackground(new Color(22, 20, 20));
		filter.setBounds(400, 300, 125, 50);
		filter.setFont(new Font("Calisto MT",Font.BOLD,18));
		add(filter);	
		
		
		show_dec  = new JButton("Show descendent");
		show_dec.setActionCommand("mostrarDEC");
		show_dec.setBorderPainted(true);
		show_dec.setContentAreaFilled(true);
		show_dec.setForeground(new Color(255,255,255));
		show_dec.setBackground(new Color(22, 20, 20));
		show_dec.setBounds(225, 400, 185, 50);
		show_dec.setFont(new Font("Calisto MT",Font.BOLD,18));
		add(show_dec);
		
		exit2  = new JButton("Exit");
		exit2.setActionCommand("EXIT2");
		exit2.setBorderPainted(true);
		exit2.setContentAreaFilled(true);
		exit2.setForeground(new Color(255,255,255));
		exit2.setBackground(new Color(22, 20, 20));
		exit2.setBounds(25, 500, 100, 45);
		exit2.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(exit2);	
		
		volver_adm  = new JButton("Return");
		volver_adm.setActionCommand("returnAdm");
		volver_adm.setBorderPainted(true);
		volver_adm.setContentAreaFilled(true);
		volver_adm.setForeground(new Color(255,255,255));
		volver_adm.setBackground(new Color(22, 20, 20));
		volver_adm.setBounds(150, 500, 100, 45);
		volver_adm.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(volver_adm);		
		
		
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto stadistic de tipo JButton. <br>
	 */
	public JButton getStadistic() {
		return stadistic;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param stadistic es el botón para acceder a ls estadisitcas. stadistic != null, stadistic != " ". <br>
	 */
	public void setStadistic(JButton stadistic) {
		this.stadistic = stadistic;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto delete de tipo JButton. <br>
	 */
	public JButton getDelete() {
		return delete;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param delete es el botón para eliminar un usuario. delete != null, delete != " ". <br>
	 */
	public void setDelete(JButton delete) {
		this.delete = delete;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto show_asc JButton. <br>
	 */
	public JButton getShow_asc() {
		return show_asc;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param show_asc es el botón para mostrar los usuarios de forma ascendente. show_asc != null, show_asc != " ". <br>
	 */
	public void setShow_asc(JButton show_asc) {
		this.show_asc = show_asc;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto show_asc JButton. <br>
	 */
	public JButton getShow_dec() {
		return show_dec;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param show_dec es el botón para mostrar los usuarios de forma descendente. show_dec != null, show_dec != " ". <br>
	 */
	public void setShow_dec(JButton show_dec) {
		this.show_dec = show_dec;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto filter JButton. <br>
	 */
	public JButton getFilter() {
		return filter;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param filter es el botón para filtrar los usuarios. filter != null, filter != " ". <br>
	 */
	public void setFilter(JButton filter) {
		this.filter = filter;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto pad JButton. <br>
	 */
	public PanelImagenAdmin getPad() {
		return pad;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param pad es el botón para los usuarios. pad != null, pad != " ". <br>
	 */
	public void setPad(PanelImagenAdmin pad) {
		this.pad = pad;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto exit2 JButton. <br>
	 */
	public JButton getExit2() {
		return exit2;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param exit2 es el botón para los usuarios. exit2 != null, exit2 != " ". <br>
	 */
	public void setExit2(JButton exit2) {
		this.exit2 = exit2;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto volver_adm JButton. <br>
	 */
	public JButton getVolver_adm() {
		return volver_adm;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @param volver_adm es el botón para los usuarios. exit2 != null, exit2 != " ". <br>
	 */
	public void setVolver_adm(JButton volver_adm) {
		this.volver_adm = volver_adm;
	}
	

}
