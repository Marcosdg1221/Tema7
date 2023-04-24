package ejercicio8;

public class Main {
	private String codigo = "libre";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;

	// Ahora van el constructor con todos los parámetros, y no te olvides de los
	// gets y sets de los atributos.

	public class Disco {
		String codigo = "libre";
		private String autor = "";
		private String titulo = "";
		private String genero = "";
		private int duracion = 0;

		/**
		 * Constructor con todos sus parámetros, que son; 
		 * @param codigo
		 * @param autor
		 * @param titulo
		 * @param genero
		 * @param duracion
		 */
		public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
			this.codigo = codigo;
			this.autor = autor;
			this.titulo = titulo;
			this.genero = genero;
			if (duracion > 0) {
				this.duracion = duracion;
			}
		}

		/**
		 * El constructor copia que hace los this.
		 * 
		 * @param this hace que lo copian a disco
		 */
		public Disco(Disco disco) {
			this.codigo = disco.codigo;
			this.autor = disco.autor;
			this.titulo = disco.titulo;
			this.genero = disco.genero;
			this.duracion = disco.duracion;
		}

		
		//Ahora van todos los gets y sets de los atributos.
		
		
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			if (duracion > 0) {
				this.duracion = duracion;
			} 
		}

		/**
		 * Esto lo pone bonico
		 * 
		 */
		public String toString() {
			String res = " Disco;  ";
			res += "Codigo: " + this.codigo + "\n";
			res += "Autor: " + this.autor + "\n";
			res += "Título: " + this.titulo + "\n";
			res += "Genero: " + this.genero + "\n";
			res += "Duracion: " + this.duracion + "\n";
			return res;
		}
	}
}

