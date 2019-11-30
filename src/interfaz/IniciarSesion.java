package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import bd.BD;
import interfaz.IniciarSesion;
import interfaz.MenuInicial;
import objetos.CreadorDePiezas;
import objetos.Usuario;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class IniciarSesion extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JPasswordField passwordFieldInicioSesion;
	public static Usuario entrada;
	
	public static String[][] campo_i;
	
	public static ArrayList<String> lista_i;

	/**
	 * Lanza la ventana.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
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
	public IniciarSesion() {

		// AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTONES
		JButton btnIniciarSesion = new JButton("ENTRAR");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(255, 165, 0));
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnIniciarSesion.setBounds(437, 492, 277, 105);
		contentPane.add(btnIniciarSesion);

		JButton btnVolver = new JButton("ATRAS");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnVolver.setBackground(new Color(135, 206, 235));

		btnVolver.setBounds(116, 492, 277, 105);
		contentPane.add(btnVolver);

		// PANELS
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 844, 105);
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
					MenuInicial nuevaventana = new MenuInicial();
					nuevaventana.setVisible(true);

					// CIERRA LA VENTANA ACTUAL
					IniciarSesion.this.dispose();
				}

			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// PROCESADO DE CONTRASEÑA
				char clave[] = passwordFieldInicioSesion.getPassword();
				String clave_pasada = new String(clave);
				String cont_usu = BD.getCont(textFieldNombre.getText());

				// COMPRUEBA QUE LOS CAMPOS NO ESTEN VACIOS
				if (textFieldNombre.getText().equals("")
						|| passwordFieldInicioSesion.getPassword().toString().equals("")) {

					JOptionPane.showMessageDialog(null, "Introduce los datos antes de continuar");

					// COMPRUEBA QUE EL USAURIO EXISTE
				} else if (BD.getUserName(textFieldNombre.getText()).getNombre().equals("")) {

					JOptionPane.showMessageDialog(null, "Este usuario no existe.");

					// COMPRUEBA QUE LAS CONTRASEÑAS SEAN IGUALES
				} else if (!cont_usu.equals(clave_pasada)) {

					JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");

				} else {
					
					//INICIA LA LISTA DE PIEZAS
					
					lista_i = new ArrayList<String>();
					
					lista_i = CreadorDePiezas.crear_lista_pirmera_vez();
					
					//Inicializa el campo
					
					campo_i = new String[21][9];
					
					 for (int i = 0;i<campo_i.length;i++){
						 
			            for(int j=0;j<campo_i[0].length;j++){
			            	
			            	campo_i[i][j]= null;
				            }
				        }
					 
					//MARCA QUE USUARIO HA ENTRADO
					entrada = BD.getUserName(textFieldNombre.getText());
					
					Ventana nuevaventana = new Ventana();
					nuevaventana.setVisible(true);

					// CIERRA LA VENTANA ACTUAL
					IniciarSesion.this.dispose();
				}
			}
		});

	}
}
