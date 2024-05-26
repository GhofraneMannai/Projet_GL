public class Profil {
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
