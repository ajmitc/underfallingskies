package ufs.game.city;

import ufs.game.Game;

public class NewYorkCity extends City{

    public NewYorkCity(){
        super("New York");
        facilityTop = 'C';
        facilityBottom = 'A';
    }

    @Override
    public void setup(Game game) {
        game.adjMaxDamage(4);
        game.adjMaxEnergy(4);

        game.getResearchTrack().add(2);
    }
}
