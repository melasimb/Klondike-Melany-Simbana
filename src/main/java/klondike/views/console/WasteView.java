package klondike.views.console;

import klondike.controllers.GeneralController;

public class WasteView extends CardStackView {

    public WasteView(GeneralController generalController) {
        super(generalController, Message.WASTE_TITLE);
    }

    public void writeln() {
        super.writeln(this.generalController.peekWaste());
    }
}
