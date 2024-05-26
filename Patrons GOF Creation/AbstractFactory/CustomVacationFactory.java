public class CustomVacationFactory implements ReservationFactory {
    @Override
    public Reservation createReservation() {
        return new CustomVacation();
    }
}
