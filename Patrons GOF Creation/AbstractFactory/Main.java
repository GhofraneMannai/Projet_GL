public class Main {
    public static void main(String[] args) {
        ReservationService eventService = new ReservationService(new EventReservationFactory());
        eventService.book();

        ReservationService hotelService = new ReservationService(new HotelReservationFactory());
        hotelService.book();

        ReservationService vacationService = new ReservationService(new CustomVacationFactory());
        vacationService.book();
    }
}
