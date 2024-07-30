package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci una parola: ");
            String parola = scanner.nextLine();

            if (!paroleDistinte.add(parola)) {
                duplicati.add(parola);
            }
        }

        // Stampa parole duplicate
        System.out.println("Parole duplicate: " + duplicati);

        // Stampa numero di parole distinte
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        // Stampa elenco delle parole distinte
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);
    }
}
