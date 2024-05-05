import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Créer des détails pour une réservation d'événement
        DetailsEvenement detailsEvenement = new DetailsEvenement(
            "Concert de rock au Zénith", 
            "Zénith de Paris", 
            "Société XYZ Events", 
            Arrays.asList("Artiste principal: RockBand", "Première partie: DJ Example")
        );

        // Créer une réservation d'événement
        ReservationEvenement reservationEvenement = new ReservationEvenement(
            1, 
            new Date(), 
            new Date(System.currentTimeMillis() + 86400000 * 7), // +7 jours
            "Non confirmée", 
            120.0, 
            200, 
            detailsEvenement, 
            555
        );

        // Créer des détails pour une réservation d'hôtel
        DetailsHotel detailsHotel = new DetailsHotel(
            "Week-end romantique à Paris", 
            "Suite nuptiale", 
            true
        );

        // Créer une réservation d'hôtel
        ReservationHotel reservationHotel = new ReservationHotel(
            2, 
            new Date(), 
            new Date(System.currentTimeMillis() + 86400000 * 2), // +2 jours
            "Non confirmée", 
            500.0, 
            1, 
            detailsHotel, 
            999
        );

        // Système de gestion des réservations
        SystemeReservation systemeReservation = new SystemeReservation();

        // Valider les réservations
        boolean resultatValidationEvenement = systemeReservation.traiterReservation(reservationEvenement);
        boolean resultatValidationHotel = systemeReservation.traiterReservation(reservationHotel);
        System.out.println("Réservation d'événement validée : " + resultatValidationEvenement);
        System.out.println("Réservation d'hôtel validée : " + resultatValidationHotel);

        // Annuler les réservations
        boolean resultatAnnulationEvenement = systemeReservation.annulerReservation(reservationEvenement);
        boolean resultatAnnulationHotel = systemeReservation.annulerReservation(reservationHotel);
        System.out.println("Réservation d'événement annulée : " + resultatAnnulationEvenement);
        System.out.println("Réservation d'hôtel annulée : " + resultatAnnulationHotel);

        // Afficher l'état final des réservations
        System.out.println("État final de la réservation d'événement : " + reservationEvenement.getEtat());
        System.out.println("État final de la réservation d'hôtel : " + reservationHotel.getEtat());
    }
}
