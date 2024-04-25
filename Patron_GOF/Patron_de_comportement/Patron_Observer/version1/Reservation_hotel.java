public class Reservation_hotel extends Reservation {
    private int Nbre_chambres;

    public Reservation_hotel(String etat, int prix, int Nbre_chambres) {
        super(etat, prix);
        this.Nbre_chambres = Nbre_chambres;
    }

    // Getter and setter methods for Nbre_chambres (not shown here for brevity)

    @Override
    public void cancelReservation() {
        super.cancelReservation(); // Appel de la méthode de la classe parente
       
            System.out.println("Hotel reservation canceled: " +
                    "Nbre_chambres=" + this.Nbre_chambres);
        
    }

    @Override
    public void confirmReservation() {
        super.confirmReservation(); // Appel de la méthode de la classe parente
    
            System.out.println("Hotel reservation confirmed: " +
                    "Nbre_chambres=" + this.Nbre_chambres);
        
    }
}
