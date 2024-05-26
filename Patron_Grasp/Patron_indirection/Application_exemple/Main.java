package Patron_Grasp.Patron_indirection.Application_exemple;
public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale(100.0);
        double taxes = sale.calculateTaxes();
        System.out.println("Taxes: " + taxes);
    }
}
