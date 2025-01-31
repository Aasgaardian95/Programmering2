import java.time.LocalDate;


// Arver her instansvariabler fra Carpenter (Carpenter arver videre Person)
public class CarpenterApprentice extends Carpenter{

    private LocalDate trainingStartDate;
    private LocalDate trainingEndDate;


    public CarpenterApprentice(String firstName,
                               String lastName,
                               int age,
                               int numHousesbuilt,
                               LocalDate trainingStartDate,
                               LocalDate trainingEndDate) {
        super(firstName,
                lastName,
                age,
                numHousesbuilt);

        this.trainingStartDate = trainingStartDate;
        this.trainingEndDate = trainingEndDate;

    }

    public LocalDate getTrainingEndDate() {
        return trainingEndDate;
    }

    public void setTrainingEndDate(LocalDate trainingEndDate) {
        this.trainingEndDate = trainingEndDate;
    }

    public LocalDate getTrainingStartDate() {
        return trainingStartDate;
    }

    public void setTrainingStartDate(LocalDate trainingStartDate) {
        this.trainingStartDate = trainingStartDate;
    }
}
