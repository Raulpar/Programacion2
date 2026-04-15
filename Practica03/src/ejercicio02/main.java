package ejercicio02;

public class main {
    public static void main(String[] args) {

        // a) Crear las 3 instancias con 3 vidas
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        // b) Llamar al método juega de cada uno
        System.out.println("=== Juego Normal ===");
        juegoNormal.juega();

        System.out.println("\n=== Juego de Números PARES ===");
        juegoPar.juega();

        System.out.println("\n=== Juego de Números IMPARES ===");
        juegoImpar.juega();
    }
}