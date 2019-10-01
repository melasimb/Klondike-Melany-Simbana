package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.models.Error;

public class MoveFromWasteToPileCommand extends Command {

//    public MoveFromWasteToPileCommand(MoveController moveController) {
//        super(CommandTitle.WASTE2PILE_COMMAND.getTitle(), moveController);
//    }

    public MoveFromWasteToPileCommand(GeneralController generalController) {
        super(CommandTitle.WASTE2PILE_COMMAND.getTitle(), generalController);
    }

//    @Override
//    protected Error move() {
//        int pileIndex = PileReader.readIndex(Message.DESTINATION);
//        return this.moveController.moveFromWasteToPile(pileIndex);
//    }

    @Override
    protected Error move() {
        int pileIndex = PileReader.readIndex(Message.DESTINATION);
        return this.generalController.moveFromWasteToPile(pileIndex);
    }
}
