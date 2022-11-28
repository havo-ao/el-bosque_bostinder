package co.edu.unbosque.views;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author sofia
 *
 */

public class PanelImgGuia  extends JPanel implements PanelImagenI{
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
	 * Metodo constructor de panelImagenFondo
	 */
	 public PanelImgGuia() {
		this.setSize(getPreferredSize()); //esto es pa que se ajuste
	}
		@Override
	public void paintComponent(Graphics g) { //este metodo es para ponerla de fonde
		Dimension tam = getSize();
		img_fon = new ImageIcon(getClass().getResource("/imagenes/couple.png"));
		g.drawImage(img_fon.getImage(), 0, 0, tam.width,tam.height,null );
		setOpaque(false); 
		super.paintComponent(g);
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
