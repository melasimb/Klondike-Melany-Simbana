package klondike.views;

import klondike.controllers.GeneralController;
import klondike.controllers.MoveController;
import klondike.controllers.ResumeController;
//import klondike.controllers.StartController;

public abstract class View {

    protected GeneralController generalController;

//    protected StartController startController;
//
//    protected MoveController moveController;
//
//    protected ResumeController resumeController;

    public View(GeneralController generalController) {
        this.generalController = generalController;
    }

//    public View(StartController startController, MoveController moveController, ResumeController resumeController) {
//        this.startController = startController;
//        this.moveController = moveController;
//        this.resumeController = resumeController;
//    }

    public void interact() {
        boolean resume;
        do {
            this.start();
            boolean finished;
            do {
                this.move();
                finished = generalController.isGameFinished();
            } while (!finished);
            resume = this.resume();
            if (resume) generalController.resume();
        } while (resume);
    }

/*    public void interact() {
        boolean resume;
        do {
            this.start();
            boolean finished;
            do {
                this.move();
                finished = moveController.isGameFinished();
            } while (!finished);
            resume = this.resume();
            if (resume) resumeController.resume();
        } while (resume);
    }*/

    protected abstract void start();

    protected abstract void move();

    protected abstract boolean resume();
}
