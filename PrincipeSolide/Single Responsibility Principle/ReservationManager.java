import java.util.HashMap;
import java.util.Map;

public class ReservationManager {
    private Map<Integer, Integer> reservations;

    public ReservationManager() {
        reservations = new HashMap<>();
    }

    public boolean reserverPlaces(Evenement evenement, int nombreDePlaces) {
        if (evenement == null || nombreDePlaces <= 0) {
            throw new IllegalArgumentException("Invalid event or number of places.");
        }
        if (nombreDePlaces > evenement.getPlacesDisponibles()) {
            return false; // Pas assez de places disponibles pour la réservation
        }
        evenement.setPlacesDisponibles(evenement.getPlacesDisponibles() - nombreDePlaces);
        reservations.put(evenement.getIdEvenement(), nombreDePlaces);
        return true;
    }

    public boolean annulerReservations(Evenement evenement, int nombreDePlaces) {
        if (evenement == null || nombreDePlaces <= 0) {
            throw new IllegalArgumentException("Les informations de l'événement ou le nombre de places sont invalides.");
        }

        int reservationsActuelles = reservations.getOrDefault(evenement.getIdEvenement(), 0);
        if (nombreDePlaces > reservationsActuelles) {
            return false; // Pas assez de réservations existantes pour annuler
        }
        evenement.setPlacesDisponibles(evenement.getPlacesDisponibles() + nombreDePlaces);
        reservations.put(evenement.getIdEvenement(), reservationsActuelles - nombreDePlaces);
        return true;
    }

    public void afficherReservations() {
        for (Map.Entry<Integer, Integer> entry : reservations.entrySet()) {
            System.out.println("ID de l'événement: " + entry.getKey() + ", Places réservées: " + entry.getValue());
        }
    }
}
