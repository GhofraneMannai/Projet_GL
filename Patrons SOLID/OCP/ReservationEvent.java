public class ReservationEvent extends Reservation {
    public ReservationEvent(int idReservation, String etat, double prix, int nbrPlaces, Object details) {
        super(idReservation, etat, prix, nbrPlaces, details);
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
}

