public class Reservation_Hotel implements Reservation {
    public int idReservationHotel;
    public ArrayList<Object> periode;
    public String etat;
    public Number prix;
    public Number nbrChambres;
    public Object details;

    @Override
    public void verifierDispo() {
        // code de verification de disponibilité
    }

    @Override
    public void modifierOptions() {
        // Code de modification des options 
    }

    @Override
    public void paiement() {
        // Implémentation du processus de paiement 
    }

    
}