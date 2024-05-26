package Patron_Grasp.Patron_indirection.Application_exemple;

public class Sale {
    private double total;

    public Sale(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public double calculateTaxes() {
        TaxMasterAdapter taxAdapter = new TaxMasterAdapter();
        return taxAdapter.getTaxes(this);
    }
}
