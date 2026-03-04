package problema1;

public class Cronometro {
    private long inicia;
    private long finaliza;

    public void inicia() {
        inicia = System.currentTimeMillis();
    }

    public void detener() {
        finaliza = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }
}
