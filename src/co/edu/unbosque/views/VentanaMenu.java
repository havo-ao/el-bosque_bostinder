package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**
 * 
 * @author sofia
 *
 */
public class VentanaMenu extends JFrame{
	private PanelImgGuia pim;
	private JButton admin; 
	private JButton user, volver;
	/**
	 * 
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
		user.setActionCommand("usuario");
		//user.setEnabled(false);
		user.setBackground(new Color(22, 20, 20));
		user.setForeground(new Color(255,255,255));
		user.setFont(new Font("Calisto MT",Font.BOLD,25));
		user.setBounds(40,40,130,65);
		add(user);

		admin = new JButton("ADMIN");
		admin.setActionCommand("adminis");
		admin.setBackground(new Color(22, 20, 20));
		admin.setForeground(new Color(255,255,255));
		admin.setFont(new Font("Calisto MT",Font.BOLD,25));
		admin.setBounds(550,350,130,50);
		add(admin);

		volver = new JButton("Return");
		volver.setActionCommand("Volver1");
		volver.setBackground(new Color(22, 20, 20));
		volver.setForeground(new Color(255,255,255));
		volver.setFont(new Font("Calisto MT",Font.BOLD,20));
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
