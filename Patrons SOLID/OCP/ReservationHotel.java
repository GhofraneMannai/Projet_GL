public class ReservationHotel extends Reservation {
    public ReservationHotel(int idReservation, String etat, double prix, int nbrPlaces, Object details) {
        super(idReservation, etat, prix, nbrPlaces, details);
    }

    @Override
    public void reserver() {
        System.out.println("Réservation d'hôtel effectuée.");
    }

    @Override
    public void annulerReservation() {
        System.out.println("Réservation d'hôtel annulée.");
    }

    @Override
    public void modifierReservation() {
        System.out.println("Réservation d'hôtel modifiée.");
    }
}
