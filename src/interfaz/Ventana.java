package interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;


import objetos.Pieza;

import objetos.creador_de_piezas;

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
		
		Calendar calendario = Calendar.getInstance();
		
		
		//AJUSTES GENERALES
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 613, 614);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
		
		//PANELES
			JPanel t_guardada = new JPanel();
			t_guardada.setBounds(10, 11, 122, 121);
			contentPane.add(t_guardada);
			t_guardada.setLayout(null);
			
			JPanel Siguiente_siguientes = new JPanel();
			Siguiente_siguientes.setBounds(455, 11, 132, 478);
			contentPane.add(Siguiente_siguientes);
			Siguiente_siguientes.setLayout(null);
			
			JPanel Siguientes = new JPanel();
			Siguientes.setBounds(10, 144, 112, 328);
			Siguiente_siguientes.add(Siguientes);
			Siguientes.setLayout(null);
	
			JPanel Siguiente = new JPanel();
			Siguiente.setBounds(10, 11, 112, 122);
			Siguiente_siguientes.add(Siguiente);
			Siguiente.setLayout(null);
			
			JPanel Info = new JPanel();
			Info.setBounds(10, 397, 122, 167);
			contentPane.add(Info);
			Info.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(139, 11, 306, 553);
			contentPane.add(panel);
		
		
		//LABELS
			JLabel pieza_guardada = new JLabel("");
			pieza_guardada.setBounds(10, 11, 102, 99);
			t_guardada.add(pieza_guardada);
	
			JLabel pieza_siguiente = new JLabel("");
			pieza_siguiente.setBounds(10, 11, 92, 100);
			Siguiente.add(pieza_siguiente);
	
			JLabel pieza_siguiente_2 = new JLabel("");
			pieza_siguiente_2.setBounds(10, 11, 92, 92);
			Siguientes.add(pieza_siguiente_2);
	
			JLabel pieza_siguiente_3 = new JLabel("");
			pieza_siguiente_3.setBounds(10, 114, 92, 92);
			Siguientes.add(pieza_siguiente_3);
	
			JLabel pieza_siguiente_4 = new JLabel("");
			pieza_siguiente_4.setBounds(10, 225, 92, 92);
			Siguientes.add(pieza_siguiente_4);
	
			JLabel lblUsuario = new JLabel("Usuario:  " + iniciar_sesion.entrada.getNombre());
			lblUsuario.setBounds(10, 11, 122, 22);
			Info.add(lblUsuario);
	
			JLabel lblPuntuacion = new JLabel("Puntuacion: " + iniciar_sesion.entrada.getMaxPuntu());
			lblPuntuacion.setBounds(10, 41, 122, 14);
			Info.add(lblPuntuacion);
	
			JLabel lblLineas = new JLabel("Lineas:");
			lblLineas.setBounds(10, 66, 122, 14);
			Info.add(lblLineas);
	
			JLabel lblDificultad = new JLabel("Dificultad: ");
			lblDificultad.setBounds(10, 91, 122, 14);
			Info.add(lblDificultad);
			
			
			java.util.Date fecha = new Date();
			
			JLabel lblFecha = new JLabel("Fecha: " + fecha);
			lblFecha.setBounds(10, 116, 122, 14);
			Info.add(lblFecha);
	
			JLabel lblHora = new JLabel("Hora: " + calendario.get(Calendar.HOUR_OF_DAY) + ":" + calendario.get(Calendar.MINUTE));
			lblHora.setBounds(10, 141, 122, 14);
			Info.add(lblHora);
			
			JLabel label = new JLabel("");
			label.setBounds(0, 0, 306, 553);
			panel.add(label);
			
			javax.swing.Timer timer = new javax.swing.Timer(1, new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent ae) {
					lblHora .setText("Hora: " + calendario.get(Calendar.HOUR_OF_DAY) + ":" + calendario.get(Calendar.MINUTE));
				}
			});

		
		//BOTONES
			JButton Ajustes = new JButton("Ajustes");
			Ajustes.setBounds(455, 500, 132, 64);
			contentPane.add(Ajustes);
			
			JButton btnGirar = new JButton("Girar");
			btnGirar.setBounds(102, 502, 97, 25);
			panel.add(btnGirar);
			
			JButton btnSacarBool = new JButton("SACAR BOOL");
			btnSacarBool.setBounds(66, 464, 168, 25);
			panel.add(btnSacarBool);
			
			JButton btnSacarX = new JButton("SACAR X");
			btnSacarX.setBounds(102, 430, 97, 25);
			panel.add(btnSacarX);
			
			JButton btnSacarY = new JButton("SACAR Y");
			btnSacarY.setBounds(102, 392, 97, 25);
			panel.add(btnSacarY);
			
			JButton btnT = new JButton("T");
			btnT.setBounds(20, 153, 97, 25);
			contentPane.add(btnT);
			
			JButton btnI = new JButton("I");
			btnI.setBounds(20, 187, 97, 25);
			contentPane.add(btnI);
			
			JButton btnO = new JButton("O");
			btnO.setBounds(20, 219, 97, 25);
			contentPane.add(btnO);
			
			JButton btnL = new JButton("L");
			btnL.setBounds(20, 248, 97, 25);
			contentPane.add(btnL);
			
			JButton btnR = new JButton("R");
			btnR.setBounds(20, 276, 97, 25);
			contentPane.add(btnR);
			
			JButton btnS = new JButton("S");
			btnS.setBounds(20, 306, 97, 25);
			contentPane.add(btnS);
			
			JButton btnZ = new JButton("Z");
			btnZ.setBounds(20, 338, 97, 25);
			contentPane.add(btnZ);
			
			JButton btnBajar = new JButton("BAJAR");
			btnBajar.setBounds(102, 354, 97, 25);
			panel.add(btnBajar);
		
		
		//CODIGO
			
			//CREACION DEL ARRAY
			
				String[][] campo;
				campo = new String[23][12]; //EL ARRAY TIENE QUE SER DE 21 * 9 PERO ESTA AUMENTADO PARA PROBAR LOS GIROS (sin que de error por out of index)
			
			//CREACION DE LA PIEZA
				
				 //CODIGOS DE PIEZAS: T - I - O - L - R - S - Z  //SOLO LA PIEZA T TIENE LOS METODOS DE GIRO Y LOS BOOLEANOS BIEN IMPLEMENTADOS	
				
	
		//ACTION LISTENERS
				

				 Ajustes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == Ajustes) {
								
								ajustes nuevaventana = new ajustes();
								nuevaventana.setVisible(true);

								// CIERRA LA VENTAN ACTUAL
								Ventana.this.dispose();
					        
							}	
		
						}
					});
				 
				
				
				
				 btnT.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnT) {
								
								Pieza t = creador_de_piezas.crear_pieza("T");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									
									
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
								        
							}	
		
						}
					});
				 

				 btnI.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnI) {
								
								Pieza t = creador_de_piezas.crear_pieza("I");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
							}	
		
						}
					});
				 
			

				 btnL.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnL) {
								
								Pieza t = creador_de_piezas.crear_pieza("L");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
							}	
		
						}
					});
		

				 btnO.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnO) {
								
								Pieza t = creador_de_piezas.crear_pieza("O");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
							}	
		
						}
					});
				 
				 

				 btnR.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnR) {
								
								Pieza t = creador_de_piezas.crear_pieza("R");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
							}	
		
						}
					});
				 

				 btnS.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnS) {
								
								Pieza t = creador_de_piezas.crear_pieza("S");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
									 
									 
							}	
		
						}
					});
				 

				 btnZ.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnZ) {
								
								Pieza t = creador_de_piezas.crear_pieza("Z");
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
									
									campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
							}	
		
						}
					});
				 
				 btnGirar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnGirar) {
								
								//GIROS
								
								//Cada vez que llamas a la funcion gira la pieza ( ORIGINAL --> DERECHA --> ALREVES --> IZQUIERDA --> ORIGINAL... ) //El orden de giro ha de ser siempre ORIGINAL --> DERECHA --> ALREVES --> IZQUIERDA --> ORIGINAL...
								
								Pieza t = creador_de_piezas.crear_pieza("T");
								
								t.setOrientacion();
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] = t.getc1().getCod_cuadrado();
									
									campo[t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
									
									campo[t.getc3().gety()][t.getc3().getx()] = t.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int i=campo.length;i>0;i--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[i-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);
									 
									 for (int i = 0;i<campo.length;i++){
										 
								            for(int j=0;j<campo[0].length;j++){
								            	
									            	campo[i][j]= null;
									            }
									        }
									 
									 
									 Pieza e = creador_de_piezas.crear_pieza("T");
										
										e.setOrientacion();
										e.setOrientacion();
										
										//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
										
											campo[e.getc0().gety()][e.getc0().getx()] = e.getc0().getCod_cuadrado();
											
											campo[e.getc1().gety()][e.getc1().getx()] = e.getc1().getCod_cuadrado();
											
											campo[e.getc2().gety()][e.getc2().getx()] = e.getc2().getCod_cuadrado();
											
											campo[e.getc3().gety()][e.getc3().getx()] = e.getc3().getCod_cuadrado();
											
										//DIBUJA EL CAMPO
										
											String ESOg1 = "";
											 for (int i=campo.length;i>0;i--){
											//System.out.print("\n");
												 ESOg1 = ESOg1 + "\n";
										            for(int j=0;j<campo[0].length;j++){
										            	ESOg1 = ESOg1 + campo[i-1][j]+ " ";
										            	//System.out.print(campo[i-1][j]+ " ");
										            }
										        }
											 
											 JOptionPane.showMessageDialog(null, ESOg1);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
									 
									 
									 Pieza w = creador_de_piezas.crear_pieza("T");
										
										w.setOrientacion();
										w.setOrientacion();
										w.setOrientacion();
										
										//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
										
											campo[w.getc0().gety()][w.getc0().getx()] = w.getc0().getCod_cuadrado();
											
											campo[w.getc1().gety()][w.getc1().getx()] = w.getc1().getCod_cuadrado();
											
											campo[w.getc2().gety()][w.getc2().getx()] = w.getc2().getCod_cuadrado();
											
											campo[w.getc3().gety()][w.getc3().getx()] = w.getc3().getCod_cuadrado();
											
										//DIBUJA EL CAMPO
										
											String ESOg2 = "";
											 for (int i=campo.length;i>0;i--){
											//System.out.print("\n");
												 ESOg2 = ESOg2 + "\n";
										            for(int j=0;j<campo[0].length;j++){
										            	ESOg2 = ESOg2 + campo[i-1][j]+ " ";
										            	//System.out.print(campo[i-1][j]+ " ");
										            }
										        }
											 
											 JOptionPane.showMessageDialog(null, ESOg2);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
									 
									 Pieza g = creador_de_piezas.crear_pieza("T");
										
										g.setOrientacion();
										g.setOrientacion();
										g.setOrientacion();
										g.setOrientacion();
										
										//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
										
											campo[g.getc0().gety()][g.getc0().getx()] = g.getc0().getCod_cuadrado();
											
											campo[g.getc1().gety()][g.getc1().getx()] = g.getc1().getCod_cuadrado();
											
											campo[g.getc2().gety()][g.getc2().getx()] = g.getc2().getCod_cuadrado();
											
											campo[g.getc3().gety()][g.getc3().getx()] = g.getc3().getCod_cuadrado();
											
										//DIBUJA EL CAMPO
										
											String ESOg3 = "";
											 for (int i=campo.length;i>0;i--){
											//System.out.print("\n");
												 ESOg3 = ESOg3 + "\n";
										            for(int j=0;j<campo[0].length;j++){
										            	ESOg3 = ESOg3 + campo[i-1][j]+ " ";
										            	//System.out.print(campo[i-1][j]+ " ");
										            }
										        }
											 
											 JOptionPane.showMessageDialog(null, ESOg3);
									 
								//RESETEA EL CAMPO
									 
									 for (int i = 0;i<campo.length;i++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[i][j]= null;
								            }
								        }
							}	
		
						}
					});
				 
				 btnSacarBool.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnSacarBool) {
								
								Pieza t = creador_de_piezas.crear_pieza("T");					
									 
								//ENSEÑA EL CAMPO 
									
									System.out.println("La orientacion es: " + t.getOrientacion());
									
									System.out.println("");
									System.out.println("El boolean de abajo de c0 es: " + t.getc0().getabajo());
									System.out.println("");
									System.out.println("El boolean de derecha de c0 es: " + t.getc0().getderecha());
									System.out.println("");
									System.out.println("El boolean de izquierda de c0 es: " + t.getc0().getizquierda());
									System.out.println("");
									System.out.println("");
									System.out.println("El boolean de abajo de c1 es: " + t.getc1().getabajo());
									System.out.println("");
									System.out.println("El boolean de derecha de c1 es: " + t.getc1().getderecha());
									System.out.println("");
									System.out.println("El boolean de izquierda de c1 es: " + t.getc1().getizquierda());
									System.out.println("");
									System.out.println("");
									System.out.println("El boolean de abajo de c2 es: " +  t.getc2().getabajo());
									System.out.println("");
									System.out.println("El boolean de derecha de c2 es: " + t.getc2().getderecha());
									System.out.println("");
									System.out.println("El boolean de izquierda de c2 es: " + t.getc2().getizquierda());
									System.out.println("");
									System.out.println("");
									System.out.println("El boolean de abajo de c3 es: " +  t.getc3().getabajo());
									System.out.println("");
									System.out.println("El boolean de derecha de c3 es: " + t.getc3().getderecha());
									System.out.println("");
									System.out.println("El boolean de izquierda de c3 es: " + t.getc3().getizquierda());
									System.out.println("");
									 
							
							}	
		
						}
					});
				 
				 btnSacarX.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnSacarX) {
								
								Pieza t = creador_de_piezas.crear_pieza("T");
								
									 
								//ENSEÑA EL CAMPO 
									System.out.println("");
									System.out.println("La orientacion es: " + t.getOrientacion());
									System.out.println("");
									System.out.println("");
									System.out.println("La x de c0 es: " + t.getc0().getx());
									System.out.println("");
									
									System.out.println("La x de c1 es: " + t.getc1().getx());
									System.out.println("");
									
									System.out.println("La x de c2 es: " + t.getc2().getx());
									System.out.println("");
									
									System.out.println("La x de c3 es: " + t.getc3().getx());
									System.out.println("");
									
									 
							
							}	
		
						}
					});
				 
				 btnSacarY.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnSacarY) {
								
								Pieza t = creador_de_piezas.crear_pieza("T");
									 
								//ENSEÑA EL CAMPO 
								
									System.out.println("");
									System.out.println("La orientacion es: " + t.getOrientacion());
									System.out.println("");
									System.out.println("");
									
									System.out.println("La y de c0 es: " + t.getc0().gety());
									System.out.println("");
									
									System.out.println("La y de c1 es: " + t.getc1().gety());
									System.out.println("");
									
									System.out.println("La y de c2 es: " + t.getc2().gety());
									System.out.println("");
									
									System.out.println("La y de c3 es: " + t.getc3().gety());
									System.out.println("");
									
									 
							
							}	
		
						}
					});
				 
					btnBajar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							Pieza t = creador_de_piezas.crear_pieza("T");
							
							//MOVIMIENTO DE LA PIEZA
				
							//Estas lineas manda la ficha al final del array
							
							t.getc2().sety(0); //sabemos que el fondo es 0
							
							//sabemos que estos bloques estan 1 por encima de c2 en este caso
							t.getc0().sety(t.getc2().gety()+1); 
							t.getc1().sety(t.getc2().gety()+1);
							t.getc3().sety(t.getc2().gety()+1);
							
							//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
							
								campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
								
								campo[t.getc1().gety()][t.getc1().getx()] =t.getc1().getCod_cuadrado();
								
								campo[ t.getc2().gety()][t.getc2().getx()] = t.getc2().getCod_cuadrado();
								
								campo[ t.getc3().gety()][ t.getc3().getx()] =  t.getc3().getCod_cuadrado();
								
							//DIBUJA EL CAMPO
							
								String ESO = "";
								 for (int i=campo.length;i>0;i--){
								//System.out.print("\n");
								ESO = ESO + "\n";
							            for(int j=0;j<campo[0].length;j++){
							            	ESO = ESO + campo[i-1][j]+ " ";
							            	//System.out.print(campo[i-1][j]+ " ");
							            }
							        }
								 
							//ENSEÑA EL CAMPO 
								 
								 JOptionPane.showMessageDialog(null, ESO);
								
								
							//RESETEA EL CAMPO
								 
								 for (int i = 0;i<campo.length;i++){
									 
						            for(int j=0;j<campo[0].length;j++){
						            	
							            	campo[i][j]= null;
							            }
							        }
						}
					});	 
				 
	}

}
