package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.BD;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class crear_usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombreUsuarioRegistro;
	private JTextField textFieldContrasenaRegistro;
	private JTextField textFieldConfirmaContrasenaRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crear_usuario frame = new crear_usuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//inicio la BD
		
		Connection con = BD.iniciar();
		BD.crearTabla(con);	
	}

	/**
	 * Create the frame.
	 */
	public crear_usuario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNombreDeUsuario.setBounds(135, 193, 172, 35);
		contentPane.add(lblNombreDeUsuario);
		
		textFieldNombreUsuarioRegistro = new JTextField();
		textFieldNombreUsuarioRegistro.setBounds(135, 241, 567, 44);
		contentPane.add(textFieldNombreUsuarioRegistro);
		textFieldNombreUsuarioRegistro.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblContrasea.setBounds(135, 309, 129, 22);
		contentPane.add(lblContrasea);
		
		textFieldContrasenaRegistro = new JTextField();
		textFieldContrasenaRegistro.setBounds(135, 344, 567, 44);
		contentPane.add(textFieldContrasenaRegistro);
		textFieldContrasenaRegistro.setColumns(10);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmarContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblConfirmarContrasea.setBounds(135, 414, 202, 22);
		contentPane.add(lblConfirmarContrasea);
		
		textFieldConfirmaContrasenaRegistro = new JTextField();
		textFieldConfirmaContrasenaRegistro.setBounds(135, 449, 567, 44);
		contentPane.add(textFieldConfirmaContrasenaRegistro);
		textFieldConfirmaContrasenaRegistro.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("REGISTRARSE");
		btnIniciarSesion.setBackground(new Color(50, 205, 50));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnIniciarSesion.setBounds(447, 520, 255, 91);
		contentPane.add(btnIniciarSesion);
		
		JPanel panelFondoTitulo = new JPanel();
		panelFondoTitulo.setBackground(new Color(220, 220, 220));
		panelFondoTitulo.setBounds(0, 0, 832, 146);
		contentPane.add(panelFondoTitulo);
		panelFondoTitulo.setLayout(null);
		
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblRegistro.setBounds(327, 31, 159, 69);
		panelFondoTitulo.add(lblRegistro);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBackground(new Color(135, 206, 235));
		btnAtras.setForeground(new Color(255, 250, 250));
		btnAtras.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnAtras.setBounds(135, 520, 255, 91);
		contentPane.add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAtras) {
					menu_inicial nuevaventana = new menu_inicial();
					nuevaventana.setVisible(true);
					crear_usuario.this.dispose();
				}
			}
		});
	}
}
