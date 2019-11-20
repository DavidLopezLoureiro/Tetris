package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.BD;
import objetos.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class CrearUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombreUsuarioRegistro;
	private JTextField textFieldContrasenaRegistro;
	private JTextField textFieldConfirmaContrasenaRegistro;
	private JTextField textFieldEmail;

	/**
	 * Lanza la ventana.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearUsuario frame = new CrearUsuario();
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
	public CrearUsuario() {

		// AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// PANELS
		JPanel panelFondoTitulo = new JPanel();
		panelFondoTitulo.setBackground(new Color(220, 220, 220));
		panelFondoTitulo.setBounds(0, 0, 844, 146);
		panelFondoTitulo.setLayout(null);
		contentPane.add(panelFondoTitulo);

		// BOTONES
		JButton btnIniciarSesion = new JButton("REGISTRARSE");
		btnIniciarSesion.setBackground(new Color(255, 165, 0));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnIniciarSesion.setBounds(447, 550, 255, 91);
		contentPane.add(btnIniciarSesion);

		JButton btnAtras = new JButton("ATRAS");

		btnAtras.setBackground(new Color(135, 206, 235));
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setFont(new Font("Times New Roman", Font.BOLD, 25));

		btnAtras.setBounds(135, 550, 255, 91);
		contentPane.add(btnAtras);

		// LABELS
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblRegistro.setBounds(327, 31, 159, 69);
		panelFondoTitulo.add(lblRegistro);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNombreDeUsuario.setBounds(135, 157, 172, 35);
		contentPane.add(lblNombreDeUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblContrasea.setBounds(135, 357, 129, 22);
		contentPane.add(lblContrasea);

		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmarContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblConfirmarContrasea.setBounds(135, 447, 202, 22);
		contentPane.add(lblConfirmarContrasea);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEmail.setBounds(135, 260, 172, 35);
		contentPane.add(lblEmail);

		// TEXTFIELDS
		textFieldNombreUsuarioRegistro = new JTextField();
		textFieldNombreUsuarioRegistro.setBounds(135, 205, 567, 44);
		contentPane.add(textFieldNombreUsuarioRegistro);
		textFieldNombreUsuarioRegistro.setColumns(10);

		textFieldContrasenaRegistro = new JTextField();
		textFieldContrasenaRegistro.setBounds(135, 392, 567, 44);
		contentPane.add(textFieldContrasenaRegistro);
		textFieldContrasenaRegistro.setColumns(10);

		textFieldConfirmaContrasenaRegistro = new JTextField();
		textFieldConfirmaContrasenaRegistro.setBounds(135, 482, 567, 44);
		contentPane.add(textFieldConfirmaContrasenaRegistro);
		textFieldConfirmaContrasenaRegistro.setColumns(10);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(135, 302, 567, 44);
		contentPane.add(textFieldEmail);

		// ACTIONS LISTENERS
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAtras) {

					// ABRE LA NUEVA VENTANA
					MenuInicial nuevaventana = new MenuInicial();
					nuevaventana.setVisible(true);

					// CIERRA LA VENTAN ACTUAL
					CrearUsuario.this.dispose();
				}
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				List<Usuario> usuarios_existentes = BD.getAllUsers();
				int n = usuarios_existentes.size();
				boolean pasar = false;

				// REVISA QUE LOS TEXTFIELDS TENGAN ALGO
				if (textFieldNombreUsuarioRegistro.getText().equals("")
						|| textFieldContrasenaRegistro.getText().equals("")
						|| textFieldConfirmaContrasenaRegistro.getText().equals("")
						|| textFieldEmail.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Introduce todos los valores antes de continuar.");

					// REVISA QUE LAS CONTRASEÑAS COINCIDAN
				} else if (!textFieldContrasenaRegistro.getText()
						.equals(textFieldConfirmaContrasenaRegistro.getText())) {

					JOptionPane.showMessageDialog(null, "Ambas contraseñas tienen que coincidir.");
					
				}else if(pasar == false){	
					
						for (int i=0; i <= n - 1; i++){
							
							if(usuarios_existentes.get(i).getNombre().equals(textFieldNombreUsuarioRegistro.getText())) {
								
								pasar = true;
								
								JOptionPane.showMessageDialog(null, "Ese usuario ya existe.");
							}
							
						// SI NADA DE LO ANTERIOR VA MAL, CREA EL USUARIO
						}
						
						if (pasar == false){

							int id = BD.getAllUsers().size() + 1;

							Usuario usuario = new Usuario(id, textFieldNombreUsuarioRegistro.getText().toString(),
									textFieldContrasenaRegistro.getText().toString(), 0, textFieldEmail.getText().toString());

							BD.store(usuario);

							MenuInicial nuevaventana = new MenuInicial();
							nuevaventana.setVisible(true);

							// CIERRA LA VENTAN ACTUAL
							CrearUsuario.this.dispose();

						}
				} 	
			}
		});

	}
}
