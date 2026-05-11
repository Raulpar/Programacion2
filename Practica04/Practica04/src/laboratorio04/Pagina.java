package laboratorio04;

public class Pagina {

    private int numeroPagina;
    private String contenido;

    public Pagina(int numeroPagina, String contenido) {

        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }

    public void mostrarPagina() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Pagina " + numeroPagina +
                ": " + contenido;
    }

}