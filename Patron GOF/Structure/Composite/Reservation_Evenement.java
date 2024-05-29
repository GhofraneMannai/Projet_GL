public class Reservation_Evenement implements Reservation {
    public int idReservationEvent;
    public ArrayList<Object> periode;
    public String etat;
    public Number prix;
    public Number nbrPlaces;
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