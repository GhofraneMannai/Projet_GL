
public class ReservationEvent implements IReservation {
    private int idReservation;
    private String etat;
    private double prix;
    private int nbrPlaces;
    private Object details; // Ce type devrait être plus spécifique ou être remplacé par une classe adéquate

    public ReservationEvent(int idReservation, String etat, double prix, int nbrPlaces, Object details) {
        this.idReservation = idReservation;
        this.etat = etat;
        this.prix = prix;
        this.nbrPlaces = nbrPlaces;
        this.details = details;
    }

    @Override
    public void reserver() {
        System.out.println("Réservation de l'événement effectuée.");
    }

    @Override
    public void annulerReservation() {
        System.out.println("Réservation de l'événement annulée.");
    }

    @Override
    public void modifierReservation() {
        System.out.println("Réservation de l'événement modifiée.");
    }

    // Getters et setters
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }
}
