package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class iniciar_sesion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 685, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setBounds(23, 38, 129, 35);
		contentPane.add(lblNombreDeUsuario);
		
		textField = new JTextField();
		textField.setBounds(23, 74, 567, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(23, 134, 129, 22);
		contentPane.add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 158, 567, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmarContrasea.setBounds(23, 220, 129, 22);
		contentPane.add(lblConfirmarContrasea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(23, 243, 567, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.setBounds(226, 310, 180, 43);
		contentPane.add(btnIniciarSesion);
	}
}
