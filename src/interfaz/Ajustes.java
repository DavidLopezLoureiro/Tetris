package interfaz;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import imagenes.AsignadorDeFotosDePiezas;
import interfaz.Ventana.Dificultad;
import objetos.CreadorDePiezas;
import objetos.Pieza;

import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JSlider;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Ajustes extends JFrame {
	JRadioButton rdbtnDifcil ;
	private JPanel contentPane;
	JRadioButton rdbtnMedio;
	JRadioButton rdbtnFcil;
	

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

	//añade los ajueste de nivel 
	public void nivelar() {
		if(rdbtnFcil.isSelected())Ventana.dificultad=Dificultad.FACIL;
		if(rdbtnMedio.isSelected())Ventana.dificultad=Dificultad.MEDIO;
		if(rdbtnDifcil.isSelected())Ventana.dificultad=Dificultad.DIFICIL;
	}
	/**
	 * Create the frame.
	 */
	public Ajustes() {
		
		
		//AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
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
		
		
		JLabel lblDificultad = new JLabel("DIFICULTAD:");
		lblDificultad.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDificultad.setBounds(88, 155, 154, 16);
		contentPane.add(lblDificultad);
	
		
		//BOTONES
		
		JButton btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(152, 251, 152));
		btnReiniciar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReiniciar.setBounds(65, 400, 292, 65);
		contentPane.add(btnReiniciar);
		
		JButton btnReanudar = new JButton("REANUDAR");
		btnReanudar.setBackground(new Color(255, 165, 0));
		btnReanudar.setForeground(Color.WHITE);
		btnReanudar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReanudar.setBounds(265, 300, 292, 65);
		contentPane.add(btnReanudar);
		
		JButton btnGuardarYSalir = new JButton("GUARDAR Y SALIR");
		btnGuardarYSalir.setForeground(new Color(255, 255, 255));
		btnGuardarYSalir.setBackground(new Color(152, 251, 152));
		btnGuardarYSalir.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnGuardarYSalir.setBounds(468, 400, 292, 65);
		contentPane.add(btnGuardarYSalir);
		
		
		//RADIOBUTTONS
		ButtonGroup grupo= new ButtonGroup();//para que solo se puede seleccionar un botton a la vez
		rdbtnFcil = new JRadioButton("F\u00C1CIL");
		rdbtnFcil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnFcil.setBounds(88, 205, 127, 25);
		grupo.add(rdbtnFcil);
		contentPane.add(rdbtnFcil);
		
		rdbtnMedio = new JRadioButton("MEDIO");
		rdbtnMedio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnMedio.setBounds(374, 205, 127, 25);
		grupo.add(rdbtnMedio);
		contentPane.add(rdbtnMedio);
		
		rdbtnDifcil = new JRadioButton("DIF\u00CDCIL");
		rdbtnDifcil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnDifcil.setBounds(654, 205, 93, 25);
		grupo.add(rdbtnDifcil);
		contentPane.add(rdbtnDifcil);
		
		
		
		btnReanudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				Ventana.borrar_donde_estaba();
				
				Ventana.ajustes = false;
			
			Ventana nuevaventana = new Ventana();
			nuevaventana.setVisible(true);
			
				// CIERRA LA VENTAN ACTUAL
			Ajustes.this.dispose();
				
	      
			}
		});
		
		
		btnGuardarYSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nivelar();
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
				nivelar();
				Ventana nuevaventana = new Ventana();
				nuevaventana.setVisible(true);

				// CIERRA LA VENTAN ACTUAL
				Ajustes.this.dispose();
	        
			}
		});
		
	}
	
}
