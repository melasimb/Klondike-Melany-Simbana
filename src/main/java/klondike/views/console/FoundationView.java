package klondike.views.console;

import klondike.controllers.Controller;
import klondike.controllers.GeneralController;
import klondike.models.Suit;
import klondike.utils.IO;

public class FoundationView extends CardStackView {

    private final Suit suit;

    public FoundationView(GeneralController generalController, Suit suit) {
        super(generalController, Message.FOUNDATION_TITLE.replace(Message.FOUNDATION_TAG, suit.toString().toLowerCase()));
        this.suit = suit;
    }

    public void writeln() {
        IO.writetab();
        super.writeln(this.generalController.peekFoundation(suit));
    }
}
