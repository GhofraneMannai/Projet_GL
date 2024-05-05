// Classe abstraite de base pour les détails des réservations
public abstract class DetailsReservation {
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}