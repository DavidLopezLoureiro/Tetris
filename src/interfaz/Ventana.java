package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel Pieza_guardada = new JPanel();
		Pieza_guardada.setBounds(10, 11, 122, 121);
		contentPane.add(Pieza_guardada);
		Pieza_guardada.setLayout(null);

		JLabel pieza_guardada = new JLabel("");
		pieza_guardada.setBounds(10, 11, 102, 99);
		Pieza_guardada.add(pieza_guardada);

		JPanel Siguiente_siguientes = new JPanel();
		Siguiente_siguientes.setBounds(455, 11, 132, 478);
		contentPane.add(Siguiente_siguientes);
		Siguiente_siguientes.setLayout(null);

		JPanel Siguiente = new JPanel();
		Siguiente.setBounds(10, 11, 112, 122);
		Siguiente_siguientes.add(Siguiente);
		Siguiente.setLayout(null);

		JLabel pieza_siguiente = new JLabel("");
		pieza_siguiente.setBounds(10, 11, 92, 100);
		Siguiente.add(pieza_siguiente);

		JPanel Siguientes = new JPanel();
		Siguientes.setBounds(10, 144, 112, 328);
		Siguiente_siguientes.add(Siguientes);
		Siguientes.setLayout(null);

		JLabel pieza_siguiente_2 = new JLabel("");
		pieza_siguiente_2.setBounds(10, 11, 92, 92);
		Siguientes.add(pieza_siguiente_2);

		JLabel pieza_siguiente_3 = new JLabel("");
		pieza_siguiente_3.setBounds(10, 114, 92, 92);
		Siguientes.add(pieza_siguiente_3);

		JLabel pieza_siguiente_4 = new JLabel("");
		pieza_siguiente_4.setBounds(10, 225, 92, 92);
		Siguientes.add(pieza_siguiente_4);

		JPanel Info = new JPanel();
		Info.setBounds(10, 397, 122, 167);
		contentPane.add(Info);
		Info.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:  ");
		lblUsuario.setBounds(10, 11, 122, 22);
		Info.add(lblUsuario);

		JLabel lblPuntuacion = new JLabel("Puntuacion: ");
		lblPuntuacion.setBounds(10, 41, 122, 14);
		Info.add(lblPuntuacion);

		JLabel lblLineas = new JLabel("Lineas:");
		lblLineas.setBounds(10, 66, 122, 14);
		Info.add(lblLineas);

		JLabel lblDificultad = new JLabel("Dificultad: ");
		lblDificultad.setBounds(10, 91, 122, 14);
		Info.add(lblDificultad);

		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 116, 122, 14);
		Info.add(lblFecha);

		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(10, 141, 122, 14);
		Info.add(lblHora);

		JPanel panel = new JPanel();
		panel.setBounds(139, 11, 306, 553);
		contentPane.add(panel);

		JButton Ajustes = new JButton("Ajustes");
		Ajustes.setBounds(455, 500, 132, 64);
		contentPane.add(Ajustes);
	}
}
