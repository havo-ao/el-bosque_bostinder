package co.edu.unbosque.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProfilesWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private Components components = new Components();

	private JLabel lblBanner = new JLabel();
	private JLabel lblPhoto = new JLabel();

	private JTextField txtProfile = new JTextField();

	private JButton btnLogout = new JButton();
	private JButton btnLike = new JButton();
	private JButton btnDislike = new JButton();

	final int defaultWidth = 200;
	final int defaultHeight = 50;

	final int paddingX = 10;
	final int paddingY = 10;

	public ProfilesWindow() {
		setSize(880, 720);
		setTitle("BosTinder APP");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		initializeComponents();
	}

	private void initializeComponents() {
		addLabels();
		addTextInputs();
		addButtons();
	}

	private void addLabels() {
		// Banner
		add(components.addLabel(lblBanner, "", 0, 0, 880, 160, SwingConstants.LEFT,
				"src/imagenes/logo_bostinder_880.png"));

		add(components.addLabel(lblPhoto, "", getCol(1), getRow(1), (defaultWidth * 2) + paddingX,
				(defaultHeight * 6) + (paddingY * 5), SwingConstants.CENTER, "src/imagenes/person_man.png"));
	}

	private void addTextInputs() {
		add(components.addTextInput(txtProfile, "", getCol(3), getRow(1), (defaultWidth * 2) + paddingX,
				(defaultHeight * 6) + (paddingY * 5)));
	}

	private void addButtons() {
		add(components.addButton(btnLogout, "Cerrar sesión", getCol(1), getRow(8) + 20, defaultWidth,
				defaultHeight - 10));
		btnLogout.setActionCommand("logoutMain");

		add(components.addButton(btnLike, "Me gusta", getCol(4), getRow(7), defaultWidth, defaultHeight));
		btnLike.setActionCommand("likeMain");

		add(components.addButton(btnDislike, "Siguiente", getCol(1), getRow(7), defaultWidth, defaultHeight));
		btnDislike.setActionCommand("dislikeMain");
	}

	// Function to get row number by integer
	private int getRow(int row) {
		return 180 + ((row - 1) * (defaultHeight + paddingY));
	}

	// Function to get col number by integer
	private int getCol(int col) {
		return 30 + ((col - 1) * (defaultWidth + paddingX));
	}

	public JTextField getTxtProfile() {
		return txtProfile;
	}

	public void setTxtProfile(JTextField txtProfile) {
		this.txtProfile = txtProfile;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(JButton btnLogout) {
		this.btnLogout = btnLogout;
	}

	public JButton getBtnLike() {
		return btnLike;
	}

	public void setBtnLike(JButton btnLike) {
		this.btnLike = btnLike;
	}

	public JButton getBtnDislike() {
		return btnDislike;
	}

	public void setBtnDislike(JButton btnDislike) {
		this.btnDislike = btnDislike;
	}
	
	

}
