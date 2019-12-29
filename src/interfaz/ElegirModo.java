package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirModo extends JFrame{
	public ElegirModo() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		
		getContentPane().setLayout(null);
		
		JButton botonModoClasico = new JButton("CLASICO");
		botonModoClasico.setFont(new Font("Times New Roman", Font.BOLD, 25));
		botonModoClasico.setBounds(103, 207, 242, 97);
		getContentPane().add(botonModoClasico);
		
		JButton botonModoDuo = new JButton("2 JUGADORES");
		botonModoDuo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botonModoDuo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		botonModoDuo.setBounds(103, 468, 242, 97);
		getContentPane().add(botonModoDuo);
		
		JLabel labelSegundaImagen = new JLabel("");
		labelSegundaImagen.setIcon(new ImageIcon(ElegirModo.class.getResource("/imagenes/c4400e39015d750887475facd79b3e42.png")));
		labelSegundaImagen.setBounds(497, 135, 292, 250);
		getContentPane().add(labelSegundaImagen);
		
		JLabel labelPrimeraImagen = new JLabel("");
		labelPrimeraImagen.setIcon(new ImageIcon(ElegirModo.class.getResource("/imagenes/trophy-256x256.png")));
		labelPrimeraImagen.setBounds(497, 412, 250, 228);
		getContentPane().add(labelPrimeraImagen);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 844, 105);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelTitulo = new JLabel("JUEGO");
		labelTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		labelTitulo.setBounds(358, 29, 128, 46);
		panel.add(labelTitulo);
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
