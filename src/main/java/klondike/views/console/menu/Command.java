package klondike.views.console.menu;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.utils.IO;

public abstract class Command /*extends klondike.utils.Command*/ {

    protected String title;

//    protected MoveController moveController;
    protected GeneralController generalController;

//    protected Command(String title, MoveController moveController) {
//        super(title);
//        this.moveController = moveController;
//    }

    protected Command(String title, GeneralController generalController) {
        this.title = title;
        this.generalController = generalController;
    }

    public String getTitle() {
        return this.title;
    }

    //@Override
    public void execute() {
        Error error = this.move();
        if (error != null) {
            IO.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected abstract Error move();
}
