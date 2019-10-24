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
import java.awt.Color;	

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
			setBounds(100, 100, 850, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnCrearUsuario = new JButton("REGISTRARSE");
			btnCrearUsuario.setForeground(new Color(255, 255, 255));
			btnCrearUsuario.setBackground(new Color(50, 205, 50));
			btnCrearUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
			btnCrearUsuario.setBounds(113, 522, 623, 85);
			contentPane.add(btnCrearUsuario);
			
			JButton btnNewButton = new JButton("INICIAR SESION");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
			btnNewButton.setBackground(new Color(50, 205, 50));
			btnNewButton.setBounds(113, 394, 623, 85);
			contentPane.add(btnNewButton);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(220, 220, 220));
			panel.setBounds(0, 0, 832, 93);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblTetris = new JLabel("TETRIS");
			lblTetris.setFont(new Font("Times New Roman", Font.BOLD, 30));
			lblTetris.setBounds(371, 13, 111, 56);
			panel.add(lblTetris);
			
			btnCrearUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == btnCrearUsuario) {
						crear_usuario nuevaventana = new crear_usuario();
						nuevaventana.setVisible(true);
						menu_inicial.this.dispose();
					}
				}
			});
		}
	}



