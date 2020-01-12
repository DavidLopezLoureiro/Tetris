package interfaz;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

import bd.BD;
import objetos.Usuario;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
public class JfreeChart {
/**
 * crea una tabla grafica con los datos de las ultimas 10 partidas del jugador
 * @param usuario
 */
public static int puntuacionMedia;
public static void CrearTabla(Usuario usuario) {
	double[][] puntus = Datos(usuario);
	
	//añadimos los datos que se van guardar en la tabla para mostrarse
	DefaultXYDataset dataset = new DefaultXYDataset();
	dataset.addSeries(usuario.getNombre(), puntus);
	XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.ORANGE);
    renderer.setSeriesStroke(0, new BasicStroke(2));
    //creacion de la tabla
    JFreeChart chart = ChartFactory.createXYLineChart("Ultimas Puntuaciones", "Partida", "Puntuacion", dataset);
    chart.getXYPlot().getRangeAxis().setRange(0, 100);
    chart.getXYPlot().setRenderer(renderer);
    
    BufferedImage image = chart.createBufferedImage(600, 400);
    try {
		ImageIO.write(image, "png", new File("xy-chart.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
private static double[][] Datos(Usuario usuario) {
	ArrayList<Integer>puntuacion=BD.puntuaciones(usuario);//obtenemos las puntuaciones
	int indice=puntuacion.size()-1;
	if(indice<=3) {
	puntuacionMedia=(puntuacion.get(indice)-4+puntuacion.get(indice)-3+puntuacion.get(indice)-2+puntuacion.get(indice)-1+puntuacion.get(indice))/4;//aprivechamos para obtener la puntuacion media de las ultimas partidas
	double[][]puntus=new double[][] {{1,2,3,4},{puntuacion.get(indice)-4,puntuacion.get(indice)-3,puntuacion.get(indice)-2,puntuacion.get(indice)-1,puntuacion.get(indice)}} ;
	return puntus;
	}
	if(indice<=3) {
		puntuacionMedia=(puntuacion.get(indice)-4+puntuacion.get(indice)-3+puntuacion.get(indice)-2+puntuacion.get(indice)-1+puntuacion.get(indice))/4;//aprivechamos para obtener la puntuacion media de las ultimas partidas
		double[][]puntus=new double[][] {{1,2,3,4},{puntuacion.get(indice)-4,puntuacion.get(indice)-3,puntuacion.get(indice)-2,puntuacion.get(indice)-1,puntuacion.get(indice)}} ;
		return puntus;
		}
	if(indice==2) {
		puntuacionMedia=(puntuacion.get(indice)-2+puntuacion.get(indice)-1+puntuacion.get(indice))/3;//aprivechamos para obtener la puntuacion media de las ultimas partidas
		double[][]puntus=new double[][] {{1,2,3,4},{0,puntuacion.get(indice)-2,puntuacion.get(indice)-1,puntuacion.get(indice)}} ;
		return puntus;
		}
	if(indice==1) {
		puntuacionMedia=(puntuacion.get(indice)-1+puntuacion.get(indice))/2;//aprivechamos para obtener la puntuacion media de las ultimas partidas
		double[][]puntus=new double[][] {{1,2,3,4},{0,0,puntuacion.get(indice)-1,puntuacion.get(indice)}} ;
		return puntus;
		}
	if(indice==0) {
		puntuacionMedia=puntuacion.get(indice);//aprivechamos para obtener la puntuacion media de las ultimas partidas
		double[][]puntus=new double[][] {{1,2,3,4},{0,0,0,puntuacion.get(indice)}} ;
		return puntus;
		}
	return new double[][] {{1,2,3,4},{0,0,0,0}};
}
}
