// Importerer Scanner klassen som trengs til koden
import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {

        // Lager en scanner som kan lese brukerens input
        Scanner scanner = new Scanner(System.in);

        // Ber brukeren skrive inn sin vekt på jorden
        System.out.println("Vennligst skriv inn din vekt (kg) på jorden: ");
        double earthWeight = scanner.nextDouble();

        // Regner ut vekten på månen, som er 16,5% av jordens vekt
        double roundedMoonWeight = Math.round(earthWeight * 0.165);

        // Skriver så ut det avrundede resultatet
        System.out.printf("Vekten din på månen er: " + roundedMoonWeight + "kg!");
    }
}
