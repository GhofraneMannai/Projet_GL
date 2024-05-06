public class Reservation_Hotel implements Reservation {
    public int idReservationHotel;
    public String periode;
    public String etat;
    public String prix;
    public int nbrChambres;
    public Object details;

    @Override
    public void verifierDispo() {
        //logique de verification de dispo
    }

    @Override
    public void modifierOptions() {
        //logique de modification des options
    }

    @Override
    public void paiement() {
        //logique de paiment
    }

}