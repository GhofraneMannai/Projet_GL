public class Main {
    public static void main(String[] args) {
        ReservationCreator hotelCreator = new HotelReservationCreator();
        Reservation hotelReservation = hotelCreator.createReservation();
        System.out.println(hotelReservation.create());

        ReservationCreator eventCreator = new EventReservationCreator();
        Reservation eventReservation = eventCreator.createReservation();
        System.out.println(eventReservation.create());

        ReservationCreator vacationCreator = new CustomVacationCreator();
        Reservation customVacation = vacationCreator.createReservation();
        System.out.println(customVacation.create());
    }
}
