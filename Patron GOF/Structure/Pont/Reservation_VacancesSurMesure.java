public class Reservation_VacancesSurMesure implements Reservation {
    public int idVacancesSurMesure;
    public String typeDestination;
    public Number nbrDestinations;
    public ArrayList<String> destinations;
    public Number periode;
    public Number nbrPersonnes;
    public Object Personnes;
    public ArrayList<Object> options;

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