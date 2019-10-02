package klondike.views.console;

import klondike.controllers.GeneralController;

public class StockView extends CardStackView {

    public StockView(GeneralController generalController) {
        super(generalController, Message.STOCK_TITLE);
    }

    public void writeln() {
        super.writeln(this.generalController.peekStock());
    }
}
