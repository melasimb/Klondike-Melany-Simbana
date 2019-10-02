package klondike.views.console;

import klondike.controllers.GeneralController;
import klondike.models.Card;
import klondike.utils.IO;

public abstract class CardStackView {

    protected final GeneralController generalController;
    private final String title;

    CardStackView(GeneralController generalController, String title) {
        this.generalController = generalController;
        this.title = title;
    }

    protected void writeln(Card card) {
        IO.write(title);
        if (card == null)
            IO.writeln(Message.EMPTY);
        else
            new CardView(card).writeln();
    }

    public abstract void writeln();
}
