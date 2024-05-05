import java.util.List;
import java.util.Map;

public class Hotel {
    private int idHotel;
    private String nomHotel;
    private String localisation;
    private String description;
    private double rating;
    private List<String> images;
    private Map<String, String> options;

    public Hotel(int idHotel, String nomHotel, String localisation, String description,
                 double rating, List<String> images, Map<String, String> options) {
        this.idHotel = idHotel;
        this.nomHotel = nomHotel;
        this.localisation = localisation;
        this.description = description;
        this.rating = rating;
        this.images = images;
        this.options = options;
    }

    // Getters
    public int getIdHotel() {
        return idHotel;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

    public List<String> getImages() {
        return images;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    // Setters
    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }
}
