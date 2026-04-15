package ejercicio02;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;

    // Constructor
    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    // 🔹 MÉTODO NUEVO (base para herencia)
    public boolean validaNumero(int num) {
        return num >= 0 && num <= 10;
    }

    // 🔹 MÉTODO PRINCIPAL DEL JUEGO
    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        reiniciaPartida();
        numeroAAdivinar = random.nextInt(11);

        int intentos = 0;

        System.out.println("Adivina un número entre 0 y 10:");

        while (true) {

            int num = sc.nextInt();

            // 🔥 IMPORTANTE: usar validaNumero
            if (!validaNumero(num)) {
                System.out.println("Número inválido, intenta de nuevo:");
                continue;
            }

            intentos++;

            // a) Si acierta
            if (num == numeroAAdivinar) {
                System.out.println("¡Acertaste!! 🎉");
                actualizaRecord(intentos);
                break;
            } 
            else {
                // b) Quita vida
                boolean tieneVidas = quitaVida();

                // c) Si aún tiene vidas
                if (tieneVidas) {
                    if (num < numeroAAdivinar) {
                        System.out.println("El número es MAYOR");
                    } else {
                        System.out.println("El número es MENOR");
                    }
                } 
                // d) Si ya no tiene vidas
                else {
                    System.out.println("Te quedaste sin vidas. El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
