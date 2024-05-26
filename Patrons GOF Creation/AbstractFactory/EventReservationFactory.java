public class EventReservationFactory implements ReservationFactory {
    @Override
    public Reservation createReservation() {
        return new EventReservation();
    }
}
