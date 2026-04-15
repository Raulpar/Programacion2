package ejercicio02;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int num) {

        // Validar rango
        if (num < 0 || num > 10) {
            System.out.println("Número fuera de rango (0-10)");
            return false;
        }

        // Validar que sea PAR
        if (num % 2 != 0) {
            System.out.println("Error: Debes ingresar un número PAR");
            return false;
        }

        return true;
    }
}