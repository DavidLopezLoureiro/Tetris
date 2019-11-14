package interfaz;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JButton;

import javax.swing.JSlider;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;

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
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(88, 222, 672, 26);
		contentPane.add(slider);
		
		JButton btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(0, 191, 255));
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReiniciar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReiniciar.setBounds(65, 546, 292, 65);
		contentPane.add(btnReiniciar);
		
		JButton btnReanudar = new JButton("RENAUDAR");
		btnReanudar.setBackground(new Color(173, 255, 47));
		btnReanudar.setForeground(new Color(255, 255, 255));
		btnReanudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReanudar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReanudar.setBounds(273, 457, 292, 65);
		contentPane.add(btnReanudar);
		
		JButton btnGuardarYSalir = new JButton("GUARDAR Y SALIR");
		btnGuardarYSalir.setBackground(new Color(0, 191, 255));
		btnGuardarYSalir.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnGuardarYSalir.setBounds(468, 546, 292, 65);
		contentPane.add(btnGuardarYSalir);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setForeground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 832, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAjustes = new JLabel("AJUSTES");
		lblAjustes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblAjustes.setBounds(327, 34, 153, 46);
		panel.add(lblAjustes);
		
		JLabel lblVolumen = new JLabel("VOLUMEN:");
		lblVolumen.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblVolumen.setBounds(88, 160, 127, 16);
		contentPane.add(lblVolumen);
		
		JLabel lblDificultad = new JLabel("DIFICULTAD:");
		lblDificultad.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDificultad.setBounds(88, 285, 154, 16);
		contentPane.add(lblDificultad);
		
		JRadioButton rdbtnFcil = new JRadioButton("F\u00C1CIL");
		rdbtnFcil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnFcil.setBounds(88, 345, 127, 25);
		contentPane.add(rdbtnFcil);
		
		JRadioButton rdbtnMedio = new JRadioButton("MEDIO");
		rdbtnMedio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnMedio.setBounds(374, 345, 127, 25);
		contentPane.add(rdbtnMedio);
		
		JRadioButton rdbtnDifcil = new JRadioButton("DIF\u00CDCIL");
		rdbtnDifcil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnDifcil.setBounds(654, 345, 93, 25);
		contentPane.add(rdbtnDifcil);
		
		JLabel label = new JLabel("-");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label.setBounds(65, 204, 56, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("+");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label_1.setBounds(764, 205, 56, 16);
		contentPane.add(label_1);
	}
}
