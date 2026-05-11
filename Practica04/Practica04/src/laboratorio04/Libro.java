package laboratorio04;
import java.util.ArrayList;

public class Libro {

    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas;

    public Libro(String titulo,String isbn,String contenido[]) {

        this.titulo = titulo;
        this.isbn = isbn;
        paginas = new ArrayList<>();


        // COMPOSICION
        for (int i = 0; i < contenido.length; i++) {

            paginas.add(new Pagina(i + 1,contenido[i]));
        }
    }

    public void leer() {
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo +
                ", isbn=" + isbn + "]";
    }

}