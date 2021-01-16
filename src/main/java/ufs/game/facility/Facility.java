package ufs.game.facility;

import ufs.game.sky.Sky;

import java.util.ArrayList;
import java.util.List;

public class Facility {
    public static final int ROWS = 6;
    public static final int COLUMNS = 5;

    private List<Room> rooms = new ArrayList<>();

    private int excavatorIndex = 0;

    public Facility(){
        for (int row = 0; row < ROWS; ++row){
            if (row % 2 == 0) {
                for (int col = COLUMNS - 1; col >= 0; --col) {
                    rooms.add(new Room(col));
                }
            }
            else {
                for (int col = 0; col < COLUMNS; ++col) {
                    rooms.add(new Room(col));
                }
            }
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Room getRoomAt(int row, int column){
        if (row < 0 || row >= ROWS || column < 0 || column >= COLUMNS)
            return null;
        return rooms.get((row * ROWS) + (row % 2 == 0? COLUMNS - column - 1: column));
    }

    public void setExcavatorIndex(int excavatorIndex) {
        this.excavatorIndex = excavatorIndex;
    }

    public int getExcavatorIndex() {
        return excavatorIndex;
    }

    public Room getExcavatorRoom(){
        return rooms.get(excavatorIndex);
    }
}
