package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.models.Error;
import klondike.utils.IO;

public abstract class Command {

    protected String title;

    protected GeneralController generalController;

    protected Command(String title, GeneralController generalController) {
        this.title = title;
        this.generalController = generalController;
    }

    public String getTitle() {
        return this.title;
    }

    public void execute() {
        Error error = this.move();
        if (error != null) {
            IO.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected abstract Error move();
}
