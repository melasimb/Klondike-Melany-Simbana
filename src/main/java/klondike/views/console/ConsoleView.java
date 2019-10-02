package klondike.views.console;

import klondike.controllers.GeneralController;
import klondike.utils.YesNoDialog;
import klondike.views.View;
import klondike.views.console.menu.PlayMenu;

public class ConsoleView extends View {

    private PlayMenu playMenu;
    private GameView gameView;

    public ConsoleView(GeneralController generalController) {
        super(generalController);
        this.playMenu = new PlayMenu(this.generalController);
        this.gameView = new GameView(this.generalController);
    }

    @Override
    protected void start() {
        this.gameView.writeln();
    }

    @Override
    protected void move() {
        this.playMenu.execute();
        this.gameView.writeln();
    }

    @Override
    protected boolean resume() {
        return new YesNoDialog().read(Message.RESUME);
    }
}
