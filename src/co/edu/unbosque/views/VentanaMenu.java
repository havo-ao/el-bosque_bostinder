/**
 * Este paquete corresponde a la parte grafica
 */
package co.edu.unbosque.views;
/**
 * Se genera cuando se llama al c�digo que depende de un teclado,
 *  una pantalla o un mouse en un entorno que no admite un teclado, una pantalla o un mouse.
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**
 * Esta clase corresponde a la Ventana del Menu
 * @author Sofia Morales
 *
 */
public class VentanaMenu extends JFrame{
	/**
	 * Encapsulo pim 
	 */
	private PanelImgGuia pim;
	/**
	 * Encapsulo admin
	 */
	private JButton admin; 
	/**
	 * Encapsulo user y volver
	 */
	private JButton user, volver;
	/**
	 * Metodo constructor de la Ventana menu, aqui se inicializa
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
	 * 
	 */
	public void inicializar() {
		pim = new PanelImgGuia();
		pim.setBorder(new EmptyBorder(5,5,5,5)); //transparente
		pim.setLayout(null); //coordenadas
		setContentPane(pim);

		user = new JButton("USER");
		user.setActionCommand("userLogin");
		//user.setEnabled(false);
		user.setFont(new Font("Calisto MT",Font.BOLD,15));
		user.setBounds(40,40,130,65);
		add(user);

		admin = new JButton("Administrador");
		admin.setActionCommand("adminLogin");
		admin.setFont(new Font("Calisto MT",Font.BOLD,15));
		admin.setBounds(550,350,130,50);
		add(admin);

		volver = new JButton("Volver");
		volver.setActionCommand("Volver1");
		volver.setFont(new Font("Calisto MT",Font.BOLD,15));
		volver.setBounds(600,500,100,50);
		add(volver);
	}







	/**
	 * 
	 * @return
	 */

	public PanelImgGuia getPim() {
		return pim;
	}
	/**
	 * 
	 * @param pim
	 */
	public void setPim(PanelImgGuia pim) {
		this.pim = pim;
	}

	public JButton getAdmin() {
		return admin;
	}

	public void setAdmin(JButton admin) {
		this.admin = admin;
	}

	public JButton getUser() {
		return user;
	}

	public void setUser(JButton user) {
		this.user = user;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}



}
