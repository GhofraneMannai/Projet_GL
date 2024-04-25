public class Compte implements Client {

    private String Email;
    private String MotDePasse;

    public Compte(String email, String motDePasse) {
        this.Email = email;
        this.MotDePasse = motDePasse;
    }

    public void afficher() {
        // Implémentation de la méthode pour afficher les informations du compte
    }

    public void ajouter() {
        // Implémentation de la méthode pour ajouter des informations au compte
    }

    public void modifier() {
        // Implémentation de la méthode pour modifier les informations du compte
    }

    public void supprimer() {
        // Implémentation de la méthode pour supprimer le compte
    }

    @Override
    public void receiveNotification(Notification notification) {
        // Implémentation de la méthode pour recevoir la notification
        System.out.println("Notification received by " + Email + ": " + notification.getMessage());
        // Vous pouvez ajouter ici la logique pour traiter la notification
    }
}
