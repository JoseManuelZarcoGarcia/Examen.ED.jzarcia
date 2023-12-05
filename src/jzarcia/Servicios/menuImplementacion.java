package jzarcia.Servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {
	
	Scanner sc = new Scanner(System.in);
	
	public int mostrarMenu(Scanner sc) 
	{
		String opcionConsola;
		int opcionEnviar; 
		
		System.out.println("Elija una opcion ");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. Añadir venta  ");
		System.out.println("2. Añadir gasto  ");
		System.out.println("3. Mostrar total ");
		System.out.println("_________________");
		
		opcionConsola = sc.next();
		opcionEnviar = Integer.parseInt(opcionConsola);
		
		return opcionEnviar;
	
	}
	
	

}
