package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.models.Suit;

public class MoveFromWasteToFoundationCommand extends Command {

//    public MoveFromWasteToFoundationCommand(MoveController moveController) {
//        super(CommandTitle.WASTE2FOUNDATION_COMMAND.getTitle(), moveController);
//    }

    public MoveFromWasteToFoundationCommand(GeneralController generalController) {
        super(CommandTitle.WASTE2FOUNDATION_COMMAND.getTitle(), generalController);
    }

//    @Override
//    protected Error move() {
//        Suit suit = SuitReader.read();
//        return this.moveController.moveFromWasteToFoundation(suit);
//    }

    @Override
    protected Error move() {
        Suit suit = SuitReader.read();
        return this.generalController.moveFromWasteToFoundation(suit);
    }
}
