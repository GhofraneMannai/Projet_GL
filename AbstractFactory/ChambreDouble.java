
// ChambreDouble.java
public class ChambreDouble extends Chambre {
    public ChambreDouble(int numChambre, float prixBase, String typePension) {
        super(numChambre, prixBase, typePension);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Chambre Double - Numéro: " + numChambre + ", Prix: " + calculerPrix() + "$, Pension: " + typePension);
    }
}