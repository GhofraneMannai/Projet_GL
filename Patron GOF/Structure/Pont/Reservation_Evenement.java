public class Reservation_Evenement implements Reservation {
    public int idReservationEvent;
    public ArrayList<Object> periode;
    public String etat;
    public Number prix;
    public Number nbrPlaces;
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