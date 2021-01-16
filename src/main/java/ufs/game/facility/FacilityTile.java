package ufs.game.facility;

import ufs.game.Game;

public class FacilityTile {
    public static void setup(Game game, char topTile, char bottomTile){
        setupAAGuns(game);

        switch (topTile){
            case 'A':
                setupTopA(game);
                break;
            case 'B':
                setupTopB(game);
                break;
            case 'C':
                setupTopC(game);
                break;
        }
        switch (bottomTile){
            case 'A':
                setupBottomA(game);
                break;
            case 'B':
                setupBottomB(game);
                break;
            case 'C':
                setupBottomC(game);
                break;
        }
    }

    private static void setupAAGuns(Game game){
        for (int c = 0; c < Facility.COLUMNS; ++c) {
            game.getFacility().getRoomAt(0, c).config(RoomType.AA_GUN, true);
        }
    }

    private static void setupTopA(Game game){
        game.getFacility().getRoomAt(1, 0).config(RoomType.SCRAMBLE_FIGHTERS, 1, -1, true);
        game.getFacility().getRoomAt(1, 1).config(RoomType.RESEARCH, 2, 0, true);
        game.getFacility().getRoomAt(1, 3)
                .config(RoomType.GENERATE_ENERGY, 0, -3, true)
                .addAdjoiningRoom(game.getFacility().getRoomAt(1, 4));
        game.getFacility().getRoomAt(1, 4)
                .config(RoomType.GENERATE_ENERGY, 0, -3, true)
                .addAdjoiningRoom(game.getFacility().getRoomAt(1, 3));

        game.getFacility().getRoomAt(2, 3).config(RoomType.RESEARCH, 1, -1, false);
        game.getFacility().getRoomAt(2, 2)
                .config(RoomType.SCRAMBLE_FIGHTERS, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(2, 1));
        game.getFacility().getRoomAt(2, 1)
                .config(RoomType.SCRAMBLE_FIGHTERS, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(2, 2));
        game.getFacility().getRoomAt(2, 0).config(RoomType.GENERATE_ENERGY, 0, 0, false);

        game.getFacility().setExcavatorIndex(10);
        game.adjMaxEnergy(4);
        game.adjMaxDamage(4);
    }

    private static void setupTopB(Game game){
        game.getFacility().getRoomAt(1, 0).config(RoomType.SCRAMBLE_FIGHTERS, 2, 0, true);
        game.getFacility().getRoomAt(1, 1).config(RoomType.GENERATE_ENERGY, 0, -1, true);
        game.getFacility().getRoomAt(1, 2).config(RoomType.SCRAMBLE_FIGHTERS, 0, -2, true);
        game.getFacility().getRoomAt(1, 3).config(RoomType.SCRAMBLE_FIGHTERS, 1, -1, true);

        game.getFacility().getRoomAt(2, 4).config(RoomType.RESEARCH, 2, 1, false);
        game.getFacility().getRoomAt(2, 3).config(RoomType.GENERATE_ENERGY, 0, -1, false);
        game.getFacility().getRoomAt(2, 1).config(RoomType.ROBOT_FACTORY, 2, 0, false);
        game.getFacility().getRoomAt(2, 0).config(RoomType.RESEARCH, 1, 0, false);

        game.getFacility().setExcavatorIndex(9);
        game.adjMaxEnergy(4);
        game.adjMaxDamage(3);
    }

    private static void setupTopC(Game game){
        game.getFacility().getRoomAt(1, 0).config(RoomType.ROBOT_FACTORY, 1, -1, true);
        game.getFacility().getRoomAt(1, 1).config(RoomType.SCRAMBLE_FIGHTERS, 3, 0, true);
        game.getFacility().getRoomAt(1, 2)
                .config(RoomType.GENERATE_ENERGY, 0, 0, true)
                .addAdjoiningRoom(game.getFacility().getRoomAt(1, 3));
        game.getFacility().getRoomAt(1, 3)
                .config(RoomType.GENERATE_ENERGY, 0, 0, true)
                .addAdjoiningRoom(game.getFacility().getRoomAt(1, 2));

        game.getFacility().getRoomAt(2, 4).config(RoomType.GENERATE_ENERGY, 0, -1, false);
        game.getFacility().getRoomAt(2, 3).config(RoomType.RESEARCH, 1, 0, false);
        game.getFacility().getRoomAt(2, 1).config(RoomType.RESEARCH, 2, 1, false);
        game.getFacility().getRoomAt(2, 0).config(RoomType.ROBOT_FACTORY, 0, -1, false);

        game.getFacility().setExcavatorIndex(9);
        game.adjMaxEnergy(4);
        game.adjMaxDamage(4);
    }

