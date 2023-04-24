package ejercicio4;

public class Articulo {
	private String nombre; // El nombre del ser humano
	private double precio; // El precio del ser producto
	private int cantidad; // La cantidad de los seres productos
	public final static double IVA = 0.21; // Los impuestos que todos amamos

	/**
	 * Si seleccionas estas variables, haces right click -> Source -> Generate set
	 * and getters te hace un favorazo, tecnología en su más alta cuota.
	 */

	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param d
	 * @param cantidad
	 * 
	 * Se comprueba también de que los valores no son negativos, y que nombre no sea nada
	 * 
	 */
	public Articulo(String nombre, double precio, double d, int cantidad) {
		if (nombre != "") {
			this.nombre = nombre;
		} else {
			System.out.println("nombre incorrecto");
		}

		if (precio >= -1) {
			this.precio = precio;
		} else {
			System.out.println("Precio no puede ser negativo");
		}

		if (cantidad >= 0) {
			this.cantidad = cantidad;
		} else {
			System.out.println("Cantidad debe ser de 0 a más");
		}
	}
	/**
	 * 
	 * @param a
	 */
	public Articulo(Articulo a) {
		this.nombre = a.nombre;
		this.precio = a.precio;
		this.cantidad = a.cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		if (nombre!="") {
			this.nombre = nombre;
		}
	}
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad >= 0) {
			this.cantidad = cantidad;
		}
	}

	
	/**
	 * Resultado con su IVA
	 * @param descuento
	 * @return
	 */
	public double getPVPDescuento(double descuento) {
		double IVA = ((this.precio * 0.21) + this.precio);
		double price = IVA - (IVA * descuento);
		return price;
	}

	public boolean vender(int cantidad) {
		boolean venta = false;
		if (this.cantidad >= cantidad) {
			venta = true;
			this.cantidad= this.cantidad - cantidad;
		}
		return venta;
	}

	/**
	 * Imprimirá todo con su resultado
	 */
	public String toString() {
		String imprime = "";

		imprime += "Nombre: " + this.nombre + "\n" + "Precio: " + this.precio + "\n" + "Cantidad: " + this.cantidad + "\n" + "IVA: " + IVA + "\n";

		return imprime;
	}
	
	
	/**
	 * Función almacenar
	 * @param cantidad
	 */
	public void almacenar(int cantidad) {
		cantidad= this.cantidad+ cantidad;
		this.cantidad = cantidad;
	}
}
