package ejercicio01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de vidas: ");
        int vidas = sc.nextInt();

        // Crear el juego con las vidas ingresadas
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(vidas);

        // Iniciar el juego
        juego.juega();

        System.out.println("Fin del juego");
    }
}