package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.models.Error;

public class MoveFromWasteToStockCommand extends Command {

//    public MoveFromWasteToStockCommand(MoveController moveController) {
//        super(CommandTitle.WASTE2STOCK_COMMAND.getTitle(), moveController);
//    }

    public MoveFromWasteToStockCommand(GeneralController generalController) {
        super(CommandTitle.WASTE2STOCK_COMMAND.getTitle(), generalController);
    }

//    @Override
//    protected Error move() {
//        return this.moveController.moveFromWasteToStock();
//    }

    @Override
    protected Error move() {
        return this.generalController.moveFromWasteToStock();
    }
}
