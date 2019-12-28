package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirModo extends JFrame{
	
	private JPanel contentPane;
	
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
	
	
	public ElegirModo() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CLASICO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(62, 112, 369, 137);
		getContentPane().add(btnNewButton);
		
		JButton btnJugadores = new JButton("2 JUGADORES");
		btnJugadores.setBounds(62, 397, 369, 137);
		getContentPane().add(btnJugadores);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(505, 49, 293, 263);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(505, 335, 293, 261);
		contentPane.add(lblNewLabel_1);
	}

	
}
