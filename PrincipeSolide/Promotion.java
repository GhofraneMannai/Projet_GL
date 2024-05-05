import java.util.List;
import java.util.ArrayList;

public class Promotion {
    private int hotelId;
    private List<String> promotions;

    // Constructeur
    public Promotion(int hotelId) {
        this.hotelId = hotelId;
        this.promotions = new ArrayList<>();
    }

    // Méthode pour ajouter une promotion à la liste
    public void addPromotion(String promo) {
        if (promo != null && !promo.trim().isEmpty()) {
            promotions.add(promo);
        }
    }

    // Méthode pour retirer une promotion de la liste
    public void removePromotion(String promo) {
        promotions.remove(promo);
    }

    // Getter pour l'identifiant de l'hôtel
    public int getHotelId() {
        return hotelId;
    }

    // Setter pour l'identifiant de l'hôtel
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    // Getter pour obtenir la liste des promotions
    public List<String> getPromotions() {
        return promotions;
    }

}
