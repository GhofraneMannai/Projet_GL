public class Reservation_hotel extends Reservation {
    private int Nbre_chambres;

    public Reservation_hotel(String etat, int prix, int Nbre_chambres) {
        super(etat, prix);
        this.Nbre_chambres = Nbre_chambres;
    }



    @Override
    public void cancelReservation() {
        super.cancelReservation(); 

        Notification confirmationNotification = new Notification("Hotel reservation canceled: " + "Nbre_chambres=" + this.Nbre_chambres);
        publish(confirmationNotification);
        
    }

    @Override
    public void confirmReservation() {
        super.confirmReservation(); 

         Notification confirmationNotification = new Notification("Hotel reservation confirmed: " + "Nbre_chambres=" + this.Nbre_chambres);
        publish(confirmationNotification);
        
    }
}
