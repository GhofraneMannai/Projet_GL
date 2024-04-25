// Hotel5EtoilesFactory.java
public class Hotel5EtoilesFactory implements HotelFactory {
    private static final float PRIX_BASE_SIMPLE = 300.0f;
    private static final float PRIX_BASE_DOUBLE = 500.0f;
    private static final float PRIX_BASE_ROYAL = 1000.0f;

    @Override
    public Chambre creeChambreSimple(String typePension) {
        return new ChambreSimple(201, PRIX_BASE_SIMPLE, typePension);
    }

    @Override
    public Chambre creeChambreDouble(String typePension) {
        return new ChambreDouble(202, PRIX_BASE_DOUBLE, typePension);
    }

    @Override
    public Chambre creeChambreRoyal(String typePension) {
        return new ChambreRoyal(203, PRIX_BASE_ROYAL, typePension);
    }
}