import java.util.ArrayList;
import java.util.Date;


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

    }

    public void modifierEvenement() {
       
    }

    public void supprimerEvenement() {
       
    }

    public void ajouterNote(Note note) {
        this.notes.add(note);
    }

    public void ajouterProgramme(Programme programme) {
        this.programme = programme;
    }
}


class Note {
    private int valeur;
    private String commentaire;

    public Note(int valeur, String commentaire) {
        this.valeur = valeur;
        this.commentaire = commentaire;
    }

    public void creerNote() {
        
    }

    public void modifierNote() {
        
    }

    public void supprimerNote() {
        
    }
}


class Programme {
    private String description;
    private ArrayList<Activite> activites;

    public Programme(String description) {
        this.description = description;
        this.activites = new ArrayList<>();
    }

    public void ajouterProgramme() {
        
    }

    public void modifierProgramme() {
        
    }

    public void supprimerProgramme() {
       
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
       
    }

    public void modifierActivite() {
        
    }

    public void supprimerActivite() {
      
    }
}


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
        
    }

    public void modifierVacance() {
       
    }

    public void supprimerVacance() {
       
    }

    public void ajouterDestination(Destination destination) {
        this.destination = destination;
    }
}


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
       
    }

    public void modifierDestination() {

    }

    public void supprimerDestination() {
    
    }
}
