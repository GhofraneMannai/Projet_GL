import java.text.SimpleDateFormat;
import java.util.Date;


// Classe abstraite Evenement
abstract class Evenement implements Affichable {
    protected int idEvenement;
    protected String nomEvenement;
    protected String typeEvenement;
    protected String description;
    protected Date dateDebut;
    protected double prix;

    public Evenement(int idEvenement, String nomEvenement, String typeEvenement, String description, Date dateDebut, double prix) {
        this.idEvenement = idEvenement;
        this.nomEvenement = nomEvenement;
        this.typeEvenement = typeEvenement;
        this.description = description;
        this.dateDebut = dateDebut;
        this.prix = prix;
    }

    @Override
    public void afficherDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id de l'événement: " + idEvenement);
        System.out.println("Nom de l'événement: " + nomEvenement);
        System.out.println("Type d'événement: " + typeEvenement);
        System.out.println("Description: " + description);
        System.out.println("Date de début: " + sdf.format(dateDebut));
        System.out.println("Prix: " + prix);
    }
}


