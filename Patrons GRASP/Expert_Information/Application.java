package expert_Info;

public class Application {
    // Classe interne pour gérer les profils des utilisateurs
    static class Profil {
        private String nom;
        private String prenom;
        private String telephone;
        private String email;

        // Constructeur
        public Profil(String nom, String prenom, String telephone, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.telephone = telephone;
            this.email = email;
        }

        // Mettre à jour les informations de contact
        public void updateContactInfo(String newPhone, String newEmail) {
            this.telephone = newPhone;
            this.email = newEmail;
        }

        // Récupérer les détails du profil
        public String getProfileDetails() {
            return "Nom: " + this.nom + ", Prenom: " + this.prenom + ", Telephone: " + this.telephone + ", Email: " + this.email;
        }
    }

    // Classe interne pour gérer les comptes des utilisateurs
    static class Compte {
        private String email;
        private String motDePasse;

        // Constructeur
        public Compte(String email, String motDePasse) {
            this.email = email;
            this.motDePasse = motDePasse;
        }

        // Authentifier l'utilisateur
        public boolean authenticate(String email, String motDePasse) {
            return this.email.equals(email) && this.motDePasse.equals(motDePasse);
        }

        // Changer le mot de passe
        public void changePassword(String newPassword) {
            this.motDePasse = newPassword;
        }

        // Récupérer les détails du compte
        public String getAccountDetails() {
            return "Email: " + this.email + ", Mot de Passe: " + this.motDePasse;
        }
    }

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


