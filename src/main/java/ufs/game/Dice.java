package ufs.game;

import ufs.util.Util;

public class Dice {
    private DiceType diceType;
    private int value;

    public Dice(DiceType diceType){
        this.diceType = diceType;
        value = 1;
    }

    public void roll(){
        value = Util.getRandomInt(0, 6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DiceType getDiceType() {
        return diceType;
    }
}
