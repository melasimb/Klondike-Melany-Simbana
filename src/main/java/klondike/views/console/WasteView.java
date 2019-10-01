package klondike.views.console;

import klondike.controllers.Controller;
import klondike.controllers.GeneralController;

public class WasteView extends CardStackView {


//    public WasteView(Controller controller) {
//        super(controller, Message.WASTE_TITLE);
//    }

    public WasteView(GeneralController generalController) {
        super(generalController, Message.WASTE_TITLE);
    }

//    public void writeln() {
//        super.writeln(this.controller.peekWaste());
//    }

    public void writeln() {
        super.writeln(this.generalController.peekWaste());
    }
}
