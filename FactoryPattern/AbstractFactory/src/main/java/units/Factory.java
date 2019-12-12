package units;

public interface Factory {
    InfantryUnit createInfantryUnit(UnitType unitType);

    ArmoredUnit createArmoredUnit(UnitType unitType);

    ArtilleryUnit createArtilleryUnit(UnitType unitType);

    NavalUnit createNavalUnit(UnitType unitType);

    AirUnit createAirUnit(UnitType unitType);
}