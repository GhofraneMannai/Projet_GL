public class HotelReservationFactory implements ReservationFactory {
    @Override
    public Reservation createReservation() {
        return new HotelReservation();
    }
}
