package esercizio1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayNumeri {
    private static int numeroRandom;
    private static int[] arrayRandom = new int[5];


    public static void main(String[] args) {

        for (int i = 0; i < arrayRandom.length; i++) {

            numeroRandom = (int) (Math.random() * 10);
            arrayRandom[i] = numeroRandom;

            System.out.println("valori " + arrayRandom[i]);
        }
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("inserisci il numero in posizione 1");
            try {
                int numeroUtente = scanner.nextInt();
                if (numeroUtente > 0 && numeroUtente < 11) {
                    arrayRandom[0] = numeroUtente;
                    for (int i = 0; i < arrayRandom.length; i++) {
                        System.out.println(arrayRandom[i]);
                    }
                } else if (numeroUtente == 0) {
                    System.out.println("fine gioco");
                } else {
                    throw new numeroMaggiore("numero troppo grande");
                }
            } catch (numeroMaggiore e) {
                System.out.println(e);
                scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Errore: L'input inserito non è un numero .");
                System.out.println(e);
                scanner.nextLine();
            }
        }
    }
}
