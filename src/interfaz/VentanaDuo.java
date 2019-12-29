package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import interfaz.ElegirModo;

public class VentanaDuo extends JFrame{
	
private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDuo frame = new VentanaDuo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

}
