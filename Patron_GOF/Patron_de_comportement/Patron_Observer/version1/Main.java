import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
   
        Client client1 = new Compte("client1@example.com", "password1");
        Client client2 = new Compte("client2@example.com", "password2");

        
        ReservationManager reservationManager = new ReservationManager();

        
        reservationManager.addClient("vacance_sur_mesure", client1);
        reservationManager.addClient("hotel_reservation", client1);
        reservationManager.addClient("event_reservation", client2);

        
        List<String> destinations = new ArrayList<>();
        destinations.add("Paris");
        destinations.add("New York");
        Vacance_sur_mesure customVacation = new Vacance_sur_mesure(destinations, 2, 4, new ArrayList<>(), "Adventure");

        
        Reservation_hotel hotelReservation = new Reservation_hotel("confirmed", 200, 2);

 
        Reservation_evenement eventReservation = new Reservation_evenement("pending", 50, 5);

 
        System.out.println("Vacation sur mesure : ");
        System.out.println("Confirmation Reservation : ");
        customVacation.confirmReservation();
        customVacation.cancelReservation();
        hotelReservation.confirmReservation();
        hotelReservation.cancelReservation();
        eventReservation.confirmReservation();
        eventReservation.cancelReservation();
        System.out.println("Le programme a été exécuté avec succès !");
    
    }
}
