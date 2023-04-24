package ejercicio5;

import java.util.Scanner;

//Private los atributos a partir de ahora todos
public class Hora {
	
	
	/**
	 * Crear la hora
	 */
	private int hora=1;
	/**
	*Le minuto
	*/
	private int minuto=1;
	/**
	 *  Le segundo
	 */
	private static int segundo=1;
	
	
	/**
	 * Pone los segundos, minutos, horas.
	 */
	public Hora() {
		super();
		this.segundo=segundo;
		this.minuto=minuto;
		this.hora=hora;
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructor con los parámetros;
	 * @param segundo
	 * @param minuto
	 * @param hora
	 */
	public Hora(int segundo, int minuto, int hora) {
		// TODO Auto-generated constructor stub
	this.hora=hora;
	this.minuto=minuto;
	this.segundo=segundo;
	}
	
	
	/**
	 * Constructor copia
	 * @param h
	 */
	public Hora(Hora h) { //Constructor copia
		this.hora=h.hora;
		this.minuto=h.minuto;
		this.segundo=h.segundo;
	}
	
	public void getHora(int segundo, int minuto, int hora) {
		// TODO Auto-generated constructor stub
	hora=0;
	minuto=0;
	segundo=0;
	}

	public int getSegundo(){
		Scanner all = new Scanner(System.in);
		System.out.println("Pon un nº pa' los segundos");
		segundo=all.nextInt();
		all.close();
		return segundo;
		}
	
	//Parámetro que incrementa un segundo a la hora actual
	public static int incrementaSegundo() {
		segundo++;
		return segundo;
		
	}
}
