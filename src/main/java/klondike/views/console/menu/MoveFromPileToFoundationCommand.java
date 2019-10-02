package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.models.Error;
import klondike.models.Suit;

public class MoveFromPileToFoundationCommand extends Command {

    public MoveFromPileToFoundationCommand(GeneralController generalController) {
        super(CommandTitle.PILE2FOUNDATION_COMMAND.getTitle(), generalController);
    }

    @Override
    protected Error move() {
        int pileIndex = PileReader.readIndex(Message.ORIGIN);
        Suit suit = SuitReader.read();
        return this.generalController.moveFromPileToFoundation(pileIndex, suit);
    }
}
