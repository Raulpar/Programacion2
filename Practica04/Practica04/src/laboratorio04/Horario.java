package laboratorio04;

public class Horario {

    private String dias;
    private int apertura;
    private int cierre;

    public Horario(String dias,int apertura,int cierre) {
        this.dias = dias;
        this.apertura = apertura;
        this.cierre = cierre;
    }

    public Horario() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarHorario() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Horario [dias=" + dias +
                ", apertura=" + apertura +
                ", cierre=" + cierre + "]";
    }

}