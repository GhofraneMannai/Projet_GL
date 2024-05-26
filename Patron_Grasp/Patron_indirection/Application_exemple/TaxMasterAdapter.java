package Patron_Grasp.Patron_indirection.Application_exemple;

public class TaxMasterAdapter {
    public double getTaxes(Sale sale) {
        double total = sale.getTotal();
        return communicateWithTaxMaster(total);
    }

    private double communicateWithTaxMaster(double amount) {
       
        TaxMaster taxMaster = new TaxMaster();
        return taxMaster.calculateTax(amount);
    }
}
