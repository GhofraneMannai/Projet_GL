// Classe représentant le produit
public class Produit {

    private String nom;
    private double prixUnitaire;

    public Produit(String nom, double prixUnitaire) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }
}