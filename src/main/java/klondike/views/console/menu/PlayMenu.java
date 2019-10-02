package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.utils.Menu;

public class PlayMenu extends Menu {

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
