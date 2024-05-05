// Classes spécialisées pour les types spécifiques de réservations

import java.util.Date;

public class ReservationEvenement extends Reservation {
    private int idEvenement;

    public ReservationEvenement(int idReservation, Date debutPeriode, Date finPeriode, String etat, double prix, int nbrPlaces, DetailsReservation details, int idEvenement) {
        super(idReservation, debutPeriode, finPeriode, etat, prix, nbrPlaces, details);
        this.idEvenement = idEvenement;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }
}