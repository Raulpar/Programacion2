package laboratorio04;

import java.util.ArrayList;

public class Biblioteca {

	private String nombre;
	private ArrayList<Libro> libros;
	private ArrayList<Autor> autores;
	private ArrayList<Prestamo> prestamos;
	private Horario horario;

	public Biblioteca(String nombre) {

		this.nombre = nombre;

		libros = new ArrayList<>();
		autores = new ArrayList<>();
		prestamos = new ArrayList<>();

		horario = new Horario("Lunes-Viernes", 8, 20);
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void agregarAutor(Autor autor) {
		autores.add(autor);
	}

	public void prestarLibro(Estudiante estudiante, Libro libro) {
		prestamos.add(new Prestamo(estudiante, libro));
	}

	public void mostrarEstado() {

		System.out.println("Biblioteca: " + nombre);
		horario.mostrarHorario();

		System.out.println("Autores");
		for (Autor a : autores) {
			a.mostrarInfo();
		}

		System.out.println("Libros");
		for (Libro l : libros) {
			System.out.println(l);
		}

		System.out.println("Prestamos");
		for (Prestamo p : prestamos) {
			p.mostrarInfo();
		}
	}

	public void cerrarBiblioteca() {
		System.out.println("Biblioteca cerrada");
		prestamos.clear();
	}

}