package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelImagenPersona extends JPanel {

	/**
	 *  Variable tipo Dimension
	 */
	private Dimension tam; 
	/**
	 *  Variable tipo ImageIcon
	 */
	private ImageIcon img_fon;
	/**
	 *  Variable tipo JLabel
	 */
	private JLabel label;
	/**
	 * Metodo constructor de panelImagenPersona
	 */
	public PanelImagenPersona() {
		// TODO Auto-generated constructor stub{
		this.setSize(400,400);
		setLayout(new GridLayout(1,2));
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) { //este metodo es para ponerla de fonde
		Dimension tam = getSize();
		img_fon = new ImageIcon(getClass().getResource("/imagenes/girl.jpg"));
		g.drawImage(img_fon.getImage(), 0, 0, tam.width,tam.height,null );
		setOpaque(false); 
		//super.paintComponent(g);
	}

	public Dimension getTam() {
		return tam;
	}

	public void setTam(Dimension tam) {
		this.tam = tam;
	}

	public ImageIcon getImg_fon() {
		return img_fon;
	}

	public void setImg_fon(ImageIcon img_fon) {
		this.img_fon = img_fon;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
}


