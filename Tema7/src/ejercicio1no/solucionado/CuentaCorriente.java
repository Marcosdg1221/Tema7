package ejercicio1no.solucionado;

public class CuentaCorriente {
	
	
	//Un pequeño resumen; las variables globales que estás viendo abajo pues son lo que son, variables globales.
	//ahora, dentro de public bla bla bla se meten lo parámetros que vas a usar; NO son las variables globales, son otras que se llaman igual y están dentro.
	//this DNI hace referencia al DNI global, si no se estaría referenciando a sí mismo.
	//Pon Static si todas las CuentaCorriente tienen el mismo valor; todas las cuentas tienen el mismo banco, por ejemplo (si solo hubiese un banco)
	
	
	/**
	 * Estos son los datos, llamados atributos
	 */
	String DNI;
	/**
	 * 
	 */
	String nombre;
	/**
	 * 
	 */
	double saldo;
	/**
	 * 
	 * @param DNI
	 * @param saldo
	 * 
	 */
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean sacarDinero(double cantidad) {
		boolean res = false;
		
		if(cantidad < saldo) {
			res=true;
			saldo -= cantidad;
		}
		
		return res;
	}
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	public String toString() {
		String result = "";
		result += "DNI: " + DNI + "\n";
		result += "Nombre: " + nombre + "\n";
		result += "Saldo: " + saldo;
		return result;
	}
	
}
