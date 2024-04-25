
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir le type de chambre :");
        System.out.println("1. Simple");
        System.out.println("2. Double");
        System.out.println("3. Royale");

        int choixChambre = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Veuillez choisir le type de pension :");
        System.out.println("1. Complète");
        System.out.println("2. Demi");
        String typePension = scanner.nextLine().equals("1") ? "complète" : "demi";

        System.out.println("Veuillez choisir un hôtel :");
        System.out.println("1. Hôtel 4 étoiles");
        System.out.println("2. Hôtel 5 étoiles");
        int choixHotel = scanner.nextInt();

        HotelFactory factory = null;
        switch (choixHotel) {
            case 1:
                factory = new Hotel4EtoilesFactory();
                break;
            case 2:
                factory = new Hotel5EtoilesFactory();
                break;
            default:
                System.out.println("Choix invalide d'hôtel.");
                scanner.close();
                return;
        }

        Chambre chambre = null;
        switch (choixChambre) {
            case 1:
                chambre = factory.creeChambreSimple(typePension);
                break;
            case 2:
                chambre = factory.creeChambreDouble(typePension);
                break;
            case 3:
                chambre = factory.creeChambreRoyal(typePension);
                break;
            default:
                System.out.println("Choix invalide de chambre.");
                scanner.close();
                return;
        }

        chambre.afficherDetails();
        scanner.close();
    }
}

