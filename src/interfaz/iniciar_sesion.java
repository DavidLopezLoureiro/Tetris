package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class iniciar_sesion extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JPasswordField passwordFieldInicioSesion;

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public iniciar_sesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNombreDeUsuario.setBounds(116, 162, 180, 43);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblContrasea.setBounds(116, 318, 180, 35);
		contentPane.add(lblContrasea);
		
		JButton btnIniciarSesion = new JButton("ENTRAR");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(50, 205, 50));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnIniciarSesion.setBounds(116, 491, 598, 105);
		contentPane.add(btnIniciarSesion);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(116, 215, 598, 56);
		contentPane.add(textFieldNombre);
		
		passwordFieldInicioSesion = new JPasswordField();
		passwordFieldInicioSesion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordFieldInicioSesion.setBounds(116, 366, 598, 56);
		contentPane.add(passwordFieldInicioSesion);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 832, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIniciarSesion = new JLabel("INICIAR SESION");
		lblIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblIniciarSesion.setBounds(283, 13, 281, 79);
		panel.add(lblIniciarSesion);
	}
}
