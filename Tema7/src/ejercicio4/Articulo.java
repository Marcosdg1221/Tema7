package ejercicio4;

import java.util.*;

public class Articulo {

	/**
	 * Si seleccionas estas variables, haces right click -> Source -> Generate set and getters pos hace eso.
	 */
	private String nombre;
	/**
	 * 
	 */
	private double precio;
	/**
	 * 
	 */
	private double plusIva=0.21;
	/**
	 * 
	 */
	private int cuantosQuedan;
	private int cantidad;

	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param precio
	 * @param plusIva
	 * @param cuantosQuedan
	 */
	public Articulo(String nombre, double precio, double plusIva, int cuantosQuedan) { //Constructor
		this.nombre = nombre;
		this.precio = precio;
		this.plusIva = plusIva;
		this.cuantosQuedan = cuantosQuedan;
	}


	//Getters y Setters de los atributos;
	
	public double getPVP() {
		double precioIVA= (precio + (precio * plusIva));
		return precioIVA;
	}

	public  double getPVPDescuento(double descuento) {
		double PVPdescuento=getPVP() - (getPVP()*this.precio); //getPVP() -> llamas a la función
		return PVPdescuento;
	}

	public boolean vender(int cuantosQuedan) { //NO pongas Sysout en funciones, sólo next(), el sysout en main.

		
		boolean posible = false;
		if (this.cantidad >= cantidad) {
			posible=true;
			this.cantidad-=cantidad;
		}
		return posible;
	}
	
	public int getcantidad(int cantidad) {
		return cantidad;
	}
	
	public void setcantidad(int cantidad) {
		if (cantidad>=0) {
			this.cantidad=cantidad;
		}
	}
/**
 * Faltaría un toString aquí
 * @param nombre
 * @param precio
 * @param plusIva
 * @param cuantosQuedan
 */
	public void almacenar(String nombre, double precio, double plusIva, int cuantosQuedan) {
		Scanner all = new Scanner(System.in);
		System.out.println("¿Cuanto quieres almacenar?");
		this.nombre = nombre;
		this.precio = precio;
		this.plusIva = plusIva;
		this.cuantosQuedan = cuantosQuedan;
		all.close();
	}
}