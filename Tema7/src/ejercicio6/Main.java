package ejercicio6;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Contador contador = new Contador(0);
		contador.incrementar();
		contador.decrementar(); //Llamando a todas las funciones
		contador.Copia(0);
		System.out.println(contador);
	}
}