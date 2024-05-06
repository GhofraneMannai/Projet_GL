public class Reservation_VacancesSurMesure implements Reservation {
    public int idVacancesSurMesure;
    public String typeDestination;
    public String destinations;
    public int periode;
    public int nbrPersonnes;
    public Object options;

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