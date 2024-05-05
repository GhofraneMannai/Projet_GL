// Classe abstraite pour les réservations générales

import java.util.Date;

public abstract class Reservation implements IReservable {
    protected int idReservation;
    protected Date debutPeriode;
    protected Date finPeriode;
    protected String etat;
    protected double prix;
    protected int nbrPlaces;
    protected DetailsReservation details;

    public Reservation(int idReservation, Date debutPeriode, Date finPeriode, String etat, double prix, int nbrPlaces, DetailsReservation details) {
        this.idReservation = idReservation;
        this.debutPeriode = debutPeriode;
        this.finPeriode = finPeriode;
        this.etat = etat;
        this.prix = prix;
        this.nbrPlaces = nbrPlaces;
        this.details = details;
    }
    public String getEtat() {
        return etat;
    }
    
    @Override
    public boolean validerReservation() {
        if (nbrPlaces <= 0) {
            return false;
        }
        etat = "Confirmée";
        nbrPlaces--;
        return true;
    }

    @Override
    public boolean annulerReservation() {
        if (!"Confirmée".equals(etat)) {
            return false;
        }
        etat = "Annulée";
        nbrPlaces++;
        return true;
    }
}

