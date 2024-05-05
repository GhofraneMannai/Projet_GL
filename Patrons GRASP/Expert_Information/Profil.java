public class Profil {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String motDePasse;

    // Constructor
    public Profil(String nom, String prenom, String email, String telephone, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        setEmail(email); 
        setTelephone(telephone); 
        setMotDePasse(motDePasse); 
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

  

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Email not updated.");
        }
    }

    public void setTelephone(String telephone) {
        if (validateTelephone(telephone)) {
            this.telephone = telephone;
        } else {
            System.out.println("Invalid telephone format. Telephone not updated.");
        }
    }

    private void setMotDePasse(String motDePasse) {
        if (validatePassword(motDePasse)) {
            this.motDePasse = motDePasse;
        } else {
            System.out.println("Invalid password format. Password not updated.");
        }
    }

    // Validation methods
    public boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    private boolean validateTelephone(String telephone) {
        return telephone.matches("\\d{8}");
    }

    public boolean validatePassword(String password) {
        return password.length() >= 8;
    }

    // Public method to update the email
    public void updateEmail(String newEmail) {
        setEmail(newEmail); 
    }

    // Public method to change the password
    public void changePassword(String oldPassword, String newPassword) {
        if (this.motDePasse.equals(oldPassword) && validatePassword(newPassword)) {
            setMotDePasse(newPassword); 
        } else {
            System.out.println("Invalid password format or incorrect old password. Password not changed.");
        }
    }

    // Method to print profile information
    public void printProfileInfo() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Telephone: " + telephone);
    }
}
