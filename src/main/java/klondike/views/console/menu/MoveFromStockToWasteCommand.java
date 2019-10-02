package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.models.Error;

public class MoveFromStockToWasteCommand extends Command {

    public MoveFromStockToWasteCommand(GeneralController generalController) {
        super(CommandTitle.STOCK2WASTE_COMMAND.getTitle(), generalController);
    }

    @Override
    protected Error move() {
        return this.generalController.moveFromStockToWaste();
    }
}
