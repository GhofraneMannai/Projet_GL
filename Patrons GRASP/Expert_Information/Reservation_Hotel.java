import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation_Hotel {
    private int idReservationHotel;
    private Compte compte;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;
    private double prixTotal;
    private List<Chambre> chambresReservees;

    // Constructor
    public Reservation_Hotel(Compte compte, LocalDate dateArrivee, LocalDate dateDepart) {
        this.compte = compte;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.chambresReservees = new ArrayList<>();
    }

    // Method to add a room to the reservation
    public void addChambreReservation(Chambre chambre) {
        if (chambre != null && !chambresReservees.contains(chambre)) {
            chambresReservees.add(chambre);
            // Update prixTotal based on the room's price
            prixTotal += chambre.getPrix();
        }
    }

    // Method to remove a room from the reservation
    public void removeChambreReservation(Chambre chambre) {
        if (chambresReservees.remove(chambre)) {
            // Update prixTotal after removing the room's price
            prixTotal -= chambre.getPrix();
        }
    }

    // Method to update reservation dates
    public void updateReservationDates(LocalDate dateArrivee, LocalDate dateDepart) {
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    // Method to cancel the reservation
    public void cancelReservation() {
        chambresReservees.clear();
        prixTotal = 0.0;
    }

    // Getters and setters
    public int getIdReservationHotel() {
        return idReservationHotel;
    }

    public void setIdReservationHotel(int idReservationHotel) {
        this.idReservationHotel = idReservationHotel;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public List<Chambre> getChambresReservees() {
        return new ArrayList<>(chambresReservees); // Defensive copy
    }

    // Method to calculate the total price (can be extended to include discounts, taxes, etc.)
    public void calculateTotalPrice() {
        prixTotal = chambresReservees.stream()
                .mapToDouble(Chambre::getPrix)
                .sum();
    }
    
    // Method to print reservation details
    public void printReservationDetails() {
        System.out.println("Reservation ID: " + idReservationHotel);
        System.out.println("Check-in Date: " + dateArrivee);
        System.out.println("Check-out Date: " + dateDepart);
        System.out.println("Total Price: " + prixTotal);
        System.out.println("Rooms reserved:");
        chambresReservees.forEach(chambre -> System.out.println(chambre)); // Assuming Chambre class overrides toString()
    }

    // Additional methods related to hotel reservation management can be added here
}
