package interfaz;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Estadisticas extends JFrame{
	JButton btnVolver;
	public Estadisticas() {
		//Ajustes generales
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblJugador = new JLabel("Jugador:");
		lblJugador.setBounds(27, 12, 55, 14);
		getContentPane().add(lblJugador);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setText(IniciarSesion.entrada.getNombre());
		lblNewLabel.setBounds(94, 12, 148, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		try {
			lblNewLabel_1.setIcon(new ImageIcon(new File("xy-chart.png").toURL()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblNewLabel_1.setBounds(109, 68, 619, 399);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblPuntuacionMaxima = new JLabel("Puntuacion media:");
		lblPuntuacionMaxima.setBounds(447, 12, 148, 14);
		getContentPane().add(lblPuntuacionMaxima);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(572, 12, 55, 14);
		lblNewLabel_2.setText(String.valueOf(JfreeChart.puntuacionMedia));
		getContentPane().add(lblNewLabel_2);
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(358, 537, 98, 24);
		btnVolver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ElegirModo modo=new ElegirModo();
				Estadisticas.this.dispose();
				
			}
		});
		getContentPane().add(btnVolver);
	}
}
