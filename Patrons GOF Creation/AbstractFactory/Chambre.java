//Chambre.java
public abstract class Chambre {
    protected int numChambre;
    protected float prixBase;
    protected String typePension;

    public Chambre(int numChambre, float prixBase, String typePension) {
        this.numChambre = numChambre;
        this.prixBase = prixBase;
        this.typePension = typePension;
    }

    public abstract void afficherDetails();

    public float calculerPrix() {
        float prix = prixBase;
        if ("complète".equals(typePension)) {
            prix += 50;
        } else if ("demi".equals(typePension)) {
            prix += 30;
        }
        return prix;
    }
}