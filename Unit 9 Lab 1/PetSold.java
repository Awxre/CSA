public class PetSold extends ItemSold {
    boolean vaccinated;
    boolean neutered;
    boolean housebroken;

    // Getters
    boolean isVaccinated() {
        return vaccinated;
    }
    boolean isNeutered() {
        return neutered;
    }
    boolean isHousebroken() {
        return housebroken;
    }

    // Setters

    void setVaccinated(boolean tF) {
        vaccinated = tF;
    }
    void setNeutered(boolean tF) {
        neutered = tF;
    }
    void setHousebroken(boolean tF) {
        housebroken = tF;
    }
}
