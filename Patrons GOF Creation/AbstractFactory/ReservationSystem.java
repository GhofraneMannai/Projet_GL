public class ReservationSystem {

    // Abstract Product
    interface Reservation {
        String create();
    }

    // Concrete Products
    static class EventReservation implements Reservation {
        @Override
        public String create() {
            return "Event reservation created";
        }
    }

    static class HotelReservation implements Reservation {
        @Override
        public String create() {
            return "Hotel reservation created";
        }
    }

    static class CustomVacation implements Reservation {
        @Override
        public String create() {
            return "Custom vacation created";
        }
    }

    // Abstract Factory
    interface ReservationFactory {
        Reservation createReservation();
    }

    // Concrete Factories
    static class EventReservationFactory implements ReservationFactory {
        @Override
        public Reservation createReservation() {
            return new EventReservation();
        }
    }

    static class HotelReservationFactory implements ReservationFactory {
        @Override
        public Reservation createReservation() {
            return new HotelReservation();
        }
    }

    static class CustomVacationFactory implements ReservationFactory {
        @Override
        public Reservation createReservation() {
            return new CustomVacation();
        }
    }

    // Client class
    static class ReservationService {
        private ReservationFactory factory;

        public ReservationService(ReservationFactory factory) {
            this.factory = factory;
        }

        public void book() {
            Reservation reservation = factory.createReservation();
            System.out.println(reservation.create());
        }
    }

    public static void main(String[] args) {
        ReservationService eventService = new ReservationService(new EventReservationFactory());
        eventService.book();
        
        ReservationService hotelService = new ReservationService(new HotelReservationFactory());
        hotelService.book();
        
        ReservationService vacationService = new ReservationService(new CustomVacationFactory());
        vacationService.book();
    }
}
