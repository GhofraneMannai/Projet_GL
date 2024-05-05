
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a profile for a user
        Profil profil = new Profil("Faten", "Borchani", "fatenbogmail.com", "12345678", "securePassword123");

        // Create an account using the profile
        Compte compte = new Compte(profil, "fatenborgmail.com", "12345678");

        // Authenticate the account
        if (compte.authenticate("fatenborgmail.com", "123456789")) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }

        // Create a hotel reservation
        Reservation_Hotel reservation = new Reservation_Hotel(compte, LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15));

        // Create rooms and add them to the reservation
        Chambre chambre1 = new Chambre(101, 100.0f, "complète");
        Chambre chambre2 = new Chambre(102, 85.0f, "demi");

        reservation.addChambreReservation(chambre1);
        reservation.addChambreReservation(chambre2);

        // Print reservation details before and after cancellation
        reservation.printReservationDetails();

        // Cancel reservation
        reservation.cancelReservation();
        System.out.println("After cancellation:");
        reservation.printReservationDetails();

        // Print profile information
        profil.printProfileInfo();

        // Change and update email
        profil.updateEmail("new.email@example.com");
        System.out.println("Updated Email: " + profil.getEmail());

        // Change password
        profil.changePassword("12345678", "newSecurePassword456");
        System.out.println("Password changed successfully.");

        // Print account details
        compte.printAccountInfo();
    }
}
