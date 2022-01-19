
public class Libro {
	
	//Atributos
	private int isbn;
	private String titulo;
	private String autor;
	private int numPag;
	
	//Constructor
	public Libro(int isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}
	

	
	//Getters & Setters
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	
	//ToString
	@Override
	public String toString() {
		return "El libro "+ titulo +" con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPag + " páginas";
	}	
	
}
