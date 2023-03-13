package ejercicio4;

import java.util.*;

public class Articulo {

	/**
	 * 
	 */
	String nombre;
	/**
	 * 
	 */
	double precio;
	/**
	 * 
	 */
	double plusIva;
	/**
	 * 
	 */
	int cuantosQuedan;

	public Articulo(String nombre, double precio, double plusIva, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.plusIva = plusIva;
		this.cuantosQuedan = cuantosQuedan;
	}

	public void getPVP(double precio, double plusIVA, String nombre) {
		System.out.println("precio de " + nombre + " ; " + precio + (precio * plusIVA));
	}

	public void getPVPDescuento(double precio) {
		System.out.println(precio);
	}

	public boolean vender(int cuantosQuedan) {

		boolean posible = false;
		Scanner all = new Scanner(System.in);
		System.out.println("Pon un numero para cuantos quieres vender");
		int x = all.nextInt();
		if (x > cuantosQuedan) {
			System.out.println("No se pueden vender esa cantidad");
		} else {
			posible = true;
		}
		all.close();
		return posible;
	}

	public void almacenar(String nombre, double precio, double plusIva, int cuantosQuedan) {
		Scanner all = new Scanner(System.in);
		int x;
		System.out.println("¿Cuanto quieres almacenar?");
		x = all.nextInt();
		this.nombre = nombre;
		this.precio = precio;
		this.plusIva = plusIva;
		this.cuantosQuedan = cuantosQuedan;
		all.close();
	}
}