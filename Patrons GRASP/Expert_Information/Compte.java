public class Compte {
    private Profil profil;
    private String email;
    private String motDePasse;

    // Constructor
    public Compte(Profil profil, String email, String motDePasse) {
        this.profil = profil;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    // Method to authenticate the account
    public boolean authenticate(String email, String motDePasse) {
        return this.email.equalsIgnoreCase(email) && this.motDePasse.equals(motDePasse);
    }

    // Getters
    public Profil getProfil() {
        return profil;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public void setEmail(String email) {
        if (profil.validateEmail(email)) { 
            this.email = email;
        } else {
            System.out.println("Invalid email format. Email not updated.");
        }
    }

    public void setMotDePasse(String motDePasse) {
        if (profil.validatePassword(motDePasse)) { 
            this.motDePasse = motDePasse;
        } else {
            System.out.println("Invalid password format. Password not updated.");
        }
    }

    // Method to reset the password
    public void resetPassword(String oldPassword, String newPassword) {
        if (this.motDePasse.equals(oldPassword)) {
            setMotDePasse(newPassword); // This method includes validation
        } else {
            System.out.println("Incorrect old password. Password reset failed.");
        }
    }
    
    // Method to print account information
    public void printAccountInfo() {
        System.out.println("Account Email: " + email);
        // Calls the method from the Profil class to print the profile information
        profil.printProfileInfo();
    }

}
