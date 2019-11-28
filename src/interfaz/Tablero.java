package interfaz;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Tablero extends JPanel {
	
	public static int y_0;
	public static int x_0;
	
	public static int y_1;
	public static int x_1;
	
	public static int y_2;
	public static int x_2;
	
	public static int y_3;
	public static int x_3;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //PARA LA VERSION

	public Tablero() {
		setBorder(new LineBorder(Color.BLACK));
		this.setSize(270, 630);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics arg0) {
		
		super.paint(arg0);
		//pintamos las diferentes lineas del tablero
		//lineas horizontales
		arg0.drawLine(0,30,270,30 );
		arg0.drawLine(0,60,270,60 );
		arg0.drawLine(0,90,270,90 );
		arg0.drawLine(0,120,270,120 );
		arg0.drawLine(0,150,270,150 );
		arg0.drawLine(0,180,270,180 );
		arg0.drawLine(0,210,270,210 );
		arg0.drawLine(0,240,270,240 );
		arg0.drawLine(0,270,270,270 );
		arg0.drawLine(0,300,270,300 );
		arg0.drawLine(0,330,270,330 );
		arg0.drawLine(0,360,270,360 );
		arg0.drawLine(0,390,270,390 );
		arg0.drawLine(0,420,270,420 );
		arg0.drawLine(0,450,270,450 );
		arg0.drawLine(0,480,270,480 );
		arg0.drawLine(0,510,270,510 );
		arg0.drawLine(0,540,270,540 );
		arg0.drawLine(0,570,270,570 );
		arg0.drawLine(0,600,270,600 );
		arg0.drawLine(0,630,270,630 );
		//lineas verticales
		arg0.drawLine(0,0,0,630 );
		arg0.drawLine(30,0,30,630 );
		arg0.drawLine(60,0,60,630 );
		arg0.drawLine(90,0,90,630 );
		arg0.drawLine(120,0,120,630 );
		arg0.drawLine(150,0,150,630 );
		arg0.drawLine(180,0,180,630 );
		arg0.drawLine(210,0,210,630 );
		arg0.drawLine(240,0,240,630 );
		arg0.drawLine(270,0,270,630 );
		arg0.drawLine(300,0,300,630 );
		
		
			if(Ventana.campo[0][0] != null){
			arg0.fillRect(0,600,30,30);
			}

			if(Ventana.campo[0][1] != null){
			arg0.fillRect(30,600,30,30);
			}

			if(Ventana.campo[0][2] != null){
			arg0.fillRect(60,600,30,30);
			}

			if(Ventana.campo[0][3] != null){
			arg0.fillRect(90,600,30,30);
			}

			if(Ventana.campo[0][4] != null){
			arg0.fillRect(120,600,30,30);
			}

			if(Ventana.campo[0][5] != null){
			arg0.fillRect(150,600,30,30);
			}

			if(Ventana.campo[0][6] != null){
			arg0.fillRect(180,600,30,30);
			}

			if(Ventana.campo[0][7] != null){
			arg0.fillRect(210,600,30,30);
			}

			if(Ventana.campo[0][8] != null){
			arg0.fillRect(240,600,30,30);
			}

			if(Ventana.campo[1][0] != null){
			arg0.fillRect(0,570,30,30);
			}

			if(Ventana.campo[1][1] != null){
			arg0.fillRect(30,570,30,30);
			}

			if(Ventana.campo[1][2] != null){
			arg0.fillRect(60,570,30,30);
			}

			if(Ventana.campo[1][3] != null){
			arg0.fillRect(90,570,30,30);
			}

			if(Ventana.campo[1][4] != null){
			arg0.fillRect(120,570,30,30);
			}

			if(Ventana.campo[1][5] != null){
			arg0.fillRect(150,570,30,30);
			}

			if(Ventana.campo[1][6] != null){
			arg0.fillRect(180,570,30,30);
			}

			if(Ventana.campo[1][7] != null){
			arg0.fillRect(210,570,30,30);
			}

			if(Ventana.campo[1][8] != null){
			arg0.fillRect(240,570,30,30);
			}

			if(Ventana.campo[2][0] != null){
			arg0.fillRect(0,540,30,30);
			}

			if(Ventana.campo[2][1] != null){
			arg0.fillRect(30,540,30,30);
			}

			if(Ventana.campo[2][2] != null){
			arg0.fillRect(60,540,30,30);
			}

			if(Ventana.campo[2][3] != null){
			arg0.fillRect(90,540,30,30);
			}

			if(Ventana.campo[2][4] != null){
			arg0.fillRect(120,540,30,30);
			}

			if(Ventana.campo[2][5] != null){
			arg0.fillRect(150,540,30,30);
			}

			if(Ventana.campo[2][6] != null){
			arg0.fillRect(180,540,30,30);
			}

			if(Ventana.campo[2][7] != null){
			arg0.fillRect(210,540,30,30);
			}

			if(Ventana.campo[2][8] != null){
			arg0.fillRect(240,540,30,30);
			}

			if(Ventana.campo[3][0] != null){
			arg0.fillRect(0,510,30,30);
			}

			if(Ventana.campo[3][1] != null){
			arg0.fillRect(30,510,30,30);
			}

			if(Ventana.campo[3][2] != null){
			arg0.fillRect(60,510,30,30);
			}

			if(Ventana.campo[3][3] != null){
			arg0.fillRect(90,510,30,30);
			}

			if(Ventana.campo[3][4] != null){
			arg0.fillRect(120,510,30,30);
			}

			if(Ventana.campo[3][5] != null){
			arg0.fillRect(150,510,30,30);
			}

			if(Ventana.campo[3][6] != null){
			arg0.fillRect(180,510,30,30);
			}

			if(Ventana.campo[3][7] != null){
			arg0.fillRect(210,510,30,30);
			}

			if(Ventana.campo[3][8] != null){
			arg0.fillRect(240,510,30,30);
			}

			if(Ventana.campo[4][0] != null){
			arg0.fillRect(0,480,30,30);
			}

			if(Ventana.campo[4][1] != null){
			arg0.fillRect(30,480,30,30);
			}

			if(Ventana.campo[4][2] != null){
			arg0.fillRect(60,480,30,30);
			}

			if(Ventana.campo[4][3] != null){
			arg0.fillRect(90,480,30,30);
			}

			if(Ventana.campo[4][4] != null){
			arg0.fillRect(120,480,30,30);
			}

			if(Ventana.campo[4][5] != null){
			arg0.fillRect(150,480,30,30);
			}

			if(Ventana.campo[4][6] != null){
			arg0.fillRect(180,480,30,30);
			}

			if(Ventana.campo[4][7] != null){
			arg0.fillRect(210,480,30,30);
			}

			if(Ventana.campo[4][8] != null){
			arg0.fillRect(240,480,30,30);
			}

			if(Ventana.campo[5][0] != null){
			arg0.fillRect(0,450,30,30);
			}

			if(Ventana.campo[5][1] != null){
			arg0.fillRect(30,450,30,30);
			}

			if(Ventana.campo[5][2] != null){
			arg0.fillRect(60,450,30,30);
			}

			if(Ventana.campo[5][3] != null){
			arg0.fillRect(90,450,30,30);
			}

			if(Ventana.campo[5][4] != null){
			arg0.fillRect(120,450,30,30);
			}

			if(Ventana.campo[5][5] != null){
			arg0.fillRect(150,450,30,30);
			}

			if(Ventana.campo[5][6] != null){
			arg0.fillRect(180,450,30,30);
			}

			if(Ventana.campo[5][7] != null){
			arg0.fillRect(210,450,30,30);
			}

			if(Ventana.campo[5][8] != null){
			arg0.fillRect(240,450,30,30);
			}

			if(Ventana.campo[6][0] != null){
			arg0.fillRect(0,420,30,30);
			}

			if(Ventana.campo[6][1] != null){
			arg0.fillRect(30,420,30,30);
			}

			if(Ventana.campo[6][2] != null){
			arg0.fillRect(60,420,30,30);
			}

			if(Ventana.campo[6][3] != null){
			arg0.fillRect(90,420,30,30);
			}

			if(Ventana.campo[6][4] != null){
			arg0.fillRect(120,420,30,30);
			}

			if(Ventana.campo[6][5] != null){
			arg0.fillRect(150,420,30,30);
			}

			if(Ventana.campo[6][6] != null){
			arg0.fillRect(180,420,30,30);
			}

			if(Ventana.campo[6][7] != null){
			arg0.fillRect(210,420,30,30);
			}

			if(Ventana.campo[6][8] != null){
			arg0.fillRect(240,420,30,30);
			}

			if(Ventana.campo[7][0] != null){
			arg0.fillRect(0,390,30,30);
			}

			if(Ventana.campo[7][1] != null){
			arg0.fillRect(30,390,30,30);
			}

			if(Ventana.campo[7][2] != null){
			arg0.fillRect(60,390,30,30);
			}

			if(Ventana.campo[7][3] != null){
			arg0.fillRect(90,390,30,30);
			}

			if(Ventana.campo[7][4] != null){
			arg0.fillRect(120,390,30,30);
			}

			if(Ventana.campo[7][5] != null){
			arg0.fillRect(150,390,30,30);
			}

			if(Ventana.campo[7][6] != null){
			arg0.fillRect(180,390,30,30);
			}

			if(Ventana.campo[7][7] != null){
			arg0.fillRect(210,390,30,30);
			}

			if(Ventana.campo[7][8] != null){
			arg0.fillRect(240,390,30,30);
			}

			if(Ventana.campo[8][0] != null){
			arg0.fillRect(0,360,30,30);
			}

			if(Ventana.campo[8][1] != null){
			arg0.fillRect(30,360,30,30);
			}

			if(Ventana.campo[8][2] != null){
			arg0.fillRect(60,360,30,30);
			}

			if(Ventana.campo[8][3] != null){
			arg0.fillRect(90,360,30,30);
			}

			if(Ventana.campo[8][4] != null){
			arg0.fillRect(120,360,30,30);
			}

			if(Ventana.campo[8][5] != null){
			arg0.fillRect(150,360,30,30);
			}

			if(Ventana.campo[8][6] != null){
			arg0.fillRect(180,360,30,30);
			}

			if(Ventana.campo[8][7] != null){
			arg0.fillRect(210,360,30,30);
			}

			if(Ventana.campo[8][8] != null){
			arg0.fillRect(240,360,30,30);
			}

			if(Ventana.campo[9][0] != null){
			arg0.fillRect(0,330,30,30);
			}

			if(Ventana.campo[9][1] != null){
			arg0.fillRect(30,330,30,30);
			}

			if(Ventana.campo[9][2] != null){
			arg0.fillRect(60,330,30,30);
			}

			if(Ventana.campo[9][3] != null){
			arg0.fillRect(90,330,30,30);
			}

			if(Ventana.campo[9][4] != null){
			arg0.fillRect(120,330,30,30);
			}

			if(Ventana.campo[9][5] != null){
			arg0.fillRect(150,330,30,30);
			}

			if(Ventana.campo[9][6] != null){
			arg0.fillRect(180,330,30,30);
			}

			if(Ventana.campo[9][7] != null){
			arg0.fillRect(210,330,30,30);
			}

			if(Ventana.campo[9][8] != null){
			arg0.fillRect(240,330,30,30);
			}

			if(Ventana.campo[10][0] != null){
			arg0.fillRect(0,300,30,30);
			}

			if(Ventana.campo[10][1] != null){
			arg0.fillRect(30,300,30,30);
			}

			if(Ventana.campo[10][2] != null){
			arg0.fillRect(60,300,30,30);
			}

			if(Ventana.campo[10][3] != null){
			arg0.fillRect(90,300,30,30);
			}

			if(Ventana.campo[10][4] != null){
			arg0.fillRect(120,300,30,30);
			}

			if(Ventana.campo[10][5] != null){
			arg0.fillRect(150,300,30,30);
			}

			if(Ventana.campo[10][6] != null){
			arg0.fillRect(180,300,30,30);
			}

			if(Ventana.campo[10][7] != null){
			arg0.fillRect(210,300,30,30);
			}

			if(Ventana.campo[10][8] != null){
			arg0.fillRect(240,300,30,30);
			}

			if(Ventana.campo[11][0] != null){
			arg0.fillRect(0,270,30,30);
			}

			if(Ventana.campo[11][1] != null){
			arg0.fillRect(30,270,30,30);
			}

			if(Ventana.campo[11][2] != null){
			arg0.fillRect(60,270,30,30);
			}

			if(Ventana.campo[11][3] != null){
			arg0.fillRect(90,270,30,30);
			}

			if(Ventana.campo[11][4] != null){
			arg0.fillRect(120,270,30,30);
			}

			if(Ventana.campo[11][5] != null){
			arg0.fillRect(150,270,30,30);
			}

			if(Ventana.campo[11][6] != null){
			arg0.fillRect(180,270,30,30);
			}

			if(Ventana.campo[11][7] != null){
			arg0.fillRect(210,270,30,30);
			}

			if(Ventana.campo[11][8] != null){
			arg0.fillRect(240,270,30,30);
			}

			if(Ventana.campo[12][0] != null){
			arg0.fillRect(0,240,30,30);
			}

			if(Ventana.campo[12][1] != null){
			arg0.fillRect(30,240,30,30);
			}

			if(Ventana.campo[12][2] != null){
			arg0.fillRect(60,240,30,30);
			}

			if(Ventana.campo[12][3] != null){
			arg0.fillRect(90,240,30,30);
			}

			if(Ventana.campo[12][4] != null){
			arg0.fillRect(120,240,30,30);
			}

			if(Ventana.campo[12][5] != null){
			arg0.fillRect(150,240,30,30);
			}

			if(Ventana.campo[12][6] != null){
			arg0.fillRect(180,240,30,30);
			}

			if(Ventana.campo[12][7] != null){
			arg0.fillRect(210,240,30,30);
			}

			if(Ventana.campo[12][8] != null){
			arg0.fillRect(240,240,30,30);
			}

			if(Ventana.campo[13][0] != null){
			arg0.fillRect(0,210,30,30);
			}

			if(Ventana.campo[13][1] != null){
			arg0.fillRect(30,210,30,30);
			}

			if(Ventana.campo[13][2] != null){
			arg0.fillRect(60,210,30,30);
			}

			if(Ventana.campo[13][3] != null){
			arg0.fillRect(90,210,30,30);
			}

			if(Ventana.campo[13][4] != null){
			arg0.fillRect(120,210,30,30);
			}

			if(Ventana.campo[13][5] != null){
			arg0.fillRect(150,210,30,30);
			}

			if(Ventana.campo[13][6] != null){
			arg0.fillRect(180,210,30,30);
			}

			if(Ventana.campo[13][7] != null){
			arg0.fillRect(210,210,30,30);
			}

			if(Ventana.campo[13][8] != null){
			arg0.fillRect(240,210,30,30);
			}

			if(Ventana.campo[14][0] != null){
			arg0.fillRect(0,180,30,30);
			}

			if(Ventana.campo[14][1] != null){
			arg0.fillRect(30,180,30,30);
			}

			if(Ventana.campo[14][2] != null){
			arg0.fillRect(60,180,30,30);
			}

			if(Ventana.campo[14][3] != null){
			arg0.fillRect(90,180,30,30);
			}

			if(Ventana.campo[14][4] != null){
			arg0.fillRect(120,180,30,30);
			}

			if(Ventana.campo[14][5] != null){
			arg0.fillRect(150,180,30,30);
			}

			if(Ventana.campo[14][6] != null){
			arg0.fillRect(180,180,30,30);
			}

			if(Ventana.campo[14][7] != null){
			arg0.fillRect(210,180,30,30);
			}

			if(Ventana.campo[14][8] != null){
			arg0.fillRect(240,180,30,30);
			}

			if(Ventana.campo[15][0] != null){
			arg0.fillRect(0,150,30,30);
			}

			if(Ventana.campo[15][1] != null){
			arg0.fillRect(30,150,30,30);
			}

			if(Ventana.campo[15][2] != null){
			arg0.fillRect(60,150,30,30);
			}

			if(Ventana.campo[15][3] != null){
			arg0.fillRect(90,150,30,30);
			}

			if(Ventana.campo[15][4] != null){
			arg0.fillRect(120,150,30,30);
			}

			if(Ventana.campo[15][5] != null){
			arg0.fillRect(150,150,30,30);
			}

			if(Ventana.campo[15][6] != null){
			arg0.fillRect(180,150,30,30);
			}

			if(Ventana.campo[15][7] != null){
			arg0.fillRect(210,150,30,30);
			}

			if(Ventana.campo[15][8] != null){
			arg0.fillRect(240,150,30,30);
			}

			if(Ventana.campo[16][0] != null){
			arg0.fillRect(0,120,30,30);
			}

			if(Ventana.campo[16][1] != null){
			arg0.fillRect(30,120,30,30);
			}

			if(Ventana.campo[16][2] != null){
			arg0.fillRect(60,120,30,30);
			}

			if(Ventana.campo[16][3] != null){
			arg0.fillRect(90,120,30,30);
			}

			if(Ventana.campo[16][4] != null){
			arg0.fillRect(120,120,30,30);
			}

			if(Ventana.campo[16][5] != null){
			arg0.fillRect(150,120,30,30);
			}

			if(Ventana.campo[16][6] != null){
			arg0.fillRect(180,120,30,30);
			}

			if(Ventana.campo[16][7] != null){
			arg0.fillRect(210,120,30,30);
			}

			if(Ventana.campo[16][8] != null){
			arg0.fillRect(240,120,30,30);
			}

			if(Ventana.campo[17][0] != null){
			arg0.fillRect(0,90,30,30);
			}

			if(Ventana.campo[17][1] != null){
			arg0.fillRect(30,90,30,30);
			}

			if(Ventana.campo[17][2] != null){
			arg0.fillRect(60,90,30,30);
			}

			if(Ventana.campo[17][3] != null){
			arg0.fillRect(90,90,30,30);
			}

			if(Ventana.campo[17][4] != null){
			arg0.fillRect(120,90,30,30);
			}

			if(Ventana.campo[17][5] != null){
			arg0.fillRect(150,90,30,30);
			}

			if(Ventana.campo[17][6] != null){
			arg0.fillRect(180,90,30,30);
			}

			if(Ventana.campo[17][7] != null){
			arg0.fillRect(210,90,30,30);
			}

			if(Ventana.campo[17][8] != null){
			arg0.fillRect(240,90,30,30);
			}

			if(Ventana.campo[18][0] != null){
			arg0.fillRect(0,60,30,30);
			}

			if(Ventana.campo[18][1] != null){
			arg0.fillRect(30,60,30,30);
			}

			if(Ventana.campo[18][2] != null){
			arg0.fillRect(60,60,30,30);
			}

			if(Ventana.campo[18][3] != null){
			arg0.fillRect(90,60,30,30);
			}

			if(Ventana.campo[18][4] != null){
			arg0.fillRect(120,60,30,30);
			}

			if(Ventana.campo[18][5] != null){
			arg0.fillRect(150,60,30,30);
			}

			if(Ventana.campo[18][6] != null){
			arg0.fillRect(180,60,30,30);
			}

			if(Ventana.campo[18][7] != null){
			arg0.fillRect(210,60,30,30);
			}

			if(Ventana.campo[18][8] != null){
			arg0.fillRect(240,60,30,30);
			}

			if(Ventana.campo[19][0] != null){
			arg0.fillRect(0,30,30,30);
			}

			if(Ventana.campo[19][1] != null){
			arg0.fillRect(30,30,30,30);
			}

			if(Ventana.campo[19][2] != null){
			arg0.fillRect(60,30,30,30);
			}

			if(Ventana.campo[19][3] != null){
			arg0.fillRect(90,30,30,30);
			}

			if(Ventana.campo[19][4] != null){
			arg0.fillRect(120,30,30,30);
			}

			if(Ventana.campo[19][5] != null){
			arg0.fillRect(150,30,30,30);
			}

			if(Ventana.campo[19][6] != null){
			arg0.fillRect(180,30,30,30);
			}

			if(Ventana.campo[19][7] != null){
			arg0.fillRect(210,30,30,30);
			}

			if(Ventana.campo[19][8] != null){
			arg0.fillRect(240,30,30,30);
			}

			if(Ventana.campo[20][0] != null){
			arg0.fillRect(0,0,30,30);
			}

			if(Ventana.campo[20][1] != null){
			arg0.fillRect(30,0,30,30);
			}

			if(Ventana.campo[20][2] != null){
			arg0.fillRect(60,0,30,30);
			}

			if(Ventana.campo[20][3] != null){
			arg0.fillRect(90,0,30,30);
			}

			if(Ventana.campo[20][4] != null){
			arg0.fillRect(120,0,30,30);
			}

			if(Ventana.campo[20][5] != null){
			arg0.fillRect(150,0,30,30);
			}

			if(Ventana.campo[20][6] != null){
			arg0.fillRect(180,0,30,30);
			}

			if(Ventana.campo[20][7] != null){
			arg0.fillRect(210,0,30,30);
			}

			if(Ventana.campo[20][8] != null){
			arg0.fillRect(240,0,30,30);
			}


		//PINTA LA PIEZA EN MO
		arg0.fillRect(Ventana.x_0, Ventana.y_0, 30, 30);
		arg0.fillRect(Ventana.x_1, Ventana.y_1, 30, 30);
		arg0.fillRect(Ventana.x_2, Ventana.y_2, 30, 30);
		arg0.fillRect(Ventana.x_3, Ventana.y_3, 30, 30);
		

			
		
		
		repaint();
	
		
	}



}
