package klondike.views.console;

import klondike.controllers.Controller;
import klondike.controllers.GeneralController;

public class StockView extends CardStackView {

//    public StockView(Controller controller) {
//        super(controller, Message.STOCK_TITLE);
//    }

    public StockView(GeneralController generalController) {
        super(generalController, Message.STOCK_TITLE);
    }

//    public void writeln() {
//        super.writeln(this.controller.peekStock());
//    }

    public void writeln() {
        super.writeln(this.generalController.peekStock());
    }
}
