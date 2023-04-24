package ejercicio5;

public class Main {
	public static void main(String[] args) {
		//Llamar a métodos, construir objetos para la hora e imprimirlo.
		
		int segundo=0;
		segundo=Hora.incrementaSegundo();
		Hora hora = new Hora(segundo, 0, 0);
		System.out.println(hora);
	}
}