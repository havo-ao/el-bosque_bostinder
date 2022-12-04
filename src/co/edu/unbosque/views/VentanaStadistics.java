package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaStadistics extends JFrame{

	private JButton estadisticaGen;
	private JButton estadisticaPersonal;
	private JButton modifyP ;
	private JButton volverEs;

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

	public JButton getEstadisticaGen() {
		return estadisticaGen;
	}

	public void setEstadisticaGen(JButton estadisticaGen) {
		this.estadisticaGen = estadisticaGen;
	}

	public JButton getEstadisticaPersonal() {
		return estadisticaPersonal;
	}

	public void setEstadisticaPersonal(JButton estadisticaPersonal) {
		this.estadisticaPersonal = estadisticaPersonal;
	}

	public JButton getModifyP() {
		return modifyP;
	}

	public void setModifyP(JButton modifyP) {
		this.modifyP = modifyP;
	}

	public JButton getVolverEs() {
		return volverEs;
	}

	public void setVolverEs(JButton volverEs) {
		this.volverEs = volverEs;
	}
	
	
}
