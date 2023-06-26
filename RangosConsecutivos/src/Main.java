import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> encontrarRangosConsecutivos(int[] array, int objetivo) {
        List<String> rangos = new ArrayList<>();
        int inicio = 0;
        int fin = 0;
        int suma = array[0];

        while (fin < array.length) {
            if (suma == objetivo) {
                rangos.add(inicio + "-" + fin);
                suma -= array[inicio];
                inicio++;
            }

            if (suma < objetivo) {
                fin++;
                if (fin < array.length) {
                    suma += array[fin];
                }
            } else {
                suma -= array[inicio];
                inicio++;
            }
        }

        return rangos;
    }

    public static void main(String[] args) {
        int[] array = {6, 7, 5, 4, 3, 1, 2, 3, 5, 6, 7, 9, 0, 0, 1, 2, 4, 1, 2, 3, 5, 1, 2};
        int objetivo = 13;

        List<String> rangos = encontrarRangosConsecutivos(array, objetivo);

        System.out.println("Rangos de números consecutivos que suman " + objetivo + ":");
        for (String rango : rangos) {
            System.out.println(rango);
        }
    }
}
