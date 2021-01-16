package ufs.game.sky;

public enum SkyAction {
    NONE,
    SHIFT_RIGHT,
    SHIFT_LEFT,
    MOTHERSHIP_DESCEND,
    EXPLOSION_1,
    EXPLOSION_2,
    EXPLOSION_3,
    EXPLOSION_4,
    EXPLOSION_5,
    EXPLOSION_6,
    EXPLOSION_7;

    public boolean isExplosion(){
        return this == EXPLOSION_1 ||
                this == EXPLOSION_2 ||
                this == EXPLOSION_3 ||
                this == EXPLOSION_4 ||
                this == EXPLOSION_5 ||
                this == EXPLOSION_6 ||
                this == EXPLOSION_7;
    }
}
