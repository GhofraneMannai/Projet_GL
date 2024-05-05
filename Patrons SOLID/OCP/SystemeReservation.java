// Système de réservation pour gérer les actions sur les réservations
public class SystemeReservation {
    public boolean traiterReservation(IReservable reservable) {
        return reservable.validerReservation();
    }

    public boolean annulerReservation(IReservable reservable) {
        return reservable.annulerReservation();
    }
}