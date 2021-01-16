package ufs;

import ufs.game.MothershipAction;
import ufs.game.Phase;
import ufs.game.PhaseStep;
import ufs.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void run(){
        if (model.getGame() == null)
            return;
        while (model.getGame().getPhase() != Phase.GAMEOVER){
            view.refresh();
            switch (model.getGame().getPhase()){
                case SETUP:{
                    switch (model.getGame().getPhaseStep()){
                        case START_PHASE:
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        case END_PHASE:
                            model.getGame().setPhase(Phase.ASSIGN_DICE);
                            break;
                    }
                    break;
                }
                case ASSIGN_DICE:{
                    switch (model.getGame().getPhaseStep()){
                        case START_PHASE:
                            break;
                        case ASSIGN_DICE_PLACE_DICE:
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        case END_PHASE:
                            model.getGame().setPhase(Phase.DICE_ACTIONS);
                            break;
                    }
                    break;
                }
                case DICE_ACTIONS:{
                    switch (model.getGame().getPhaseStep()){
                        case START_PHASE:
                            break;
                        case DICE_ACTION_CHOOSE_DICE:
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        case END_PHASE:
                            model.getGame().setPhase(Phase.MOTHERSHIP);
                            break;
                    }
                    break;
                }
                case MOTHERSHIP:{
                    switch (model.getGame().getPhaseStep()){
                        case START_PHASE:
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        case END_PHASE:
                            model.getGame().setPhase(Phase.ASSIGN_DICE);
                            break;
                    }
                    break;
                }
            }
            checkGameOver();
        }
    }

    private void checkGameOver(){
        if (model.getGame().getMothershipActions().get(model.getGame().getMothershipRow()) == MothershipAction.GAMEOVER ||
            model.getGame().getDamage() >= model.getGame().getMaxDamage())
            model.getGame().setPhase(Phase.GAMEOVER);
    }
}
