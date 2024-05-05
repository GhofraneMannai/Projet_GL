import java.util.ArrayList;
import java.util.Date;

// Classe Vacances_sur_mesure
class Vacances_sur_mesure extends Evenement {
    private int idVacances;
    private String typeDestination;
    private ArrayList<String> destinations;
    private int nbrPersonnes;
    private ArrayList<String> options;

    public Vacances_sur_mesure(int idEvenement, String nomEvenement, String typeEvenement, String description, Date dateDebut, double prix, int idVacances, String typeDestination, ArrayList<String> destinations, int nbrPersonnes, ArrayList<String> options) {
        super(idEvenement, nomEvenement, typeEvenement, description, dateDebut, prix);
        this.idVacances = idVacances;
        this.typeDestination = typeDestination;
        this.destinations = destinations;
        this.nbrPersonnes = nbrPersonnes;
        this.options = options;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("ID vacances: " + idVacances);
        System.out.println("Type de destination: " + typeDestination);
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Nombre de personnes: " + nbrPersonnes);
        System.out.println("Options: " + options);
    }
}
