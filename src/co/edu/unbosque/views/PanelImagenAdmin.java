/**
 * Este paquete corresponde a la parte grafica
 */
package co.edu.unbosque.views;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Esta clase es para poner la imagen de fondo de la ventana del administrador. <br>
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class PanelImagenAdmin extends JPanel implements PanelImagenI{
	/**
	 * Variable tam de tipo Dimension
	 */
	private Dimension tam; 
	/**
	 * Variable img_fon de tipo ImageIcon
	 */
	private ImageIcon img_fon;
	/**
	 * Variable label de tipo JLabel
	 */
	private JLabel label;
	
	/**
	 * Metodo que crea e inicializa el panel PanelImagenAdmin. 
	 * <b>pre</b> Se hace el llamado de la clase. <br>
	 * <b>post</b> Se ha inicializado el panel PanelImagenAdmin. <br>
	 */
	public PanelImagenAdmin() {
		this.setSize(getPreferredSize());
	}
	@Override
	/**
	 * Este metodo se encarga de poner la imagen d fondo.
	 * <b>pre</b> La imagen que se va a utilizar debe estar en la carpeta. <br>
	 * <b>post</b> La imagen se ha colocado de fondo. <br>
	 */
	public void paintComponent(Graphics g) {
	
		Dimension tam = getSize();
		img_fon = new ImageIcon(getClass().getResource("/imagenes/ImgAdmin.png"));
		g.drawImage(img_fon.getImage(), 0, 0, tam.width,tam.height,null );
		setOpaque(false); 
		super.paintComponent(g);
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto tam de tipo Dimension. <br>
	 */
	public Dimension getTam() {
		return tam;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param tam es dimension de la imagen. tam != null, tam != " ". <br>
	 */
	public void setTam(Dimension tam) {
		this.tam = tam;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto img_fon de tipo ImageIcon. <br>
	 */
	public ImageIcon getImg_fon() {
		return img_fon;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param img_fon es la imagen de fondo. img_fon != null, img_fon != " ". <br>
	 */
	public void setImg_fon(ImageIcon img_fon) {
		this.img_fon = img_fon;
	}
	/**
	 * Este metodo permite que otras clases accedan a esta variable y a su valor. <br>
	 * <b>pre</b> la variable esta instanciada e inicializada. <br>
	 * <b>post</b> Brindar su valor actual. <br>
	 * @return Regresa el objeto label de tipo JLabel. <br>
	 */
	public JLabel getLabel() {
		return label;
	}
	/**
	 * Este metodo permite setear el valor de la variable. <br>
	 * <b>pre</b> la variable debe estar inicializada. <br>
	 * <b>post</b> Se asigna un nuevo valor a la variable <br>
	 * @param label es el JLabel que almacenará la imagen de fondo. label != null, label != " ". <br>
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}

	
}
