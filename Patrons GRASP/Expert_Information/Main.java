public class Main {
    public static void main(String[] args) {
        // Création et test du profil
        Profil profil = new Profil("Faten", "Borchani", "0123456789", "fatenborchani@example.com");
        System.out.println(profil.getProfileDetails());
        profil.updateContactInfo("9876543210", "fatenborchani@nouveau.com");
        System.out.println(profil.getProfileDetails());

        // Création et test du compte
        Compte compte = new Compte("fatenborchani@example.com", "password123");
        System.out.println(compte.getAccountDetails());
        if (compte.authenticate("fatenborchani@example.com", "password123")) {
            System.out.println("Authentification réussie!");
        } else {
            System.out.println("Échec de l'authentification.");
        }
        compte.changePassword("newPassword123");
        System.out.println(compte.getAccountDetails());
    }
}
