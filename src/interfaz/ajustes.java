package interfaz;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JButton;

import javax.swing.JSlider;

@SuppressWarnings("serial")
public class ajustes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajustes frame = new ajustes();
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
	public ajustes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVolumen = new JLabel("Volumen:");
		lblVolumen.setBounds(12, 37, 99, 32);
		contentPane.add(lblVolumen);
		
		JSlider slider = new JSlider();
		slider.setBounds(12, 82, 625, 26);
		contentPane.add(slider);
		
		JLabel lblDificultad = new JLabel("Dificultad:");
		lblDificultad.setBounds(12, 132, 83, 16);
		contentPane.add(lblDificultad);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(12, 161, 625, 26);
		contentPane.add(slider_1);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setBounds(12, 210, 170, 65);
		contentPane.add(btnReiniciar);
		
		JButton btnReanudar = new JButton("Reanudar");
		btnReanudar.setBounds(88, 288, 472, 65);
		contentPane.add(btnReanudar);
		
		JButton btnGuardarYSalir = new JButton("Guardar y salir");
		btnGuardarYSalir.setBounds(467, 210, 170, 65);
		contentPane.add(btnGuardarYSalir);
		
		JButton btnCerrarSesion = new JButton("Cerrar sesion");
		btnCerrarSesion.setBounds(216, 210, 219, 65);
		contentPane.add(btnCerrarSesion);
		
		JLabel lblAjustes = new JLabel("AJUSTES");
		lblAjustes.setBounds(296, 13, 68, 32);
		contentPane.add(lblAjustes);
	}
}
