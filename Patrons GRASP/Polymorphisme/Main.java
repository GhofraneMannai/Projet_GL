

public class Main {
    public static void main(String[] args) {
        Reservation event = new ReservationEvent(101, 200, 2);
        Reservation hotel = new ReservationHotel(102, 300, 3);

        // Affichage des détails des réservations
        System.out.println(event.getDetails());
        System.out.println(hotel.getDetails());
    }
}
