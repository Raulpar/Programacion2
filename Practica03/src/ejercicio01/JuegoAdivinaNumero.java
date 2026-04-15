package ejercicio01;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    // b) Atributo numeroAAdivinar
    private int numeroAAdivinar;

    // c) Constructor que recibe número de vidas
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas); // llama al constructor de la clase padre
    }

    // d) Método juega
    public void juega() {
        
        // 1) Llama a reiniciaPartida
        reiniciaPartida();

        // 2) Genera número aleatorio entre 0 y 10
        numeroAAdivinar = (int) (Math.random() * 11);

        Scanner sc = new Scanner(System.in);

        // 3) Mensaje inicial
        System.out.println("Adivina un número entre 0 y 10:");

        // Bucle del juego
        while (true) {

            // 4) Lee número del usuario
            int intento = sc.nextInt();

            // a) Si acierta
            if (intento == numeroAAdivinar) {
                System.out.println("¡¡Acertaste!!");
                
                // Llama a actualizaRecord
                actualizaRecord(numeroDeVidas);
                break;
            } 
            else {
                // b) Si falla, quita vida
                boolean quedanVidas = quitaVida();

                // c) Si aún tiene vidas
                if (quedanVidas) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es MAYOR. Intenta de nuevo:");
                    } else {
                        System.out.println("El número es MENOR. Intenta de nuevo:");
                    }
                } 
                else {
                    // d) Si ya no tiene vidas
                    System.out.println("Game Over. El número era: " + numeroAAdivinar);
                    break;
                }
                
            }
        }
    }
}
