import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Evenement {
    private Integer idEvenement;
    private String nomEvenement;
    private String typeEvenement;
    private String description;
    private Date dateDebut;
    private Double prix;
    private List<String> programme;
    private List<String> notes;
    private Integer placesDisponibles;

    // Constructeur
    public Evenement(Integer idEvenement, String nomEvenement, String typeEvenement, String description, 
                     Date dateDebut, Double prix, ArrayList<String> programme, ArrayList<String> notes, Integer placesDisponibles) {
        this.idEvenement = idEvenement;
        this.nomEvenement = nomEvenement;
        this.typeEvenement = typeEvenement;
        this.description = description;
        this.dateDebut = dateDebut;
        this.prix = prix;
        this.programme = programme;
        this.notes = notes;
        this.placesDisponibles = placesDisponibles;
    }

    // Getters et Setters
    public Integer getIdEvenement() { return idEvenement; }
    public String getNomEvenement() { return nomEvenement; }
    public String getTypeEvenement() { return typeEvenement; }
    public String getDescription() { return description; }
    public Date getDateDebut() { return dateDebut; }
    public Double getPrix() { return prix; }
    public List<String> getProgramme() { return programme; }
    public List<String> getNotes() { return notes; }
    public Integer getPlacesDisponibles() { return placesDisponibles; }
    public void setPlacesDisponibles(Integer placesDisponibles) { this.placesDisponibles = placesDisponibles; }
}
