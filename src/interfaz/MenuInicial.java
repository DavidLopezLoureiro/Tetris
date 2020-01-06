package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.BD;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MenuInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Lanza la ventana.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuInicial frame = new MenuInicial();
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
	public MenuInicial() {

		// INICIALIZACION DE LA BD
		BD.connect();

		// AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		// BOTONES
		JButton btnCrearUsuario = new JButton("REGISTRARSE");
		btnCrearUsuario.setForeground(new Color(255, 255, 255));
		btnCrearUsuario.setBackground(new Color(152, 251, 152));
		btnCrearUsuario.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCrearUsuario.setBounds(85, 422, 314, 79);
		contentPane.add(btnCrearUsuario);

		JButton btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));

		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnIniciarSesion.setBackground(new Color(135, 206, 235));
		btnIniciarSesion.setBounds(85, 307, 314, 79);
		contentPane.add(btnIniciarSesion);
		
		JLabel lblimagen = new JLabel();
		lblimagen.setIcon(new ImageIcon(MenuInicial.class.getResource("/imagenes/tetris.gif")));
		lblimagen.setBounds(516, 40, 296, 498);
		contentPane.add(lblimagen);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuInicial.class.getResource("/imagenes/logoo.png")));
		lblNewLabel.setBounds(54, 45, 391, 174);
		contentPane.add(lblNewLabel);
		
		

		// ACTION LISTENERS
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCrearUsuario) {
					
					// ABRE LA NUEVA VENTANA
					CrearUsuario nuevaventana = new CrearUsuario();
					nuevaventana.setVisible(true);

					// CIERRA LA VENTAN ACTUAL
					MenuInicial.this.dispose();
				}
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnIniciarSesion) {

					int n_usuarios = BD.getAllUsers().size();

					if (n_usuarios != 0) {

						// ABRE LA NUEVA VENTANA
						IniciarSesion nuevaventana = new IniciarSesion();
						nuevaventana.setVisible(true);

						// CIERRA LA VENTAN ACTUAL
						MenuInicial.this.dispose();

					} else if (n_usuarios == 0) {

						JOptionPane.showMessageDialog(null, "Crea un usuario antes.");

					}
				}
			}
		});

	}
}
