public class CustomVacationCreator extends ReservationCreator {
    @Override
    public Reservation createReservation() {
        return new CustomVacation();
    }
}