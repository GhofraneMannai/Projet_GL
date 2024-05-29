import java.util.ArrayList;
import java.util.Date;

// Classe Evenement
public class Evenement {
    private String nomEvenement;
    private String typeEvenement;
    private String description;
    private Date date;
    private int periode;
    private int prix;
    private int places;
    private String image;
    private ArrayList<Note> notes;
    private Programme programme;

    public Evenement(String nomEvenement, String typeEvenement, String description, Date date, int periode, int prix, int places, String image) {
        this.nomEvenement = nomEvenement;
        this.typeEvenement = typeEvenement;
        this.description = description;
        this.date = date;
        this.periode = periode;
        this.prix = prix;
        this.places = places;
        this.image = image;
        this.notes = new ArrayList<>();
    }

    public void creerEvenement() {
        // Code pour créer un événement
    }

    public void modifierEvenement() {
        // Code pour modifier un événement
    }

    public void supprimerEvenement() {
        // Code pour supprimer un événement
    }

    public void ajouterNote(Note note) {
        this.notes.add(note);
    }

    public void ajouterProgramme(Programme programme) {
        this.programme = programme;
    }
}

// Classe Note
class Note {
    private int valeur;
    private String commentaire;

    public Note(int valeur, String commentaire) {
        this.valeur = valeur;
        this.commentaire = commentaire;
    }

    public void creerNote() {
        // Code pour créer une note
    }

    public void modifierNote() {
        // Code pour modifier une note
    }

    public void supprimerNote() {
        // Code pour supprimer une note
    }
}

// Classe Programme
class Programme {
    private String description;
    private ArrayList<Activite> activites;

    public Programme(String description) {
        this.description = description;
        this.activites = new ArrayList<>();
    }

    public void ajouterProgramme() {
        // Code pour ajouter un programme
    }

    public void modifierProgramme() {
        // Code pour modifier un programme
    }

    public void supprimerProgramme() {
        // Code pour supprimer un programme
    }

    public void ajouterActivite(Activite activite) {
        this.activites.add(activite);
    }
}

// Classe Activite
class Activite {
    private String nomActivite;
    private String description;

    public Activite(String nomActivite, String description) {
        this.nomActivite = nomActivite;
        this.description = description;
    }

    public void ajouterActivite() {
        // Code pour ajouter une activité
    }

    public void modifierActivite() {
        // Code pour modifier une activité
    }

    public void supprimerActivite() {
        // Code pour supprimer une activité
    }
}

// Classe VacanceSurMesure
class VacanceSurMesure {
    private String typeDestination;
    private int nbPersonnes;
    private ArrayList<Integer> periode;
    private ArrayList<String> option;
    private ArrayList<String> personne;
    private Destination destination;

    public VacanceSurMesure(String typeDestination, int nbPersonnes, ArrayList<Integer> periode, ArrayList<String> option, ArrayList<String> personne) {
        this.typeDestination = typeDestination;
        this.nbPersonnes = nbPersonnes;
        this.periode = periode;
        this.option = option;
        this.personne = personne;
    }

    public void ajouterVacance() {
        // Code pour ajouter une vacance
    }

    public void modifierVacance() {
        // Code pour modifier une vacance
    }

    public void supprimerVacance() {
        // Code pour supprimer une vacance
    }

    public void ajouterDestination(Destination destination) {
        this.destination = destination;
    }
}

// Classe Destination
class Destination {
    private String nom;
    private String description;
    private String typeDestination;

    public Destination(String nom, String description, String typeDestination) {
        this.nom = nom;
        this.description = description;
        this.typeDestination = typeDestination;
    }

    public void ajouterDestination() {
        // Code pour ajouter une destination
    }

    public void modifierDestination() {
        // Code pour modifier une destination
    }

    public void supprimerDestination() {
        // Code pour supprimer une destination
    }
}
