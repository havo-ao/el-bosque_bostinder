package co.edu.unbosque.views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class UserWindowApp extends JFrame {
	private PanelImagenPersona panelPersona;
	private JButton like, dislike;
	private JButton salir,siguiente;

	private JLabel name,txt1, age, txt2;
	public UserWindowApp() {
		setSize(746, 596); 
		setTitle("Bostinder APP"); //titulo esqu
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pa que se pueda cerrar
		setResizable(false); //pa que no se expanda
		setLayout(null);

		inicializar();

		setLocationRelativeTo(null);//centrar
		//	getContentPane().setBackground(new Color(255,182,175));

		setVisible(false);

	}

	public void inicializar() {

		panelPersona = new PanelImagenPersona();
		panelPersona.setBounds(10,10, 400, 400);
		add(panelPersona);

		like = new JButton("LIKE");
		like.setActionCommand("match");
		like.setFocusPainted(true); //para pintar
		like.setBorderPainted(true);
		like.setContentAreaFilled(true); //pq despues sale vacio y f
		like.setForeground(new Color(255,255,255));//color letra
		like.setBackground(new Color(22, 20, 20));
		like.setBounds(420,34,70,50);
		add(like);

		dislike = new JButton("noks");
		dislike.setActionCommand("NOTLIKED");
		dislike.setFocusPainted(true); //para pintar
		dislike.setBorderPainted(true);
		dislike.setContentAreaFilled(true); //pq despues sale vacio y f
		dislike.setBounds(550, 456, 100,55);
		dislike.setForeground(new Color(255,255,255));//color letra
		dislike.setBackground(new Color(22, 20, 20));
		dislike.setBounds(420,150,70,50);
		add(dislike);

		name = new JLabel("Name:");
		name.setBounds(10,400,100,100);
		add(name);

		txt1 = new JLabel();
		txt1.setBounds(40,400,100,100);
		add(txt1);

		age = new JLabel("Age:");
		age.setBounds(10,440,100,100);
		add(age);

		txt2 = new JLabel();
		txt2.setBounds(40,440,100,100);
		add(txt2);

		siguiente = new JButton("Next");
		siguiente.setActionCommand("SalirMatch"); //poderlo usar despues
		//	log.setEnabled(true);//poder interactuar
		siguiente.setFocusPainted(true); //para pintar
		siguiente.setBorderPainted(true);
		siguiente.setContentAreaFilled(true); //pq despues sale vacio y f
		siguiente.setBounds(550, 400, 100,55);
		siguiente.setForeground(new Color(255,255,255));//color letra
		siguiente.setBackground(new Color(22, 20, 20));
		add(siguiente);


		salir = new JButton("Salir");
		salir.setActionCommand("SalirMatch"); //poderlo usar despues
		//	log.setEnabled(true);//poder interactuar
		salir.setFocusPainted(true); //para pintar
		salir.setBorderPainted(true);
		salir.setContentAreaFilled(true); //pq despues sale vacio y f
		salir.setBounds(550, 456, 100,55);
		salir.setForeground(new Color(255,255,255));//color letra
		salir.setBackground(new Color(22, 20, 20));
		add(salir);
	}
}
