// Hotel4EtoilesFactory.java
public class Hotel4EtoilesFactory implements HotelFactory {
    private static final float PRIX_BASE_SIMPLE = 200.0f;
    private static final float PRIX_BASE_DOUBLE = 200.0f;
    private static final float PRIX_BASE_ROYAL = 400.0f;

    @Override
    public Chambre creeChambreSimple(String typePension) {
        return new ChambreSimple(101, PRIX_BASE_SIMPLE, typePension);
    }

    @Override
    public Chambre creeChambreDouble(String typePension) {
        return new ChambreDouble(102, PRIX_BASE_DOUBLE, typePension);
    }

    @Override
    public Chambre creeChambreRoyal(String typePension) {
        return new ChambreRoyal(103, PRIX_BASE_ROYAL, typePension);
    }
}
