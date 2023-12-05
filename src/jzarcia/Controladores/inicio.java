package jzarcia.Controladores;

import java.util.Scanner;
import jzarcia.Servicios.*;
 /**
  * Clase principal por la que inicia el programa
  *  jzg - 051223
  */
public class inicio {
/**
 * Metodo main por el que se inicia el programa
 *  jzg - 051223
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		menuInterfaz mi = new menuImplementacion();
		operativaInterfaz oi = new operativaImplementacion();
		
		long aux = 0;
		int opcionSeleccionad;
		boolean cerrarMenu = false;
		
		
		do 
		{
			
			opcionSeleccionad = mi.mostrarMenu(sc);
			
			switch(opcionSeleccionad) {
			
			case 0:
				cerrarMenu = true;
				break;
				
			case 1:
				aux = oi.anyadirVenta(sc, aux);
				break;
				
			case 2:
				aux = oi.anyadirGasto(sc, aux);
				
				if(aux == 0) {
					System.out.println("Su saldo es de 0 ");
				}
				
				else if(aux < 0){
					
					System.out.println("Debe dinero ");
				}
				
				break;
				
			case 3:
				oi.mostrarTotal(aux);
				break;
			
			default:
				break;

			
			}
			
		}while(!cerrarMenu);
		
		

	}

}
