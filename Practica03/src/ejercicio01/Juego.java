package ejercicio01;
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    protected int vidasIniciales;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.vidasIniciales = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        this.numeroDeVidas = this.vidasIniciales;
        System.out.println("Partida reiniciada. Vidas: " + this.numeroDeVidas);
    }
    public void actualizaRecord(int nuevoRecord) {
        if (nuevoRecord > this.record) {
            this.record = nuevoRecord;
            System.out.println("Nuevo record: " + this.record);
        } else {
            System.out.println("No superaste el record actual: " + this.record);
        }
    }
    public boolean quitaVida() {
        this.numeroDeVidas--;
        System.out.println("Te quedan " + this.numeroDeVidas + " vidas");

        if (this.numeroDeVidas > 0) {
            return true; 
        } else {
            System.out.println("Te quedaste sin vidas.");
            return false;
        }
    }
}