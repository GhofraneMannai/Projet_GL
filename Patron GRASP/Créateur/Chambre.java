public class Chambre {
    private int idChambre;
    private String pension;
    private Number prix;
    private Number nbrAdulte;
    private Number nbrEnfant;

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

    public Number getPrix() {
        return prix;
    }

    public Number getNbrAdulte() {
        return nbrAdulte;
    }

    public Number getNbrEnfant() {
        return nbrEnfant;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public void setPrix(Number prix) {
        this.prix = prix;
    }

    public void setNbrAdulte(Number nbrAdulte) {
        this.nbrAdulte = nbrAdulte;
    }

    public void setNbrEnfant(Number nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }
}