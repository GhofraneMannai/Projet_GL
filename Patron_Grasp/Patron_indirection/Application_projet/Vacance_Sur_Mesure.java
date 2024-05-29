package Patron_Grasp.Patron_indirection.Application_projet;

public class Vacance_Sur_Mesure {
    private String type_Destination;
    private int nbreDestination;
    private String[] destination;
    private int periode;
    private int nbrePersonne;
    private String[] options;

    public Vacance_Sur_Mesure(String type_Destination, int nbreDestination, String[] destination, int periode, int nbrePersonne, String[] options) {
        this.type_Destination = type_Destination;
        this.nbreDestination = nbreDestination;
        this.destination = destination;
        this.periode = periode;
        this.nbrePersonne = nbrePersonne;
        this.options = options;
    }

  
    public void setType_Destination(String type_Destination) { this.type_Destination = type_Destination; }
    public void setNbreDestination(int nbreDestination) { this.nbreDestination = nbreDestination; }
    public void setDestination(String[] destination) { this.destination = destination; }
    public void setPeriode(int periode) { this.periode = periode; }
    public void setNbrePersonne(int nbrePersonne) { this.nbrePersonne = nbrePersonne; }
    public void setOptions(String[] options) { this.options = options; }
}
