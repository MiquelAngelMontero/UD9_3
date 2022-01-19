
public class LibroApp {

	public static void main(String[] args) {

		//Creamos dos libros
		Libro l1 = new Libro(312314141, "Como aprender Java", "Jose", 700);
		Libro l2 = new Libro(414124151, "Como aprender Java 2da parte", "Juan", 800);
		
		//Comprovamos el metodo toString
		System.out.println(l1.toString());		
		System.out.println(l2.toString());
		
		//Comparamos que libro tiene más páginas
		masPaginas(l1, l2);
	}
	
	//Metodos
	public static void masPaginas(Libro l1, Libro l2) {
		
		int l1Pag = l1.getNumPag();
		int l2Pag = l2.getNumPag();
		
		if(l1Pag > l2Pag) {
			
			System.out.println(l1.getTitulo()+" tiene más páginas que "+l2.getTitulo());
			
		}else if (l1Pag < l2Pag) {
			
			System.out.println(l2.getTitulo()+" tiene más páginas que "+l1.getTitulo());
			
		}else {
			
			System.out.println("Los dos libros tenen las mismas páginas");
			
		}
		
	}
	
}
