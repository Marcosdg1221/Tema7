package ejercicio5;

import java.util.*;

import ejercicio4.Articulo;

public class Main {
	public static void main(String[] args) {
		//Llamar a métodos, construir objetos para la hora e imprimirlo.
		
		Hora hora = new Hora(0, 0, 0);
		Hora hora2 = new Hora();
		Hora hora3 = new Hora(hora);
		Hora.incrementaSegundo();
		System.out.println(hora);
	}
}