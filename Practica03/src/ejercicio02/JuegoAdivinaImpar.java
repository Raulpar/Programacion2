package ejercicio02;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int num) {

        // Validar rango
        if (num < 0 || num > 10) {
            System.out.println("Número fuera de rango (0-10)");
            return false;
        }

        // Validar que sea IMPAR
        if (num % 2 == 0) {
            System.out.println("Error: Debes ingresar un número IMPAR");
            return false;
        }

        return true;
    }
}