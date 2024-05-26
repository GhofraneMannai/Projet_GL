
public class Main {
    public static void main(String[] args) {
        ReservationEvent myEvent = new ReservationEvent(1, "Planifié", 59.99, 100, "Détails de l'événement");
        
        // Test des méthodes
        myEvent.reserver();
        myEvent.annulerReservation();
        myEvent.modifierReservation();

        // Affichage de l'état actuel de l'objet
        System.out.println("ID: " + myEvent.getIdReservation());
        System.out.println("État: " + myEvent.getEtat());
        System.out.println("Prix: " + myEvent.getPrix());
        System.out.println("Nombre de places: " + myEvent.getNbrPlaces());
        System.out.println("Détails: " + myEvent.getDetails());
    }
}
