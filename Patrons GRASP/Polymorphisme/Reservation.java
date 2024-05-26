public abstract class Reservation {
    protected int reservationId;
    protected double prix;

    public Reservation(int reservationId, double prix) {
        this.reservationId = reservationId;
        this.prix = prix;
    }

    // Méthode abstraite pour obtenir les détails de la réservation
    public abstract String getDetails();
}
