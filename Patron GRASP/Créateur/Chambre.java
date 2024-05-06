public class Chambre {
    private int idChambre;
    private String pension;
    private double prix;
    private int nbrAdulte;
    private int nbrEnfant;

    public Chambre(int idChambre, String pension, double prix, int nbrAdulte, int nbrEnfant) {
        this.idChambre = idChambre;
        this.pension = pension;
        this.prix = prix;
        this.nbrAdulte = nbrAdulte;
        this.nbrEnfant = nbrEnfant;
    }

    // Getters et setters
    public int getIdChambre() {
        return idChambre;
    }

    public String getPension() {
        return pension;
    }

    public double getPrix() {
        return prix;
    }

    public int getNbrAdulte() {
        return nbrAdulte;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setNbrAdulte(int nbrAdulte) {
        this.nbrAdulte = nbrAdulte;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }
}