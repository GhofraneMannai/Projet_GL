package Patron_Grasp.Patron_indirection.Application_exemple;





// Classe représentant les informations de vente
public class InformationsVente {

    private Vendeur vendeur;
    private Exemple produit;
    private int quantite;

    public InformationsVente(Vendeur vendeur, Exemple produit, int quantite) {
        this.vendeur = vendeur;
        this.produit = produit;
        this.quantite = quantite;
    }

    public Vendeur getVendeur() {
        return vendeur;
    }

    public Exemple getProduit() {
        return produit;
    }

    public int getQuantite() {
        return quantite;
    }
}

// Classe représentant l'adaptateur TaxMaster
public class AdaptateurTaxMaster {

    private SystemeFiscal systemeFiscal;

    public AdaptateurTaxMaster() {
        this.systemeFiscal = new SystemeFiscal();
    }

    public void transmettreInformationsVente(InformationsVente informationsVente) {
        // Calculer le montant de l'impôt
        double montantImpot = systemeFiscal.calculerImpot(informationsVente);

        // Envoyer le montant de l'impôt au vendeur
        System.out.println("Vendeur : " + informationsVente.getVendeur().getNom());
        System.out.println("Produit : " + informationsVente.getProduit().getNom());
        System.out.println("Quantité : " + informationsVente.getQuantite());
        System.out.println("Montant de l'impôt : " + montantImpot);
    }
}

// Classe représentant le système fiscal
public class SystemeFiscal {

    public double calculerImpot(InformationsVente informationsVente) {
        // Simuler le calcul de l'impôt
        double montantImpot = informationsVente.getProduit().getPrixUnitaire() * informationsVente.getQuantite() * 0.2;
        return montantImpot;
    }
}

// Exemple d'utilisation


public class Exemple {
    public static void main(String[] args) {
        Vendeur vendeur = new Vendeur("Alice");
        Exemple produit = new Exemple("Ordinateur portable", 1000.0);

        vendeur.effectuerVente(produit, 2);
    }
}
