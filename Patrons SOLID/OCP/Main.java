public class Main {
    public static void main(String[] args) {
        IReservation myEvent = new ReservationEvent(1, "Planifié", 59.99, 100, "Détails de l'événement");
        IReservation myHotel = new ReservationHotel(2, "Confirmé", 129.99, 2, "Détails de l'hôtel");

        // Test des méthodes
        myEvent.reserver();
        myEvent.annulerReservation();
        myEvent.modifierReservation();

        myHotel.reserver();
        myHotel.annulerReservation();
        myHotel.modifierReservation();

        // Affichage de l'état actuel de l'objet
        ReservationEvent event = (ReservationEvent) myEvent;
        System.out.println("ID: " + event.getIdReservation());
        System.out.println("État: " + event.getEtat());
        System.out.println("Prix: " + event.getPrix());
        System.out.println("Nombre de places: " + event.getNbrPlaces());
        System.out.println("Détails: " + event.getDetails());
    }
}
