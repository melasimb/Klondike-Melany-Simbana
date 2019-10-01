package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class MoveFromPileToPileCommand extends Command {

//    public MoveFromPileToPileCommand(MoveController moveController) {
//        super(CommandTitle.PILE2PILE_COMMAND.getTitle(), moveController);
//    }

    public MoveFromPileToPileCommand(GeneralController generalController) {
        super(CommandTitle.PILE2PILE_COMMAND.getTitle(), generalController);
    }

//    @Override
//    protected Error move() {
//        int originIndex = PileReader.readIndex(Message.ORIGIN);
//        int destinationIndex = PileReader.readIndex(Message.DESTINATION);
//        int numberOfCards = IO.readInt(Message.READ_NUMBER_OF_CARDS, new ClosedInterval(1, 13));
//        return this.moveController.moveFromPileToPile(originIndex, destinationIndex, numberOfCards);
//    }

    @Override
    protected Error move() {
        int originIndex = PileReader.readIndex(Message.ORIGIN);
        int destinationIndex = PileReader.readIndex(Message.DESTINATION);
        int numberOfCards = IO.readInt(Message.READ_NUMBER_OF_CARDS, new ClosedInterval(1, 13));
        return this.generalController.moveFromPileToPile(originIndex, destinationIndex, numberOfCards);
    }
}
