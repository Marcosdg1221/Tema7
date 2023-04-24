package ejercicio8;

//Ejercicios resueltos en git

import java.util.Scanner;

public class Disco {

	static Scanner all = new Scanner(System.in);

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		// TODO Auto-generated constructor stub
	}

	public Disco() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Crea un array pa los discos y con su opcion
	 * @param args
	 */
	public static void main(String[] args) {
		Disco[] arrayDiscos = new Disco[10];
		int pos = 0;
		int opcion;

		/**
		 *  Creas un objeto disco y lo pones en cada (pos)
		 */
		for (int i = 0; i < arrayDiscos.length; i++) {
			arrayDiscos[i] = new Disco();
		}

		do {
			menu();
			System.out.println("Elija opcion:");
			opcion = all.nextInt();
			all.nextLine();

			switch (opcion) {
			case 1:
				listado(arrayDiscos);
				break;
			case 2: // Inserto nuevo disco
				// Tengo que ver qué posición hay libre.
				pos = posicionLibre(arrayDiscos);
				if (pos < 0) {
					System.out.println("No hay hueco");
				} else {
					nuevoDisco(arrayDiscos, pos);
				}
				break;
			case 3:
				modificar(arrayDiscos);
				break;
			case 4:
				borrar(arrayDiscos);
				break;
			case 5:
				System.out.println("salir");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 5);
		// System.out.println(Arrays.toString(arrayDiscos));
	}

	private static void menu() {
		System.out.println("discos");
		System.out.println("===================");
		System.out.println("1. Lista");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	private static void listado(Disco[] array) {
		for (Disco disco : array) {
			if (!disco.getCodigo().equals("LIBRE")) {
				System.out.println(disco);
			}
		}
	}



	private static void nuevoDisco(Disco[] array, int contador) {
		String codigo;
		String autor, titulo, genero;
		int duracion;

		codigo = String.valueOf(contador);

		System.out.println("Introduzca el autor del disco:");
		autor = all.nextLine();

		System.out.println("Introduzca el titulo del disco:");
		titulo = all.nextLine();

		System.out.println("Introduzca el genero del disco:");
		genero = all.nextLine();

		System.out.println("Introduzca la duración del disco:");
		duracion = all.nextInt();

		array[contador] = new Disco(codigo, autor, titulo, genero, duracion);

	}

	private static int posicionLibre(Disco[] array) {
		int posicion = 0;

		while (posicion < array.length && !array[posicion].getCodigo().equals("LIBRE")) {
			posicion++;
		}

		if (posicion == array.length) {
			posicion = -1;
		}

		return posicion;
	}

	private Object getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void modificar(Disco[] array) {
		String autor, titulo, genero;
		int codigo, duracion;

		System.out.println("Introduzca el código del disco a modificar");
		codigo = all.nextInt();
		all.nextLine();

		if (!array[codigo].getCodigo().equals("libre")) {
			System.out.println("Introduzca el autor del disco:");
			autor = all.nextLine();
			array[codigo].setAutor(autor);

			System.out.println("Introduzca el titulo del disco:");
			titulo = all.nextLine();
			array[codigo].setTitulo(titulo);

			System.out.println("Introduzca el genero del disco:");
			genero = all.nextLine();
			array[codigo].setGenero(genero);

			System.out.println("Introduzca la duración del disco:");
			duracion = all.nextInt();
			array[codigo].setDuracion(duracion);
		} else {
			System.out.println("En esa posición no hay ningún disco a modificar");
		}

	}

	private void setAutor(String autor) {
		// TODO Auto-generated method stub
		
	}

	private void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		
	}

	private void setGenero(String genero) {
		// TODO Auto-generated method stub
		
	}

	private void setDuracion(int duracion) {
		// TODO Auto-generated method stub
		
	}

	public static void borrar(Disco[] array) {
		System.out.println("Introduzca el código del disco a borrar");
		int posicion = all.nextInt();
		all.nextLine();
		
		if(posicion>=0 && posicion<array.length) {
			array[posicion].setCodigo("libre");
		} else {
			System.out.println("Código no válido");
		}
	}

	private void setCodigo(String string) {
		// TODO Auto-generated method stub
		
	}
}
