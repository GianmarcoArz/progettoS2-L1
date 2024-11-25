package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class KmPerLitro {
    private static final Logger logger = LoggerFactory.getLogger(KmPerLitro.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = 0;
        double litri = 0;

        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            km = scanner.nextDouble();

            System.out.print("Inserisci il numero di litri di carburante consumati: ");
            litri = scanner.nextDouble();


            double consumo = calcolaConsumo(km, litri);

            System.out.printf("Consumo: %.2f km/litro%n", consumo);
        } catch (ArithmeticException e) {
            logger.error("Errore: Divisione per zero. Assicurati di non inserire 0 litri.", e);
        } catch (Exception e) {
            logger.error("Si è verificato un errore. Assicurati di inserire valori numerici.", e);
        } finally {
            scanner.close();
        }
    }

    private static double calcolaConsumo(double km, double litri) {
        if (litri == 0) {
            throw new ArithmeticException("Litri non possono essere zero.");
        }
        return km / litri;
    }
}