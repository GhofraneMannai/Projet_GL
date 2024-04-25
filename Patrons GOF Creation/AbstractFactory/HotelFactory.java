// HotelFactory.java
public interface HotelFactory {
    Chambre creeChambreSimple(String typePension);
    Chambre creeChambreDouble(String typePension);
    Chambre creeChambreRoyal(String typePension);
}