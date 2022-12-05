package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class VentanaAdmin extends JFrame{ //hereda de ...

	private JButton stadistic, delete,show_asc,show_dec,filter;
	private JButton exit2, volver_adm;
	private  PanelImagenAdmin pad;
	
	/**
	 * 
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

	public void inicializar() {
		pad = new PanelImagenAdmin();
		pad.setBorder(new EmptyBorder(5,5,5,5));
		pad.setLayout(null);
		setContentPane(pad);

		stadistic  = new JButton("Estadisticas");
		stadistic.setActionCommand("Estadisticas");
		stadistic.setBorderPainted(true);
		stadistic.setContentAreaFilled(true);
		stadistic.setBounds(225, 25, 145, 50);
		stadistic.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(stadistic);
		
		delete  = new JButton("Delete");
		delete.setActionCommand("borrar");
		delete.setBorderPainted(true);
		delete.setContentAreaFilled(true);
		delete.setBounds(400, 100, 150, 50);
		delete.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(delete);
		
		show_asc  = new JButton("Show ascendent");
		show_asc.setActionCommand("mostrarAsc");
		show_asc.setBorderPainted(true);
		show_asc.setContentAreaFilled(true);
		show_asc.setBounds(225, 200, 185, 50);
		show_asc.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(show_asc);

	
		filter  = new JButton("Filter");
		filter.setActionCommand("Filtrarr");
		filter.setBorderPainted(true);
		filter.setContentAreaFilled(true);
		filter.setBounds(400, 300, 125, 50);
		filter.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(filter);	
		
		
		show_dec  = new JButton("Mostrar desc");
		show_dec.setActionCommand("mostrarDEC");
		show_dec.setBorderPainted(true);
		show_dec.setContentAreaFilled(true);
		show_dec.setBounds(225, 400, 185, 50);
		show_dec.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(show_dec);
		
		exit2  = new JButton("Salir");
		exit2.setActionCommand("EXIT2");
		exit2.setBorderPainted(true);
		exit2.setContentAreaFilled(true);
		exit2.setBounds(25, 500, 100, 45);
		exit2.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(exit2);	
		
		volver_adm  = new JButton("Volver");
		volver_adm.setActionCommand("returnAdm");
		volver_adm.setBorderPainted(true);
		volver_adm.setContentAreaFilled(true);
		volver_adm.setBounds(150, 500, 100, 45);
		volver_adm.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(volver_adm);		
		
		
	}

	public JButton getStadistic() {
		return stadistic;
	}

	public void setStadistic(JButton stadistic) {
		this.stadistic = stadistic;
	}

	public JButton getDelete() {
		return delete;
	}

	public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public JButton getShow_asc() {
		return show_asc;
	}

	public void setShow_asc(JButton show_asc) {
		this.show_asc = show_asc;
	}

	public JButton getShow_dec() {
		return show_dec;
	}

	public void setShow_dec(JButton show_dec) {
		this.show_dec = show_dec;
	}

	public JButton getFilter() {
		return filter;
	}

	public void setFilter(JButton filter) {
		this.filter = filter;
	}

	public PanelImagenAdmin getPad() {
		return pad;
	}

	public void setPad(PanelImagenAdmin pad) {
		this.pad = pad;
	}

	public JButton getExit2() {
		return exit2;
	}

	public void setExit2(JButton exit2) {
		this.exit2 = exit2;
	}

	public JButton getVolver_adm() {
		return volver_adm;
	}

	public void setVolver_adm(JButton volver_adm) {
		this.volver_adm = volver_adm;
	}
	

}
