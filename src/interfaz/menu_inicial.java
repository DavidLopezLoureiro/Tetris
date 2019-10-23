package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;	

	@SuppressWarnings("serial")
	public class menu_inicial extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
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
		 * Create the frame.
		 */
		public menu_inicial() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 685, 413);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblTetris = new JLabel("Tetris");
			lblTetris.setFont(new Font("Georgia", Font.BOLD, 30));
			lblTetris.setBounds(265, 27, 108, 65);
			contentPane.add(lblTetris);
			
			JButton btnCrearUsuario = new JButton("Crear usuario");
			btnCrearUsuario.setBounds(95, 115, 456, 75);
			contentPane.add(btnCrearUsuario);
			
			btnCrearUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == btnCrearUsuario) {
						crear_usuario nuevaventana = new crear_usuario();
						nuevaventana.setVisible(true);
						menu_inicial.this.dispose();
					}
				}
			});
			
			
			JButton btnIniciarSesion = new JButton("Iniciar sesion");
			btnIniciarSesion.setBounds(95, 235, 456, 75);
			contentPane.add(btnIniciarSesion);
			
			btnIniciarSesion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == btnIniciarSesion) {
						iniciar_sesion nuevaventana = new iniciar_sesion();
						nuevaventana.setVisible(true);
						menu_inicial.this.dispose();
					}
				}
			});
		}
	}



