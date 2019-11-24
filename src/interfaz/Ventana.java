package interfaz;



import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import imagenes.AsignadorDeFotosDePiezas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;


import objetos.Pieza;
import objetos.CreadorDePiezas;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JPanel contentPane;
	
	public static String Cod_pieza_actual;
	public static ArrayList<String> lista;
	private static String ESO;
	private static int lineas;
	public static Dificultad dificultad;
	
	public enum Dificultad { FACIL, MEDIO, DIFICIL }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
					 JOptionPane.showMessageDialog(null, ESO);
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
		
		//CREACION DEL ARRAY
		
			String[][] campo;
			campo = new String[23][12]; //EL ARRAY TIENE QUE SER DE 21 * 9 PERO ESTA AUMENTADO PARA PROBAR LOS GIROS (sin que de error por out of index)
		
		//LISTA DE PIEZAS
		
			lista = new ArrayList<String>();
	
		//AJUSTES GENERALES
			
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 613, 704);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
		
			
		//PANELES
			
			JPanel t_guardada = new JPanel();
			t_guardada.setBounds(10, 33, 122, 149);
			contentPane.add(t_guardada);
			t_guardada.setLayout(null);
			
			JPanel Siguiente_siguientes = new JPanel();
			Siguiente_siguientes.setBounds(455, 22, 132, 542);
			contentPane.add(Siguiente_siguientes);
			Siguiente_siguientes.setLayout(null);
			
			JPanel Siguientes = new JPanel();
			Siguientes.setBounds(10, 144, 112, 387);
			Siguiente_siguientes.add(Siguientes);
			Siguientes.setLayout(null);
	
			JPanel Siguiente = new JPanel();
			Siguiente.setBounds(10, 11, 112, 122);
			Siguiente_siguientes.add(Siguiente);
			Siguiente.setLayout(null);
			
			JPanel Info = new JPanel();
			Info.setBounds(10, 486, 145, 167);
			contentPane.add(Info);
			Info.setLayout(null);
			
			JPanel partida = new JPanel();
			partida.setBounds(175, 22, 270, 630);
			contentPane.add(partida);
			partida.setLayout(null);
		
		
		//LABELS
			
			JLabel pieza_siguiente = new JLabel("");
			pieza_siguiente.setBounds(10, 11, 92, 100);
			Siguiente.add(pieza_siguiente);
	
			JLabel pieza_siguiente_2 = new JLabel("");
			pieza_siguiente_2.setBounds(10, 23, 92, 92);
			Siguientes.add(pieza_siguiente_2);
	
			JLabel pieza_siguiente_3 = new JLabel("");
			pieza_siguiente_3.setBounds(10, 144, 92, 92);
			Siguientes.add(pieza_siguiente_3);
	
			JLabel pieza_siguiente_4 = new JLabel("");
			pieza_siguiente_4.setBounds(10, 271, 92, 92);
			Siguientes.add(pieza_siguiente_4);
			
			JLabel lblEspera = new JLabel("Espera");
			lblEspera.setBounds(0, 6, 122, 22);
			t_guardada.add(lblEspera);
			lblEspera.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblEspera.setHorizontalAlignment(SwingConstants.CENTER);
			
			JLabel pieza_guardada = new JLabel("");
			pieza_guardada.setBounds(10, 11, 102, 99);
			t_guardada.add(pieza_guardada);
	
	
			JLabel lblUsuario = new JLabel("Usuario:  " + IniciarSesion.entrada.getNombre());
			lblUsuario.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblUsuario.setBounds(10, 11, 122, 22);
			Info.add(lblUsuario);
	
			JLabel lblPuntuacion = new JLabel("Puntuacion: " + IniciarSesion.entrada.getMaxPuntu());
			lblPuntuacion.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblPuntuacion.setBounds(10, 41, 122, 14);
			Info.add(lblPuntuacion);
	
	
			lineas = 0; //este valor aumenta en uno cada vez que es llamada la funcion de linea llena.
			JLabel lblLineas = new JLabel("Lineas: " + lineas);
			lblLineas.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblLineas.setBounds(10, 66, 122, 14);
			Info.add(lblLineas);
			
			Ventana.dificultad = Ventana.Dificultad.FACIL;
			JLabel lblDificultad = new JLabel("Dificultad: " + dificultad);
			lblDificultad.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblDificultad.setBounds(10, 91, 135, 14);
			Info.add(lblDificultad);
			
			//AJUSTES
			
			JButton Ajustes = new JButton("Ajustes");
			Ajustes.setFont(new Font("Consolas", Font.PLAIN, 12));
			Ajustes.setBounds(455, 575, 132, 78);
			contentPane.add(Ajustes);
			
			//TIEMPO
			
				String fecha = new Date().toString();
				
				String[] dia = fecha.split(" ");

				JLabel lblFecha = new JLabel("Fecha: " + dia[2] + " " + dia[1]);
				lblFecha.setFont(new Font("Consolas", Font.PLAIN, 12));
				lblFecha.setBounds(10, 116, 122, 14);
				Info.add(lblFecha);
				
			//RELOJ
				
				JLabel lblHora = new JLabel("Hora: ");
				lblHora.setFont(new Font("Consolas", Font.PLAIN, 12));
				lblHora.setBounds(10, 141, 122, 14);
				Info.add(lblHora);
				
				javax.swing.Timer timer = new javax.swing.Timer(1, new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent ae) {
						
						Calendar calendario = Calendar.getInstance();
						
						int hora = calendario.get(Calendar.HOUR_OF_DAY);
						int minutos = calendario.get(Calendar.MINUTE);
						
						//PARA EL PARPADEO DE LOS PUNTOS
						
							if(calendario.get(Calendar.SECOND)%2 == 1) {
								
								if (minutos > 9) {
								
									lblHora .setText("Hora: " + hora + " " + minutos);
									
								}else if (minutos < 10) {
									
									lblHora .setText("Hora: " + hora + " 0" + minutos);
								}
							
							}else if(calendario.get(Calendar.SECOND)%2 == 0) {
								
								if (minutos > 9) {
							
									lblHora .setText("Hora: " + hora + ":" + minutos);
							
								}else if (minutos < 10) {
									
									lblHora .setText("Hora: " + hora + ":0" + minutos);
								}
							
							}
		
					}
				});
				timer.start();
				
				
				//INSERCION DE PIEZAS EN LA LISTA POR PRIMERA VEZ
				
					lista = CreadorDePiezas.crear_lista_pirmera_vez();
		
					pieza_siguiente.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(0)))));
					pieza_siguiente_2.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(1)))));
					pieza_siguiente_3.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(2)))));
					pieza_siguiente_4.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3)))));
		
				
				//SACA LA PRIMERA PIEZA DE LA LISTA AL CAMPO Y MUEVE EL RESTO DE LAS PIEZAS UN HUECO HACIA ADELANTE
				
					CreadorDePiezas.mover_lista();
					
					//MUEVE LA LISTA
						pieza_siguiente.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(0)))));
						pieza_siguiente_2.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(1)))));
						pieza_siguiente_3.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(2)))));
						pieza_siguiente_4.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3)))));
						
						campo[Pieza.getc0().gety()][Pieza.getc0().getx()] = Pieza.getc0().getCod_cuadrado();
						
						campo[Pieza.getc1().gety()][Pieza.getc1().getx()] = Pieza.getc1().getCod_cuadrado();
						
						campo[Pieza.getc2().gety()][Pieza.getc2().getx()] = Pieza.getc2().getCod_cuadrado();
						
						campo[Pieza.getc3().gety()][Pieza.getc3().getx()] = Pieza.getc3().getCod_cuadrado();
						
						//DIBUJA EL CAMPO
						
								 ESO = "";
								 
								 for (int i=campo.length;i>0;i--){
								//System.out.print("\n");
								ESO = ESO + "\n";
							            for(int j=0;j<campo[0].length;j++){
							            	ESO = ESO + campo[i-1][j]+ " ";
							            	
							            }
							        }
						 
						//RESETEA EL CAMPO
							 
								 for (int i = 0;i<campo.length;i++){
									 
						            for(int j=0;j<campo[0].length;j++){
						            	
							            	campo[i][j]= null;
							            }
							        }
					
			
						
		//FONDO	
		
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/fondoTetris.jpg")));
			lblNewLabel.setBounds(0, 0, 682, 803);
			contentPane.add(lblNewLabel);
	
				
		
			
			/**
			JButton btnGirar = new JButton("Girar");
			btnGirar.setBounds(102, 534, 97, 25);
			partida.add(btnGirar);
			
			JButton btnSacarBool = new JButton("SACAR BOOL");
			btnSacarBool.setBounds(66, 496, 168, 25);
			partida.add(btnSacarBool);
			
			JButton btnSacarX = new JButton("SACAR X");
			btnSacarX.setBounds(102, 462, 97, 25);
			partida.add(btnSacarX);
			
			JButton btnSacarY = new JButton("SACAR Y");
			btnSacarY.setBounds(102, 428, 97, 25);
			partida.add(btnSacarY);
			
			JButton btnT = new JButton("T");
			btnT.setBounds(20, 193, 97, 25);
			contentPane.add(btnT);
			
			JButton btnI = new JButton("I");
			btnI.setBounds(20, 222, 97, 25);
			contentPane.add(btnI);
			
			JButton btnO = new JButton("O");
			btnO.setBounds(20, 251, 97, 25);
			contentPane.add(btnO);
			
			JButton btnL = new JButton("L");
			btnL.setBounds(20, 280, 97, 25);
			contentPane.add(btnL);
			
			JButton btnR = new JButton("R");
			btnR.setBounds(20, 308, 97, 25);
			contentPane.add(btnR);
			
			JButton btnS = new JButton("S");
			btnS.setBounds(20, 338, 97, 25);
			contentPane.add(btnS);
			
			JButton btnZ = new JButton("Z");
			btnZ.setBounds(20, 370, 97, 25);
			contentPane.add(btnZ);
			
			JButton btnBajar = new JButton("BAJAR");
			btnBajar.setBounds(102, 396, 97, 25);
			partida.add(btnBajar);
		*/
			
		//ACTION LISTENERS
				

				 Ajustes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == Ajustes) {
								
								Ajustes nuevaventana = new Ajustes();
								nuevaventana.setVisible(true);

								// CIERRA LA VENTAN ACTUAL
								Ventana.this.dispose();
					        
							}	
		
						}
					});
				 
				
			/*	
				
				 btnT.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnT) {
							 
								PiezaT t = new PiezaT();
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[t.getc0().gety()][t.getc0().getx()] = t.getc0().getCod_cuadrado();
									
									campo[t.getc1().gety()][t.getc1().getx()] = t.getc1().getCod_cuadrado();
									
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
									 
									 partida.getGraphics().clearRect(0, 0, 630, 270);
									 
									 
									 JOptionPane.showMessageDialog(null, ESO);
	
									    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
									
									
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
								
								 partida.getGraphics().clearRect(0, 0, 630, 270);
								 
								 PiezaI i = new PiezaI();
								
								//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
								
									campo[i.getc0().gety()][i.getc0().getx()] = i.getc0().getCod_cuadrado();
									
									campo[i.getc1().gety()][i.getc1().getx()] =i.getc1().getCod_cuadrado();
									
									campo[ i.getc2().gety()][i.getc2().getx()] = i.getc2().getCod_cuadrado();
									
									campo[ i.getc3().gety()][ i.getc3().getx()] =  i.getc3().getCod_cuadrado();
									
								//DIBUJA EL CAMPO
								
									String ESO = "";
									 for (int w=campo.length;w>0;w--){
									//System.out.print("\n");
									ESO = ESO + "\n";
								            for(int j=0;j<campo[0].length;j++){
								            	ESO = ESO + campo[w-1][j]+ " ";
								            	//System.out.print(campo[i-1][j]+ " ");
								            }
								        }
									 
								//ENSEÑA EL CAMPO 
									 
									 JOptionPane.showMessageDialog(null, ESO);

									 
									    partida.getGraphics().fillRect(i.getc0().getx()*30,(20 - i.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(i.getc1().getx()*30,(20 - i.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(i.getc2().getx()*30,(20 - i.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(i.getc3().getx()*30,(20 - i.getc3().gety()) * 30 ,30,30);
									 
								//RESETEA EL CAMPO
									 
									 for (int w = 0;w<campo.length;w++){
										 
							            for(int j=0;j<campo[0].length;j++){
							            	
								            	campo[w][j]= null;
								            }
								        }
							}	
		
						}
					});
				 
			

				 btnL.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (arg0.getSource() == btnL) {
								
								 partida.getGraphics().clearRect(0, 0, 630, 270);
								
								Pieza t = CreadorDePiezas.crear_pieza("L");
								
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
									    
									    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
									 
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
								
								 partida.getGraphics().clearRect(0, 0, 630, 270);
								
								Pieza t = CreadorDePiezas.crear_pieza("O");
								
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
									    
									    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
									 
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
								
								 partida.getGraphics().clearRect(0, 0, 630, 270);
								
								Pieza t = CreadorDePiezas.crear_pieza("R");
								
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
									 
									    
									    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
									 
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
								
								 partida.getGraphics().clearRect(0, 0, 630, 270);
								
								Pieza t = CreadorDePiezas.crear_pieza("S");
								
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
									 
									    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
									 
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
								
								 partida.getGraphics().clearRect(0, 0, 630, 270);
								
								Pieza t = CreadorDePiezas.crear_pieza("Z");
								
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
									    
									    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
									    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
									 
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
								
								Pieza t = CreadorDePiezas.crear_pieza("T");					
									 
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
								
								Pieza t = CreadorDePiezas.crear_pieza("T");
								
									 
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
								
								Pieza t = CreadorDePiezas.crear_pieza("T");
									 
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
							
							Pieza t = CreadorDePiezas.crear_pieza("T");
							
							 partida.getGraphics().clearRect(0, 0, 630, 270);
							
							//MOVIMIENTO DE LA PIEZA
				
							//Estas lineas manda la ficha al final del array
							
							t.getc2().sety(0); //sabemos que el fondo del campo es 0
							
							//sabemos que estos bloques estan 1 por encima de c2 en este caso
							t.getc0().sety(t.getc2().gety()+1); 
							t.getc1().sety(t.getc2().gety()+1);
							t.getc3().sety(t.getc2().gety()+1);
							
							//METE CADA CUADRADO EN SU LUGAR DEL ARRAY
							
								campo[t.getc0().gety()] [t.getc0().getx()] = t.getc0().getCod_cuadrado();
								
								campo[t.getc1().gety()] [t.getc1().getx()] = t.getc1().getCod_cuadrado();
								
								campo[t.getc2().gety()] [t.getc2().getx()] = t.getc2().getCod_cuadrado();
								
								campo[t.getc3().gety()] [t.getc3().getx()] = t.getc3().getCod_cuadrado();
								
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
							    
							    partida.getGraphics().fillRect(t.getc0().getx()*30,(20 - t.getc0().gety()) * 30 ,30,30);
							    partida.getGraphics().fillRect(t.getc1().getx()*30,(20 - t.getc1().gety()) * 30 ,30,30);
							    partida.getGraphics().fillRect(t.getc2().getx()*30,(20 - t.getc2().gety()) * 30 ,30,30);
							    partida.getGraphics().fillRect(t.getc3().getx()*30,(20 - t.getc3().gety()) * 30 ,30,30);
						
								
							//RESETEA EL CAMPO
								 
								 for (int i = 0;i<campo.length;i++){
									 
						            for(int j=0;j<campo[0].length;j++){
						            	
							            	campo[i][j]= null;
							            	
							            	
							            }
							        }
						}
				});	 
				*/		 
		}

}
