package Patron_Grasp.Patron_indirection.Application_exemple;
// Classe représentant le vendeur
public class Vendeur {

    private String nom;

    public Vendeur(String nom) {
        this.nom = nom;
    }

    public void effectuerVente(Exemple produit, int quantite) {
        // Créer un objet InformationsVente
        InformationsVente informationsVente = new InformationsVente(this, produit, quantite);

        // Transmettre les informations de vente à l'adaptateur TaxMaster
        AdaptateurTaxMaster adaptateurTaxMaster = new AdaptateurTaxMaster();
        adaptateurTaxMaster.transmettreInformationsVente(informationsVente);
    }
}