public class ReservationService {
    private ReservationFactory factory;

    public ReservationService(ReservationFactory factory) {
        this.factory = factory;
    }

    public void book() {
        Reservation reservation = factory.createReservation();
        System.out.println(reservation.create());
    }
}
