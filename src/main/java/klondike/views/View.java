package klondike.views;

import klondike.controllers.GeneralController;

public abstract class View {

    protected GeneralController generalController;

    public View(GeneralController generalController) {
        this.generalController = generalController;
    }

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

    protected abstract void start();

    protected abstract void move();

    protected abstract boolean resume();
}
