public class Reservation extends ReservationManager {
    private String etat;
    private int prix;

    public Reservation(String etat, int prix) {
        this.etat = etat;
        this.prix = prix;
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reservation canceled: etat=" + etat + ", prix=" + prix);
    }

    @Override
    public void confirmReservation() {
        System.out.println("Reservation confirmed: etat=" + etat + ", prix=" + prix);
    }
}
