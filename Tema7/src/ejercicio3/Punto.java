package ejercicio3;

import java.util.Scanner;

public class Punto {
	/**
	 * 
	 */
	int x;
	/**
	 * 
	 */
	int y;
	/**
	 * 
	 */
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void imprime() {
		System.out.println(x +" , " + y);
	}
	
	public void setXY(int x, int y) {
		Scanner all = new Scanner(System.in);
		x=all.nextInt();
		y=all.nextInt();
		all.close();
	}
	
	public void desplaza(int dx, int dy) {
		Scanner all = new Scanner(System.in);
		dx+=all.nextInt();
		dy+=all.nextInt();
		all.close();
	}
	public int distancia(int puntoP) {
		this.x+=this.y;
		this.x+=puntoP;
		puntoP=this.x;
		return puntoP;
	}
	
}
