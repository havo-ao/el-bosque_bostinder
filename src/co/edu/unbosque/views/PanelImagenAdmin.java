package co.edu.unbosque.views;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Esta clase es para poner la imagen de fondo
 * @author sofia
 *
 */
public class PanelImagenAdmin extends JPanel implements PanelImagenI{

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
	 * Metodo constructor de panelImagenAdmin
	 */
	public PanelImagenAdmin() {
		this.setSize(getPreferredSize());
	}

	@Override
	public void paintComponent(Graphics g) {
		Dimension tam = getSize();
		img_fon = new ImageIcon(getClass().getResource("/imagenes/ImgAdmin.png"));
		g.drawImage(img_fon.getImage(), 0, 0, tam.width,tam.height,null );
		setOpaque(false); 
		super.paintComponent(g);
	}

}
