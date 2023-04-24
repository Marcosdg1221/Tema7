package ejercicio6;

public class Main {
	
	public static void main(String[] args) {
		
		Contador contador = new Contador(0);
		contador.incrementar();
		contador.decrementar(); //Llamando a todas las funciones, el resultado es 0, ya que se suma 1 y se resta 1
		contador.Copia(0);
		System.out.println(contador);
	}
}