package interfaz;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Tablero extends JPanel {
	
	
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
		// TODO Auto-generated method stub
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
		
		arg0.fillRect(Ventana.x_0, Ventana.y_0, 30, 30);
		arg0.fillRect(Ventana.x_1, Ventana.y_1, 30, 30);
		arg0.fillRect(Ventana.x_2, Ventana.y_2, 30, 30);
		arg0.fillRect(Ventana.x_3, Ventana.y_3, 30, 30);
		
		repaint();
	
		
	}



}
