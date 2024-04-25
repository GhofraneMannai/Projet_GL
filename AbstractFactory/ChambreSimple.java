// ChambreSimple.java
public class ChambreSimple extends Chambre {
    public ChambreSimple(int numChambre, float prixBase, String typePension) {
        super(numChambre, prixBase, typePension);
    }

    @Override
    public void afficherDetails() {
        System.out.println("Chambre Simple - Numéro: " + numChambre + ", Prix: " + calculerPrix() + "$, Pension: " + typePension);
    }
}