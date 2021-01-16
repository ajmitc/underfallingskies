package ufs.game.sky;

import ufs.game.Game;
import ufs.game.MothershipAction;

public class SkyTile {
    public SkyTile(){

    }

    public static void setup(Game game, int level, boolean hard){
        switch (level){
            case 0:
                if (hard)
                    setup0H(game);
                else
                    setup0E(game);
                break;
            case 1:
                if (hard)
                    setup1H(game);
                else
                    setup1E(game);
                break;
            case 2:
                if (hard)
                    setup2H(game);
                else
                    setup2E(game);
                break;
            case 3:
                if (hard)
                    setup3H(game);
                else
                    setup3E(game);
                break;
        }
    }

    private static void setup0H(Game game){
        game.getSky().setSkyAction(0, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(0, 1, SkyAction.EXPLOSION_7);
        game.getSky().setSkyAction(0, 2, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(0, 3, SkyAction.MOTHERSHIP_DESCEND);

        game.getSky().setSkyAction(1, 0, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(1, 1, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(1, 3, SkyAction.EXPLOSION_6);
        game.getSky().setSkyAction(1, 4, SkyAction.MOTHERSHIP_DESCEND);

        game.getSky().setSkyAction(2, 2, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(2, 3, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(2, 4, SkyAction.EXPLOSION_5);

        game.getSky().setSkyAction(3, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(3, 1, SkyAction.EXPLOSION_5);
        game.getSky().setSkyAction(3, 2, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(3, 4, SkyAction.SHIFT_LEFT);

        game.getResearchTrack().add(3);
        game.getResearchTrack().add(2);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(5);
    }

    private static void setup0E(Game game){
        game.getSky().setSkyAction(0, 1, SkyAction.EXPLOSION_5);
        game.getSky().setSkyAction(0, 2, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(0, 3, SkyAction.EXPLOSION_4);

        game.getSky().setSkyAction(1, 0, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(1, 2, SkyAction.EXPLOSION_3);
        game.getSky().setSkyAction(1, 4, SkyAction.SHIFT_LEFT);

        game.getSky().setSkyAction(2, 1, SkyAction.EXPLOSION_6);
        game.getSky().setSkyAction(2, 3, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(2, 4, SkyAction.EXPLOSION_4);

        game.getSky().setSkyAction(3, 0, SkyAction.EXPLOSION_3);
        game.getSky().setSkyAction(3, 1, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(3, 3, SkyAction.MOTHERSHIP_DESCEND);

        game.getResearchTrack().add(3);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(3);
        game.getResearchTrack().add(1);
    }

    private static void setup1H(Game game){
        int rowoffset = 4;
        game.getSky().setSkyAction(rowoffset, 2, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset, 3, SkyAction.EXPLOSION_4);

        game.getSky().setSkyAction(rowoffset + 1, 1, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset + 1, 3, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 1, 4, SkyAction.EXPLOSION_7);

        game.getSky().setSkyAction(rowoffset + 2, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 2, 1, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(rowoffset + 2, 2, SkyAction.EXPLOSION_7);
        game.getSky().setSkyAction(rowoffset + 2, 3, SkyAction.SHIFT_RIGHT);

        game.getSky().setSkyAction(rowoffset + 3, 0, SkyAction.EXPLOSION_6);
        game.getSky().setSkyAction(rowoffset + 3, 2, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset + 3, 4, SkyAction.MOTHERSHIP_DESCEND);

        game.getResearchTrack().add(3);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(3);
        game.getResearchTrack().add(7);

        game.getMothershipActions().put(rowoffset + 1, MothershipAction.GAMEOVER);
        game.getMothershipActions().put(rowoffset + 3, MothershipAction.NONE); // Unknown symbol
    }

    private static void setup1E(Game game){
        int rowoffset = 4;
        game.getSky().setSkyAction(rowoffset, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset, 1, SkyAction.EXPLOSION_3);
        game.getSky().setSkyAction(rowoffset, 3, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(rowoffset, 4, SkyAction.MOTHERSHIP_DESCEND);

        game.getSky().setSkyAction(rowoffset + 1, 1, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 1, 2, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset + 1, 4, SkyAction.EXPLOSION_6);

        game.getSky().setSkyAction(rowoffset + 2, 0, SkyAction.EXPLOSION_5);
        game.getSky().setSkyAction(rowoffset + 2, 2, SkyAction.SHIFT_LEFT);

        game.getSky().setSkyAction(rowoffset + 3, 2, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(rowoffset + 3, 3, SkyAction.SHIFT_RIGHT);

        game.getResearchTrack().add(4);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(3);
        game.getResearchTrack().add(2);

        game.getMothershipActions().put(rowoffset, MothershipAction.GAMEOVER);
        game.getMothershipActions().put(rowoffset + 2, MothershipAction.ADD_WHITE_SHIP_1);
        game.getMothershipActions().put(rowoffset + 3, MothershipAction.REDUCE_RESEARCH_1);
    }

    private static void setup2H(Game game){
        int rowoffset = 8;
        game.getSky().setSkyAction(rowoffset, 1, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset, 2, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset, 4, SkyAction.MOTHERSHIP_DESCEND);

        game.getSky().setSkyAction(rowoffset + 1, 0, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(rowoffset + 1, 1, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset + 1, 3, SkyAction.EXPLOSION_5);

        game.getSky().setSkyAction(rowoffset + 2, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 2, 1, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 2, 3, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset + 2, 4, SkyAction.EXPLOSION_3);

        game.getSky().setSkyAction(rowoffset + 3, 0, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset + 3, 2, SkyAction.EXPLOSION_2);
        game.getSky().setSkyAction(rowoffset + 3, 4, SkyAction.SHIFT_LEFT);

        game.getResearchTrack().add(2);
        game.getResearchTrack().add(3);
        game.getResearchTrack().add(4);
        game.getResearchTrack().add(2);

        game.getMothershipActions().put(rowoffset, MothershipAction.REDUCE_RESEARCH_1);
        game.getMothershipActions().put(rowoffset + 1, MothershipAction.ADD_WHITE_SHIP_2);
        game.getMothershipActions().put(rowoffset + 2, MothershipAction.REDUCE_RESEARCH_2);
        game.getMothershipActions().put(rowoffset + 3, MothershipAction.REVERSE_EXCAVATOR_3);
    }

    private static void setup2E(Game game){
        int rowoffset = 8;
        game.getSky().setSkyAction(rowoffset, 0, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset, 2, SkyAction.EXPLOSION_6);
        game.getSky().setSkyAction(rowoffset, 4, SkyAction.SHIFT_LEFT);

        game.getSky().setSkyAction(rowoffset + 1, 0, SkyAction.EXPLOSION_4);
        game.getSky().setSkyAction(rowoffset + 1, 1, SkyAction.EXPLOSION_3);
        game.getSky().setSkyAction(rowoffset + 1, 3, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset + 1, 4, SkyAction.EXPLOSION_2);

        game.getSky().setSkyAction(rowoffset + 2, 1, SkyAction.MOTHERSHIP_DESCEND);

        game.getSky().setSkyAction(rowoffset + 3, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 3, 1, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset + 3, 3, SkyAction.EXPLOSION_4);

        game.getResearchTrack().add(1);
        game.getResearchTrack().add(6);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(3);

        game.getMothershipActions().put(rowoffset + 1, MothershipAction.REDUCE_RESEARCH_1);
        game.getMothershipActions().put(rowoffset + 2, MothershipAction.REVERSE_EXCAVATOR_1);
        game.getMothershipActions().put(rowoffset + 3, MothershipAction.ADD_WHITE_SHIP_1);
    }

    private static void setup3H(Game game){
        int rowoffset = 12;
        game.getSky().setSkyAction(rowoffset, 1, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset, 2, SkyAction.EXPLOSION_3);
        game.getSky().setSkyAction(rowoffset, 3, SkyAction.MOTHERSHIP_DESCEND);

        game.getSky().setSkyAction(rowoffset + 1, 0, SkyAction.SHIFT_RIGHT);
        game.getSky().setSkyAction(rowoffset + 1, 4, SkyAction.EXPLOSION_2);

        game.getSky().setSkyAction(rowoffset + 2, 2, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset + 2, 3, SkyAction.SHIFT_RIGHT);

        game.getSky().setSkyAction(rowoffset + 3, 1, SkyAction.EXPLOSION_1);

        game.getResearchTrack().add(3);
        game.getResearchTrack().add(5);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(12);

        game.getMothershipActions().put(rowoffset, MothershipAction.NONE); // Unknown symbol
        game.getMothershipActions().put(rowoffset + 1, MothershipAction.REVERSE_EXCAVATOR_2);
        game.getMothershipActions().put(rowoffset + 2, MothershipAction.ADD_WHITE_SHIP_2);
        game.getMothershipActions().put(rowoffset + 3, MothershipAction.REVERSE_EXCAVATOR_1);
    }

    private static void setup3E(Game game){
        int rowoffset = 12;
        game.getSky().setSkyAction(rowoffset, 1, SkyAction.EXPLOSION_2);
        game.getSky().setSkyAction(rowoffset, 2, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset, 4, SkyAction.EXPLOSION_4);

        game.getSky().setSkyAction(rowoffset + 1, 0, SkyAction.MOTHERSHIP_DESCEND);
        game.getSky().setSkyAction(rowoffset + 1, 2, SkyAction.EXPLOSION_1);

        game.getSky().setSkyAction(rowoffset + 2, 1, SkyAction.SHIFT_LEFT);
        game.getSky().setSkyAction(rowoffset + 2, 2, SkyAction.SHIFT_RIGHT);

        game.getSky().setSkyAction(rowoffset + 3, 3, SkyAction.SHIFT_RIGHT);

        game.getResearchTrack().add(5);
        game.getResearchTrack().add(1);
        game.getResearchTrack().add(3);
        game.getResearchTrack().add(11);

        game.getMothershipActions().put(rowoffset + 1, MothershipAction.ADD_WHITE_SHIP_1);
        game.getMothershipActions().put(rowoffset + 2, MothershipAction.REVERSE_EXCAVATOR_2);
        game.getMothershipActions().put(rowoffset + 3, MothershipAction.ADD_WHITE_SHIP_1);
    }
}
