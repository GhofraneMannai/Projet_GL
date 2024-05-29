package Patron_Grasp.Patron_indirection.Application_projet;

import java.util.Date;

public class Evenement {
    private String nom;
    private String type;
    private String description;
    private Date date;
    private int periode;
    private double prix;
    private String[] program;
    private String[] notes;
    private String[] images;
    private int places;

    public Evenement(String nom, String type, String description, Date date, int periode, double prix, String[] program, String[] notes, String[] images, int places) {
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.date = date;
        this.periode = periode;
        this.prix = prix;
        this.program = program;
        this.notes = notes;
        this.images = images;
        this.places = places;
    }

  
    public void setNom(String nom) { this.nom = nom; }
    public void setType(String type) { this.type = type; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(Date date) { this.date = date; }
    public void setPeriode(int periode) { this.periode = periode; }
    public void setPrix(double prix) { this.prix = prix; }
    public void setProgram(String[] program) { this.program = program; }
    public void setNotes(String[] notes) { this.notes = notes; }
    public void setImages(String[] images) { this.images = images; }
    public void setPlaces(int places) { this.places = places; }
}

