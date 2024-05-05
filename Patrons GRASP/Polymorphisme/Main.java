import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création de dates pour les événements
        Date dateDebut1 = new Date();
        Date dateDebut2 = new Date(dateDebut1.getTime() + 86400000); // Date de début demain

        // Création d'un événement de type Reservation_Event
        ArrayList<Date> periodeReservation = new ArrayList<>();
        periodeReservation.add(dateDebut1);
        periodeReservation.add(new Date(dateDebut1.getTime() + 2592000000L)); // Plus 30 jours

        Reservation_Event reservation = new Reservation_Event(
            1, "Concert de Rock", "Concert", "Un concert inoubliable", dateDebut1, 59.99,
            101, periodeReservation, "Confirmé", 150, "Réservation en ligne disponible"
        );

        // Création d'un événement de type Vacances_sur_mesure
        ArrayList<String> destinations = new ArrayList<>(Arrays.asList("Paris", "Londres", "Berlin"));
        ArrayList<String> optionsVacances = new ArrayList<>(Arrays.asList("Guide touristique", "Transport inclus", "Hôtel 4 étoiles"));

        Vacances_sur_mesure vacances = new Vacances_sur_mesure(
            2, "Vacances Européennes", "Voyage", "Découvrez l'Europe en luxe", dateDebut2, 1200.00,
            202, "Europe", destinations, 4, optionsVacances
        );

        // Affichage des détails des événements
        reservation.afficherDetails();
        System.out.println(); // Saut de ligne pour séparer les sorties
        vacances.afficherDetails();
    }
}
