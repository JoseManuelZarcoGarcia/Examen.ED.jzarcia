package jzarcia.Servicios;

import java.util.Scanner;

public class operativaImplementacion implements operativaInterfaz {
	
	Scanner sc = new Scanner(System.in);
	
	
	public long anyadirVenta(Scanner sc, long aux) {
		
		String opcionConsola;
		long opcionEnviar, patata = aux;
		
		System.out.println("Cuanto quire añadir: ");
		
		opcionConsola = sc.next();
		opcionEnviar = Long.parseLong(opcionConsola);
		
		aux = patata + opcionEnviar;
		System.out.println(aux);
		return aux;
		
	}
	
	
	public long anyadirGasto(Scanner sc, long aux) {
		
		String opcionConsola;
		long opcionEnviar, patata = aux;
		
		System.out.println("Cuanto quire gastar: ");
		
		opcionConsola = sc.next();
		opcionEnviar = Long.parseLong(opcionConsola);
		
		aux = patata - opcionEnviar;
		System.out.println(aux);
		return aux;
			
	}

	public void mostrarTotal(long aux) {
		
		if(aux == 0) {
			System.out.print(aux);
			System.out.println(" Vamos mal ");
		}
		
		else if(aux < 0){
			System.out.print(aux);
			System.out.println(" Vamos muy mal ");
		}
		
		System.out.println(aux);
		
	}
	

}
