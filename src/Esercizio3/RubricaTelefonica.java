package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {
    private Map<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        contatti.remove(nome);
    }

    public String ricercaPerNumero(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String ricercaPerNome(String nome) {
        return contatti.get(nome);
    }

    public void stampaContatti() {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);

        // Inserimento di alcuni contatti per esempio
        rubrica.inserisciContatto("Alice", "12345");
        rubrica.inserisciContatto("Bob", "67890");

        // Stampa tutti i contatti
        rubrica.stampaContatti();

        // Ricerca per nome
        System.out.print("Inserisci un nome per cercare il numero di telefono: ");
        String nome = scanner.nextLine();
        System.out.println("Numero di telefono per " + nome + ": " + rubrica.ricercaPerNome(nome));

        // Ricerca per numero
        System.out.print("Inserisci un numero di telefono per cercare il nome: ");
        String telefono = scanner.nextLine();
        System.out.println("Nome per il numero di telefono " + telefono + ": " + rubrica.ricercaPerNumero(telefono));

        // Cancellazione di un contatto
        System.out.print("Inserisci un nome per cancellare il contatto: ");
        nome = scanner.nextLine();
        rubrica.cancellaContatto(nome);

        // Stampa tutti i contatti dopo la cancellazione
        rubrica.stampaContatti();
    }
}
