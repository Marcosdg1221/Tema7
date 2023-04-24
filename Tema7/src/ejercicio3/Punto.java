 package ejercicio3;

public class Punto {
	/**
	 * Atributo x
	 */
	int x;
	/**
	 * Atributo y
	 */
	int y;
	/**
	 * 
	 */
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	/**
	 * Imprime x+y
	 */
	public void imprime() {
		String result = "";
		result +="x; " + x + " y; " + y;
		System.out.println(result);
	}
	
	/**
	 * Constructor para XY
	 * @param x
	 * @param y
	 */
	
	public void setXY(int x, int y) {
		x=2;
		y=5;
	}
	
	public void desplaza(int dx, int dy) {
		dx+=6;
		dy+=9;
	}
	public int distancia(int puntoP) {
		this.x+=this.y;
		this.x+=puntoP;
		puntoP=this.x;
		return puntoP;
	}
	
}
