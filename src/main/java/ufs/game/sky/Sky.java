package ufs.game.sky;

public class Sky {
    public static final int COLUMNS = 5;
    public static final int ROWS = 16;
    private SkyAction[][] skyActions = new SkyAction[ROWS][COLUMNS];

    public Sky(){
        for (int r = 0; r < ROWS; ++r){
            for (int c = 0; c < COLUMNS; ++c){
                setSkyAction(r, c, SkyAction.NONE);
            }
        }
    }

    public SkyAction getSkyAction(int row, int column){
        if (row < 0 || row >= ROWS || column < 0 || column >= COLUMNS)
            return null;
        return skyActions[row][column];
    }

    public boolean setSkyAction(int row, int column, SkyAction skyAction){
        if (row < 0 || row >= ROWS || column < 0 || column >= COLUMNS)
            return false;
        skyActions[row][column] = skyAction;
        return true;
    }
}
