

public class ReservationEvent extends Reservation {
    private int nbPlaces;

    public ReservationEvent(int reservationId, double prix, int nbPlaces) {
        super(reservationId, prix);
        this.nbPlaces = nbPlaces;
    }

    @Override
    public String getDetails() {
        return "Reservation Event ID: " + reservationId + ", Prix: " + prix + ", Places: " + nbPlaces;
    }
}
