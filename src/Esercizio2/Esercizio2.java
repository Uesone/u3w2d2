package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

    public static List<Integer> generaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101)); // numeri casuali tra 0 e 100
        }

        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> invertiEConcatena(List<Integer> lista) {
        List<Integer> invertita = new ArrayList<>(lista);
        Collections.reverse(invertita);
        List<Integer> concatenata = new ArrayList<>(lista);
        concatenata.addAll(invertita);
        return concatenata;
    }

    public static void stampaValori(List<Integer> lista, boolean posizioniPari) {
        for (int i = 0; i < lista.size(); i++) {
            if (posizioniPari && i % 2 == 0) {
                System.out.print(lista.get(i) + " ");
            } else if (!posizioniPari && i % 2 != 0) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;

        List<Integer> listaOrdinata = generaListaOrdinata(n);
        System.out.println("Lista ordinata: " + listaOrdinata);

        List<Integer> listaInvertitaEConcatenata = invertiEConcatena(listaOrdinata);
        System.out.println("Lista invertita e concatenata: " + listaInvertitaEConcatenata);

        System.out.print("Valori in posizioni pari: ");
        stampaValori(listaInvertitaEConcatenata, true);

        System.out.print("Valori in posizioni dispari: ");
        stampaValori(listaInvertitaEConcatenata, false);
    }
}
