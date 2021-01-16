package ufs.game.city;

import ufs.game.Game;

public abstract class City {
    protected String name;
    // Setup
    protected char facilityTop, facilityBottom;

    public City(String name){
        this.name = name;
    }

    public abstract void setup(Game game);

    public String getName() {
        return name;
    }

    public char getFacilityBottom() {
        return facilityBottom;
    }

    public char getFacilityTop() {
        return facilityTop;
    }
}
