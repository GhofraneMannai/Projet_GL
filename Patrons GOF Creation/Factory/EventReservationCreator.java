public class EventReservationCreator extends ReservationCreator {
    @Override
    public Reservation createReservation() {
        return new EventReservation();
    }
}