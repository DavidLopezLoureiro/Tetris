package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ElegirModo extends JFrame{
	public ElegirModo() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CLASICO");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(60, 140, 351, 154);
		getContentPane().add(btnNewButton);
		
		JButton btnJugadores = new JButton("2 JUGADORES");
		btnJugadores.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnJugadores.setBounds(60, 418, 351, 154);
		getContentPane().add(btnJugadores);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ElegirModo.class.getResource("/imagenes/961570e90e488f080c2a3be82a3ea02a_icon.jpg")));
		lblNewLabel.setBounds(501, 86, 256, 251);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ElegirModo.class.getResource("/imagenes/descarga1.png")));
		label.setBounds(501, 363, 285, 251);
		getContentPane().add(label);
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirModo frame = new ElegirModo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
