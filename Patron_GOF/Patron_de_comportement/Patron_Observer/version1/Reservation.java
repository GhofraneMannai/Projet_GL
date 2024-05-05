public class Reservation extends ReservationManager {
    private String etat;
    private int prix;

    public Reservation(String etat, int prix) {
        this.etat = etat;
        this.prix = prix;
    }

    @Override
    public void cancelReservation() {
        Notification confirmationNotification = new Notification("Reservation canceled: etat=" + etat + ", prix=" + prix);
        publish(confirmationNotification);
    }

    @Override
    public void confirmReservation() {
        Notification confirmationNotification = new Notification("Reservation confirmed: etat=" + etat + ", prix=" + prix);
        publish(confirmationNotification);
    }
}
