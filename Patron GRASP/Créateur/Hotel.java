public class Hotel {

    private int idHotel;
    private String nomHotel;
    private String localisation;
    private String description;
    private Number rating;
    private ArrayList<Object> images;
    private Object options;
    private Number promo;
    private List<Chambre> chambres;

    public Hotel(int idHotel, String nomHotel, String localisation, String description, double rating) {
        this.idHotel = idHotel;
        this.nomHotel = nomHotel;
        this.localisation = localisation;
        this.description = description;
        this.rating = rating;
        this.images = new ArrayList<>();
        this.chambres = new ArrayList<>();
    }

    // Methods to manage Chambres
    public void addChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    public void removeChambre(Chambre chambre) {
        chambres.remove(chambre);
    }

    
    // Getters and setters
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

    public List<Object> getImages() {
        return images;
    }

    public Object getOptions() {
        return options;
    }

    public Number getPromo() {
        return promo;
    }

    public void setOptions(Object options) {
        this.options = options;
    }

    public void setPromo(Number promo) {
        this.promo = promo;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }
}