package ejercicio2;

public class Libro {

	/**
	 * 
	 */
	String título;
	/**
	 * 
	 */
	String autor;
	/**
	 * 
	 */
	int ejemplares;
	int ejemplaresPres;

	public Libro() {
		this.título = título;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPres = ejemplaresPres;
	}

	public Libro(String título, String autor, int ejemplares, int ejemplaresPres) {
		título = "Como hacer pushero";
		this.autor = "Tragabuche";
		this.ejemplares = 50;
		this.ejemplaresPres = 20;
	}

	public boolean prestamo(int ejemplaresPres) {
		boolean prestamo = false;
		if (ejemplaresPres > ejemplares) {
			prestamo = true;
		}
		return prestamo;
	}

	public boolean devolucion(int ejemplares, int ejemplaresPres) {
		boolean prestar = false;
		int prestados = ejemplares - ejemplaresPres;
		if (prestados > 0) {
			prestar = true;
		}
		return prestar;
	}
	public String toString() {
		String result = "";
		result += "autor: " + autor +"/n";
		result +="título: " + título+"/n";
		result += "ejemplares: " + ejemplares +"/n";
		result += "ejemplares prestados: " +ejemplaresPres+"/n";
		return result;
	}
}


