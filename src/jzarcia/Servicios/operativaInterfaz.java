package jzarcia.Servicios;

import java.util.Scanner;

public interface operativaInterfaz {
	
	/**
	 * Metodo que añade al saldo una cantidad que pide por consola 
	 *  jzg - 051223
	 * @author csi22-jzarcia
	 * @param sc
	 * @param aux
	 * @return
	 */
	public long anyadirVenta(Scanner sc, long aux);
	
	/**
	 * Metodo que resta al saldo una cantidad que pide por consola 
	 *  jzg - 051223
	 * @author csi22-jzarcia
	 * @param sc
	 * @param aux
	 * @return
	 */
	public long anyadirGasto(Scanner sc, long aux);
	
	/**
	 * Metodo que muestra el saldo que lleva actualmente
	 *  jzg - 051223
	 * @author csi22-jzarcia
	 * @param aux
	 */
	public void mostrarTotal(long aux);

}
