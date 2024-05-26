
public class ReservationHotel extends Reservation {
    private int nbChambres;

    public ReservationHotel(int reservationId, double prix, int nbChambres) {
        super(reservationId, prix);
        this.nbChambres = nbChambres;
    }

    @Override
    public String getDetails() {
        return "Reservation Hotel ID: " + reservationId + ", Prix: " + prix + ", Chambres: " + nbChambres;
    }
}
