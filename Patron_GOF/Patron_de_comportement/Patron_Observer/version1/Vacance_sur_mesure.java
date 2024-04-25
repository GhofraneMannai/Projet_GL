import java.util.List;

public class Vacance_sur_mesure extends ReservationManager {
    private List<String> destinations;
    private int nbreDestination;
    private int nbrePersonne;
    private List<String> options;
    private String typeDestination;

    public Vacance_sur_mesure(List<String> destinations, int nbreDestination, int nbrePersonne, List<String> options, String typeDestination) {
        this.destinations = destinations;
        this.nbreDestination = nbreDestination;
        this.nbrePersonne = nbrePersonne;
        this.options = options;
        this.typeDestination = typeDestination;
    }

    // Getter and setter methods for the fields (not shown here for brevity)

    @Override
    public void cancelReservation() {
        System.out.println("Customized vacation reservation canceled: " +
                "destinations=" + destinations +
                ", nbreDestination=" + nbreDestination +
                ", nbrePersonne=" + nbrePersonne +
                ", options=" + options +
                ", typeDestination=" + typeDestination);
    }

    @Override
    public void confirmReservation() {
        System.out.println("Customized vacation reservation confirmed: " +
                "destinations=" + destinations +
                ", nbreDestination=" + nbreDestination +
                ", nbrePersonne=" + nbrePersonne +
                ", options=" + options +
                ", typeDestination=" + typeDestination);
    }
}
