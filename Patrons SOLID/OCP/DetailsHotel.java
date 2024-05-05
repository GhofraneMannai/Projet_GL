// Classe détaillée pour les réservations d'hôtels
public class DetailsHotel extends DetailsReservation {
    private String typeChambre;
    private boolean petitDejeunerInclus;

    public DetailsHotel(String description, String typeChambre, boolean petitDejeunerInclus) {
        this.description = description;
        this.typeChambre = typeChambre;
        this.petitDejeunerInclus = petitDejeunerInclus;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public boolean isPetitDejeunerInclus() {
        return petitDejeunerInclus;
    }

    public void setPetitDejeunerInclus(boolean petitDejeunerInclus) {
        this.petitDejeunerInclus = petitDejeunerInclus;
    }
}
