import java.util.ArrayList;
import java.util.Date;
// Classe Reservation_Event
class Reservation_Event extends Evenement {
    private int idReservation;
    private ArrayList<Date> periode;
    private String etat;
    private int nbrPlaces;
    private Object details;

    public Reservation_Event(int idEvenement, String nomEvenement, String typeEvenement, String description, Date dateDebut, double prix, int idReservation, ArrayList<Date> periode, String etat, int nbrPlaces, Object details) {
        super(idEvenement, nomEvenement, typeEvenement, description, dateDebut, prix);
        this.idReservation = idReservation;
        this.periode = periode;
        this.etat = etat;
        this.nbrPlaces = nbrPlaces;
        this.details = details;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("ID de réservation: " + idReservation);
        System.out.println("Période: " + periode);
        System.out.println("État: " + etat);
        System.out.println("Nombre de places: " + nbrPlaces);
        System.out.println("Détails: " + details.toString());
    }
}
