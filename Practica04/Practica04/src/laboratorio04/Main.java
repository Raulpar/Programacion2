package laboratorio04;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca b1 = new Biblioteca("Biblioteca UMSA");
		
		Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiano");
		Autor a2 = new Autor("Mario Vargas Llosa", "Peruano");
		
		String paginas1[] = {"Introduccion", "Capitulo 1", "Capitulo 2", "Final"};
		String paginas2[] = {"Tema 1", "Tema 2", "Tema 3"};
		
		Libro l1 = new Libro("Programacion", "111", paginas1);
		Libro l2 = new Libro("POO", "222", paginas2);
		
		Estudiante e1 = new Estudiante("2024001", "Raul");
		Estudiante e2 = new Estudiante("2024002", "Maria");
		
		b1.agregarAutor(a1);
		b1.agregarAutor(a2);
		
		b1.agregarLibro(l1);
		b1.agregarLibro(l2);
		
		b1.prestarLibro(e1, l1);
		b1.prestarLibro(e2, l2);
		
		System.out.println("ESTADO DE LA BIBLIOTECA");
		b1.mostrarEstado();
		
		System.out.println("\nCONTENIDO DEL LIBRO 1");
		l1.leer();
		
		System.out.println("\nCONTENIDO DEL LIBRO 2");
		l2.leer();
		
		b1.cerrarBiblioteca();
		
		System.out.println("\nESTADO FINAL");
		b1.mostrarEstado();
	}

}