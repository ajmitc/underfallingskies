package ufs.game.facility;

import ufs.game.Dice;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int column;

    private boolean excavated;
    private RoomType type = RoomType.NONE;
    private int energyCost = 0;
    private int valueModifier = 0;
    private List<Room> adjoinedRooms = new ArrayList<>();

    // Keep track of the
    private Dice assignedDice;

    public Room(int column){
        this(column, false, RoomType.NONE, 0, 0);
    }

    public Room(int column, boolean excavated, RoomType roomType, int energyCost, int valueModifier){
        this.column = column;
        this.excavated = excavated;
        this.type = roomType;
        this.energyCost = energyCost;
        this.valueModifier = valueModifier;
    }

    public Room config(RoomType type, boolean excavated){
        setType(type);
        setExcavated(excavated);
        return this;
    }

    public Room config(RoomType type, int energyCost, int valueModifier, boolean excavated){
        setType(type);
        setEnergyCost(energyCost);
        setValueModifier(valueModifier);
        setExcavated(excavated);
        return this;
    }

    public Room addAdjoiningRoom(Room room){
        adjoinedRooms.add(room);
        return this;
    }

    public int getColumn() {
        return column;
    }

    public boolean isExcavated() {
        return excavated;
    }

    public void setExcavated(boolean excavated) {
        this.excavated = excavated;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public int getValueModifier() {
        return valueModifier;
    }

    public void setValueModifier(int valueModifier) {
        this.valueModifier = valueModifier;
    }

    public List<Room> getAdjoinedRooms() {
        return adjoinedRooms;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}
