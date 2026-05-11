package laboratorio04;

public class Prestamo {

    private int fechaPrestamo;
    private int fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante,Libro libro) {

        this.fechaPrestamo = 0;
        this.fechaDevolucion = 0;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo="
                + fechaPrestamo
                + ", fechaDevolucion="
                + fechaDevolucion
                + ", " + estudiante
                + ", " + libro + "]";
    }

}