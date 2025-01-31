import java.time.LocalDate;

public class Inheritance {
    public static void main(String[] args) {


        Person person = new Person(
                "Ola",
                "Nordmann",
                20);
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());


        Carpenter carpenter = new Carpenter(
                "Rudolf",
                "Kristiansen",
                45,
                3);

        System.out.println("Carpenter: " + carpenter.getFirstName() + " " + carpenter.getLastName());

        System.out.println("Carpenter has built " + carpenter.getNumHousesBuilt() + " houses.");


        carpenter.setFirstName("Noldus");
        carpenter.setLastName("Gnoldus");
        System.out.println("Carpenter: " + carpenter.getFirstName() + " " + carpenter.getLastName());

        BussDriver bussDriver = new BussDriver(
                "Bjarne",
                "Bo",
                55,
                "630 - Moss, Halden");
        System.out.println("Buss driver: " + bussDriver.getFirstName() + " " + bussDriver.getLastName());
        System.out.println("Buss driver has route " + bussDriver.getRoute());

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2026, 1, 1);
        CarpenterApprentice apprentice = new CarpenterApprentice(
                "Marius",
                "Aasgaard",
                29,
                0,
                startDate,
                endDate
        );
        System.out.println("Carpenter apprentice: "
                + apprentice.getFirstName() +
                " " + apprentice.getLastName());
        System.out.println("Carpenter apprentice training period: "
                + apprentice.getTrainingEndDate()
                + " - " + apprentice.getTrainingEndDate());

        System.out.println("\n---Print description---");
        person.printDescription();

        System.out.println();
        carpenter.printDescription();

        System.out.println();
        bussDriver.printDescription();

        System.out.println();
        apprentice.printDescription();

        System.out.println("\n---toString()---");

        System.out.println("\n-Person object-");
        System.out.println(person);

        System.out.println("\n-Carpenter object-");
        System.out.println(carpenter);

        System.out.println("\n-Bussdriver object-");
        System.out.println(bussDriver);

        System.out.println("\n-Apprentice object-");
        System.out.println(apprentice);

    }
}