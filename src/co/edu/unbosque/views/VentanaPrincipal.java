package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelImagenFondo pimg;
	private JButton register;
	private JButton log;


	public VentanaPrincipal() {
		setSize(746, 596); 
		setTitle("Bostinder APP"); //titulo esqu
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pa que se pueda cerrar
		setResizable(false); //pa que no se expanda
		inicializar();
		setLocationRelativeTo(null);//centrar
		
		
		setVisible(true);
	}


	public void inicializar() {

		pimg = new PanelImagenFondo();
		pimg.setBorder(new EmptyBorder(5,5,5,5)); //transparente
		pimg.setLayout(null); //coordenadas
		setContentPane(pimg);

		register = new JButton("Registrar usuario");
		register.setActionCommand("Registrar"); //poderlo usar despues
		register.setEnabled(true);//poder interactuar
		register.setFocusPainted(true); //para pintar
		register.setBorderPainted(true);
		register.setContentAreaFilled(true); //pq despues sale vacio y f
		register.setBounds(456, 156, 165,55);
		register.setFont(new Font("Calisto MT",Font.BOLD,15));
		add(register);
		
		log = new JButton("Iniciar sesión");
		log.setActionCommand("goTologin"); //poderlo usar despues
	//	log.setEnabled(true);//poder interactuar
		log.setFocusPainted(true); //para pintar
		log.setBorderPainted(true);
		log.setContentAreaFilled(true); //pq despues sale vacio y f
		log.setBounds(456, 356, 165,55);
		log.setFont(new Font("Calisto MT",Font.BOLD,15)); //SansSerif
		add(log);
	}


	public PanelImagenFondo getPimg() {
		return pimg;
	}


	public void setPimg(PanelImagenFondo pimg) {
		this.pimg = pimg;
	}


	public JButton getRegister() {
		return register;
	}


	public void setRegister(JButton register) {
		this.register = register;
	}


	public JButton getLog() {
		return log;
	}


	public void setLog(JButton log) {
		this.log = log;
	}

}
