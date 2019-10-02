package klondike;

import klondike.controllers.GeneralController;
import klondike.models.Game;
import klondike.views.View;
import klondike.views.console.ConsoleView;

public class Klondike {

    private final GeneralController generalController;
    private View view;
    private Game game;

    private Klondike() {
        this.game = new Game();
        this.generalController = new GeneralController(this.game);
        this.view = new ConsoleView(generalController);
    }

    public static void main(String[] args) {
        new Klondike().play();
    }

    public void play() {
        view.interact();
    }
}