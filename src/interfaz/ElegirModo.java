package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import objetos.CreadorDePiezas;
import objetos.Usuario;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ElegirModo extends JFrame implements  ActionListener{
	JButton btnAjustes;
	JButton botonModoClasico;
	JButton botonModoDuo;
	public static ArrayList<String> lista_i;
	public static String[][] campo_i;
	public ElegirModo() {
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		botonModoClasico = new JButton("CLASICO");
		botonModoClasico.setFont(new Font("Times New Roman", Font.BOLD, 25));
		botonModoClasico.setBounds(103, 207, 242, 97);
		botonModoClasico.addActionListener(this);
		getContentPane().add(botonModoClasico);
		
		botonModoDuo = new JButton("ESTADISTICAS");
		botonModoDuo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		botonModoDuo.setBounds(103, 341, 242, 97);
		botonModoDuo.addActionListener(this);
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
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

//implementacion de los action listener 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==botonModoClasico) {
			//INICIA LA LISTA DE PIEZAS
			IniciarSesion.lista_i = new ArrayList<String>();
			IniciarSesion.lista_i  = CreadorDePiezas.crear_lista_pirmera_vez();
			//Inicializa el campo
			IniciarSesion.campo_i = new String[21][9];
			 for (int i = 0;i<IniciarSesion.campo_i.length;i++){
				 
	            for(int j=0;j<IniciarSesion.campo_i[0].length;j++){
	            	
	            	IniciarSesion.campo_i[i][j]= null;
		            }
		        }
			 
			 Ventana.terminar=true;
			Ventana ventana= new Ventana();
			ventana.setVisible(true);
			ElegirModo.this.dispose();
		
		
		}
		
	}


	
}
