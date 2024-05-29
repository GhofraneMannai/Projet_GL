public class Reservation_evenement extends Reservation {
    private int Nbre_place;

    public Reservation_evenement(String etat, int prix, int Nbre_place) {
        super(etat, prix);
        this.Nbre_place = Nbre_place;
    }

  

    @Override
    public void cancelReservation() {
        super.cancelReservation(); 
     
            System.out.println("Event reservation canceled: " +
                    "Nbre_place=" + this.Nbre_place);
        
    }

    @Override
    public void confirmReservation() {
        
           
            System.out.println("Event reservation confirmed: " +
                    "Nbre_place=" + this.Nbre_place);
    
    }
}
