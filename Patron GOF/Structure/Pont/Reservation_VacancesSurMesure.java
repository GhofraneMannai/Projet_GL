public class Reservation_VacancesSurMesure implements Reservation {
    public int idVacancesSurMesure;
    public String typeDestination;
    public int nbrDestinations;
    public String destinations;
    public String periode;
    public int nbrPersonnes;
    public Object Personnes;
    public ArrayList<Object> options = new ArrayList<Object>();

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