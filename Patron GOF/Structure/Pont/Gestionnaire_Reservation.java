public class Gestionnaire_Reservation {
    private Reservation reservation;

    public void reserver() {
        reservation.verifierDispo();
        reservation.paiement();
        // Autres 
    }

    public void annulerReservation() {
        // Logique pour annuler une réservation
    }

    // Setter et getter pour Reservation
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return this.reservation ;
    }
}