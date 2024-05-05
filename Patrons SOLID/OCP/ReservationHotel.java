import java.util.Date;

public class ReservationHotel extends Reservation {
    private int idHotel;

    public ReservationHotel(int idReservation, Date debutPeriode, Date finPeriode, String etat, double prix, int nbrPlaces, DetailsReservation details, int idHotel) {
        super(idReservation, debutPeriode, finPeriode, etat, prix, nbrPlaces, details);
        this.idHotel = idHotel;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }
}