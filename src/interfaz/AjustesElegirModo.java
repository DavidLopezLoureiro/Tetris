package interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

import interfaz.Ventana.Dificultad;
import objetos.CreadorDePiezas;

public class AjustesElegirModo extends  JFrame {
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
	public AjustesElegirModo() {
		// TODO Auto-generated constructor stub {
		
		
		//AJUSTES GENERALES
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
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
		lblDificultad.setBounds(88, 285, 154, 16);
		contentPane.add(lblDificultad);
		
		
		
		//BOTONES
		
		JButton btnReiniciar = new JButton("SALIR");
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(152, 251, 152));
		btnReiniciar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReiniciar.setBounds(65, 546, 292, 65);
		contentPane.add(btnReiniciar);
		
		
		
		JButton btnGuardarYSalir = new JButton("GUARDAR Y SALIR");
		btnGuardarYSalir.setForeground(new Color(255, 255, 255));
		btnGuardarYSalir.setBackground(new Color(152, 251, 152));
		btnGuardarYSalir.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnGuardarYSalir.setBounds(468, 546, 292, 65);
		contentPane.add(btnGuardarYSalir);
		//RADIOBUTTONS
		ButtonGroup grupo= new ButtonGroup();//para que solo se puede seleccionar un botton a la vez
		rdbtnFcil = new JRadioButton("F\u00C1CIL");
		rdbtnFcil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnFcil.setBounds(88, 345, 127, 25);
		grupo.add(rdbtnFcil);
		contentPane.add(rdbtnFcil);
		
		rdbtnMedio = new JRadioButton("MEDIO");
		rdbtnMedio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnMedio.setBounds(374, 345, 127, 25);
		grupo.add(rdbtnMedio);
		contentPane.add(rdbtnMedio);
		
		rdbtnDifcil = new JRadioButton("DIF\u00CDCIL");
		rdbtnDifcil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnDifcil.setBounds(654, 345, 93, 25);
		grupo.add(rdbtnDifcil);
		contentPane.add(rdbtnDifcil);
		
		
		

		
		btnGuardarYSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CAMBIOS QUE SE REALIZAN EN LA VENTANA DE AJUESTES
				nivelar();
				//ABRIR LA VENTANA NUEVA
				ElegirModo elegir=new ElegirModo();
				// CIERRA LA VENTAN ACTUAL
				AjustesElegirModo.this.dispose();
	        
			}
		});
		
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ABRIR LA VENTANA NUEVA
				ElegirModo elegir=new ElegirModo();
				// CIERRA LA VENTAN ACTUAL
				AjustesElegirModo.this.dispose();
	        
			}
		});
		
	}
}
