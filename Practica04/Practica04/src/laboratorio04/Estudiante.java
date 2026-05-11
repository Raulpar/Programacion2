package laboratorio04;

public class Estudiante {

    private String codigo;
    private String nombre;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo +
                ", nombre=" + nombre + "]";
    }

}