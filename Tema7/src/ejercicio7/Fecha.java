package ejercicio7;

public class Fecha {

	/**
	 * int día
	 */
	private int dia;
	/**
	 * int mes, cuidados con febrero
	 */
	private int mes;
	/**
	 * int año (no importa cuál)
	 */
	private int año;

	/**
	 * 
	 * @param dia <-
	 * @param mes <-
	 * @param año <-
	 */
	
	public Fecha() {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * 
	 * @return el día
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * 
	 * @param dia del atributo día
	 */
	public void setDia(int dia) { //Lo suyo por lo visto es comprobar si la fecha es correcta aquí en set, pones condicionales.
		if(dia<32&dia>0) {
		this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Comprueba si el año es bisiesto o no.
	 */
	private boolean esBisiesto() {
		boolean bisiesto = false;
		if (this.año % 400 == 0 & this.año % 4 == 0 & this.año % 100 != 0) {
			bisiesto = true;
		}
		return bisiesto;
	}

	/**
	 * 
	 * @return la comprobasión de la fesha introdusía
	 */
	public boolean fechaCorrecta() {
		boolean fecha = false;
		boolean bisiesto = esBisiesto(); // Llamar función para bisiestidad
		if (dia >= 1 & dia <= 31 && mes >= 1 && mes <= 12) { // Comprobación de si fecha es correcta
			if ((dia == 31 && mes % 2 == 0) | (dia > 29 && bisiesto == false)) {
				return false;
			} else {
				fecha = true;
			}
		}
		return fecha;
	}

	/**
	 * El nombre difícilmente NO es descriptivo
	 */
	void diaSiguiente() {
		boolean fecha = fechaCorrecta();
		boolean bisiesto = esBisiesto();
		if (fecha) {
			if (mes % 2 != 0) { // los días que tienen 31 si no tienen 31 simplemente se les suman 1 al día, si
								// no es el siguiente mes, y lo mismo con el siguiente año
				if (dia != 31) {
					dia++;
				} else if (mes != 12) {
					dia = 1;
					mes++;
				} else {
					dia = 1;
					mes = 1;
					año++;
				}
			}

			else { // Si es un mes par, y el día es 30, suma uno al mes y pone 1 al día.
				if (dia != 30) {
					dia++;
				} else if (mes != 12 & mes != 2) {
					mes++;
					dia = 1;
				} else if (mes == 12) {
					dia = 1;
					dia = 1;
					año++;
				} else if (mes == 2) { // Entran en juego los bisiestos y febrero, me entran ganas de hacer una huelga
										// para que febrero tenga 30 días. Pobrete.
					if (bisiesto) {
						if (dia == 29) {
							dia = 0;
							mes++;
						} else {
							dia++;
						}
					} else {
						if (dia == 28) {
							dia = 0;
							mes++;
						} else {
							dia++;
						}

					}
				}

			}

		}

	}

	/**
	 * Ponmelo bonico va
	 */
	public String toString() {
		diaSiguiente();
		String result = "";
		result += "dia: " + dia + "\n";
		result += "mes: " + mes + "\n";
		result += "año: " + año + "\n";
		return result;
	}

}
