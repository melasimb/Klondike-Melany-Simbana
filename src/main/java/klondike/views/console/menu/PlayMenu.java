package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.utils.Menu;

public class PlayMenu extends Menu {

//    public PlayMenu(MoveController moveController) {
//        this.addCommand(new MoveFromStockToWasteCommand(moveController));
//        this.addCommand(new MoveFromWasteToStockCommand(moveController));
//        this.addCommand(new MoveFromWasteToFoundationCommand(moveController));
//        this.addCommand(new MoveFromWasteToPileCommand(moveController));
//        this.addCommand(new MoveFromFoundationToPileCommand(moveController));
//        this.addCommand(new MoveFromPileToFoundationCommand(moveController));
//        this.addCommand(new MoveFromPileToPileCommand(moveController));
//
//    }

    public PlayMenu(GeneralController generalController) {
        this.addCommand(new MoveFromStockToWasteCommand(generalController));
        this.addCommand(new MoveFromWasteToStockCommand(generalController));
        this.addCommand(new MoveFromWasteToFoundationCommand(generalController));
        this.addCommand(new MoveFromWasteToPileCommand(generalController));
        this.addCommand(new MoveFromFoundationToPileCommand(generalController));
        this.addCommand(new MoveFromPileToFoundationCommand(generalController));
        this.addCommand(new MoveFromPileToPileCommand(generalController));

    }

}
