package co.edu.unbosque.views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class VentanaSelectionSort extends JFrame{
	private static final long serialVersionUID = 1L;

	//	private Components components = new Components();
	//	final int defaultWidth = 200;
	//	final int defaultHeight = 40;
	//
	//	final int paddingX = 10;
	//	final int paddingY = 10;

	private JButton volver;
	private PanelSelectionSort panelSeleccion;

	public VentanaSelectionSort() {
		setSize(746, 596);
		setTitle("Seleccion");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setVisible(false);
		initializeComponents();

	}
	private void initializeComponents() {
		panelSeleccion = new PanelSelectionSort();
		panelSeleccion.setBounds(10,10, 400, 400);

		add(panelSeleccion);

		volver = new JButton("Volver4");
		volver.setActionCommand("VolverSelection");
		volver.setFocusPainted(true); //para pintar
		volver.setBorderPainted(true);
		volver.setContentAreaFilled(true); //pq despues sale vacio y f
		volver.setBounds(550, 456, 100,55);

		add(volver);

	}
	public JButton getVolver() {
		return volver;
	}
	public void setVolver(JButton volver) {
		this.volver = volver;
	}
	public PanelSelectionSort getPanelSeleccion() {
		return panelSeleccion;
	}
	public void setPanelSeleccion(PanelSelectionSort panelSeleccion) {
		this.panelSeleccion = panelSeleccion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
