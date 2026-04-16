import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.array.dinamici.NumeriInteriDinamico;
import org.array.statici.NumeriInteriStatico;

public class Main {
    public static void main(String[] args) {
        int[] arrayprova = { 1, 8, 9, 55, 79 };

        // //Prova con classe che manipola array statici
        // NumeriInteriStatico arrayNumeri = new NumeriInteriStatico(arrayprova);
        // arrayNumeri.addElemento();
        // arrayNumeri.addElemento(5);
        // arrayNumeri.addElemento(5);

        // Prova con array che manipola array dinamici come arraylist

        ArrayList<Integer> listaProva = new ArrayList<>(List.of(1, 5, 6, 12));
        Integer[] arrayInteger = { 1, 2, 3, 4, 5 };
        // NumeriInteriDinamico arrayNumeri = new NumeriInteriDinamico(arrayprova);
        // NumeriInteriDinamico arrayNumeri = new NumeriInteriDinamico(listaProva);
        NumeriInteriDinamico arrayNumeri = new NumeriInteriDinamico(arrayInteger);

        arrayNumeri.addElemento(5);
        arrayNumeri.addElemento(5);
        int iterazioni = 0;
        while (arrayNumeri.hasAncoraElementi()) {
            if (iterazioni == 0) {
                System.out.println("Il primo elemento è:");
            } else if (iterazioni == arrayNumeri.getArrayLength() - 1) {
                System.out.println("L'ultimo elemento è:");
            } else {
                System.out.println("Il prossimo elemento è:");
            }
            System.out.println(arrayNumeri.getElementoSuccessivo());
            iterazioni++;

        }
        if (!arrayNumeri.hasAncoraElementi() && iterazioni > 0) {
            System.out.println("Non ci sono più elementi nella lista");
        } else if (iterazioni == 0) {
            System.out.println("Non ci sono elementi nella lista");
        }

    }
}
