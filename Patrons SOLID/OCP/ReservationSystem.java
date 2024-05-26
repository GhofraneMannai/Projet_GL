public class ReservationSystem {

    public interface IReservation {
        void reserver();
        void annulerReservation();
        void modifierReservation();
    }

    public static class Reservation_Event implements IReservation {
        private int idReservation;
        private String etat;
        private double prix;
        private int nbrPlaces;
        private Object details; // Ce type devrait être plus spécifique ou être remplacé par une classe adéquate

        public Reservation_Event(int idReservation, String etat, double prix, int nbrPlaces, Object details) {
            this.idReservation = idReservation;
            this.etat = etat;
            this.prix = prix;
            this.nbrPlaces = nbrPlaces;
            this.details = details;
        }

        @Override
        public void reserver() {
            System.out.println("Réservation de l'événement effectuée.");
        }

        @Override
        public void annulerReservation() {
            System.out.println("Réservation de l'événement annulée.");
        }

        @Override
        public void modifierReservation() {
            System.out.println("Réservation de l'événement modifiée.");
        }

        // Getters et setters
        public int getIdReservation() {
            return idReservation;
        }

        public void setIdReservation(int idReservation) {
            this.idReservation = idReservation;
        }

        public String getEtat() {
            return etat;
        }

        public void setEtat(String etat) {
            this.etat = etat;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public int getNbrPlaces() {
            return nbrPlaces;
        }

        public void setNbrPlaces(int nbrPlaces) {
            this.nbrPlaces = nbrPlaces;
        }

        public Object getDetails() {
            return details;
        }

        public void setDetails(Object details) {
            this.details = details;
        }
    }

    public static void main(String[] args) {
        Reservation_Event myEvent = new Reservation_Event(1, "Planifié", 59.99, 100, "Détails de l'événement");
        
        // Test des méthodes
        myEvent.reserver();
        myEvent.annulerReservation();
        myEvent.modifierReservation();

        // Affichage de l'état actuel de l'objet
        System.out.println("ID: " + myEvent.getIdReservation());
        System.out.println("État: " + myEvent.getEtat());
        System.out.println("Prix: " + myEvent.getPrix());
        System.out.println("Nombre de places: " + myEvent.getNbrPlaces());
        System.out.println("Détails: " + myEvent.getDetails());
    }
}
