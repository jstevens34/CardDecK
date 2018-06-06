import enums.FaceCards;
import enums.Suits;

import java.util.Collections;
import java.util.Stack;

/**
 *
 *
 */
public class Deck {
    private Stack<Card> cards = new Stack<>();

    /**
     *
     * Constructs an instance of Deck with a stack of Cards
     */
    Deck() {
        for (Suits suit : Suits.values()) {
            for (FaceCards faceCard : FaceCards.values()) {
                this.cards.push(new Card(suit, faceCard));
            }
        }
    }

    @Override
    public String toString() {
        return "Deck " + cards.toString();
    }


    /**
     * Shuffle Deck of Cards
     */
    public void shuffle(){
        Collections.shuffle(this.cards);
    }


    /**
     * Get all Cards in Deck
     */
    public Stack<Card> getCards() {
        return cards;
    }

}
