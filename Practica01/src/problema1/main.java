package problema1;
import java.util.random.*;
public class main {
	    public static void main(String[] args) {
	        int[] numeros = new int[100000];
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i;
	        }

	        Cronometro cronometro = new Cronometro();
	        cronometro.inicia();
	        ordenarPorSeleccion(numeros);
	        cronometro.detener();

	        long tiempoEjecucion = cronometro.lapsoDeTiempo();
	        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " milisegundos");
	    }

	    private static void ordenarPorSeleccion(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int min_idx = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[min_idx]) {
	                    min_idx = j;
	                }
	            }
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}


