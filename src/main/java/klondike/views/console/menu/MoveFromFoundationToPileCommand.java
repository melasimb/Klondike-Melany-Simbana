package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.models.Error;
import klondike.models.Suit;

public class MoveFromFoundationToPileCommand extends Command {

    public MoveFromFoundationToPileCommand(GeneralController generalController) {
        super(CommandTitle.FOUNDATION2PILE_COMMAND.getTitle(), generalController);
    }

    @Override
    protected Error move() {
        Suit suit = SuitReader.read();
        int pileIndex = PileReader.readIndex(Message.DESTINATION);
        return this.generalController.moveFromFoundationToPile(suit, pileIndex);
    }
}
