package klondike.controllers;

import klondike.models.Card;
import klondike.models.Error;
import klondike.models.Game;
import klondike.models.Suit;

import java.util.Stack;

public class GeneralController {
    private MoveController moveController;
    private ResumeController resumeController;

    public GeneralController(Game game) {
        this.moveController = new MoveController(game);
        this.resumeController = new ResumeController(game);
    }

    public Card peekStock() {
        return this.moveController.peekStock();
    }

    public Card peekWaste() {
        return this.moveController.peekWaste();
    }

    public Card peekFoundation(Suit suit) {
        return this.moveController.peekFoundation(suit);
    }

    public Stack<Card> getPileCards(int index) {
        return this.moveController.getPileCards(index);
    }

    public int getNumberOfFaceUpCardsInPile(int index) {
        return this.moveController.getNumberOfFaceUpCardsInPile(index);
    }

    public Error moveFromFoundationToPile(Suit suit, int pileIndex) {
        return this.moveController.moveFromFoundationToPile(suit, pileIndex);
    }

    public Error moveFromPileToFoundation(int pileIndex, Suit suit) {
        return this.moveController.moveFromPileToFoundation(pileIndex, suit);
    }

    public Error moveFromPileToPile(int originIndex, int destinationIndex, int numberOfCards) {
        return this.moveController.moveFromPileToPile(originIndex, destinationIndex, numberOfCards);
    }

    public Error moveFromStockToWaste() {
        return this.moveController.moveFromStockToWaste();
    }

    public Error moveFromWasteToFoundation(Suit suit) {
        return this.moveController.moveFromWasteToFoundation(suit);
    }

    public Error moveFromWasteToPile(int pileIndex) {
        return this.moveController.moveFromWasteToPile(pileIndex);
    }

    public Error moveFromWasteToStock() {
        return this.moveController.moveFromWasteToStock();
    }

    public boolean isGameFinished() {
        return this.moveController.isGameFinished();
    }

    public void resume() {
        this.resumeController.resume();
    }
}
