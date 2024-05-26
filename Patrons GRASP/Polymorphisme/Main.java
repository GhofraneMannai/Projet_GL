abstract class Reservation {
    protected int reservationId;
    protected double prix;

    public Reservation(int reservationId, double prix) {
        this.reservationId = reservationId;
        this.prix = prix;
    }

    // Méthode abstraite pour obtenir les détails de la réservation
    public abstract String getDetails();
}

class ReservationEvent extends Reservation {
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

class ReservationHotel extends Reservation {
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

public class Main {
    public static void main(String[] args) {
        Reservation event = new ReservationEvent(101, 200, 2);
        Reservation hotel = new ReservationHotel(102, 300, 3);

        // Affichage des détails des réservations
        System.out.println(event.getDetails());
        System.out.println(hotel.getDetails());
    }
}
