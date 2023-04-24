package ejercicio1;

public class CuentaCorriente {
	
	
	//Un pequeño resumen; las variables globales que estás viendo abajo pues son lo que son, variables globales.
		//ahora, dentro de public bla bla bla se meten lo parámetros que vas a usar; NO son las variables globales, son otras que se llaman igual y están dentro.
		//this DNI hace referencia al DNI global, si no se estaría referenciando a sí mismo.
		//Pon Static si todas las CuentaCorriente tienen el mismo valor; todas las cuentas tienen el mismo banco, por ejemplo (si solo hubiese un banco)
		
	
	/**
	 * DNI es el dni
	 */
	String DNI;
	/**
	 * nombre = nombre
	 */
	String nombre;
	/**
	 * saldo es lo que se consultará
	 */
	double saldo;
	
	/**
	 * 
	 * @param DNI que se pondrá en el atributo de la clase, lo mismo con saldo
	 * @param saldo
	 */
	
	enum Sexo {Hombre, Mujer};
	Sexo sexo;
	
	//Opción 1
	//Pasar el sexo como cadena y convertirlo a tipo Sexo
	public CuentaCorriente (String sexo) {
	this.sexo=Sexo.valueOf(sexo);  
	}
	
	//Opción 2
	//Pasar el sexo directamente como tipo Sexo
	public CuentaCorriente(Sexo sexo) {
		
	}
	
	
	
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	/**
	 * Constructor con los siguientes;
	 * @param DNI
	 * @param nombre
	 * @param saldo
	 */
	
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @param cantidad sacar dinero la cantidad.
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
	
	/**
	 * 
	 * @param cantidad ingresar lo que se desee
	 */
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	/**
	 * Se pondrá por pantalla.
	 */
	
	public String toString() {
		String result = "";
		result += "DNI: " + DNI;
		result += "Nombre: " + nombre;
		result += "Saldo: " + saldo;
		return result;
	}
	
}
