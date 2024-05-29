public class Reservation_VacancesSurMesure implements Reservation {
    public int idVacancesSurMesure;
    public String typeDestination;
    public Number NbrDestination;
    public ArrayList<String> destinations;
    public Number periode;
    public Number nbrPersonnes;
    public Object personnes;
    public Object options;
    public ArrayList<Reservation> Reservation;

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