package main;

import java.util.Scanner;

public class BD{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	//LECTURA DE ENTRADA DE DATOS
		
	
	Scanner entrada = new Scanner(System.in);

	System.out.print("Escribe el usuario: ");

	String usuario = entrada.nextLine();

	System.out.println("\n ");

	System.out.print("Escribe la contrase�a: ");

	String contrase�a = entrada.nextLine();
	
	entrada.close();	
	
	
	}
	
}
