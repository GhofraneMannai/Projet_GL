// ChambreRoyal.java
public class ChambreRoyal extends Chambre {
    public ChambreRoyal(int numChambre, float prixBase, String typePension) {
        super(numChambre, prixBase, typePension);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Chambre Royale - Numéro: " + numChambre + ", Prix: " + calculerPrix() + "$, Pension: " + typePension);
    }
}