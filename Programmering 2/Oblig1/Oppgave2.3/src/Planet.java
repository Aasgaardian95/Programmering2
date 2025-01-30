//Oppgave 2.3b
public class Planet {

    //Oppretter flere instansvariabler
    private String planetName;
    private double planetRadius;
    private double planetMass;

    public Planet(String planetName, double planetRadius, double planetMass) {
        this.planetName = planetName;
        this.planetRadius = planetRadius;
        this.planetMass = planetMass;
    }

        //Oppretter gettere og settere for alle instansvariablene
        public String getPlanetName () {
            return planetName;
        }

        public void setPlanetName (String planetName){
            this.planetName = planetName;
        }

        public double getPlanetRadius () {
            return planetRadius;
        }

        public void setPlanetRadius ( double planetRadius) {
            this.planetRadius = planetRadius;
        }

        public double getPlanetMass () {
            return planetMass;
        }

        public void setPlanetMass ( double planetMass) {
            this.planetMass = planetMass;
        }
}
