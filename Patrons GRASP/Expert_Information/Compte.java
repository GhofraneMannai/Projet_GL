public class Compte {
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
