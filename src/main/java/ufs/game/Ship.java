package ufs.game;

public class Ship {
    private boolean white;

    // Current sky location
    private int row, column;

    // If true, waiting to be deployed
    private boolean docked;

    public Ship(boolean white){
        this.white = white;
        this.docked = true;
        this.row = 0;
        this.column = 0;
    }

    public boolean isDocked() {
        return docked;
    }

    public void setDocked(boolean docked) {
        this.docked = docked;
    }

    public boolean isWhite() {
        return white;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setLocation(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
