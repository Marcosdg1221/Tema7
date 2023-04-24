package ejercicio6;

import java.util.*;

public class Contador {

	private int cont=1;
	
/**
 * 
 * @param cont (Con this)
 */
	public Contador(int cont) {
		this.cont = cont;
	}
/**
 * 
 * @param cont(valor)
 * @param inicio (valor 2nd)
 */
	public Contador(int cont, int inicio) {
		if (inicio < 0) {
			this.cont = 0;
		}
	}

	public void Copia(int cont) {
		this.cont=cont;
	}

	public int getContador() {
		return cont;
	}
	/**
	 * 
	 * @param cont; set contador con parámetro cont
	 */
	public void setContador(int cont) {
		if (cont >= 0) { // sólo los valores positivos tienen sentido
			this.cont = cont;
		} // en caso contrario no se modifica la edad
	}
	/**
	 * Aumentar contador en uno
	 */
	public void incrementar() {
		// TODO Auto-generated method stub
		cont++;
	}
	/**
	 * Decrementa contador en uno
	 */
	public void decrementar() {
		if (cont > 0) {
			cont--;
		}
	}
		/**
		 * 
		 * @return el resultado
		 */
		public int resultado() {
			int result = cont;
			return result;	
	}
}