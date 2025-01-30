//Oppgave 2.3b
public class Oppgave2_3 {
    public static void main(String[] args) {

        //Oppretter en overskrift
        System.out.println("---Her er en oversikt over flere planter---");

        //Oppretter objekter ved bruk av klassen:
        Planet mars = new Planet("Mars", 3889.5, 6.39E23);
        Planet saturn = new Planet("Saturn", 58232, 5.683E26);
        Planet jupiter = new Planet("Jupiter", 69911, 1.897880E27);

        //Skriver ut informasjon om hver planet slik oppgaven etterspør:

        //Mars
        System.out.println("Planeten " + mars.getPlanetName() + " har en radius på " + mars.getPlanetRadius()
                + "km, og en masse på " + mars.getPlanetMass() + "kg.");
        //Saturn
        System.out.println("Planeten " + saturn.getPlanetName() + " har en radius på " + saturn.getPlanetRadius()
                + "km, og en masse på " + saturn.getPlanetMass() + "kg.");
        //Jupiter
        System.out.println("Planeten " + jupiter.getPlanetName() + " har en radius på " + jupiter.getPlanetRadius()
                + "km, og en masse på " + jupiter.getPlanetMass() + "kg.");
    }
}
