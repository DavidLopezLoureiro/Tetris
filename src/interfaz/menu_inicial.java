package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.BD;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class menu_inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Lanza la ventana.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_inicial frame = new menu_inicial();
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
	public menu_inicial() {

		// INICIALIZACION DE LA BD
		// Connection con = BD.iniciar();
		// Statement st = BD.crearTabla(con);

		// AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTONES
		JButton btnCrearUsuario = new JButton("REGISTRARSE");
		btnCrearUsuario.setForeground(new Color(255, 255, 255));
		btnCrearUsuario.setBackground(new Color(50, 205, 50));
		btnCrearUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCrearUsuario.setBounds(105, 432, 623, 85);
		contentPane.add(btnCrearUsuario);

		JButton btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnIniciarSesion.setBackground(new Color(50, 205, 50));
		btnIniciarSesion.setBounds(105, 304, 623, 85);
		contentPane.add(btnIniciarSesion);

		// LABELS
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(menu_inicial.class.getResource("/imagenes/logo.png")));
		lblNewLabel.setBounds(133, 31, 614, 221);
		contentPane.add(lblNewLabel);

		// ACTION LISTENERS
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCrearUsuario) {
					crear_usuario nuevaventana = new crear_usuario();
					nuevaventana.setVisible(true);
					// BD.cerrarBD(con, st);
					menu_inicial.this.dispose();
				}
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnIniciarSesion) {

					// if (BD.cargaUsuario(con, st).size() != 0) {
					iniciar_sesion nuevaventana = new iniciar_sesion();
					nuevaventana.setVisible(true);
					// BD.cerrarBD(con, st);
					menu_inicial.this.dispose();

					// } else if ((BD.cargaUsuario(con, st).size() != 0)) {

					// JOptionPane.showMessageDialog(null, "Crea un usuario antes.");

					// }
				}
			}
		});
	}
}
