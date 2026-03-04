package problema4;

public class Estadistica {
	
    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public double desviacion() {
        double media = promedio();
        double sumaDesviacion = 0;
        for (double num : numeros) {
            sumaDesviacion += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaDesviacion / (numeros.length - 1));
    }
}
