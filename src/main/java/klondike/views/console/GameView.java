package klondike.views.console;

import klondike.controllers.Controller;
import klondike.controllers.GeneralController;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.IO;

public class GameView {

    private final GeneralController generalController;

    public GameView(GeneralController generalController) {
        this.generalController = generalController;
    }

    public void writeln() {
        IO.writeln();
        IO.writeln(Message.GAME_TITLE);
        new StockView(this.generalController).writeln();
        new WasteView(this.generalController).writeln();
        IO.writeln(Message.FOUNDATIONS_TITLE);
        for (Suit suit : Suit.values()) {
            new FoundationView(this.generalController, suit).writeln();
        }
        IO.writeln(Message.PILES_TITLE);
        for (int i = 0; i < Game.NUMBER_OF_PILES; i++) {
            new PileView(this.generalController, i).writeln();
        }
        IO.writeln(Message.GAME_END);
        IO.writeln();
    }
}
