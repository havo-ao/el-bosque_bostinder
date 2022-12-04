package co.edu.unbosque.views;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSelectionSort extends JPanel {

	private JLabel sorterText;
	public PanelSelectionSort() {
		// TODO Auto-generated constructor stub{
		this.setSize(600,600);
		setLayout(new GridLayout(1,2));
		setBackground(new Color(180, 255, 159));
		setVisible(true);
		uploadText();
	}
	public void uploadText() {
		sorterText = new JLabel("s");
		add(sorterText);
	}
	
	
	
	
}
