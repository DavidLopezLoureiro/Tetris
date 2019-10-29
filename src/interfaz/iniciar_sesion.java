package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import interfaz.iniciar_sesion;
import interfaz.menu_inicial;
import main.BD;
import objetos.Usuario;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class iniciar_sesion extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JPasswordField passwordFieldInicioSesion;
	public static Usuario entrada;

	/**
	 * Lanza la ventana.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iniciar_sesion frame = new iniciar_sesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea el frame.
	 */
	public iniciar_sesion() {

		// INICIALIZACION DE LA BD
		Connection con = BD.iniciar();
		Statement st = BD.crearTabla(con);

		// AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTONES
		JButton btnIniciarSesion = new JButton("ENTRAR");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(50, 205, 50));
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnIniciarSesion.setBounds(437, 492, 277, 105);
		contentPane.add(btnIniciarSesion);

		JButton btnVolver = new JButton("ATRAS");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnVolver.setBackground(new Color(135, 206, 235));
		btnVolver.setBounds(116, 492, 277, 105);
		contentPane.add(btnVolver);

		// PANELS
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 832, 105);
		contentPane.add(panel);
		panel.setLayout(null);

		// LABELS
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNombreDeUsuario.setBounds(116, 162, 180, 43);
		contentPane.add(lblNombreDeUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblContrasea.setBounds(116, 318, 180, 35);
		contentPane.add(lblContrasea);

		JLabel lblIniciarSesion = new JLabel("INICIAR SESION");
		lblIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblIniciarSesion.setBounds(283, 13, 281, 79);
		panel.add(lblIniciarSesion);

		// TEXTFIELDS
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(116, 215, 598, 56);
		contentPane.add(textFieldNombre);

		// PASWORDFIELDS
		passwordFieldInicioSesion = new JPasswordField();
		passwordFieldInicioSesion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordFieldInicioSesion.setBounds(116, 366, 598, 56);
		contentPane.add(passwordFieldInicioSesion);

		// ACTION LISTENERS
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == btnVolver) {

					// ABRE LA NUEVA VENTANA
					menu_inicial nuevaventana = new menu_inicial();
					nuevaventana.setVisible(true);

					// CIERRA LA BD
					BD.cerrarBD(con, st);

					// CIERRA LA VENTANA ACTUAL
					iniciar_sesion.this.dispose();
				}

			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// COMPRUEBA QUE EL USAURIO EXISTE
				if(textFieldNombre.getText().equals("")
						|| passwordFieldInicioSesion.getPassword().toString().equals("")) {

					JOptionPane.showMessageDialog(null, "Introduce los datos antes de continuar");

				}else if (BD.idUsuario(con, st, textFieldNombre.getText()) == 0) { // NO estoy seguro de esta parte

					JOptionPane.showMessageDialog(null, "Este usuario no existe.");

				} else if (!BD.contUsuario(con, st, textFieldNombre.getText())
						.equals(passwordFieldInicioSesion.getPassword().toString())) {

					JOptionPane.showMessageDialog(null, "Contrase�a incorrecta.");

				} else {

					//entrada = BD.getUsuario(con, st, textFieldNombre.getText());

					BD.cerrarBD(con, st);
					iniciar_sesion.this.dispose();
				}
			}
		});

	}
}
