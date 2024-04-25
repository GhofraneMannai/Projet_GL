import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création de quelques clients
        Client client1 = new Compte("client1@example.com", "password1");
        Client client2 = new Compte("client2@example.com", "password2");

        // Création du gestionnaire de réservations
        ReservationManager reservationManager = new ReservationManager();

        // Ajout des clients à différentes réservations
        reservationManager.addClient("vacance_sur_mesure", client1);
        reservationManager.addClient("hotel_reservation", client1);
        reservationManager.addClient("event_reservation", client2);

        // Création d'une réservation sur mesure
        List<String> destinations = new ArrayList<>();
        destinations.add("Paris");
        destinations.add("New York");
        Vacance_sur_mesure customVacation = new Vacance_sur_mesure(destinations, 2, 4, new ArrayList<>(), "Adventure");

        // Création d'une réservation d'hôtel
        Reservation_hotel hotelReservation = new Reservation_hotel("confirmed", 200, 2);

        // Création d'une réservation d'événement
        Reservation_evenement eventReservation = new Reservation_evenement("pending", 50, 5);

        // Confirmation et annulation des réservations
        customVacation.confirmReservation();
        customVacation.cancelReservation();
        hotelReservation.confirmReservation();
        hotelReservation.cancelReservation();
        eventReservation.confirmReservation();
        eventReservation.cancelReservation();
        System.out.println("Le programme a été exécuté avec succès !");
        // Affichage des notifications reçues par les clients
        // (Cela dépendra des implémentations spécifiques de chaque client)
    }
}
