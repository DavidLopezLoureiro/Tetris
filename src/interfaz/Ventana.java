package interfaz;

import java.awt.Color;
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
import interfaz.Tablero;

import objetos.Pieza;
import objetos.CreadorDePiezas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements KeyListener{

	private JPanel contentPane;
	
	public static String Cod_pieza_actual;
	public static ArrayList<String> lista;
	private static int lineas;
	public static Dificultad dificultad;
	private static Pieza guardada; //para guardar la pieza 
	
	public static int x_0;
	public static int y_0;
	
	public static int x_1;
	public static int y_1;
	
	public static int x_2;
	public static int y_2;
	
	public static int x_3;
	public static int y_3;
	
	public static String[][] campo;

	
	public enum Dificultad { FACIL, MEDIO, DIFICIL }
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		 if (key == KeyEvent.VK_DOWN) {
			 
			 while(choque_abajo() == false) {
					
					movimientoabajo();
			 }
		  
		 } 
	
		 if (key == KeyEvent.VK_LEFT) {
			 
			 movimientoizquierda();
		  
		 }
		 
		 if (key == KeyEvent.VK_RIGHT) {
			 
			 movimientoderecha();
		  
		 }
		 
		 if (key == KeyEvent.VK_SPACE) {
			 
		  System.out.println("Presion� Espacio!" + (char) key);
		  
		 }
		 
		
	}
	 
	@Override
	public void keyReleased(KeyEvent e) {}
	 
	@Override
	public void keyTyped(KeyEvent e) {}

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
		
		//CREACION DEL ARRAY
		
			
			campo = new String[21][9]; //EL ARRAY TIENE QUE SER DE 21 * 9 PERO ESTA AUMENTADO PARA PROBAR LOS GIROS (sin que de error por out of index)
		
		
		//LISTA DE PIEZAS
		
			lista = new ArrayList<String>();
	
		//AJUSTES GENERALES
			
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 616, 707);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
		
			
		//PANELES
			
			//TABLERO
				JPanel panel = new JPanel();
				panel.setBackground(Color.DARK_GRAY);
				panel.setBounds(167, 13, 290, 650);
				contentPane.add(panel);
				panel.setLayout(null);
				
				Tablero tablero = new Tablero();
				tablero.setBounds(10, 10, 270, 630);
				panel.add(tablero);
				
				
			
			//GUARDAR
				JPanel t_guardada = new JPanel();
				t_guardada.setBackground(Color.DARK_GRAY);
				t_guardada.setBounds(10, 13, 145, 160);
				contentPane.add(t_guardada);
				t_guardada.setLayout(null);
				
				JPanel panel_guardar = new JPanel();
				panel_guardar.setBackground(Color.WHITE);
				panel_guardar.setBounds(12, 32, 121, 121);
				t_guardada.add(panel_guardar);
				panel_guardar.setLayout(null);
				
			//SIGUIENTES
				JPanel Siguiente_siguientes = new JPanel();
				Siguiente_siguientes.setBackground(Color.DARK_GRAY);
				Siguiente_siguientes.setBounds(469, 13, 132, 542);
				contentPane.add(Siguiente_siguientes);
				Siguiente_siguientes.setLayout(null);
				
				JPanel Siguientes = new JPanel();
				Siguientes.setBounds(10, 144, 112, 387);
				Siguientes.setBackground(Color.DARK_GRAY);
				Siguiente_siguientes.add(Siguientes);
				Siguientes.setLayout(null);
		
				JPanel Siguiente = new JPanel();
				Siguiente.setBounds(10, 11, 112, 112);
				Siguiente.setBackground(Color.WHITE);
				Siguiente_siguientes.add(Siguiente);
				Siguiente.setLayout(null);
				
				JPanel panel_siguiente_1 = new JPanel();
				panel_siguiente_1.setLayout(null);
				panel_siguiente_1.setBackground(Color.WHITE);
				panel_siguiente_1.setBounds(0, 15, 112, 112);
				Siguientes.add(panel_siguiente_1);
				
				JPanel panel_siguiente_2 = new JPanel();
				panel_siguiente_2.setLayout(null);
				panel_siguiente_2.setBackground(Color.WHITE);
				panel_siguiente_2.setBounds(0, 140, 112, 112);
				Siguientes.add(panel_siguiente_2);
				
				JPanel panel_siguiente_3 = new JPanel();
				panel_siguiente_3.setLayout(null);
				panel_siguiente_3.setBackground(Color.WHITE);
				panel_siguiente_3.setBounds(0, 265, 112, 112);
				Siguientes.add(panel_siguiente_3);
				
			//DATOS
				JPanel Info = new JPanel();
				Info.setBounds(10, 486, 145, 167);
				contentPane.add(Info);
				Info.setLayout(null);
		
		//LABELS
			
			JLabel pieza_siguiente = new JLabel("");
			pieza_siguiente.setBounds(10, 11, 92, 92);
			Siguiente.add(pieza_siguiente);
	
			JLabel pieza_siguiente_2 = new JLabel("");
			pieza_siguiente_2.setBounds(10, 11, 92, 92);
			panel_siguiente_1.add(pieza_siguiente_2);
	
			JLabel pieza_siguiente_3 = new JLabel("");
			pieza_siguiente_3.setBounds(10, 11, 92, 92);
			panel_siguiente_2.add(pieza_siguiente_3);
	
			JLabel pieza_siguiente_4 = new JLabel("");
			pieza_siguiente_4.setBounds(10, 11, 92, 92);
			panel_siguiente_3.add(pieza_siguiente_4);
			
			JLabel lblEspera = new JLabel("Espera");
			lblEspera.setForeground(Color.WHITE);
			lblEspera.setBounds(10, 11, 122, 22);
			t_guardada.add(lblEspera);
			lblEspera.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblEspera.setHorizontalAlignment(SwingConstants.CENTER);
			
			JLabel pieza_guardada = new JLabel("");
			pieza_guardada.setBounds(16, 16, 92, 92);
			panel_guardar.add(pieza_guardada);
			pieza_guardada.setBackground(Color.WHITE);
			
	
	/* COMENTADO PARA HACER PRUEBAS RAPIDAS EN LUGAR DE TENER QUE INICIAR SESION CADA VEZ
			JLabel lblUsuario = new JLabel("Usuario:  " + IniciarSesion.entrada.getNombre());
			lblUsuario.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblUsuario.setBounds(10, 11, 122, 22);
			Info.add(lblUsuario);
	
			JLabel lblPuntuacion = new JLabel("Puntuacion: " + IniciarSesion.entrada.getMaxPuntu());
			lblPuntuacion.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblPuntuacion.setBounds(10, 41, 122, 14);
			Info.add(lblPuntuacion);
	*/
	
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
				Ajustes.setBounds(469, 575, 132, 78);
				contentPane.add(Ajustes);
				Ajustes.addKeyListener(this);
			
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
				
			
						
		//FONDO	
		
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/fondoTetris.jpg")));
			lblNewLabel.setBounds(0, 0, 682, 803);
			contentPane.add(lblNewLabel);
			
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
				 

					//INSERCION DE PIEZAS EN LA LISTA POR PRIMERA VEZ
					
						lista = CreadorDePiezas.crear_lista_pirmera_vez(); //PASAR A LA VENTANA ANTERIOR
			
						pieza_siguiente.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(0)))));
						pieza_siguiente_2.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(1)))));
						pieza_siguiente_3.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(2)))));
						pieza_siguiente_4.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3)))));
						
						//pieza_guardada.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3))))); para poner la imagen de la foto de la pieza que este guardada
			
					
					//Inicializa el campo
						

						 for (int i = 0;i<campo.length;i++){
							 
				            for(int j=0;j<campo[0].length;j++){
				            	
					            	campo[i][j]= null;
					            }
					        }
					
						 //SACA LA PRIMERA PIEZA Y MUEVE LA LISTA DE PIEZAS
						 
						 CreadorDePiezas.mover_lista();
						 
						 	campo[Pieza.getc0().gety()][Pieza.getc0().getx()] = Pieza.getc0().getCod_cuadrado();
							
							campo[Pieza.getc1().gety()][Pieza.getc1().getx()] = Pieza.getc1().getCod_cuadrado();
							
							campo[Pieza.getc2().gety()][Pieza.getc2().getx()] = Pieza.getc2().getCod_cuadrado();
							
							campo[Pieza.getc3().gety()][Pieza.getc3().getx()] = Pieza.getc3().getCod_cuadrado();
							
						
						//MUEVE LA LISTA
							pieza_siguiente.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(0)))));
							pieza_siguiente_2.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(1)))));
							pieza_siguiente_3.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(2)))));
							pieza_siguiente_4.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3)))));
			
					x_0 = (Pieza.getc0().getx() * 30);
					x_1 = (Pieza.getc1().getx() * 30);
					x_2 = (Pieza.getc2().getx() * 30);
					x_3 = (Pieza.getc3().getx() * 30);
					
					javax.swing.Timer movimiento = new javax.swing.Timer(1, new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent ae) {
							try {
								Thread.sleep(300);
								
										if(choque_abajo() == false) {
											
											movimientoabajo();
															
										}else{
										
										for(int i = 0; i < 9 ; i++) {
											
											if(campo[20][i] != null) {
												 JOptionPane.showMessageDialog(null, "GAME OVER");
												 
												 for (int P = 0;P<campo.length;P++){
													 
											            for(int j=0;j<campo[0].length;j++){
											            	
												            	campo[P][j]= null;
												            }
												        }
												 
											}
										}
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
													
													x_0 = (Pieza.getc0().getx() * 30);
													x_1 = (Pieza.getc1().getx() * 30);
													x_2 = (Pieza.getc2().getx() * 30);
													x_3 = (Pieza.getc3().getx() * 30);
													
													movimientoabajo();
													
										}
									
							
							} catch (InterruptedException e) {
							
							}
								
						}
					});
					movimiento.start();
					
		}
	
	public void movimientoabajo() {	 	
		 	
		 	if(choque_abajo() == false) {
		 		
		 		borrar_donde_estaba();
	
				Pieza.getc0().sety(Pieza.getc0().gety() - 1);
				y_0 = (20 - Pieza.getc0().gety()) * 30;
				
				Pieza.getc1().sety(Pieza.getc1().gety() - 1);
				y_1 = (20 - Pieza.getc1().gety()) * 30;
				
				Pieza.getc2().sety(Pieza.getc2().gety() - 1);
				y_2 = (20 - Pieza.getc2().gety()) * 30;
				
				Pieza.getc3().sety(Pieza.getc3().gety() - 1);
				y_3 = (20 - Pieza.getc3().gety()) * 30;
				
				campo[Pieza.getc0().gety()][Pieza.getc0().getx()] = Pieza.getc0().getCod_cuadrado();
				campo[Pieza.getc1().gety()][Pieza.getc1().getx()] = Pieza.getc1().getCod_cuadrado();
				campo[Pieza.getc2().gety()][Pieza.getc2().getx()] = Pieza.getc2().getCod_cuadrado();
				campo[Pieza.getc3().gety()][Pieza.getc3().getx()] = Pieza.getc3().getCod_cuadrado();
			
		 	}
	
	}
	
	public void movimientoizquierda() {	 	
	 	
	 	if(choque_izquierda() == false) {
	 		
	 		borrar_donde_estaba();

			Pieza.getc0().setx(Pieza.getc0().getx() - 1);
			x_0 = Pieza.getc0().getx() * 30;
			
			Pieza.getc1().setx(Pieza.getc1().getx() - 1);
			x_1 = Pieza.getc1().getx() * 30;
			
			Pieza.getc2().setx(Pieza.getc2().getx() - 1);
			x_2 = Pieza.getc2().getx() * 30;
			
			Pieza.getc3().setx(Pieza.getc3().getx() - 1);
			x_3 = Pieza.getc3().getx() * 30;
			
			campo[Pieza.getc0().gety()][Pieza.getc0().getx()] = Pieza.getc0().getCod_cuadrado();
			campo[Pieza.getc1().gety()][Pieza.getc1().getx()] = Pieza.getc1().getCod_cuadrado();
			campo[Pieza.getc2().gety()][Pieza.getc2().getx()] = Pieza.getc2().getCod_cuadrado();
			campo[Pieza.getc3().gety()][Pieza.getc3().getx()] = Pieza.getc3().getCod_cuadrado();
		
	 	}

}
	
	public void movimientoderecha() {	 	
	 	
	 	if(choque_derecha() == false) {
	 		
	 		borrar_donde_estaba();

			Pieza.getc0().setx(Pieza.getc0().getx() + 1);
			x_0 = Pieza.getc0().getx() * 30;
			
			Pieza.getc1().setx(Pieza.getc1().getx() + 1);
			x_1 = Pieza.getc1().getx() * 30;
			
			Pieza.getc2().setx(Pieza.getc2().getx() + 1);
			x_2 = Pieza.getc2().getx() * 30;
			
			Pieza.getc3().setx(Pieza.getc3().getx() + 1);
			x_3 = Pieza.getc3().getx() * 30;
			
			campo[Pieza.getc0().gety()][Pieza.getc0().getx()] = Pieza.getc0().getCod_cuadrado();
			campo[Pieza.getc1().gety()][Pieza.getc1().getx()] = Pieza.getc1().getCod_cuadrado();
			campo[Pieza.getc2().gety()][Pieza.getc2().getx()] = Pieza.getc2().getCod_cuadrado();
			campo[Pieza.getc3().gety()][Pieza.getc3().getx()] = Pieza.getc3().getCod_cuadrado();
		
	 	}
	}
	
	public void borrar_donde_estaba() {
		
		//BORRA LA POSICION EN LA QUE ESTABA EL CUADRADO
		
		campo[Pieza.getc0().gety()][Pieza.getc0().getx()] = null;
		campo[Pieza.getc1().gety()][Pieza.getc1().getx()] = null;
		campo[Pieza.getc2().gety()][Pieza.getc2().getx()] = null;
		campo[Pieza.getc3().gety()][Pieza.getc3().getx()] = null;
		
	}
	
	public boolean choque_abajo() {
		
		//COMPRUEBA QUE LA PIEZA AL BAJAR NO CHOQUE
		
		if(Pieza.getc0().gety() == 0 || Pieza.getc1().gety() == 0 || Pieza.getc2().gety() == 0 || Pieza.getc3().gety() == 0) {
			
			return true;
			
		}
		
		if(Pieza.getc0().getabajo() == true){
			
			if(campo[Pieza.getc0().gety()-1][Pieza.getc0().getx()] == null) {
				
				
			}else {
				
				return true;
				
			}
			
		}
		
		if(Pieza.getc1().getabajo() == true) {
			
			if(campo[Pieza.getc1().gety()-1][Pieza.getc1().getx()] == null) {
				
				
			}else {
				
				return true;
				
			}
			
		}
		
		if(Pieza.getc2().getabajo() == true) {
			
			if(campo[Pieza.getc2().gety()-1][Pieza.getc2().getx()] == null) {
				
				
			}else {
				return true;
			}
			
		}
		
		if(Pieza.getc3().getabajo() == true) {
			
			if(campo[Pieza.getc3().gety()-1][Pieza.getc3().getx()] == null) {
				
				
			}else {
				return true;
			}
		
		}
		return false;
	}
	
	public boolean choque_izquierda() {
		
		//COMPRUEBA QUE LA PIEZA AL BAJAR NO CHOQUE
		
		if(Pieza.getc0().getx() == 0 || Pieza.getc1().getx() == 0 || Pieza.getc2().getx() == 0 || Pieza.getc3().getx() == 0) {
			
			return true;
			
		}
		
		if(Pieza.getc0().getizquierda() == true){
			
			if(campo[Pieza.getc0().gety()][Pieza.getc0().getx() - 1] == null) {
				
				
			}else {
				
				return true;
				
			}
			
		}
		
		if(Pieza.getc1().getizquierda() == true) {
			
			if(campo[Pieza.getc1().gety()][Pieza.getc1().getx()-1] == null) {
				
				
			}else {
				
				return true;
				
			}
			
		}
		
		if(Pieza.getc2().getizquierda() == true) {
			
			if(campo[Pieza.getc2().gety()][Pieza.getc2().getx()-1] == null) {
				
				
			}else {
				return true;
			}
			
		}
		
		if(Pieza.getc3().getizquierda() == true) {
			
			if(campo[Pieza.getc3().gety()][Pieza.getc3().getx()-1] == null) {
				
				
			}else {
				return true;
			}
		
		}
		return false;
	}
	
	
	public boolean choque_derecha() {
		
		//COMPRUEBA QUE LA PIEZA AL BAJAR NO CHOQUE
		
		if(Pieza.getc0().getx() == 8 || Pieza.getc1().getx() == 8 || Pieza.getc2().getx() == 8 || Pieza.getc3().getx() == 8) {
			
			return true;
			
		}
		
		if(Pieza.getc0().getderecha() == true){
			
			if(campo[Pieza.getc0().gety()][Pieza.getc0().getx() + 1] == null) {
				
				
			}else {
				
				return true;
				
			}
			
		}
		
		if(Pieza.getc1().getderecha() == true) {
			
			if(campo[Pieza.getc1().gety()][Pieza.getc1().getx()+1] == null) {
				
				
			}else {
				
				return true;
				
			}
			
		}
		
		if(Pieza.getc2().getderecha() == true) {
			
			if(campo[Pieza.getc2().gety()][Pieza.getc2().getx()+1] == null) {
				
				
			}else {
				return true;
			}
			
		}
		
		if(Pieza.getc3().getderecha() == true) {
			
			if(campo[Pieza.getc3().gety()][Pieza.getc3().getx()+1] == null) {
				
				
			}else {
				return true;
			}
		
		}
		return false;
	}

}
