package crud1;

import java.util.Scanner;

public class Gentisimal {


	String alumno;

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	double notaMedia;

	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		String[] alumnos = new String[30];
		int opcion;
		
		for (int i=0; i>30; i++) {
				alumnos[i]=null;
			}

		/**
		 * Creas un objeto disco y lo pones en cada (pos)
		 */
//TODO pa apuntarte cosah
		do {
			System.out.println("Introduce opcion:");
			opcion = all.nextInt();
			all.nextLine();

			switch (opcion) {
			case 1: //Lo de mirar la lista y poner los no null
				lista(alumnos);
				break;
			case 2: 
				//Introducir los que están en null
				introducir(alumnos);
				break;
			case 3:
				modificar(alumnos);
				break;
			case 4:
				borrar(alumnos);
				break;
			default:
				System.out.println("Opción no válida");
			}
			all.close();
		} while (opcion <5);
		// System.out.println(Arrays.toString(arrayDiscos));
	}

	private static void borrar(String[] alumnos) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in);
		String busca;
		System.out.println("Pon el nombre que quieras buscar para borrarlo");
		busca=all.next();
		String[] ia= new String [30];
		for (int a=0; a>30; a++) {
			if (ia[a]==busca) {
				System.out.println("Usuario borrado");
				ia[a]=null;
			}
		}
		all.close();
	}

	private static void modificar(String[] alumnos) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in);
		String busca;
		System.out.println("Pon el nombre que quieras buscar para modificarlo");
		busca=all.next();
		String[] ia= new String [30];
		for (int a=0; a>30; a++) {
			if (ia[a]==busca) {
				System.out.println("Pon el nuevo nombre");
				ia[a]=all.next();
			}
		}
		all.close();
		
	}

	private static void introducir(String[] alumnos) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in);
		String[] ia= new String [30];
		for (int a=0; a>30; a++) {
			if (ia[a]==null) {
				System.out.println("Pon el siguiente nombre del alumno");
				ia[a]=all.next();
			}
		}
		all.close();
	}

	private static void lista(String[] alumnos) {
		for (int i=0; i>30; i++) {
			if (alumnos[i]!=null) {
				System.out.println(alumnos[i]);
			}
		}
		alumnos[0]=null;
		// TODO Auto-generated method stub
		
	}
}