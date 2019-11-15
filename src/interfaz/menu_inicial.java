package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BD.BD;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
		BD.connect();

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
		btnCrearUsuario.setBackground(new Color(152, 251, 152));
		btnCrearUsuario.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnCrearUsuario.setBounds(103, 435, 296, 66);
		contentPane.add(btnCrearUsuario);

		JButton btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnIniciarSesion.setBackground(new Color(255, 165, 0));
		btnIniciarSesion.setBounds(103, 320, 296, 66);
		contentPane.add(btnIniciarSesion);
		
		JLabel lblimagen = new JLabel();
		lblimagen.setIcon(new ImageIcon(menu_inicial.class.getResource("/imagenes/tetris.gif")));
		lblimagen.setBounds(516, 40, 296, 498);
		contentPane.add(lblimagen);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(menu_inicial.class.getResource("/imagenes/logoo.png")));
		lblNewLabel.setBounds(54, 45, 391, 174);
		contentPane.add(lblNewLabel);
		
		

		// ACTION LISTENERS
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCrearUsuario) {
					
					// ABRE LA NUEVA VENTANA
					crear_usuario nuevaventana = new crear_usuario();
					nuevaventana.setVisible(true);

					// CIERRA LA VENTAN ACTUAL
					menu_inicial.this.dispose();
				}
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnIniciarSesion) {

					int n_usuarios = BD.getAllUsers().size();

					if (n_usuarios != 0) {

						// ABRE LA NUEVA VENTANA
						iniciar_sesion nuevaventana = new iniciar_sesion();
						nuevaventana.setVisible(true);

						// CIERRA LA VENTAN ACTUAL
						menu_inicial.this.dispose();

					} else if (n_usuarios == 0) {

						JOptionPane.showMessageDialog(null, "Crea un usuario antes.");

					}
				}
			}
		});

	}
}
