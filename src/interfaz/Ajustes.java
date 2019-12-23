package interfaz;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.CreadorDePiezas;

import javax.swing.JLabel;

import javax.swing.JButton;

import javax.swing.JSlider;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Ajustes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajustes frame = new Ajustes();
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
	public Ajustes() {
		
		
		//AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//PANELS
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setForeground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 850, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		//LABELS
		
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
		
		JLabel label = new JLabel("-");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label.setBounds(65, 204, 56, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("+");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label_1.setBounds(764, 205, 56, 16);
		contentPane.add(label_1);
		
		
		//SLIDER
		
		JSlider slider = new JSlider();
		slider.setBounds(88, 222, 672, 26);
		contentPane.add(slider);
		
		
		//BOTONES
		
		JButton btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(152, 251, 152));
		btnReiniciar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReiniciar.setBounds(65, 546, 292, 65);
		contentPane.add(btnReiniciar);
		
		JButton btnReanudar = new JButton("REANUDAR");
		btnReanudar.setBackground(new Color(255, 165, 0));
		btnReanudar.setForeground(Color.WHITE);
		btnReanudar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReanudar.setBounds(265, 452, 292, 65);
		contentPane.add(btnReanudar);
		
		JButton btnGuardarYSalir = new JButton("GUARDAR Y SALIR");
		btnGuardarYSalir.setForeground(new Color(255, 255, 255));
		btnGuardarYSalir.setBackground(new Color(152, 251, 152));
		btnGuardarYSalir.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnGuardarYSalir.setBounds(468, 546, 292, 65);
		contentPane.add(btnGuardarYSalir);
		
		
		//RADIOBUTTONS
		
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
		
		
		
		btnReanudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Ventana nuevaventana = new Ventana();
				nuevaventana.setVisible(true);

				// CIERRA LA VENTAN ACTUAL
				Ajustes.this.dispose();
	        
			}
		});
		
		
		btnGuardarYSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// CIERRA LA VENTAN ACTUAL
				Ajustes.this.dispose();
	        
			}
		});
		
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				//INICIA LA LISTA DE PIEZAS

				IniciarSesion.lista_i.clear();
				
				IniciarSesion.lista_i = CreadorDePiezas.crear_lista_pirmera_vez();
				
				//Inicializa el campo
				
				 for (int i = 0;i< 21;i++){
					 
		            for(int j=0;j< 9;j++){
		            	
		            	IniciarSesion.campo_i[i][j]= null;
			            }
			        }
				 
				Ventana nuevaventana = new Ventana();
				nuevaventana.setVisible(true);

				// CIERRA LA VENTAN ACTUAL
				Ajustes.this.dispose();
	        
			}
		});
		
	}
}
