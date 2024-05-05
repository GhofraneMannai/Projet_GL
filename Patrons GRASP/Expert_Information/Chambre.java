public class Chambre {
    protected int numChambre;
    protected float prixBase;
    protected String typePension;

    // Constructor
    public Chambre(int numChambre, float prixBase, String typePension) {
        this.numChambre = numChambre;
        this.prixBase = prixBase;
        this.typePension = typePension;
    }

    // Calculate the price based on the pension type
    public float getPrix() {
        float prix = prixBase;
        switch (typePension) {
            case "complète":
                prix += 50; // Extra cost for full board
                break;
            case "demi":
                prix += 30; // Extra cost for half board
                break;
            default:
                // no additional cost for no meal plan or other types
                break;
        }
        return prix;
    }

    // Overriding toString for better display and debugging
    @Override
    public String toString() {
        return "Chambre { Numéro: " + numChambre + ", Prix Base: " + prixBase + ", Type de Pension: " + typePension + " }";
    }

    // Getters and setters
    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public float getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(float prixBase) {
        this.prixBase = prixBase;
    }

    public String getTypePension() {
        return typePension;
    }

    public void setTypePension(String typePension) {
        this.typePension = typePension;
    }
}