    private static void setupBottomA(Game game){
        game.getFacility().getRoomAt(3, 0).config(RoomType.SCRAMBLE_FIGHTERS, 0, -1, false);
        game.getFacility().getRoomAt(3, 2).config(RoomType.RESEARCH, 1, 0, false);
        game.getFacility().getRoomAt(3, 3)
                .config(RoomType.SCRAMBLE_FIGHTERS, 1, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 4));
        game.getFacility().getRoomAt(3, 4)
                .config(RoomType.SCRAMBLE_FIGHTERS, 1, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 3));

        game.getFacility().getRoomAt(4, 4).config(RoomType.ROBOT_FACTORY, 2, 0, false);
        game.getFacility().getRoomAt(4, 2).config(RoomType.SCRAMBLE_FIGHTERS, 2, 1, false);
        game.getFacility().getRoomAt(4, 1).config(RoomType.RESEARCH, 1, 1, false);
        game.getFacility().getRoomAt(4, 0).config(RoomType.GENERATE_ENERGY, 0, 0, false);

        game.getFacility().getRoomAt(5, 0).config(RoomType.RESEARCH, 4, 3, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 1));
        game.getFacility().getRoomAt(5, 1).config(RoomType.RESEARCH, 4, 3, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 0));
        game.getFacility().getRoomAt(5, 2).config(RoomType.GENERATE_ENERGY, 0, 1, false);

        game.adjMaxEnergy(4);
        game.adjMaxDamage(3);
    }

    private static void setupBottomB(Game game){
        game.getFacility().getRoomAt(3, 0).config(RoomType.RESEARCH, 0, -1, false);
        game.getFacility().getRoomAt(3, 2)
                .config(RoomType.RESEARCH, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 3));
        game.getFacility().getRoomAt(3, 3)
                .config(RoomType.RESEARCH, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 2));
        game.getFacility().getRoomAt(3, 4).config(RoomType.SCRAMBLE_FIGHTERS, 2, 0, false);

        game.getFacility().getRoomAt(4, 4).config(RoomType.RESEARCH, 1, 0, false);
        game.getFacility().getRoomAt(4, 2).config(RoomType.SCRAMBLE_FIGHTERS, 1, 0, false);
        game.getFacility().getRoomAt(4, 1).config(RoomType.GENERATE_ENERGY, 0, 1, false);
        game.getFacility().getRoomAt(4, 0).config(RoomType.SCRAMBLE_FIGHTERS, 2, 1, false);

        game.getFacility().getRoomAt(5, 1)
                .config(RoomType.RESEARCH, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 2))
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 3));
        game.getFacility().getRoomAt(5, 2)
                .config(RoomType.RESEARCH, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 1))
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 3));
        game.getFacility().getRoomAt(5, 3)
                .config(RoomType.RESEARCH, 2, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 1))
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 2));

        game.adjMaxEnergy(3);
        game.adjMaxDamage(4);
    }

    private static void setupBottomC(Game game){
        game.getFacility().getRoomAt(3, 0)
                .config(RoomType.RESEARCH, 5, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 1))
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 2));
        game.getFacility().getRoomAt(3, 1)
                .config(RoomType.RESEARCH, 5, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 0))
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 2));
        game.getFacility().getRoomAt(3, 2)
                .config(RoomType.RESEARCH, 5, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 0))
                .addAdjoiningRoom(game.getFacility().getRoomAt(3, 1));
        game.getFacility().getRoomAt(3, 4).config(RoomType.SCRAMBLE_FIGHTERS, 0, -1, false);

        game.getFacility().getRoomAt(4, 4).config(RoomType.ROBOT_FACTORY, 1, 0, false);
        game.getFacility().getRoomAt(4, 3).config(RoomType.SCRAMBLE_FIGHTERS, 2, 2, false);
        game.getFacility().getRoomAt(4, 2).config(RoomType.ROBOT_FACTORY, 0, 0, false);
        game.getFacility().getRoomAt(4, 0).config(RoomType.GENERATE_ENERGY, 0, 1, false);

        game.getFacility().getRoomAt(5, 1).config(RoomType.SCRAMBLE_FIGHTERS, 1, 3, false);
        game.getFacility().getRoomAt(5, 2)
                .config(RoomType.RESEARCH, 0, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 3));
        game.getFacility().getRoomAt(5, 3)
                .config(RoomType.RESEARCH, 0, 0, false)
                .addAdjoiningRoom(game.getFacility().getRoomAt(5, 2));

        game.adjMaxEnergy(5);
        game.adjMaxDamage(4);
    }
}
