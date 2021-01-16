package ufs.game;

import ufs.game.city.City;
import ufs.game.facility.Facility;
import ufs.game.facility.FacilityTile;
import ufs.game.sky.Sky;
import ufs.game.sky.SkyTile;

import java.util.*;

public class Game {
    private static final int MAX_ROW = 16;

    private Phase phase;
    private PhaseStep phaseStep;

    private City city;
    private Sky sky;
    private Facility facility;

    /**
     * Maximum amount of damage the city can take before it's destroyed.
     * If damage == maxDamage, player loses
     */
    private int maxDamage = 0;

    /**
     * Current damage of city
     */
    private int damage = 0;

    private int maxEnergy = 0;
    private int energy = 0;

    private int mothershipRow = MAX_ROW + 1;

    private List<Integer> researchTrack = new ArrayList<>();

    private Map<Integer, MothershipAction> mothershipActions = new HashMap<>();

    // Ships currently in the game
    private List<Ship> ships = new ArrayList<>();

    public Game(){
        sky = new Sky();
        facility = new Facility();

        for (int r = 0; r < Sky.ROWS; ++r)
            mothershipActions.put(r, MothershipAction.NONE);

        for (int i = 0; i < 5; ++i){
            ships.add(new Ship(false));
        }

        phase = Phase.SETUP;
        phaseStep = PhaseStep.START_PHASE;
    }

    public void setup(Difficulty difficulty){
        List<Integer> indicies = Arrays.asList(0, 1, 2, 3);
        Collections.shuffle(indicies);
        Boolean[] tileDiff = new Boolean[4];
        for (int i = 0; i < difficulty.ordinal(); ++i){
            tileDiff[indicies.get(i)] = true;
        }
        // Setup must be in this order: City, Lowest Sky Tile, ..., Highest Sky Tile
        city.setup(this);
        SkyTile.setup(this, 0, tileDiff[0]);
        SkyTile.setup(this, 1, tileDiff[1]);
        SkyTile.setup(this, 2, tileDiff[2]);
        SkyTile.setup(this, 3, tileDiff[3]);

        FacilityTile.setup(this, city.getFacilityTop(), city.getFacilityBottom());
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
        this.phaseStep = PhaseStep.START_PHASE;
    }

    public PhaseStep getPhaseStep() {
        return phaseStep;
    }

    public void setPhaseStep(PhaseStep phaseStep) {
        this.phaseStep = phaseStep;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void adjMaxDamage(int amount){
        this.maxDamage += amount;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void adjDamage(int amount){
        this.damage += amount;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void adjEnergy(int amount){
        this.energy += amount;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public void adjMaxEnergy(int amount){
        this.maxEnergy += amount;
    }

    public int getMothershipRow() {
        return mothershipRow;
    }

    public void setMothershipRow(int mothershipRow) {
        this.mothershipRow = mothershipRow;
    }

    public void adjMothershipRow(int amount){
        this.mothershipRow += amount;
    }

    public Sky getSky() {
        return sky;
    }

    public List<Integer> getResearchTrack() {
        return researchTrack;
    }

    public Map<Integer, MothershipAction> getMothershipActions() {
        return mothershipActions;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public Facility getFacility() {
        return facility;
    }
}
