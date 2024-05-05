public class Compte implements Client {

    private String Email;
    private String MotDePasse;

    public Compte(String email, String motDePasse) {
        this.Email = email;
        this.MotDePasse = motDePasse;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMotDePasse() {
        return this.MotDePasse;
    }

    public void setMotDePasse(String MotDePasse) {
        this.MotDePasse = MotDePasse;
    }

  

    @Override
    public void receiveNotification(Notification notification) {
        // Implémentation de la méthode pour recevoir la notification
        System.out.println("Notification received by " + Email + ": " + notification.getMessage());
        // Vous pouvez ajouter ici la logique pour traiter la notification
    }
}
