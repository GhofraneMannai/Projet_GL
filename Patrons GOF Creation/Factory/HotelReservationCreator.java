public class HotelReservationCreator extends ReservationCreator {
    @Override
    public Reservation createReservation() {
        return new HotelReservation();
    }
}