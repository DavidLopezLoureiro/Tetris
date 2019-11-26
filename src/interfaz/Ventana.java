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
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import imagenes.AsignadorDeFotosDePiezas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import interfaz.Tablero;

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
	private static Pieza guardada; //para guardar la pieza 
	
	public static int x_0;
	public static int y_0;
	
	public static int x_1;
	public static int y_1;
	
	public static int x_2;
	public static int y_2;
	
	public static int x_3;
	public static int y_3;
	
	private static Timer movimiento;

	
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
			
			
			//INSERCION DE PIEZAS EN LA LISTA POR PRIMERA VEZ
			
				lista = CreadorDePiezas.crear_lista_pirmera_vez();
	
				pieza_siguiente.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(0)))));
				pieza_siguiente_2.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(1)))));
				pieza_siguiente_3.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(2)))));
				pieza_siguiente_4.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3)))));
				//pieza_guardada.setIcon(new ImageIcon(Ventana.class.getResource(AsignadorDeFotosDePiezas.poner_foto(lista.get(3))))); para poner la imagen de la foto de la pieza que este guardada
	
			
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
				 
			
					x_0 = (Pieza.getc0().getx() * 30);
					x_1 = (Pieza.getc1().getx() * 30);
					x_2 = (Pieza.getc2().getx() * 30);
					x_3 = (Pieza.getc3().getx() * 30);
					
					javax.swing.Timer movimiento = new javax.swing.Timer(1, new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent ae) {
							try {
								Thread.sleep(300);
								
								if(Pieza.getc0().getabajo()==true) {
									if (campo[Pieza.getc0().gety()][Pieza.getc0().getx()] == null) {
										if(Pieza.getc0().gety() > 0 && Pieza.getc1().gety() > 0 &&Pieza.getc2().gety() > 0 && Pieza.getc3().gety() > 0) {
											movimientoabajo(x_0, x_1, x_2, x_3);
										}else {
											parar();
										}
									}
						
								}else if((Pieza.getc1().getabajo()==true)) {
									if(campo[Pieza.getc1().gety()][Pieza.getc1().getx()] == null) {
										if(Pieza.getc0().gety() > 0 && Pieza.getc1().gety() > 0 &&Pieza.getc2().gety() > 0 && Pieza.getc3().gety() > 0) {
											movimientoabajo(x_0, x_1, x_2, x_3);
										}else {
											parar();
									}
								}
								
								}else if(Pieza.getc2().getabajo()==true) {
									if(campo[Pieza.getc2().gety()][Pieza.getc2().getx()] == null) {
										if(Pieza.getc0().gety() > 0 && Pieza.getc1().gety() > 0 &&Pieza.getc2().gety() > 0 && Pieza.getc3().gety() > 0) {
											movimientoabajo(x_0, x_1, x_2, x_3);
										}else {
											parar();
									}
								}
								
								}else if(Pieza.getc3().getabajo()==true) {
									if (campo[Pieza.getc3().gety()][Pieza.getc3().getx()] == null) {
										if(Pieza.getc0().gety() > 0 && Pieza.getc1().gety() > 0 &&Pieza.getc2().gety() > 0 && Pieza.getc3().gety() > 0) {
											movimientoabajo(x_0, x_1, x_2, x_3);
										}else {
											parar();
									}
								}
							}
			
							} catch (InterruptedException e) {
							
							}
								
						}
					});
					movimiento.start();
					
		}
	
	public void parar() {
		
		movimiento.stop();
		System.out.println("PARO");
	}
	
	public void movimientoabajo(int x_0, int x_1, int x_2, int x_3) {
	
			Pieza.getc0().sety(Pieza.getc0().gety() - 1);
			y_0 = (20 - Pieza.getc0().gety()) * 30;
			
			Pieza.getc1().sety(Pieza.getc1().gety() - 1);
			y_1 = (20 - Pieza.getc1().gety()) * 30;
			
			Pieza.getc2().sety(Pieza.getc2().gety() - 1);
			y_2 = (20 - Pieza.getc2().gety()) * 30;
			
			Pieza.getc3().sety(Pieza.getc3().gety() - 1);
			y_3 = (20 - Pieza.getc3().gety()) * 30;
			
			//aqui llama a la funcion de choques
	
	}
	
	public void choque_abajo(int y_0, int y_1, int y_2, int y_3) {
		
		Pieza.getc0().sety(Pieza.getc0().gety() - 1);
		y_0 = (20 - Pieza.getc0().gety()) * 30;
		
		Pieza.getc1().sety(Pieza.getc1().gety() - 1);
		y_1 = (20 - Pieza.getc1().gety()) * 30;
		
		Pieza.getc2().sety(Pieza.getc2().gety() - 1);
		y_2 = (20 - Pieza.getc2().gety()) * 30;
		
		Pieza.getc3().sety(Pieza.getc3().gety() - 1);
		y_3 = (20 - Pieza.getc3().gety()) * 30;
		
		//aqui llama a la funcion de choques

}

}
