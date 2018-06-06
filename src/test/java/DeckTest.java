import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;
    private int CardsInDeck = 52;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void cardsAreShuffled() {
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();

        Assert.assertNotEquals(this.deck, shuffledDeck);

    }

    @Test
    public void fullDeckIsReturned() {
        Assert.assertEquals(CardsInDeck, this.deck.getCards().size());
    }
}